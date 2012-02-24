package org.xtext.example.lmrc.db.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.xtext.example.lmrc.db.dbDsl.AbstractColumnMapper;
import org.xtext.example.lmrc.db.dbDsl.CharType;
import org.xtext.example.lmrc.db.dbDsl.Column;
import org.xtext.example.lmrc.db.dbDsl.Database;
import org.xtext.example.lmrc.db.dbDsl.DbDslPackage;
import org.xtext.example.lmrc.db.dbDsl.NumberType;
import org.xtext.example.lmrc.db.dbDsl.Table;
import org.xtext.example.lmrc.db.services.DbDslGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractDbDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected DbDslGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DbDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DbDslPackage.ABSTRACT_COLUMN_MAPPER:
				if(context == grammarAccess.getAbstractColumnMapperRule()) {
					sequence_AbstractColumnMapper(context, (AbstractColumnMapper) semanticObject); 
					return; 
				}
				else break;
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
	 *     {AbstractColumnMapper}
	 */
	protected void sequence_AbstractColumnMapper(EObject context, AbstractColumnMapper semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID tables+=Table*)
	 */
	protected void sequence_Database(EObject context, Database semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID columns+=Column*)
	 */
	protected void sequence_Table(EObject context, Table semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
