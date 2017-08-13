package graph.components.graphnode;

import javafx.scene.layout.Pane;

public class GraphNode extends Pane {

	String uuid;

	public GraphNode(String nodeId) {
		setUUID(nodeId);
	}

	public String getUUID() {
		return uuid;
	}

	public void setUUID(String uuid) {
		this.uuid = uuid;
	}

}
