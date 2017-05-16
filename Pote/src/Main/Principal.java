/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import aima.core.agent.Action;
import aima.core.agent.impl.DynamicAction;
import Metodos.JugsFunctionFactory;
import Metodos.JugsGoalTest;
import aima.core.search.framework.SearchAgent;
import aima.core.search.framework.problem.Problem;
import aima.core.search.uninformed.DepthLimitedSearch;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

/**
 *
 * @author nascimento
 */
public class Principal {
    
    public static void main (String args[]) throws Exception{
        
        Problem problem = new Problem(new JugsState(), JugsFunctionFactory.getActionsFunction(),
        JugsFunctionFactory.getResultFunction(), new JugsGoalTest());
        
        DepthLimitedSearch search = new DepthLimitedSearch(10);
        SearchAgent agent = new SearchAgent(problem, search);
        List<Action> actions = agent.getActions();
        printGeneralActions(actions);
        //Assert.assertEquals(true, search.isCutOff(actions));
    }
    
    private static void printGeneralActions(List<Action> actions) {
            java.util.Iterator<Action> ai = actions.iterator();
            while (ai.hasNext()) {
                Action a = ai.next();
//                aima.core.environment.jugs.JugsState q;
//                q = (aima.core.environment.jugs.JugsState) a;
//                System.out.println(q.getState());
                System.out.println(((DynamicAction) a).getName());
            }
           
        }
    
}
