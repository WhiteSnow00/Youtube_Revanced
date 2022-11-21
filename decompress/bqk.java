import android.graphics.Point;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqk implements bqv
{
    public final bqo a;
    public final Object b;
    private final int c;
    
    public bqk(final bqo a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bqk(final bqo a, final int[] b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final List a(final int n, final azo azo, final int[] array) {
        if (this.c != 0) {
            final bqo a = this.a;
            final Object b = this.b;
            final afjr a2 = bqy.a;
            final int n2 = ((int[])b)[n];
            final int j = a.j;
            final int k = a.k;
            final boolean l = a.l;
            int n3;
            if (j != Integer.MAX_VALUE && k != Integer.MAX_VALUE) {
                int i = 0;
                n3 = Integer.MAX_VALUE;
                while (i < azo.a) {
                    final ayh a3 = azo.a(i);
                    final int s = a3.s;
                    int n4 = n3;
                    if (s > 0) {
                        final int t = a3.t;
                        n4 = n3;
                        if (t > 0) {
                            int n5;
                            int n6;
                            if (l && s > t != j > k) {
                                n5 = j;
                                n6 = k;
                            }
                            else {
                                n6 = j;
                                n5 = k;
                            }
                            final int n7 = s * n5;
                            final int n8 = t * n6;
                            Point point;
                            if (n7 >= n8) {
                                point = new Point(n6, baz.c(n8, s));
                            }
                            else {
                                point = new Point(baz.c(n7, t), n5);
                            }
                            final int s2 = a3.s;
                            final int n9 = a3.t * s2;
                            n4 = n3;
                            if (s2 >= (int)(point.x * 0.98f)) {
                                n4 = n3;
                                if (a3.t >= (int)(point.y * 0.98f) && n9 < (n4 = n3)) {
                                    n4 = n9;
                                }
                            }
                        }
                    }
                    ++i;
                    n3 = n4;
                }
            }
            else {
                n3 = Integer.MAX_VALUE;
            }
            final afgc d = afgh.d();
            for (int n10 = 0; n10 < azo.a; ++n10) {
                final int a4 = azo.a(n10).a();
                d.h(new bqx(n, azo, n10, a, array[n10], n3 == Integer.MAX_VALUE || (a4 != -1 && a4 <= n3)));
            }
            return d.g();
        }
        final bqo a5 = this.a;
        final Object b2 = this.b;
        final afjr a6 = bqy.a;
        final afgc d2 = afgh.d();
        for (int n11 = 0; n11 < azo.a; ++n11) {
            d2.h(new bqu(n, azo, n11, a5, array[n11], (String)b2));
        }
        return d2.g();
    }
}
