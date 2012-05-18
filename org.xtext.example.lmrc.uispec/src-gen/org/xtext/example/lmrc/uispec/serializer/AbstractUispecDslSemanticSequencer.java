package org.xtext.example.lmrc.uispec.serializer;

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
import org.xtext.example.lmrc.uispec.services.UispecDslGrammarAccess;
import org.xtext.example.lmrc.uispec.uispecDsl.CheckBoxWidget;
import org.xtext.example.lmrc.uispec.uispecDsl.ComboWidget;
import org.xtext.example.lmrc.uispec.uispecDsl.EntityReference;
import org.xtext.example.lmrc.uispec.uispecDsl.Field;
import org.xtext.example.lmrc.uispec.uispecDsl.Form;
import org.xtext.example.lmrc.uispec.uispecDsl.TextFieldWidget;
import org.xtext.example.lmrc.uispec.uispecDsl.UispecDslPackage;

@SuppressWarnings("all")
public class AbstractUispecDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected UispecDslGrammarAccess grammarAccess;
	
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
		if(semanticObject.eClass().getEPackage() == UispecDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case UispecDslPackage.CHECK_BOX_WIDGET:
				if(context == grammarAccess.getCheckBoxWidgetRule() ||
				   context == grammarAccess.getWidgetRule()) {
					sequence_Widget(context, (CheckBoxWidget) semanticObject); 
					return; 
				}
				else break;
			case UispecDslPackage.COMBO_WIDGET:
				if(context == grammarAccess.getComboWidgetRule() ||
				   context == grammarAccess.getWidgetRule()) {
					sequence_ComboWidget(context, (ComboWidget) semanticObject); 
					return; 
				}
				else break;
			case UispecDslPackage.ENTITY_REFERENCE:
				if(context == grammarAccess.getEntityReferenceRule()) {
					sequence_EntityReference(context, (EntityReference) semanticObject); 
					return; 
				}
				else break;
			case UispecDslPackage.FIELD:
				if(context == grammarAccess.getFieldRule()) {
					sequence_Field(context, (Field) semanticObject); 
					return; 
				}
				else break;
			case UispecDslPackage.FORM:
				if(context == grammarAccess.getFormRule()) {
					sequence_Form(context, (Form) semanticObject); 
					return; 
				}
				else break;
			case UispecDslPackage.TEXT_FIELD_WIDGET:
				if(context == grammarAccess.getTextFieldWidgetRule() ||
				   context == grammarAccess.getWidgetRule()) {
					sequence_TextFieldWidget(context, (TextFieldWidget) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((values+=ID values+=ID*)?)
	 */
	protected void sequence_ComboWidget(EObject context, ComboWidget semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     entity=[Entity|FQN]
	 */
	protected void sequence_EntityReference(EObject context, EntityReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UispecDslPackage.Literals.ENTITY_REFERENCE__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UispecDslPackage.Literals.ENTITY_REFERENCE__ENTITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEntityReferenceAccess().getEntityEntityFQNParserRuleCall_1_0_1(), semanticObject.getEntity());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (label=ID widget=Widget attribute=[Attribute|FQN])
	 */
	protected void sequence_Field(EObject context, Field semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UispecDslPackage.Literals.FIELD__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UispecDslPackage.Literals.FIELD__LABEL));
			if(transientValues.isValueTransient(semanticObject, UispecDslPackage.Literals.FIELD__WIDGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UispecDslPackage.Literals.FIELD__WIDGET));
			if(transientValues.isValueTransient(semanticObject, UispecDslPackage.Literals.FIELD__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UispecDslPackage.Literals.FIELD__ATTRIBUTE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFieldAccess().getLabelIDTerminalRuleCall_1_0(), semanticObject.getLabel());
		feeder.accept(grammarAccess.getFieldAccess().getWidgetWidgetParserRuleCall_3_0(), semanticObject.getWidget());
		feeder.accept(grammarAccess.getFieldAccess().getAttributeAttributeFQNParserRuleCall_5_0_1(), semanticObject.getAttribute());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID usedEntities+=EntityReference* fields+=Field*)
	 */
	protected void sequence_Form(EObject context, Form semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     length=INT
	 */
	protected void sequence_TextFieldWidget(EObject context, TextFieldWidget semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UispecDslPackage.Literals.TEXT_FIELD_WIDGET__LENGTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UispecDslPackage.Literals.TEXT_FIELD_WIDGET__LENGTH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTextFieldWidgetAccess().getLengthINTTerminalRuleCall_2_0(), semanticObject.getLength());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {CheckBoxWidget}
	 */
	protected void sequence_Widget(EObject context, CheckBoxWidget semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
