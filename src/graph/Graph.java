package graph;

import java.util.HashMap;
import java.util.Map;

public class Graph {

	Map<String, GraphNode> uuidToNode;

	public Graph() {
		init();
	}

	private void init() {
		this.uuidToNode = new HashMap<>();
	}

	public String addNode(GraphNode node) {
		String uuid = "";
		return uuid;
	}

	public String removeNode(String uuid) {
		return uuid;
	}

}
