/*******************************************************************************
 * Copyright (c) 2022 BestSolution.at and others.
 *  
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *     BestSolution.at - initial API and implementation
 *******************************************************************************/
/*
 * generated by Xtext
 */
package org.eclipse.fx.ide.gmodel.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class GModelDSLGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class GModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.fx.ide.gmodel.GModelDSL.GModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeListAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeListGDomainElementParserRuleCall_3_0 = (RuleCall)cTypeListAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GModel:
		//	'package' name=QualifiedName '{'
		//	typeList+=GDomainElement+
		//	'}';
		@Override public ParserRule getRule() { return rule; }

		//'package' name=QualifiedName '{' typeList+=GDomainElement+ '}'
		public Group getGroup() { return cGroup; }

		//'package'
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }

		//name=QualifiedName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_0() { return cNameQualifiedNameParserRuleCall_1_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//typeList+=GDomainElement+
		public Assignment getTypeListAssignment_3() { return cTypeListAssignment_3; }

		//GDomainElement
		public RuleCall getTypeListGDomainElementParserRuleCall_3_0() { return cTypeListGDomainElementParserRuleCall_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class GDomainElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.fx.ide.gmodel.GModelDSL.GDomainElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSuperTypeListAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cSuperTypeListGDomainElementCrossReference_2_1_0 = (CrossReference)cSuperTypeListAssignment_2_1.eContents().get(0);
		private final RuleCall cSuperTypeListGDomainElementIDTerminalRuleCall_2_1_0_1 = (RuleCall)cSuperTypeListGDomainElementCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaSpaceKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cSuperTypeListAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cSuperTypeListGDomainElementCrossReference_2_2_1_0 = (CrossReference)cSuperTypeListAssignment_2_2_1.eContents().get(0);
		private final RuleCall cSuperTypeListGDomainElementIDTerminalRuleCall_2_2_1_0_1 = (RuleCall)cSuperTypeListGDomainElementCrossReference_2_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Assignment cMapAssignment_4_0 = (Assignment)cAlternatives_4.eContents().get(0);
		private final RuleCall cMapGDomainMapParserRuleCall_4_0_0 = (RuleCall)cMapAssignment_4_0.eContents().get(0);
		private final Assignment cPropertyListAssignment_4_1 = (Assignment)cAlternatives_4.eContents().get(1);
		private final RuleCall cPropertyListGDomainPropertyParserRuleCall_4_1_0 = (RuleCall)cPropertyListAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//GDomainElement:
		//	'type' name=ID ('extends' superTypeList+=[GDomainElement] (', ' superTypeList+=[GDomainElement])*)? '{'
		//	(map=GDomainMap | propertyList+=GDomainProperty*)
		//	'}';
		@Override public ParserRule getRule() { return rule; }

		//'type' name=ID ('extends' superTypeList+=[GDomainElement] (', ' superTypeList+=[GDomainElement])*)? '{' (map=GDomainMap
		//| propertyList+=GDomainProperty*) '}'
		public Group getGroup() { return cGroup; }

		//'type'
		public Keyword getTypeKeyword_0() { return cTypeKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//('extends' superTypeList+=[GDomainElement] (', ' superTypeList+=[GDomainElement])*)?
		public Group getGroup_2() { return cGroup_2; }

		//'extends'
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }

		//superTypeList+=[GDomainElement]
		public Assignment getSuperTypeListAssignment_2_1() { return cSuperTypeListAssignment_2_1; }

		//[GDomainElement]
		public CrossReference getSuperTypeListGDomainElementCrossReference_2_1_0() { return cSuperTypeListGDomainElementCrossReference_2_1_0; }

		//ID
		public RuleCall getSuperTypeListGDomainElementIDTerminalRuleCall_2_1_0_1() { return cSuperTypeListGDomainElementIDTerminalRuleCall_2_1_0_1; }

		//(', ' superTypeList+=[GDomainElement])*
		public Group getGroup_2_2() { return cGroup_2_2; }

		//', '
		public Keyword getCommaSpaceKeyword_2_2_0() { return cCommaSpaceKeyword_2_2_0; }

		//superTypeList+=[GDomainElement]
		public Assignment getSuperTypeListAssignment_2_2_1() { return cSuperTypeListAssignment_2_2_1; }

		//[GDomainElement]
		public CrossReference getSuperTypeListGDomainElementCrossReference_2_2_1_0() { return cSuperTypeListGDomainElementCrossReference_2_2_1_0; }

		//ID
		public RuleCall getSuperTypeListGDomainElementIDTerminalRuleCall_2_2_1_0_1() { return cSuperTypeListGDomainElementIDTerminalRuleCall_2_2_1_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//map=GDomainMap | propertyList+=GDomainProperty*
		public Alternatives getAlternatives_4() { return cAlternatives_4; }

		//map=GDomainMap
		public Assignment getMapAssignment_4_0() { return cMapAssignment_4_0; }

		//GDomainMap
		public RuleCall getMapGDomainMapParserRuleCall_4_0_0() { return cMapGDomainMapParserRuleCall_4_0_0; }

		//propertyList+=GDomainProperty*
		public Assignment getPropertyListAssignment_4_1() { return cPropertyListAssignment_4_1; }

		//GDomainProperty
		public RuleCall getPropertyListGDomainPropertyParserRuleCall_4_1_0() { return cPropertyListGDomainPropertyParserRuleCall_4_1_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class GDomainMapElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.fx.ide.gmodel.GModelDSL.GDomainMap");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMapKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cBuiltInAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final Alternatives cBuiltInAlternatives_1_0_0 = (Alternatives)cBuiltInAssignment_1_0.eContents().get(0);
		private final Keyword cBuiltInIntKeyword_1_0_0_0 = (Keyword)cBuiltInAlternatives_1_0_0.eContents().get(0);
		private final Keyword cBuiltInDoubleKeyword_1_0_0_1 = (Keyword)cBuiltInAlternatives_1_0_0.eContents().get(1);
		private final Keyword cBuiltInStringKeyword_1_0_0_2 = (Keyword)cBuiltInAlternatives_1_0_0.eContents().get(2);
		private final Keyword cBuiltInBooleanKeyword_1_0_0_3 = (Keyword)cBuiltInAlternatives_1_0_0.eContents().get(3);
		private final Assignment cRefAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final CrossReference cRefGDomainElementCrossReference_1_1_0 = (CrossReference)cRefAssignment_1_1.eContents().get(0);
		private final RuleCall cRefGDomainElementIDTerminalRuleCall_1_1_0_1 = (RuleCall)cRefGDomainElementCrossReference_1_1_0.eContents().get(1);
		
		//GDomainMap:
		//	'map' (builtIn=('Int' | 'Double' | 'String' | 'Boolean') | ref=[GDomainElement]);
		@Override public ParserRule getRule() { return rule; }

		//'map' (builtIn=('Int' | 'Double' | 'String' | 'Boolean') | ref=[GDomainElement])
		public Group getGroup() { return cGroup; }

		//'map'
		public Keyword getMapKeyword_0() { return cMapKeyword_0; }

		//builtIn=('Int' | 'Double' | 'String' | 'Boolean') | ref=[GDomainElement]
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//builtIn=('Int' | 'Double' | 'String' | 'Boolean')
		public Assignment getBuiltInAssignment_1_0() { return cBuiltInAssignment_1_0; }

		//('Int' | 'Double' | 'String' | 'Boolean')
		public Alternatives getBuiltInAlternatives_1_0_0() { return cBuiltInAlternatives_1_0_0; }

		//'Int'
		public Keyword getBuiltInIntKeyword_1_0_0_0() { return cBuiltInIntKeyword_1_0_0_0; }

		//'Double'
		public Keyword getBuiltInDoubleKeyword_1_0_0_1() { return cBuiltInDoubleKeyword_1_0_0_1; }

		//'String'
		public Keyword getBuiltInStringKeyword_1_0_0_2() { return cBuiltInStringKeyword_1_0_0_2; }

		//'Boolean'
		public Keyword getBuiltInBooleanKeyword_1_0_0_3() { return cBuiltInBooleanKeyword_1_0_0_3; }

		//ref=[GDomainElement]
		public Assignment getRefAssignment_1_1() { return cRefAssignment_1_1; }

		//[GDomainElement]
		public CrossReference getRefGDomainElementCrossReference_1_1_0() { return cRefGDomainElementCrossReference_1_1_0; }

		//ID
		public RuleCall getRefGDomainElementIDTerminalRuleCall_1_1_0_1() { return cRefGDomainElementIDTerminalRuleCall_1_1_0_1; }
	}

	public class GDomainPropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.fx.ide.gmodel.GModelDSL.GDomainProperty");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Group cGroup_0_0 = (Group)cAlternatives_0.eContents().get(0);
		private final Assignment cBuiltInAssignment_0_0_0 = (Assignment)cGroup_0_0.eContents().get(0);
		private final Alternatives cBuiltInAlternatives_0_0_0_0 = (Alternatives)cBuiltInAssignment_0_0_0.eContents().get(0);
		private final Keyword cBuiltInIntKeyword_0_0_0_0_0 = (Keyword)cBuiltInAlternatives_0_0_0_0.eContents().get(0);
		private final Keyword cBuiltInDoubleKeyword_0_0_0_0_1 = (Keyword)cBuiltInAlternatives_0_0_0_0.eContents().get(1);
		private final Keyword cBuiltInStringKeyword_0_0_0_0_2 = (Keyword)cBuiltInAlternatives_0_0_0_0.eContents().get(2);
		private final Keyword cBuiltInBooleanKeyword_0_0_0_0_3 = (Keyword)cBuiltInAlternatives_0_0_0_0.eContents().get(3);
		private final Assignment cListAssignment_0_0_1 = (Assignment)cGroup_0_0.eContents().get(1);
		private final Keyword cListLeftSquareBracketRightSquareBracketKeyword_0_0_1_0 = (Keyword)cListAssignment_0_0_1.eContents().get(0);
		private final Assignment cNameAssignment_0_0_2 = (Assignment)cGroup_0_0.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_0_0_2_0 = (RuleCall)cNameAssignment_0_0_2.eContents().get(0);
		private final Group cGroup_0_0_3 = (Group)cGroup_0_0.eContents().get(3);
		private final Keyword cEqualsSignKeyword_0_0_3_0 = (Keyword)cGroup_0_0_3.eContents().get(0);
		private final Assignment cDefaultValueAssignment_0_0_3_1 = (Assignment)cGroup_0_0_3.eContents().get(1);
		private final RuleCall cDefaultValueGDefaultParserRuleCall_0_0_3_1_0 = (RuleCall)cDefaultValueAssignment_0_0_3_1.eContents().get(0);
		private final Group cGroup_0_1 = (Group)cAlternatives_0.eContents().get(1);
		private final Assignment cRefAssignment_0_1_0 = (Assignment)cGroup_0_1.eContents().get(0);
		private final CrossReference cRefGDomainElementCrossReference_0_1_0_0 = (CrossReference)cRefAssignment_0_1_0.eContents().get(0);
		private final RuleCall cRefGDomainElementIDTerminalRuleCall_0_1_0_0_1 = (RuleCall)cRefGDomainElementCrossReference_0_1_0_0.eContents().get(1);
		private final Assignment cListAssignment_0_1_1 = (Assignment)cGroup_0_1.eContents().get(1);
		private final Keyword cListLeftSquareBracketRightSquareBracketKeyword_0_1_1_0 = (Keyword)cListAssignment_0_1_1.eContents().get(0);
		private final Assignment cNameAssignment_0_1_2 = (Assignment)cGroup_0_1.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_0_1_2_0 = (RuleCall)cNameAssignment_0_1_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//GDomainProperty:
		//	(builtIn=('Int' | 'Double' | 'String' | 'Boolean') list?='[]'? name=ID ('=' defaultValue=GDefault)? |
		//	ref=[GDomainElement] list?='[]'? name=ID) ';';
		@Override public ParserRule getRule() { return rule; }

		//(builtIn=('Int' | 'Double' | 'String' | 'Boolean') list?='[]'? name=ID ('=' defaultValue=GDefault)? |
		//ref=[GDomainElement] list?='[]'? name=ID) ';'
		public Group getGroup() { return cGroup; }

		//builtIn=('Int' | 'Double' | 'String' | 'Boolean') list?='[]'? name=ID ('=' defaultValue=GDefault)? |
		//ref=[GDomainElement] list?='[]'? name=ID
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//builtIn=('Int' | 'Double' | 'String' | 'Boolean') list?='[]'? name=ID ('=' defaultValue=GDefault)?
		public Group getGroup_0_0() { return cGroup_0_0; }

		//builtIn=('Int' | 'Double' | 'String' | 'Boolean')
		public Assignment getBuiltInAssignment_0_0_0() { return cBuiltInAssignment_0_0_0; }

		//('Int' | 'Double' | 'String' | 'Boolean')
		public Alternatives getBuiltInAlternatives_0_0_0_0() { return cBuiltInAlternatives_0_0_0_0; }

		//'Int'
		public Keyword getBuiltInIntKeyword_0_0_0_0_0() { return cBuiltInIntKeyword_0_0_0_0_0; }

		//'Double'
		public Keyword getBuiltInDoubleKeyword_0_0_0_0_1() { return cBuiltInDoubleKeyword_0_0_0_0_1; }

		//'String'
		public Keyword getBuiltInStringKeyword_0_0_0_0_2() { return cBuiltInStringKeyword_0_0_0_0_2; }

		//'Boolean'
		public Keyword getBuiltInBooleanKeyword_0_0_0_0_3() { return cBuiltInBooleanKeyword_0_0_0_0_3; }

		//list?='[]'?
		public Assignment getListAssignment_0_0_1() { return cListAssignment_0_0_1; }

		//'[]'
		public Keyword getListLeftSquareBracketRightSquareBracketKeyword_0_0_1_0() { return cListLeftSquareBracketRightSquareBracketKeyword_0_0_1_0; }

		//name=ID
		public Assignment getNameAssignment_0_0_2() { return cNameAssignment_0_0_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0_2_0() { return cNameIDTerminalRuleCall_0_0_2_0; }

		//('=' defaultValue=GDefault)?
		public Group getGroup_0_0_3() { return cGroup_0_0_3; }

		//'='
		public Keyword getEqualsSignKeyword_0_0_3_0() { return cEqualsSignKeyword_0_0_3_0; }

		//defaultValue=GDefault
		public Assignment getDefaultValueAssignment_0_0_3_1() { return cDefaultValueAssignment_0_0_3_1; }

		//GDefault
		public RuleCall getDefaultValueGDefaultParserRuleCall_0_0_3_1_0() { return cDefaultValueGDefaultParserRuleCall_0_0_3_1_0; }

		//ref=[GDomainElement] list?='[]'? name=ID
		public Group getGroup_0_1() { return cGroup_0_1; }

		//ref=[GDomainElement]
		public Assignment getRefAssignment_0_1_0() { return cRefAssignment_0_1_0; }

		//[GDomainElement]
		public CrossReference getRefGDomainElementCrossReference_0_1_0_0() { return cRefGDomainElementCrossReference_0_1_0_0; }

		//ID
		public RuleCall getRefGDomainElementIDTerminalRuleCall_0_1_0_0_1() { return cRefGDomainElementIDTerminalRuleCall_0_1_0_0_1; }

		//list?='[]'?
		public Assignment getListAssignment_0_1_1() { return cListAssignment_0_1_1; }

		//'[]'
		public Keyword getListLeftSquareBracketRightSquareBracketKeyword_0_1_1_0() { return cListLeftSquareBracketRightSquareBracketKeyword_0_1_1_0; }

		//name=ID
		public Assignment getNameAssignment_0_1_2() { return cNameAssignment_0_1_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_1_2_0() { return cNameIDTerminalRuleCall_0_1_2_0; }

		//';'
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
	}

	public class GDefaultElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.fx.ide.gmodel.GModelDSL.GDefault");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cStringValAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cStringValSTRINGTerminalRuleCall_0_0 = (RuleCall)cStringValAssignment_0.eContents().get(0);
		private final Assignment cIntValAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cIntValINTTerminalRuleCall_1_0 = (RuleCall)cIntValAssignment_1.eContents().get(0);
		
		//GDefault:
		//	stringVal=STRING | intVal=INT;
		@Override public ParserRule getRule() { return rule; }

		//stringVal=STRING | intVal=INT
		public Alternatives getAlternatives() { return cAlternatives; }

		//stringVal=STRING
		public Assignment getStringValAssignment_0() { return cStringValAssignment_0; }

		//STRING
		public RuleCall getStringValSTRINGTerminalRuleCall_0_0() { return cStringValSTRINGTerminalRuleCall_0_0; }

		//intVal=INT
		public Assignment getIntValAssignment_1() { return cIntValAssignment_1; }

		//INT
		public RuleCall getIntValINTTerminalRuleCall_1_0() { return cIntValINTTerminalRuleCall_1_0; }
	}

	public class ValidIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.fx.ide.gmodel.GModelDSL.ValidID");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//ValidID:
		//	ID;
		@Override public ParserRule getRule() { return rule; }

		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.fx.ide.gmodel.GModelDSL.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cValidIDParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cValidIDParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ValidID (=> '.' ValidID)*;
		@Override public ParserRule getRule() { return rule; }

		//ValidID (=> '.' ValidID)*
		public Group getGroup() { return cGroup; }

		//ValidID
		public RuleCall getValidIDParserRuleCall_0() { return cValidIDParserRuleCall_0; }

		//(=> '.' ValidID)*
		public Group getGroup_1() { return cGroup_1; }

		//=> '.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ValidID
		public RuleCall getValidIDParserRuleCall_1_1() { return cValidIDParserRuleCall_1_1; }
	}
	
	
	private final GModelElements pGModel;
	private final GDomainElementElements pGDomainElement;
	private final GDomainMapElements pGDomainMap;
	private final GDomainPropertyElements pGDomainProperty;
	private final GDefaultElements pGDefault;
	private final ValidIDElements pValidID;
	private final QualifiedNameElements pQualifiedName;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public GModelDSLGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGModel = new GModelElements();
		this.pGDomainElement = new GDomainElementElements();
		this.pGDomainMap = new GDomainMapElements();
		this.pGDomainProperty = new GDomainPropertyElements();
		this.pGDefault = new GDefaultElements();
		this.pValidID = new ValidIDElements();
		this.pQualifiedName = new QualifiedNameElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.fx.ide.gmodel.GModelDSL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//GModel:
	//	'package' name=QualifiedName '{'
	//	typeList+=GDomainElement+
	//	'}';
	public GModelElements getGModelAccess() {
		return pGModel;
	}
	
	public ParserRule getGModelRule() {
		return getGModelAccess().getRule();
	}

	//GDomainElement:
	//	'type' name=ID ('extends' superTypeList+=[GDomainElement] (', ' superTypeList+=[GDomainElement])*)? '{'
	//	(map=GDomainMap | propertyList+=GDomainProperty*)
	//	'}';
	public GDomainElementElements getGDomainElementAccess() {
		return pGDomainElement;
	}
	
	public ParserRule getGDomainElementRule() {
		return getGDomainElementAccess().getRule();
	}

	//GDomainMap:
	//	'map' (builtIn=('Int' | 'Double' | 'String' | 'Boolean') | ref=[GDomainElement]);
	public GDomainMapElements getGDomainMapAccess() {
		return pGDomainMap;
	}
	
	public ParserRule getGDomainMapRule() {
		return getGDomainMapAccess().getRule();
	}

	//GDomainProperty:
	//	(builtIn=('Int' | 'Double' | 'String' | 'Boolean') list?='[]'? name=ID ('=' defaultValue=GDefault)? |
	//	ref=[GDomainElement] list?='[]'? name=ID) ';';
	public GDomainPropertyElements getGDomainPropertyAccess() {
		return pGDomainProperty;
	}
	
	public ParserRule getGDomainPropertyRule() {
		return getGDomainPropertyAccess().getRule();
	}

	//GDefault:
	//	stringVal=STRING | intVal=INT;
	public GDefaultElements getGDefaultAccess() {
		return pGDefault;
	}
	
	public ParserRule getGDefaultRule() {
		return getGDefaultAccess().getRule();
	}

	//ValidID:
	//	ID;
	public ValidIDElements getValidIDAccess() {
		return pValidID;
	}
	
	public ParserRule getValidIDRule() {
		return getValidIDAccess().getRule();
	}

	//QualifiedName:
	//	ValidID (=> '.' ValidID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
