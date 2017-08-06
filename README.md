# shoyu
A Javafx-based graph structure display

This project aims to deliver a simple, usable API for constructing and display the typical node-edge graph.

The main component will be a <i>graph</i> class.
This <i>graph</i> class will act as a container for both <i>nodes</i> and <i>edges</i>.
The client will interact primarily with this <i>graph</i> class to render nodes, edges, labels, and other displayable components.

Special thanks to user Roland, who got me started on Javafx by providing the most amazing answer to the Stack Overflow question found here:
https://stackoverflow.com/questions/30679025/graph-visualisation-like-yfiles-in-javafx


<h2>Key functionalities to deliver</h2>
Below are key functionalities that I hope to incorporate into this project.
These are expected to change throughout the project, so a flexible software design will be necessary.
A more concrete API will be developed once the underlying structure is implemented.

### Graph
The main component that contains and manages graph-nodes and graph-edges.
<ul>
<li><b>Create graph:</b> Create an abstract graph object.</li>
<li><b>Add Node:</b> Add a node object to the board.</li>
<li><b>Add Edge:</b> Add an edge object to the board.</li>
<li><b>Add graph:</b> Add a graph to a scene. This will most likely be accomplished by having graph extend the base JavaFX node class.
<li><b>Remove graph:</b> Remove graph from the scene it belongs to. Much like "Add graph", this will likely be accomplished by having graph extend the base JavaFX node class.
<li><b>Display graph:</b> Display the graph to the user. Should be similar to the
pre-existing setVisible(boolean) method.</li>
<li><b>Reorganize Display:</b>Change the display of the graph to optimize the display.
This will include minimizing the number of overlapping Graph-Edges, spreading apart the Graph-Nodes, and general decluttering of the display.</li>
</ul>

### Graph Node
Named 'graph-node' to avoid confusion with JavaFX's 'Node' class.
<ul>
<li><b>Change Position:</b> The node must be able to change positions.</li>
<li><b>Change Size:</b> The size of the node must be mutable.</li>
<li><b>Change Color:</b> The client must be able to customize node color.</li>
<li><b>Change inner content:</b> The content of the Node must be manageable by the client.</li>
<li><b>Add event handler:</b> The client must be able to add listeners that run custom callback methods when the graph-node is clicked, dragged, hovered over, etc.</li>
</ul>

### Graph Edge
Named 'graph-edge' for consistency with 'graph-node'.
<ul>
<li><b>Attach to a pair of graph-nodes:</b> The user must be able to add a graph-edge to any pair of graph-nodes. Re-orientation of the graph-nodes must result in appropriate re-orientation of the graph-edges.</li>
<li><b>Adjust width:</b> The user must be able to change the width (and possibly style - dashes, color) of the graph-edge.</li>
<li><b>Directed vs Undirected:</b> While a graph-edge specified directed should start at a <i>from</i> graph-node and end at an <i>end</i> graph-node as denoted by an arrow-like style, an undirected graph-edge should have no such direction.</li>
<li><b>Add event handler:</b> The client must be able to add listeners that run custom callback methods when the graph-edge is clicked, dragged, hovered over, etc.</li>
</ul>


<h2>API</h2>

To achieve the above functionalities, the following API will be implemented:
### Graph
The widget that serves as the view for a client.
<ul>
<li><b>void setGraphLayoutManager(GraphLayoutManager):</b> Sets the GraphLayoutManager for this graph.</li>
<li><b>GraphLayoutManager getGraphLayoutManager():</b> Returns the GraphLayoutManager of graph.</li>
<li><b>String addNode(GraphNode):</b> Adds a GraphNode to the graph.</li>
<li><b>void removeNode(String):</b> Deletes a graphNode from the graph by GraphNode UUID.</li>
</ul>

### GraphLayoutManager
Manages the layout of nodes and edges of the associated graph.
<ul>
<li><b>execute:</b> Rearranges Nodes/edges to match the GraphLayoutManager's intended layout.</li>
</ul>






