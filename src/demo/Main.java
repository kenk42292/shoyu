package demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import graph.Graph;
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
		graph.setGraphLayoutManager(GraphLayoutManagers.RANDOM);
		root.setCenter(graph);
		
		Scene scene = new Scene(root, DEMO_WIDTH, DEMO_HEIGHT);
		primaryStage.setScene(scene);
		
		
		addDemoContent(graph);
		
		
		graph.getLayoutManager().execute();
		
		
	}
	
	private void addDemoContent(Graph graph) {
		graph.addNode(new Node());
	}

	public static void main(String[] args) {
		LOG.info("Starting demo application...");
		launch(args);
	}
}
