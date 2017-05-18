/*
 * generated by Xtext
 */
package org.eclipse.fx.code.editor.ldef.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.fx.code.editor.ldef.lDef.ConfigValue;
import org.eclipse.fx.code.editor.ldef.lDef.E4CodeGeneration;
import org.eclipse.fx.code.editor.ldef.lDef.Equals;
import org.eclipse.fx.code.editor.ldef.lDef.Import;
import org.eclipse.fx.code.editor.ldef.lDef.Integration;
import org.eclipse.fx.code.editor.ldef.lDef.JavaCodeGeneration;
import org.eclipse.fx.code.editor.ldef.lDef.JavaFXIntegration;
import org.eclipse.fx.code.editor.ldef.lDef.Keyword;
import org.eclipse.fx.code.editor.ldef.lDef.LDefPackage;
import org.eclipse.fx.code.editor.ldef.lDef.LanguageDef;
import org.eclipse.fx.code.editor.ldef.lDef.LexicalHighlighting;
import org.eclipse.fx.code.editor.ldef.lDef.LexicalPartitionHighlighting_JS;
import org.eclipse.fx.code.editor.ldef.lDef.LexicalPartitionHighlighting_Rule;
import org.eclipse.fx.code.editor.ldef.lDef.Paritioner_JS;
import org.eclipse.fx.code.editor.ldef.lDef.Paritioning;
import org.eclipse.fx.code.editor.ldef.lDef.Partition;
import org.eclipse.fx.code.editor.ldef.lDef.Partition_JSRule;
import org.eclipse.fx.code.editor.ldef.lDef.Partition_MultiLineRule;
import org.eclipse.fx.code.editor.ldef.lDef.Partition_SingleLineRule;
import org.eclipse.fx.code.editor.ldef.lDef.Partitioner_Rule;
import org.eclipse.fx.code.editor.ldef.lDef.Range;
import org.eclipse.fx.code.editor.ldef.lDef.Root;
import org.eclipse.fx.code.editor.ldef.lDef.ScannerConditionComposite;
import org.eclipse.fx.code.editor.ldef.lDef.ScannerConditionEquals;
import org.eclipse.fx.code.editor.ldef.lDef.ScannerConditionExists;
import org.eclipse.fx.code.editor.ldef.lDef.ScannerConditionJs;
import org.eclipse.fx.code.editor.ldef.lDef.Scanner_CharacterRule;
import org.eclipse.fx.code.editor.ldef.lDef.Scanner_JSRule;
import org.eclipse.fx.code.editor.ldef.lDef.Scanner_Keyword;
import org.eclipse.fx.code.editor.ldef.lDef.Scanner_MultiLineRule;
import org.eclipse.fx.code.editor.ldef.lDef.Scanner_PatternRule;
import org.eclipse.fx.code.editor.ldef.lDef.Scanner_SingleLineRule;
import org.eclipse.fx.code.editor.ldef.lDef.Token;
import org.eclipse.fx.code.editor.ldef.lDef.TokenVisual;
import org.eclipse.fx.code.editor.ldef.lDef.TokenVisuals;
import org.eclipse.fx.code.editor.ldef.lDef.WhitespaceRule;
import org.eclipse.fx.code.editor.ldef.services.LDefGrammarAccess;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class LDefSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LDefGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == LDefPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case LDefPackage.CONFIG_VALUE:
				sequence_ConfigValue(context, (ConfigValue) semanticObject); 
				return; 
			case LDefPackage.E4_CODE_GENERATION:
				sequence_E4CodeGeneration(context, (E4CodeGeneration) semanticObject); 
				return; 
			case LDefPackage.EQUALS:
				sequence_Equals(context, (Equals) semanticObject); 
				return; 
			case LDefPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case LDefPackage.INTEGRATION:
				sequence_Integration(context, (Integration) semanticObject); 
				return; 
			case LDefPackage.JAVA_CODE_GENERATION:
				sequence_JavaCodeGeneration(context, (JavaCodeGeneration) semanticObject); 
				return; 
			case LDefPackage.JAVA_FX_INTEGRATION:
				sequence_JavaFXIntegration(context, (JavaFXIntegration) semanticObject); 
				return; 
			case LDefPackage.KEYWORD:
				sequence_Keyword(context, (Keyword) semanticObject); 
				return; 
			case LDefPackage.LANGUAGE_DEF:
				sequence_LanguageDef(context, (LanguageDef) semanticObject); 
				return; 
			case LDefPackage.LEXICAL_HIGHLIGHTING:
				sequence_LexicalHighlighting(context, (LexicalHighlighting) semanticObject); 
				return; 
			case LDefPackage.LEXICAL_PARTITION_HIGHLIGHTING_JS:
				sequence_LexicalPartitionHighlighting_JS(context, (LexicalPartitionHighlighting_JS) semanticObject); 
				return; 
			case LDefPackage.LEXICAL_PARTITION_HIGHLIGHTING_RULE:
				sequence_LexicalPartitionHighlighting_Rule(context, (LexicalPartitionHighlighting_Rule) semanticObject); 
				return; 
			case LDefPackage.PARITIONER_JS:
				sequence_Paritioner_JS(context, (Paritioner_JS) semanticObject); 
				return; 
			case LDefPackage.PARITIONING:
				sequence_Paritioning(context, (Paritioning) semanticObject); 
				return; 
			case LDefPackage.PARTITION:
				sequence_Partition(context, (Partition) semanticObject); 
				return; 
			case LDefPackage.PARTITION_JS_RULE:
				sequence_Partition_JSRule(context, (Partition_JSRule) semanticObject); 
				return; 
			case LDefPackage.PARTITION_MULTI_LINE_RULE:
				sequence_Partition_MultiLineRule(context, (Partition_MultiLineRule) semanticObject); 
				return; 
			case LDefPackage.PARTITION_SINGLE_LINE_RULE:
				sequence_Partition_SingleLineRule(context, (Partition_SingleLineRule) semanticObject); 
				return; 
			case LDefPackage.PARTITIONER_RULE:
				sequence_Partitioner_Rule(context, (Partitioner_Rule) semanticObject); 
				return; 
			case LDefPackage.RANGE:
				sequence_Range(context, (Range) semanticObject); 
				return; 
			case LDefPackage.ROOT:
				sequence_Root(context, (Root) semanticObject); 
				return; 
			case LDefPackage.SCANNER_CONDITION_COMPOSITE:
				sequence_ScannerConditionComposite(context, (ScannerConditionComposite) semanticObject); 
				return; 
			case LDefPackage.SCANNER_CONDITION_EQUALS:
				sequence_ScannerConditionEquals(context, (ScannerConditionEquals) semanticObject); 
				return; 
			case LDefPackage.SCANNER_CONDITION_EXISTS:
				sequence_ScannerConditionExists(context, (ScannerConditionExists) semanticObject); 
				return; 
			case LDefPackage.SCANNER_CONDITION_JS:
				sequence_ScannerConditionJs(context, (ScannerConditionJs) semanticObject); 
				return; 
			case LDefPackage.SCANNER_CHARACTER_RULE:
				sequence_Scanner_CharacterRule(context, (Scanner_CharacterRule) semanticObject); 
				return; 
			case LDefPackage.SCANNER_JS_RULE:
				sequence_Scanner_JSRule(context, (Scanner_JSRule) semanticObject); 
				return; 
			case LDefPackage.SCANNER_KEYWORD:
				sequence_Scanner_Keyword(context, (Scanner_Keyword) semanticObject); 
				return; 
			case LDefPackage.SCANNER_MULTI_LINE_RULE:
				sequence_Scanner_MultiLineRule(context, (Scanner_MultiLineRule) semanticObject); 
				return; 
			case LDefPackage.SCANNER_PATTERN_RULE:
				sequence_Scanner_PatternRule(context, (Scanner_PatternRule) semanticObject); 
				return; 
			case LDefPackage.SCANNER_SINGLE_LINE_RULE:
				sequence_Scanner_SingleLineRule(context, (Scanner_SingleLineRule) semanticObject); 
				return; 
			case LDefPackage.TOKEN:
				sequence_Token(context, (Token) semanticObject); 
				return; 
			case LDefPackage.TOKEN_VISUAL:
				sequence_TokenVisual(context, (TokenVisual) semanticObject); 
				return; 
			case LDefPackage.TOKEN_VISUALS:
				sequence_TokenVisuals(context, (TokenVisuals) semanticObject); 
				return; 
			case LDefPackage.WHITESPACE_RULE:
				sequence_WhitespaceRule(context, (WhitespaceRule) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ConfigValue returns ConfigValue
	 *
	 * Constraint:
	 *     (key=ID (simpleValue=STRING | children+=ConfigValue+))
	 */
	protected void sequence_ConfigValue(ISerializationContext context, ConfigValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Codegeneration returns E4CodeGeneration
	 *     E4CodeGeneration returns E4CodeGeneration
	 *
	 * Constraint:
	 *     (name=STRING configValue+=ConfigValue*)
	 */
	protected void sequence_E4CodeGeneration(ISerializationContext context, E4CodeGeneration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Check returns Equals
	 *     Equals returns Equals
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Equals(ISerializationContext context, Equals semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LDefPackage.Literals.EQUALS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.EQUALS__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEqualsAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildCard
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LDefPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Integration returns Integration
	 *
	 * Constraint:
	 *     codeIntegrationList+=CodeIntegration+
	 */
	protected void sequence_Integration(ISerializationContext context, Integration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Codegeneration returns JavaCodeGeneration
	 *     JavaCodeGeneration returns JavaCodeGeneration
	 *
	 * Constraint:
	 *     (name=STRING configValue+=ConfigValue*)
	 */
	protected void sequence_JavaCodeGeneration(ISerializationContext context, JavaCodeGeneration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CodeIntegration returns JavaFXIntegration
	 *     JavaFXIntegration returns JavaFXIntegration
	 *
	 * Constraint:
	 *     codegenerationList+=Codegeneration+
	 */
	protected void sequence_JavaFXIntegration(ISerializationContext context, JavaFXIntegration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Keyword returns Keyword
	 *
	 * Constraint:
	 *     (name=STRING version=STRING?)
	 */
	protected void sequence_Keyword(ISerializationContext context, Keyword semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LanguageDef returns LanguageDef
	 *
	 * Constraint:
	 *     (name=ID paritioning=Paritioning lexicalHighlighting=LexicalHighlighting integration=Integration?)
	 */
	protected void sequence_LanguageDef(ISerializationContext context, LanguageDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LexicalHighlighting returns LexicalHighlighting
	 *
	 * Constraint:
	 *     (list+=LexicalPartitionHighlighting+ vistual=TokenVisuals?)
	 */
	protected void sequence_LexicalHighlighting(ISerializationContext context, LexicalHighlighting semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LexicalPartitionHighlighting returns LexicalPartitionHighlighting_JS
	 *     LexicalPartitionHighlighting_JS returns LexicalPartitionHighlighting_JS
	 *
	 * Constraint:
	 *     (partition=[Partition|ID] scriptURI=STRING)
	 */
	protected void sequence_LexicalPartitionHighlighting_JS(ISerializationContext context, LexicalPartitionHighlighting_JS semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LDefPackage.Literals.LEXICAL_PARTITION_HIGHLIGHTING__PARTITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.LEXICAL_PARTITION_HIGHLIGHTING__PARTITION));
			if (transientValues.isValueTransient(semanticObject, LDefPackage.Literals.LEXICAL_PARTITION_HIGHLIGHTING_JS__SCRIPT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.LEXICAL_PARTITION_HIGHLIGHTING_JS__SCRIPT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLexicalPartitionHighlighting_JSAccess().getPartitionPartitionIDTerminalRuleCall_1_0_1(), semanticObject.eGet(LDefPackage.Literals.LEXICAL_PARTITION_HIGHLIGHTING__PARTITION, false));
		feeder.accept(grammarAccess.getLexicalPartitionHighlighting_JSAccess().getScriptURISTRINGTerminalRuleCall_2_0(), semanticObject.getScriptURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LexicalPartitionHighlighting returns LexicalPartitionHighlighting_Rule
	 *     LexicalPartitionHighlighting_Rule returns LexicalPartitionHighlighting_Rule
	 *
	 * Constraint:
	 *     (partition=[Partition|ID] whitespace=WhitespaceRule? tokenList+=Token+)
	 */
	protected void sequence_LexicalPartitionHighlighting_Rule(ISerializationContext context, LexicalPartitionHighlighting_Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Partitioner returns Paritioner_JS
	 *     Paritioner_JS returns Paritioner_JS
	 *
	 * Constraint:
	 *     scriptURI=STRING
	 */
	protected void sequence_Paritioner_JS(ISerializationContext context, Paritioner_JS semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LDefPackage.Literals.PARITIONER_JS__SCRIPT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.PARITIONER_JS__SCRIPT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParitioner_JSAccess().getScriptURISTRINGTerminalRuleCall_1_0(), semanticObject.getScriptURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Paritioning returns Paritioning
	 *
	 * Constraint:
	 *     (partitions+=Partition+ partitioner=Partitioner)
	 */
	protected void sequence_Paritioning(ISerializationContext context, Paritioning semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Partition_Rule returns Partition_JSRule
	 *     Partition_JSRule returns Partition_JSRule
	 *
	 * Constraint:
	 *     (parition=[Partition|ID] fileURI=STRING check=Check?)
	 */
	protected void sequence_Partition_JSRule(ISerializationContext context, Partition_JSRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Partition_Rule returns Partition_MultiLineRule
	 *     Partition_MultiLineRule returns Partition_MultiLineRule
	 *
	 * Constraint:
	 *     (
	 *         parition=[Partition|ID] 
	 *         startSeq=STRING 
	 *         (startPattern=STRING startSuffix=STRING)? 
	 *         check=Check? 
	 *         endSeq=STRING 
	 *         escapeSeq=STRING?
	 *     )
	 */
	protected void sequence_Partition_MultiLineRule(ISerializationContext context, Partition_MultiLineRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Partition returns Partition
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Partition(ISerializationContext context, Partition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LDefPackage.Literals.PARTITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.PARTITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPartitionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Partition_Rule returns Partition_SingleLineRule
	 *     Partition_SingleLineRule returns Partition_SingleLineRule
	 *
	 * Constraint:
	 *     (
	 *         parition=[Partition|ID] 
	 *         startSeq=STRING 
	 *         (startPattern=STRING startSuffix=STRING)? 
	 *         check=Check? 
	 *         endSeq=STRING? 
	 *         escapeSeq=STRING?
	 *     )
	 */
	protected void sequence_Partition_SingleLineRule(ISerializationContext context, Partition_SingleLineRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Partitioner returns Partitioner_Rule
	 *     Partitioner_Rule returns Partitioner_Rule
	 *
	 * Constraint:
	 *     ruleList+=Partition_Rule+
	 */
	protected void sequence_Partitioner_Rule(ISerializationContext context, Partitioner_Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Check returns Range
	 *     Range returns Range
	 *
	 * Constraint:
	 *     ((ltIncl='(' | ltIncl='[') minValue+=INT? maxValue+=INT? (gtIncl=')' | gtIncl=']'))
	 */
	protected void sequence_Range(ISerializationContext context, Range semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Root returns Root
	 *
	 * Constraint:
	 *     (name=QualifiedName imports+=Import* languageDefinition=LanguageDef)
	 */
	protected void sequence_Root(ISerializationContext context, Root semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ScannerCondition returns ScannerConditionComposite
	 *     ScannerConditionComposite returns ScannerConditionComposite
	 *
	 * Constraint:
	 *     ((op='and' | op='or') elements+=ScannerCondition)
	 */
	protected void sequence_ScannerConditionComposite(ISerializationContext context, ScannerConditionComposite semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ScannerCondition returns ScannerConditionEquals
	 *     ScannerConditionEquals returns ScannerConditionEquals
	 *
	 * Constraint:
	 *     (key=STRING value=STRING)
	 */
	protected void sequence_ScannerConditionEquals(ISerializationContext context, ScannerConditionEquals semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LDefPackage.Literals.SCANNER_CONDITION_EQUALS__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.SCANNER_CONDITION_EQUALS__KEY));
			if (transientValues.isValueTransient(semanticObject, LDefPackage.Literals.SCANNER_CONDITION_EQUALS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.SCANNER_CONDITION_EQUALS__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScannerConditionEqualsAccess().getKeySTRINGTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getScannerConditionEqualsAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ScannerCondition returns ScannerConditionExists
	 *     ScannerConditionExists returns ScannerConditionExists
	 *
	 * Constraint:
	 *     key=STRING
	 */
	protected void sequence_ScannerConditionExists(ISerializationContext context, ScannerConditionExists semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LDefPackage.Literals.SCANNER_CONDITION_EXISTS__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.SCANNER_CONDITION_EXISTS__KEY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScannerConditionExistsAccess().getKeySTRINGTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ScannerCondition returns ScannerConditionJs
	 *     ScannerConditionJs returns ScannerConditionJs
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_ScannerConditionJs(ISerializationContext context, ScannerConditionJs semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LDefPackage.Literals.SCANNER_CONDITION_JS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.SCANNER_CONDITION_JS__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScannerConditionJsAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Scanner returns Scanner_CharacterRule
	 *     Scanner_Rule returns Scanner_CharacterRule
	 *     Scanner_CharacterRule returns Scanner_CharacterRule
	 *
	 * Constraint:
	 *     (characters+=STRING characters+=STRING* check=Check? enabledIf=ScannerCondition?)
	 */
	protected void sequence_Scanner_CharacterRule(ISerializationContext context, Scanner_CharacterRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Scanner returns Scanner_JSRule
	 *     Scanner_Rule returns Scanner_JSRule
	 *     Scanner_JSRule returns Scanner_JSRule
	 *
	 * Constraint:
	 *     (fileURI=STRING check=Check? condition=ScannerCondition?)
	 */
	protected void sequence_Scanner_JSRule(ISerializationContext context, Scanner_JSRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Scanner returns Scanner_Keyword
	 *     Scanner_Keyword returns Scanner_Keyword
	 *
	 * Constraint:
	 *     (keywords+=Keyword keywords+=Keyword* enabledIf=ScannerCondition?)
	 */
	protected void sequence_Scanner_Keyword(ISerializationContext context, Scanner_Keyword semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Scanner returns Scanner_MultiLineRule
	 *     Scanner_Rule returns Scanner_MultiLineRule
	 *     Scanner_MultiLineRule returns Scanner_MultiLineRule
	 *
	 * Constraint:
	 *     (
	 *         startSeq=STRING 
	 *         (startPattern=STRING startSuffix=STRING)? 
	 *         check=Check? 
	 *         endSeq=STRING 
	 *         escapeSeq=STRING? 
	 *         enabledIf=ScannerCondition?
	 *     )
	 */
	protected void sequence_Scanner_MultiLineRule(ISerializationContext context, Scanner_MultiLineRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Scanner returns Scanner_PatternRule
	 *     Scanner_Rule returns Scanner_PatternRule
	 *     Scanner_PatternRule returns Scanner_PatternRule
	 *
	 * Constraint:
	 *     (startPattern=STRING length=INT? check=Check? contentPattern=STRING enabledIf=ScannerCondition?)
	 */
	protected void sequence_Scanner_PatternRule(ISerializationContext context, Scanner_PatternRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Scanner returns Scanner_SingleLineRule
	 *     Scanner_Rule returns Scanner_SingleLineRule
	 *     Scanner_SingleLineRule returns Scanner_SingleLineRule
	 *
	 * Constraint:
	 *     (
	 *         startSeq=STRING 
	 *         (startPattern=STRING startSuffix=STRING)? 
	 *         check=Check? 
	 *         endSeq=STRING? 
	 *         escapeSeq=STRING? 
	 *         enabledIf=ScannerCondition?
	 *     )
	 */
	protected void sequence_Scanner_SingleLineRule(ISerializationContext context, Scanner_SingleLineRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TokenVisual returns TokenVisual
	 *
	 * Constraint:
	 *     (token=[Token|ID] colorSpec=STRING bold?='bold'? italic?='italic'?)
	 */
	protected void sequence_TokenVisual(ISerializationContext context, TokenVisual semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TokenVisuals returns TokenVisuals
	 *
	 * Constraint:
	 *     tokenVisuals+=TokenVisual+
	 */
	protected void sequence_TokenVisuals(ISerializationContext context, TokenVisuals semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Token returns Token
	 *
	 * Constraint:
	 *     (default?='default'? name=ID scannerList+=Scanner*)
	 */
	protected void sequence_Token(ISerializationContext context, Token semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WhitespaceRule returns WhitespaceRule
	 *
	 * Constraint:
	 *     ((characters+=STRING characters+=STRING*) | javawhitespace?='javawhitespace' | fileURI=STRING)
	 */
	protected void sequence_WhitespaceRule(ISerializationContext context, WhitespaceRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
