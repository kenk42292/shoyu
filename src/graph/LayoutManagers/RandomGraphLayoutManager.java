package graph.LayoutManagers;

import java.util.Collection;
import java.util.Random;

import API.GraphLayoutManagerAPI;
import graph.components.Graph;
import graph.components.graphnode.GraphNode;

public class RandomGraphLayoutManager implements GraphLayoutManagerAPI {

	Graph graph;
	
	Random rnd;

	public RandomGraphLayoutManager(Graph graph) {
		this.graph = graph;
		rnd = new Random();
	}

	@Override
	public void execute() {
        Collection<GraphNode> allNodes = graph.getAllGraphNodes();

        for (GraphNode node : allNodes) {

            double x = rnd.nextDouble() * 500;
            double y = rnd.nextDouble() * 500;

            node.relocate(x, y);

        }
	}

}
