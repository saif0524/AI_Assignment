package ai.dls;

import java.util.List;

public class Node {
	private String cityName;
	private List<Node> chidlNode;
	
	public Node(String cityName, List<Node> children){
		this.cityName = cityName;
		this.chidlNode = children;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public List<Node> getChidlNode() {
		return chidlNode;
	}

	public void setChidlNode(List<Node> chidlNode) {
		this.chidlNode = chidlNode;
	}
	
}
