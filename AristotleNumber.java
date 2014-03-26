import java.util.*;
/**
 * Solving Aristotle's number problem.
 * First observation: there are a strictly constrained number
 *   of 3-,4-,and 5- tuples that will satisfy the equality constraint.
 * Second observation: An acceptable set of satisfying tuples are all
 *   connected in a clearly defined way, allowing potential solutions
 *   to be quickly tested.
 * Third observation: It will be useful at a first pass to define these
 *   connections and leverage them in a solution checker.
 * Fourth observation: There is a very limited number of solutions that
 *   satisfy the equality and connectivity requirements.
 *
 * Rules: Set of 19 cells, like so:
 *   a b c
 *  d e f g
 * h i j k l
 *  m n o p
 *   q r s
 *
 * Every axis must sum to 38. Each cell must contain a number between
 * 1 and 19, with each number represented only once.
 */
public class AristotleNumber {
boolean c(Set<Integer>u,int z){return!u.contains(z);}
	void win() {
		int z= 0;
		for (int a = 1; a <= 19; a++)
			for (int b = 1; b <= 19; b++)
				if (b != a)
					for (int c = 1; c <= 19; c++)
						if (c != a && c != b)
							if (a + b + c == 38)
		for (int d = 1; d <= 19; d++)
			if (d != a && d != b && d != c)
				for (int h = 1; h <= 19; h++)
					if (h != d && h != a && h != b && h != c)
						if (a + d + h == 38){
							Set<Integer> used = new HashSet<Integer>();
							used.add(a);used.add(b);used.add(c);
							used.add(d);used.add(h);
		for (int m = 1; m <= 19; m++)
			if (c(used,m))
				for (int q = 1; q <= 19; q++)
					if (q != m && c(used,q))
						if (h + m + q == 38) {
							Set<Integer> used3 = new HashSet<Integer>(used);
							used3.add(m); used3.add(q);
		for (int r = 1; r <= 19; r++)
			if (c(used3,r))
				for (int s = 1; s <= 19; s++)
					if (s != r && c(used3,s))
						if (q + r + s == 38) {
							Set<Integer> used4 = new HashSet<Integer>(used3);
							used4.add(r); used4.add(s);
		for (int p = 1; p <= 19; p++)
			if (c(used4,p))
				for (int l = 1; l <= 19; l++)
					if (l != p && c(used4,l))
						if (s + p + l == 38) {
							Set<Integer> used5 = new HashSet<Integer>(used4);
							used5.add(p); used5.add(l);
		for (int g = 1; g <= 19; g++)
			if (c(used5,g))
				if (l + g + c == 38) {
					// outerboards
					Set<Integer> used6 = new HashSet<Integer>(used5);
					used6.add(g);
		for (int e = 1; e <= 19; e++)
			if (c(used6,e))
				for (int f = 1; f <= 19; f++)
					if (f != e && c(used6,f))
						if (d + e + f + g == 38) { 
							Set<Integer> used7 = new HashSet<Integer>(used6);
							used7.add(e); used7.add(f);
		for (int i = 1; i <= 19; i++)
			if (c(used7,i))
				for (int n = 1; n <= 19; n++)
					if (n != i && c(used7,n))
						if (d + i + n + r == 38 && b + e + i + m == 38) {
							Set<Integer> used8 = new HashSet<Integer>(used7);
							used8.add(i); used8.add(n);
		for (int o = 1; o <= 19; o++)
			if (c(used8,o))
				for (int k = 1; k <= 19; k++)
					if (k != o && c(used8,k))
						if (m + n + o + p == 38 && r + o + k + g == 38 &&
							b + f + k + p == 38) {
							Set<Integer> used9 = new HashSet<Integer>(used8);
							used9.add(o); used9.add(k);
		for (int j = 1; j <= 19; j++)
			if (c(used9,j))
				if (a + e + j + o + s == 38 && c + f + j + n + q == 38 &&
					h + i + j + k + l == 38) {
						z++;
System.out.printf("%6d%4d%4d\n\n",a,b,c);System.out.printf("%4d%4d%4d%4d\n\n",d,e,f,g);System.out.printf("%2d%4d%4d%4d%4d\n\n",h,i,j,k, l);System.out.printf("%4d%4d%4d%4d\n\n",m,n,o,p);System.out.printf("%6d%4d%4d\n\n",q,r,s);
				}
						}
						}
						}
				}
						}
						}
						}
						}
		System.out.println("wins: "  + z);
	}

	public static void main(String[] args) {
		AristotleNumber an = new AristotleNumber();
		an.win();
	}
}
