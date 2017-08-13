package graph.components.graphnode;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectangleNode extends GraphNode {

	public RectangleNode(String uuid) {
		super(uuid);

		Rectangle view = new Rectangle(50, 50);

		view.setFill(Color.DODGERBLUE);
		view.setStroke(Color.DODGERBLUE);

		getChildren().add(view);
	}

}
