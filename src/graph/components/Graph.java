package graph.components;

import java.util.HashMap;
import java.util.Map;

import API.GraphAPI;
import API.GraphLayoutManagerAPI;
import javafx.scene.Parent;

public class Graph extends Parent implements GraphAPI {

	Map<String, GraphNode> uuidToNode;

	public Graph() {
		init();
	}

	private void init() {
		this.uuidToNode = new HashMap<>();
	}

	@Override
	public void setGraphLayoutManager(GraphLayoutManagerAPI layoutManager) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GraphLayoutManagerAPI getGraphLayoutManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addNode(GraphNode node) {
		String uuid = node.getUUID();
		uuidToNode();
		return uuid;
	}

	@Override
	public void removeNode(String uuid) {
		uuidToNode.remove(uuid);
	}



}
