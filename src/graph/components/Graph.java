package graph.components;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import API.GraphAPI;
import API.GraphLayoutManagerAPI;
import graph.components.graphnode.GraphNode;
import javafx.scene.Group;

/**
 * The widget for the graph itself. Note lack of separation between model and
 * view.
 */
public class Graph extends Group implements GraphAPI {

	private static final Log LOG = LogFactory.getLog(Graph.class);

	// Model
	Map<UUID, GraphNode> uuidToNode;
	Set<GraphEdge> uuidToEdge;

	// LayoutManager
	private GraphLayoutManagerAPI layoutManager;

	public Graph() {
		super();
		init();
	}

	private void init() {
		uuidToNode = new HashMap<>();
	}

	@Override
	public Collection<GraphNode> getAllGraphNodes() {
		return uuidToNode.values();
	}

	@Override
	public void setGraphLayoutManager(GraphLayoutManagerAPI layoutManager) {
		this.layoutManager = layoutManager;
	}

	@Override
	public GraphLayoutManagerAPI getGraphLayoutManager() {
		return layoutManager;
	}

	@Override
	public void addNode(GraphNode graphNode) {
		LOG.info("Adding graphNode with uuid: " + graphNode.getUUID());

		// model
		uuidToNode.put(graphNode.getUUID(), graphNode);

		// view
		getChildren().add(graphNode);
		if (layoutManager != null) {
			layoutManager.execute();
		}
	}

	@Override
	public void removeNode(String uuid) {
		uuidToNode.remove(uuid);
	}

}
