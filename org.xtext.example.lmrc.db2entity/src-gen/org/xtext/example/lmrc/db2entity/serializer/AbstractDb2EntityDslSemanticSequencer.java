package org.xtext.example.lmrc.db2entity.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.lmrc.db.dbDsl.CharType;
import org.xtext.example.lmrc.db.dbDsl.Column;
import org.xtext.example.lmrc.db.dbDsl.Database;
import org.xtext.example.lmrc.db.dbDsl.DbDslPackage;
import org.xtext.example.lmrc.db.dbDsl.NumberType;
import org.xtext.example.lmrc.db.dbDsl.Table;
import org.xtext.example.lmrc.db.serializer.DbDslSemanticSequencer;
import org.xtext.example.lmrc.db2entity.db2EntityDsl.Db2EntityDslPackage;
import org.xtext.example.lmrc.db2entity.db2EntityDsl.EntityColumnMapper;
import org.xtext.example.lmrc.db2entity.services.Db2EntityDslGrammarAccess;

@SuppressWarnings("all")
public class AbstractDb2EntityDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected Db2EntityDslGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	@Inject
	protected Provider<DbDslSemanticSequencer> superSequencerProvider;
	 
	protected DbDslSemanticSequencer superSequencer; 
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.superSequencer = superSequencerProvider.get();
		this.superSequencer.init(sequencer, sequenceAcceptor, errorAcceptor); 
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Db2EntityDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Db2EntityDslPackage.ENTITY_COLUMN_MAPPER:
				if(context == grammarAccess.getAbstractColumnMapperRule() ||
				   context == grammarAccess.getEntityColumnMapperRule()) {
					sequence_EntityColumnMapper(context, (EntityColumnMapper) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == DbDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DbDslPackage.CHAR_TYPE:
				if(context == grammarAccess.getAbstractDataTypeRule() ||
				   context == grammarAccess.getCharTypeRule()) {
					sequence_AbstractDataType(context, (CharType) semanticObject); 
					return; 
				}
				else break;
			case DbDslPackage.COLUMN:
				if(context == grammarAccess.getColumnRule()) {
					sequence_Column(context, (Column) semanticObject); 
					return; 
				}
				else break;
			case DbDslPackage.DATABASE:
				if(context == grammarAccess.getDatabaseRule() ||
				   context == grammarAccess.getRootRule()) {
					sequence_Database(context, (Database) semanticObject); 
					return; 
				}
				else break;
			case DbDslPackage.NUMBER_TYPE:
				if(context == grammarAccess.getAbstractDataTypeRule() ||
				   context == grammarAccess.getNumberTypeRule()) {
					sequence_AbstractDataType(context, (NumberType) semanticObject); 
					return; 
				}
				else break;
			case DbDslPackage.TABLE:
				if(context == grammarAccess.getTableRule()) {
					sequence_Table(context, (Table) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     {CharType}
	 */
	protected void sequence_AbstractDataType(EObject context, CharType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {NumberType}
	 */
	protected void sequence_AbstractDataType(EObject context, NumberType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=AbstractDataType name=ID mapper=AbstractColumnMapper?)
	 */
	protected void sequence_Column(EObject context, Column semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID tables+=Table*)
	 */
	protected void sequence_Database(EObject context, Database semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     entity=[Attribute|FQN]
	 */
	protected void sequence_EntityColumnMapper(EObject context, EntityColumnMapper semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Db2EntityDslPackage.Literals.ENTITY_COLUMN_MAPPER__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Db2EntityDslPackage.Literals.ENTITY_COLUMN_MAPPER__ENTITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEntityColumnMapperAccess().getEntityAttributeFQNParserRuleCall_2_0_1(), semanticObject.getEntity());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID columns+=Column*)
	 */
	protected void sequence_Table(EObject context, Table semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
}
