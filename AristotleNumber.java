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
Set<Integer> b(Set<Integer>c){return new HashSet<Integer>(c);}
	void win() {
		Set<Integer> t,u,v,w,x,y,z,T;
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
							t = new HashSet<Integer>();
							t.add(a);t.add(b);t.add(c);
							t.add(d);t.add(h);
		for (int m = 1; m <= 19; m++)
			if (c(t,m))
				for (int q = 1; q <= 19; q++)
					if (q != m && c(t,q))
						if (h + m + q == 38) {
							u = b(t);
							u.add(m); u.add(q);
		for (int r = 1; r <= 19; r++)
			if (c(u,r))
				for (int s = 1; s <= 19; s++)
					if (s != r && c(u,s))
						if (q + r + s == 38) {
							v = b(u);
							v.add(r); v.add(s);
		for (int p = 1; p <= 19; p++)
			if (c(v,p))
				for (int l = 1; l <= 19; l++)
					if (l != p && c(v,l))
						if (s + p + l == 38) {
							w = b(v);
							w.add(p); w.add(l);
		for (int g = 1; g <= 19; g++)
			if (c(w,g))
				if (l + g + c == 38) {
					x = b(w);
					x.add(g);
		for (int e = 1; e <= 19; e++)
			if (c(x,e))
				for (int f = 1; f <= 19; f++)
					if (f != e && c(x,f))
						if (d + e + f + g == 38) { 
							y = b(x);
							y.add(e); y.add(f);
		for (int i = 1; i <= 19; i++)
			if (c(y,i))
				for (int n = 1; n <= 19; n++)
					if (n != i && c(y,n))
						if (d + i + n + r == 38 && b + e + i + m == 38) {
							z = b(y);
							z.add(i); z.add(n);
		for (int o = 1; o <= 19; o++)
			if (c(z,o))
				for (int k = 1; k <= 19; k++)
					if (k != o && c(z,k))
						if (m + n + o + p == 38 && r + o + k + g == 38 &&
							b + f + k + p == 38) {
							T = b(z);
							T.add(o); T.add(k);
		for (int j = 1; j <= 19; j++)
			if (c(T,j))
				if (a + e + j + o + s == 38 && c + f + j + n + q == 38 &&
					h + i + j + k + l == 38) {
System.out.printf("%6d%4d%4d\n\n",a,b,c);System.out.printf("%4d%4d%4d%4d\n\n",d,e,f,g);System.out.printf("%2d%4d%4d%4d%4d\n\n",h,i,j,k, l);System.out.printf("%4d%4d%4d%4d\n\n",m,n,o,p);System.out.printf("%6d%4d%4d\n\n",q,r,s);
					return;
				}
						}
						}
						}
				}
						}
						}
						}
						}
	}

	public static void main(String[] args) {
		AristotleNumber an = new AristotleNumber();
		an.win();
	}
}
