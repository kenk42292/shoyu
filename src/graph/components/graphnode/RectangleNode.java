package graph.components.graphnode;

import java.util.UUID;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectangleNode extends GraphNode {

	public RectangleNode(UUID uuid, double width, double height, Color color) {
		super(uuid);
		Rectangle view = new Rectangle(width, height);
		view.setFill(Color.DODGERBLUE);
		view.setStroke(Color.DODGERBLUE);
		getChildren().add(view);
	}
}
