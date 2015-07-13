/* An interpreter for the simple math language we all espouse. */ 
package compiler6083;

import analysis.DepthFirstAdapter;
import node.*;

public class Interpreter extends DepthFirstAdapter { 
	
	public void caseAAddExpr(AAddExpr node) {
		node.getLeft();
	}
}