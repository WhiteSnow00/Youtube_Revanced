import android.graphics.PointF;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ebt extends mx
{
    private static int b = Integer.MAX_VALUE;
    
    public ebt(final int b) {
        ebt.b = b;
    }
    
    private final int i(final nw nw, final nk nk, int n, int n2) {
        final int[] g = ((nz)this).g(n, n2);
        final int as = nw.as();
        final float n3 = 1.0f;
        float n4;
        if (as == 0) {
            n4 = n3;
        }
        else {
            View view = null;
            View view2 = null;
            n2 = Integer.MAX_VALUE;
            n = Integer.MIN_VALUE;
            for (int i = 0; i < as; ++i) {
                final View ab = nw.aB(i);
                final int bo = nw.bo(ab);
                if (bo != -1) {
                    int n5;
                    if (bo < n2) {
                        n5 = bo;
                    }
                    else {
                        n5 = n2;
                    }
                    if (bo < n2) {
                        view = ab;
                    }
                    if (bo > n) {
                        view2 = ab;
                        n = bo;
                    }
                    n2 = n5;
                }
            }
            n4 = n3;
            if (view != null) {
                if (view2 == null) {
                    n4 = n3;
                }
                else {
                    final int n6 = Math.max(nk.a(view), nk.a(view2)) - Math.min(nk.d(view), nk.d(view2));
                    if (n6 == 0) {
                        n4 = n3;
                    }
                    else {
                        n4 = n6 / (float)(n - n2 + 1);
                    }
                }
            }
        }
        if (n4 <= 0.0f) {
            return 0;
        }
        if (Math.abs(g[0]) > Math.abs(g[1])) {
            n = g[0];
        }
        else {
            n = g[1];
        }
        return Math.round(n / n4);
    }
    
    public final int a(final nw nw, int n, int i) {
        if (!(nw instanceof oi)) {
            return -1;
        }
        final int av = nw.av();
        if (av == 0) {
            return -1;
        }
        final View b = this.b(nw);
        if (b == null) {
            return -1;
        }
        final int bo = nw.bo(b);
        if (bo == -1) {
            return -1;
        }
        final int n2 = av - 1;
        final PointF p3 = ((oi)nw).P(n2);
        if (p3 == null) {
            return -1;
        }
        final boolean ae = nw.ae();
        final int n3 = 0;
        if (ae) {
            final int j = this.i(nw, nk.p(nw), n, 0);
            final int b2 = ebt.b;
            if ((n = j) > b2) {
                n = b2;
            }
            final int n4 = -b2;
            int n5;
            if ((n5 = n) < n4) {
                n5 = n4;
            }
            n = n5;
            if (p3.x < 0.0f) {
                n = -n5;
            }
        }
        else {
            n = 0;
        }
        if (nw.af()) {
            final int n6 = i = this.i(nw, nk.r(nw), 0, i);
            if (p3.y < 0.0f) {
                i = -n6;
            }
        }
        else {
            i = 0;
        }
        if (nw.af()) {
            n = i;
        }
        if (n == 0) {
            return -1;
        }
        n += bo;
        if (n < 0) {
            n = n3;
        }
        if (n >= av) {
            return n2;
        }
        return n;
    }
}
