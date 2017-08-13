package graph.components.graphnode;

import java.util.UUID;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class CircleNode extends GraphNode {

	public CircleNode(UUID uuid, double radius, Color color) {
		super(uuid);
		Circle view = new Circle(radius);
		view.setFill(Color.DODGERBLUE);
		view.setStroke(Color.DODGERBLUE);
		getChildren().add(view);
	}
}
