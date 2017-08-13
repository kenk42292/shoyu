package graph.components.graphnode;

import java.util.UUID;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 * A general builder implementation for all graph nodes. A bit of a mix between
 * the factory and builder patterns. Instances of this class contains all
 * possible fields of all {@link GraphNode}s (of which there is a large overlap
 * of). Depending on the provided {@link GraphNodeType}, this builder
 * instantiates the appropriate {@link GraphNode} object.
 * 
 * This class can be used like:
 * 
 * <pre>
 * GraphNode node = new GraphNodeBuilder(GraphNodeType.RECTANGLE)
 * 							.setWidth(80)
 * 							.setHeight(30)
 * 							.setColor(Color.BLACK)
 * 							.build();
 * </pre>
 */
public class GraphNodeBuilder {

	GraphNodeType type;

	/** Fields that may be long to the various GraphNodes that exist */
	private UUID uuid;
	private double width;
	private double height;
	private double radius;
	private Color color;
	private Image image;
	
	// rotation

	/** Some default values for above fields */
	private static final double DEFAULT_HEIGHT = 50;
	private static final double DEFAULT_WIDTH = 50;
	private static final double DEFAULT_RADIUS = 25;
	private static final Color DEFAULT_COLOR = Color.DODGERBLUE;

	public GraphNodeBuilder(GraphNodeType type) {
		// defaults
		this.type = type;
		uuid = UUID.randomUUID();
		width = DEFAULT_WIDTH;
		height = DEFAULT_HEIGHT;
		radius = DEFAULT_RADIUS;
		color = DEFAULT_COLOR;
		image = null;
	}

	public GraphNode build() {
		switch (type) {
		case RECTANGLE:
			return createRectangleGraphNode();
		case TRIANGLE:
			return createTriangleGraphNode();
		case CIRCLE:
			return createCircleGraphNode();
		case IMAGE:
			return createImageGraphNode();
		default:
			return createCircleGraphNode();
		}
	}

	private GraphNode createRectangleGraphNode() {
		return new RectangleNode(uuid, width, height, color);
	}
	
	private GraphNode createTriangleGraphNode() {
		return null; //TODO: Implement... as polygon? hmm
	}
	
	private GraphNode createCircleGraphNode() {
		return new CircleNode(uuid, radius, color);
	}

	private GraphNode createImageGraphNode() {
		return null; //TODO: Implement somehow
	}

	public GraphNodeBuilder setUUID(UUID uuid) {
		this.uuid = uuid;
		return this;
	}

	public GraphNodeBuilder setWidth(double width) {
		this.width = width;
		return this;
	}

	public GraphNodeBuilder setHeight(double height) {
		this.height = height;
		return this;
	}
	
	public GraphNodeBuilder setRadius(double radius) {
		this.radius = radius;
		return this;
	}
	public GraphNodeBuilder setColor(Color color) {
		this.color = color;
		return this;
	}

	public GraphNodeBuilder setImage(Image image) {
		this.image = image;
		return this;
	}

}
