package demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import graph.LayoutManagers.RandomGraphLayoutManager;
import graph.components.Graph;
import graph.components.graphnode.GraphNode;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	private static final Log LOG = LogFactory.getLog(Main.class);

	private static final int DEMO_HEIGHT = 768;
	private static final int DEMO_WIDTH = 1024;

	@Override
	public void start(Stage primaryStage) throws Exception {

		BorderPane root = new BorderPane();
		Graph graph = new Graph();
//		graph.setGraphLayoutManager(new RandomGraphLayoutManager(graph));
		addDemoContent(graph);
		root.setCenter(graph.getCanvas());
		
		Scene scene = new Scene(root, DEMO_WIDTH, DEMO_HEIGHT);
		primaryStage.setScene(scene);
		
		primaryStage.show();
//		graph.getGraphLayoutManager().execute();

	}

	private void addDemoContent(Graph graph) {
		LOG.info("Adding demo content");
		String nodeId1 = "nodeId1";
		String nodeId2 = "nodeId2";
		String nodeId3 = "nodeId3";
		String nodeId4 = "nodeId4";
		String nodeId5 = "nodeId5";
		graph.addNode(new GraphNode(nodeId1));
		graph.addNode(new GraphNode(nodeId2));
		graph.addNode(new GraphNode(nodeId3));
		graph.addNode(new GraphNode(nodeId4));
		graph.addNode(new GraphNode(nodeId5));
	}

	public static void main(String[] args) {
		LOG.info("Starting demo application...");
		launch(args);
	}
}
