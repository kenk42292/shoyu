package API;

import java.util.Collection;

import graph.components.graphnode.GraphNode;

/**
 * The client interface for the {@link Graph} view that this library provides.
 */
public interface GraphAPI {

	/** Sets a {@link GraphLayoutManagerAPI} for this graph. */
	public void setGraphLayoutManager(GraphLayoutManagerAPI layoutManager);

	/** Gets the {@link GraphLayoutManagerAPI} of this graph. */
	public GraphLayoutManagerAPI getGraphLayoutManager();

	/** Given a {@link GraphNode}, adds it to this graph. */
	public void addNode(GraphNode node);

	/**
	 * Given the uuid of a {@link GraphNode}, removes the corresponding node
	 * from this graph.
	 */
	public void removeNode(String uuid);

	Collection<GraphNode> getAllGraphNodes();
}
