package ai.dls;

import java.util.ArrayList;
import java.util.List;

public class DLSMain {
	
	public static void main(String[] args){
		//Bucharest
		Node bucharest = new Node("Bucharest", null);
		
		
		//Pitesti and its children
		List<Node> pitestiChildren = new ArrayList<Node>();
		pitestiChildren.add(bucharest);
		
		Node pitesti = new Node("Pitesti", pitestiChildren);
		
		
		//Fagaras and its children
		List<Node> fagarasChildren = new ArrayList<Node>();
		fagarasChildren.add(bucharest);
			
		Node fagaras = new Node("Fagaras", fagarasChildren);
		
		//Craiova and its children
		List<Node> craiovaChildren = new ArrayList<Node>();
		craiovaChildren.add(pitesti);
				
		Node craiova = new Node("Craiova", craiovaChildren);
		
		
		
		//Riminicu and its children
		List<Node> rimnicuChildren = new ArrayList<Node>();
		rimnicuChildren.add(pitesti);
		rimnicuChildren.add(craiova);
				
		Node rimnicuVilcea = new Node("Rimnicu Vilcea", rimnicuChildren);

		
		//Sibiu and its children
		List<Node> sibiuChildren = new ArrayList<Node>();
		sibiuChildren.add(fagaras);
		sibiuChildren.add(rimnicuVilcea);
				
		Node sibiu = new Node("Sibiu", sibiuChildren);
		
		//Drobeta and its children
		List<Node> drobetaChildren = new ArrayList<Node>();
		drobetaChildren.add(craiova);
				
		Node drobeta = new Node("Drobeta", drobetaChildren);

		//Mahadia and its children
		List<Node> mahadiaChildren = new ArrayList<Node>();
		mahadiaChildren.add(drobeta);
				
		Node mahadia = new Node("Mahadia", mahadiaChildren);

		
		//Lugoj and its children
		List<Node> lugojChildren = new ArrayList<Node>();
		lugojChildren.add(mahadia);
				
		Node lugoj = new Node("Lugoj", lugojChildren);
		
		
		//Timisoara and its children
		List<Node> timisoaraChildren = new ArrayList<Node>();
		timisoaraChildren.add(lugoj);
		
		Node timisoara = new Node("Timisoara", timisoaraChildren);
		
		
		//Oradea and its children
		List<Node> oradeaChildren = new ArrayList<Node>();
		oradeaChildren.add(sibiu);
			
		Node oradea = new Node("Oradea", oradeaChildren);
		
		//Zerind and its children
		List<Node> zerindChildren = new ArrayList<Node>();
		zerindChildren.add(oradea);
				
		Node zerind = new Node("Zerind", zerindChildren);
		
		
		
		//Arad and its children
		List<Node> aradChildren = new ArrayList<Node>();
		aradChildren.add(zerind);
		aradChildren.add(timisoara);
		aradChildren.add(sibiu);
				
		Node arad = new Node("Arad", aradChildren);

		DepthLimitedSearch dls = new DepthLimitedSearch(arad, 3);
		
		dls.DLS(arad, bucharest, 3);
		
		if(dls.getIsFound()){
			System.out.println(bucharest.getCityName() + " found at depth " + dls.getGoalDepth());
			System.out.println("Visited Nodes: " + dls.getVisitedNodes());
			System.out.println("Goal path: " + dls.getGoalPath());
		} else{
			System.err.println(bucharest.getCityName() + " not found within depth limit.");
		}
	
	}
	
}
