package graph.components;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import API.GraphAPI;
import API.GraphLayoutManagerAPI;
import graph.components.graphnode.GraphNode;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * The widget for the graph itself. Note lack of separation between model and
 * view.
 */
public class Graph extends Parent implements GraphAPI {

	private static final Log LOG = LogFactory.getLog(Graph.class);

	// Model
	Map<String, GraphNode> uuidToNode;

	Map<String, GraphEdge> uuidToEdge; // The edge-uuids will be a concatenation
										// of the 2 component node uuids.

	// View
	Group canvas;

	// LayoutManager
	private GraphLayoutManagerAPI layoutManager;

	public Graph() {
		init();
	}

	private void init() {
		uuidToNode = new HashMap<>();
		canvas = new Group();
//		getChildren().add(canvas);
	}

	@Override
	public Collection<GraphNode> getAllGraphNodes() {
		return uuidToNode.values();
	}

	public Group getCanvas() {
		return canvas;
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
		
		// The graphNode to add
		Pane node = new Pane();
		Rectangle view = new Rectangle(50, 50);
		view.setFill(Color.DODGERBLUE);
		view.setStroke(Color.DODGERBLUE);
		node.getChildren().add(view);
		
		
		
		canvas.getChildren().add(node);
	}

	@Override
	public void removeNode(String uuid) {
		uuidToNode.remove(uuid);
	}

}
