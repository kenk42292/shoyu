package demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import graph.LayoutManagers.RandomGraphLayoutManager;
import graph.components.Graph;
import graph.components.graphnode.GraphNode;
import graph.components.graphnode.GraphNodeBuilder;
import graph.components.graphnode.GraphNodeType;
import graph.components.graphnode.RectangleNode;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

	private static final Log LOG = LogFactory.getLog(Main.class);

	private static final int DEMO_HEIGHT = 900;
	private static final int DEMO_WIDTH = 1242;

	@Override
	public void start(Stage primaryStage) throws Exception {

		AnchorPane root = new AnchorPane();
		Graph graph = new Graph();
		graph.setGraphLayoutManager(new RandomGraphLayoutManager(graph));
		addDemoContent(graph);
		root.getChildren().add(graph);

		Scene scene = new Scene(root, DEMO_WIDTH, DEMO_HEIGHT);
		primaryStage.setScene(scene);

		primaryStage.show();
		graph.getGraphLayoutManager().execute();

		LOG.info("phase 1 complete");

		graph.getGraphLayoutManager().execute();
	}

	private void addDemoContent(Graph graph) {
		LOG.info("Adding demo content");
		graph.addNode(new GraphNodeBuilder(GraphNodeType.RECTANGLE).build());
		graph.addNode(new GraphNodeBuilder(GraphNodeType.RECTANGLE).build());
		graph.addNode(new GraphNodeBuilder(GraphNodeType.CIRCLE).setColor(Color.BLACK).build());
		graph.addNode(new GraphNodeBuilder(GraphNodeType.CIRCLE).build());
	}

	public static void main(String[] args) {
		LOG.info("Starting demo application...");
		launch(args);
	}
}
