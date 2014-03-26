import java.util.HashSet;
import java.util.Set;
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
	public int countValidThreeples() {
		int count = 0;
		for (int a = 1; a <= 19; a++) {
			for (int b = 1; b <= 19; b++) {
				if (a == b) continue;
				for (int c = 1; c <= 19; c++) {
					if (a == c || b == c) continue;
					if (a + b + c == 38) count++;
				}
			}
		}
		return count;
	}

	public int countWins() {
		int winCount = 0;
		for (int a = 1; a <= 19; a++) {
			for (int b = 1; b <= 19; b++)  {
				if (b == a) continue;
				for (int c = 1; c <= 19; c++) {
					if (c == a || c == b) continue;
					if (a + b + c == 38) {
						Set<Integer> used = new HashSet<Integer>();
						used.add(a);
						used.add(b);
						used.add(c);
		for (int d = 1; d <= 19; d++) {
			if (d == a || used.contains(d)) continue;
			for (int h = 1; h <= 19; h++) {
				if (h == d || h == a || used.contains(h)) continue;
				if (a + d + h == 38) {
					Set<Integer> used2 = new HashSet<Integer>();
					used2.addAll(used);
					used2.add(d);
					used2.add(h);
		for (int m = 1; m <= 19; m++) {
			if (m == h || used2.contains(m)) continue;
			for (int q = 1; q <= 19; q++) {
				if (q == m || q == h || used2.contains(q)) continue;
				if (h + m + q == 38) {
					Set<Integer> used3 = new HashSet<Integer>();
					used3.addAll(used2);
					used3.add(m);
					used3.add(q);
		for (int r = 1; r <= 19; r++) {
			if (r == q || used3.contains(r)) continue;
			for (int s = 1; s <= 19; s++) {
				if (s == r || s == q || used3.contains(s)) continue;
				if (q + r + s == 38) {
					Set<Integer> used4 = new HashSet<Integer>();
					used4.addAll(used3);
					used4.add(r);
					used4.add(s);
		for (int p = 1; p <= 19; p++) {
			if (p == s || used4.contains(p)) continue;
			for (int l = 1; l <= 19; l++) {
				if (l == p || l == s || used4.contains(l)) continue;
				if (s + p + l == 38) {
					Set<Integer> used5 = new HashSet<Integer>();
					used5.addAll(used4);
					used5.add(p);
					used5.add(l);
		for (int g = 1; g <= 19; g++) {
			if (g == l || g == c || used5.contains(g)) continue;
			if (l + g + c == 38) {
				// outerboards
				Set<Integer> used6 = new HashSet<Integer>();
				used6.addAll(used5);
				used6.add(g);
		for (int e = 1; e <= 19; e++) {
			if (used6.contains(e)) continue;
			for (int f = 1; f <= 19; f++) {
				if (f == e || used6.contains(f)) continue;
				if (d + e + f + g == 38) { 
					Set<Integer> used7 = new HashSet<Integer>();
					used7.addAll(used6);
					used7.add(e);
					used7.add(f);
		for (int i = 1; i <= 19; i++) {
			if (used7.contains(i)) continue;
			for (int n = 1; n <= 19; n++) {
				if (n == i || used7.contains(n)) continue;
				if (d + i + n + r == 38 && b + e + i + m == 38) {
					Set<Integer> used8 = new HashSet<Integer>();
					used8.addAll(used7);
					used8.add(i);
					used8.add(n);
		for (int o = 1; o <= 19; o++) {
			if (used8.contains(o)) continue;
			for (int k = 1; k <= 19; k++) {
				if (k == o || used8.contains(k)) continue;
				if (m + n + o + p == 38 && r + o + k + g == 38 &&
					b + f + k + p == 38) {
					Set<Integer> used9 = new HashSet<Integer>();
					used9.addAll(used8);
					used9.add(o);
					used9.add(k);
		for (int j = 1; j <= 19; j++) {
			if (used9.contains(j)) continue;
			if (a + e + j + o + s == 38 && c + f + j + n + q == 38 &&
				h + i + j + k + l == 38) {
				System.out.printf("    %2d  %2d  %2d    \n\n", a, b, c);
				System.out.printf("  %2d  %2d  %2d  %2d  \n\n", d, e, f, g);
				System.out.printf("%2d  %2d  %2d  %2d  %2d\n\n", h, i, j, k, l);
				System.out.printf("  %2d  %2d  %2d  %2d  \n\n", m, n, o, p);
				System.out.printf("    %2d  %2d  %2d    \n\n", q, r, s);
				winCount++;
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
			}
		}
				}
			}
		}
					}
				}
			}
		}
		return winCount;
	}


	public int countValidFourples() {
		int count = 0;
		for (int d = 1; d <= 19; d++) {
			for (int e = 1; e <= 19; e++) {
				if (d == e) continue;
				for (int f = 1; f <= 19; f++) {
					if (d == f || e == f) continue;
					for (int g = 1; g <= 19; g++) {
						if (d == g || e == g || f == g) continue;
						if (d + e + f + g == 38) count++;
					}
				}
			}
		}
		return count;
	}

	public int countValidFiveples() {
		int count = 0;
		for (int h = 1; h <= 19; h++) {
			for (int i = 1; i <= 19; i++) {
				if (h == i) continue;
				for (int j = 1; j <= 19; j++) {
					if (h == j || i == j) continue;
					for (int k = 1; k <= 19; k++) {
						if (h == k || i == k || j == k) continue;
						for (int l = 1; l <= 19; l++) {
							if (h == l || i == l || j == l || k == l) continue;
							if (h + i + j + k + l == 38) count++;
						}
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		AristotleNumber an = new AristotleNumber();
		System.out.println("Wins: " + an.countWins());
	}
}
