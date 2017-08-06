package graph.LayoutManagers;

import java.util.Random;

import API.GraphLayoutManagerAPI;
import graph.components.Graph;

public class RandomGraphLayoutManager implements GraphLayoutManagerAPI {

	Graph graph;
	
	Random rnd;

	public RandomGraphLayoutManager(Graph graph) {
		this.graph = graph;
		rnd = new Random();
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub

	}

}
