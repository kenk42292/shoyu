package graph.components.graphnode;

import java.util.UUID;

import javafx.scene.layout.Pane;

public abstract class GraphNode extends Pane {

	UUID uuid;

	public GraphNode(UUID nodeId) {
		setUUID(nodeId);
	}

	public UUID getUUID() {
		return uuid;
	}

	public void setUUID(UUID uuid) {
		this.uuid = uuid;
	}

}
