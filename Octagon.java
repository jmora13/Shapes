
public class Octagon implements Polygon{
	int vertices, edges, width;
	public Octagon(int oVertices, int oEdges, int oWidth){
		vertices = oVertices;
		edges = oEdges;
		width = oWidth;
	}
	public int getNumVertices() {
		return vertices;
	}

	public void setNumVertices(int numVertices) {
		vertices = numVertices;
	}

	public int getNumEdges() {
		return edges;
	}

	public void setNumEdges(int numEdges) {
		edges = numEdges;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int numWidth ) {
		width = numWidth;
	}

}
