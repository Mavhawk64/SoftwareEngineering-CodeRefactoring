package q1.extract_method.refactored;

import java.util.List;

class Graph {
	String name;
	boolean contains(String p) {
		return name.contains(p);
	}
}

public class A {
	
	<T extends Graph> T m(List<T> list, String p) {
		for (T t : list) {
			if(t.contains(p))
				System.out.println(t);
		}
		return null;
	}
	
	Node m1(List<Node> nodes, String p) {
		return (Node)this.m(nodes, p);
	}
	
	Edge m2(List<Edge> edges, String p) {
		return (Edge)this.m(edges, p);
	}
}

class Node extends Graph {
}

class Edge extends Graph {
}