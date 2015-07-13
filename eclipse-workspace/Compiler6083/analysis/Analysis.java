/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAOrExpr(AOrExpr node);
    void caseAAndExpr(AAndExpr node);
    void caseANotExpr(ANotExpr node);
    void caseAAddExpr(AAddExpr node);
    void caseASubExpr(ASubExpr node);
    void caseALtExpr(ALtExpr node);
    void caseAGteqExpr(AGteqExpr node);
    void caseALteqExpr(ALteqExpr node);
    void caseAGtExpr(AGtExpr node);
    void caseAEqExpr(AEqExpr node);
    void caseANeqExpr(ANeqExpr node);
    void caseAMulExpr(AMulExpr node);
    void caseADivExpr(ADivExpr node);
    void caseASignameExpr(ASignameExpr node);
    void caseAElementExpr(AElementExpr node);
    void caseAVarExpr(AVarExpr node);
    void caseASignumberExpr(ASignumberExpr node);
    void caseAIntExpr(AIntExpr node);
    void caseAFloatExpr(AFloatExpr node);
    void caseAStrExpr(AStrExpr node);
    void caseABoolExpr(ABoolExpr node);

    void caseTComment(TComment node);
    void caseTBlank(TBlank node);
    void caseTIdentifier(TIdentifier node);
    void caseTIntVal(TIntVal node);
    void caseTFloatVal(TFloatVal node);
    void caseTBoolVal(TBoolVal node);
    void caseTStrVal(TStrVal node);
    void caseTColon(TColon node);
    void caseTSemicolon(TSemicolon node);
    void caseTComma(TComma node);
    void caseTOr(TOr node);
    void caseTAnd(TAnd node);
    void caseTAdd(TAdd node);
    void caseTSub(TSub node);
    void caseTMul(TMul node);
    void caseTDiv(TDiv node);
    void caseTLParen(TLParen node);
    void caseTRParen(TRParen node);
    void caseTLt(TLt node);
    void caseTLteq(TLteq node);
    void caseTGt(TGt node);
    void caseTGteq(TGteq node);
    void caseTNeq(TNeq node);
    void caseTEq(TEq node);
    void caseTAssign(TAssign node);
    void caseTLBrack(TLBrack node);
    void caseTRBrack(TRBrack node);
    void caseTString(TString node);
    void caseTInteger(TInteger node);
    void caseTFor(TFor node);
    void caseTBool(TBool node);
    void caseTFloat(TFloat node);
    void caseTGlobal(TGlobal node);
    void caseTNot(TNot node);
    void caseTIn(TIn node);
    void caseTProgram(TProgram node);
    void caseTOut(TOut node);
    void caseTProcedure(TProcedure node);
    void caseTIf(TIf node);
    void caseTBegin(TBegin node);
    void caseTThen(TThen node);
    void caseTReturn(TReturn node);
    void caseTElse(TElse node);
    void caseTEnd(TEnd node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
