import java.util.*;

public class DFS
{
	public static void main(String args[])
	{
		int i,nv,ne,v1,v2,s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vertices");
		nv = sc.nextInt();
		System.out.println("Enter the number of edges " );
		ne = sc.nextInt();
		Graph1 g = new Graph1(nv);
		System.out.println("Enter the edges");
		for(i=0;i<ne;i++)
		{
			v1 = sc.nextInt();
			v2 = sc.nextInt();
			g.addEdge(v1,v2);
		}
		System.out.println("Enter the starting vertex:");
		s  =sc.nextInt();
		System.out.println("Depth First Traversal");
		boolean visited[] = new boolean[nv];
		g.DFSTraversal(s,visited);
	}
}

