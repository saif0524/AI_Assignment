package ai.dls;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthLimitedSearch {
	private final List<Node> listVisitedNodes = new ArrayList<Node>();
	private boolean isFound = false;
	private int limit, goalDeapth;
	private Node startNode;
	
	public boolean getIsFound(){
		return isFound;
	}

	public void setIsFound(boolean isFound) {
		this.isFound = isFound;
	}
	
	public DepthLimitedSearch(Node startNode, int limit){
		this.limit = limit;
		this.startNode = startNode;
	}
	
	public String getVisitedNodes(){
		String visitedNodes = "";
		for(Node nodes:listVisitedNodes){
			visitedNodes += nodes.getCityName() + ", ";
		}
		
		return visitedNodes.trim().substring(0, visitedNodes.length()-2);
	}
	
	public String getGoalPath(){
		Stack<String> path = new Stack<String>();
		for(int i = 1; i<= goalDeapth; i++){
			path.push(listVisitedNodes.get(listVisitedNodes.size()-i).getCityName());
			
		}
	
		path.push(startNode.getCityName());
		String goalPath = "";
			while(!path.isEmpty()){
				goalPath += path.pop() + ", "; 
			}
			
		return goalPath.trim().substring(0, goalPath.length() - 1);
	}
	
	public int getGoalDepth(){
		return goalDeapth;
	}
	
	public DepthLimitedSearch(){
		
	}
	
	public void DLS(Node current, Node goal, int depth){
		if(depth >= 0 && getIsFound() == false){
			if(current.equals(goal)){
				listVisitedNodes.add(current);
				goalDeapth = (limit -depth);
				setIsFound(true);
			} else{
				listVisitedNodes.add(current);
				for(Node child: current.getChidlNode()){
					DLS(child, goal, depth - 1);
				}
			}
		}
	}
	
}
