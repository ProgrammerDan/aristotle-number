import java.util.*;
class A{
boolean c(Set<Integer>u,int z){return!u.contains(z);}
Set<Integer> b(Set<Integer>c){return new HashSet<Integer>(c);}
void w(){Set<Integer>t,u,v,w,x,y,z,T;int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s;for(a=1;a<20;a++)for(b=1;b<20;b++)if(b!=a)for(c=1;c<20;c++)if(c!=a&&c!=b)if(a+b+c==38)for(d=1;d<20;d++)
			if(d!=a&&d!=b&&d!=c)
				for(h=1;h<20;h++)
					if(h!=d&&h!=a&&h!=b&&h!=c)
						if(a+d+h==38){
							t=new HashSet<Integer>();
							t.add(a);t.add(b);t.add(c);
							t.add(d);t.add(h);
		for(m=1;m<20;m++)
			if(c(t,m))
				for(q=1;q<20;q++)
					if(q!=m&&c(t,q))
						if(h+m+q==38){
							u=b(t);
							u.add(m);u.add(q);
		for(r=1;r<20;r++)
			if(c(u,r))
				for(s=1;s<20;s++)
					if(s!=r&&c(u,s))
						if(q+r+s==38){
							v=b(u);
							v.add(r);v.add(s);
		for(p=1;p<20;p++)
			if(c(v,p))
				for(l=1;l<20;l++)
					if(l!=p&&c(v,l))
						if(s+p+l==38){
							w=b(v);
							w.add(p);w.add(l);
		for(g=1;g<20;g++)
			if(c(w,g))
				if(l+g+c==38){
					x=b(w);
					x.add(g);
		for(e=1;e<20;e++)
			if(c(x,e))
				for(f=1;f<20;f++)
					if(f!=e&&c(x,f))
						if(d+e+f+g==38){
							y=b(x);
							y.add(e);y.add(f);
		for(i=1;i<20;i++)
			if(c(y,i))
				for(n=1;n<20;n++)
					if(n!=i&&c(y,n))
						if(d+i+n+r==38&&b+e+i+m==38){
							z=b(y);
							z.add(i);z.add(n);
		for(o=1;o<20;o++)
			if(c(z,o))
				for(k=1;k<20;k++)
					if(k!=o&&c(z,k))
						if(m+n+o+p==38&&r+o+k+g==38&&
							b+f+k+p==38){
							T=b(z);
							T.add(o);T.add(k);
		for(j=1;j<20;j++)
			if(c(T,j))
				if(a+e+j+o+s==38&&c+f+j+n+q==38&&
					h+i+j+k+l==38){
System.out.printf("%6d%4d%4d\n\n",a,b,c);System.out.printf("%4d%4d%4d%4d\n\n",d,e,f,g);System.out.printf("%2d%4d%4d%4d%4d\n\n",h,i,j,k,l);System.out.printf("%4d%4d%4d%4d\n\n",m,n,o,p);System.out.printf("%6d%4d%4d\n\n",q,r,s);
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

	public static void main(String[]a) {
		(new A()).w();
	}
}
