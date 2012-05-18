package org.xtext.example.lmrc.entity.serializer;

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
import org.xtext.example.lmrc.entity.entityDsl.Attribute;
import org.xtext.example.lmrc.entity.entityDsl.BooleanType;
import org.xtext.example.lmrc.entity.entityDsl.Entity;
import org.xtext.example.lmrc.entity.entityDsl.EntityDslPackage;
import org.xtext.example.lmrc.entity.entityDsl.EntityReference;
import org.xtext.example.lmrc.entity.entityDsl.IntType;
import org.xtext.example.lmrc.entity.entityDsl.Module;
import org.xtext.example.lmrc.entity.entityDsl.StringType;
import org.xtext.example.lmrc.entity.services.EntityDslGrammarAccess;

@SuppressWarnings("all")
public class AbstractEntityDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected EntityDslGrammarAccess grammarAccess;
	
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
		if(semanticObject.eClass().getEPackage() == EntityDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EntityDslPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule() ||
				   context == grammarAccess.getNamedRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case EntityDslPackage.BOOLEAN_TYPE:
				if(context == grammarAccess.getAbstractTypeRule() ||
				   context == grammarAccess.getBooleanTypeRule()) {
					sequence_AbstractType(context, (BooleanType) semanticObject); 
					return; 
				}
				else break;
			case EntityDslPackage.ENTITY:
				if(context == grammarAccess.getEntityRule() ||
				   context == grammarAccess.getNamedRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case EntityDslPackage.ENTITY_REFERENCE:
				if(context == grammarAccess.getAbstractTypeRule() ||
				   context == grammarAccess.getEntityReferenceRule()) {
					sequence_EntityReference(context, (EntityReference) semanticObject); 
					return; 
				}
				else break;
			case EntityDslPackage.INT_TYPE:
				if(context == grammarAccess.getAbstractTypeRule() ||
				   context == grammarAccess.getIntTypeRule()) {
					sequence_AbstractType(context, (IntType) semanticObject); 
					return; 
				}
				else break;
			case EntityDslPackage.MODULE:
				if(context == grammarAccess.getModuleRule() ||
				   context == grammarAccess.getNamedRule()) {
					sequence_Module(context, (Module) semanticObject); 
					return; 
				}
				else break;
			case EntityDslPackage.STRING_TYPE:
				if(context == grammarAccess.getAbstractTypeRule() ||
				   context == grammarAccess.getStringTypeRule()) {
					sequence_AbstractType(context, (StringType) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     {BooleanType}
	 */
	protected void sequence_AbstractType(EObject context, BooleanType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {IntType}
	 */
	protected void sequence_AbstractType(EObject context, IntType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {StringType}
	 */
	protected void sequence_AbstractType(EObject context, StringType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=AbstractType)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EntityDslPackage.Literals.NAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntityDslPackage.Literals.NAMED__NAME));
			if(transientValues.isValueTransient(semanticObject, EntityDslPackage.Literals.ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntityDslPackage.Literals.ATTRIBUTE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getTypeAbstractTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ref=[Entity|FQN]
	 */
	protected void sequence_EntityReference(EObject context, EntityReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EntityDslPackage.Literals.ENTITY_REFERENCE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntityDslPackage.Literals.ENTITY_REFERENCE__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEntityReferenceAccess().getRefEntityFQNParserRuleCall_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID attributes+=Attribute*)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID entities+=Entity*)
	 */
	protected void sequence_Module(EObject context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
