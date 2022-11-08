import com.google.android.libraries.lidar.VisibilityChangeEventData;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class oyc
{
    public static final void d(final oyp oyp, final VisibilityChangeEventData visibilityChangeEventData, final oxw oxw) {
        final oxs a = visibilityChangeEventData.a;
        final long currentTimeMillis = System.currentTimeMillis();
        final oyu a2 = oyp.t.c.a();
        int b;
        if (a2 != null) {
            final int a3 = a2.a;
            if (oyp.q == 0) {
                oyp.q = a3;
                ((oyt)oyp.f).p = a3;
            }
            b = a2.b;
            oyp.n = a2.c;
        }
        else {
            final int u = oyp.u;
            final int n = b = 0;
            if (u == 2) {
                oyp.u = 1;
                b = n;
            }
        }
        final double b2 = visibilityChangeEventData.b;
        final boolean b3 = oxw.b();
        final long b4 = oyp.b;
        if (b4 > 0L) {
            if (!oyp.m) {
                if (oyp.c == -1L) {
                    oyp.c = currentTimeMillis;
                }
                final int q = oyp.q;
                int r;
                if ((r = b) > q) {
                    if (q <= 0) {
                        r = b;
                    }
                    else {
                        r = q;
                    }
                }
                final long n2 = currentTimeMillis - b4;
                final int n3 = r - oyp.r;
                final long i = oyp.i;
                long max;
                if (!oyp.l && n3 >= 0) {
                    max = Math.max(n2 - n3, 0L);
                }
                else {
                    max = 0L;
                }
                oyp.i = i + max;
                final long j = oyp.j;
                long n4;
                if (n3 < 0) {
                    n4 = Math.abs(n3);
                }
                else {
                    n4 = 0L;
                }
                oyp.j = j + n4;
                if (oyp.k == -1L && r > 0) {
                    oyp.k = currentTimeMillis - oyp.c;
                }
                long n5;
                if (oyp.u == 2) {
                    n5 = n3;
                }
                else {
                    n5 = n2;
                }
                if (!oyp.l) {
                    final oyt oyt = (oyt)oyp.f;
                    final double a4 = a.a;
                    final double p3 = oyp.p;
                    final boolean n6 = oyp.n;
                    final boolean a5 = oyp.a;
                    final double b5 = a.b;
                    final double n7 = b2;
                    oyt.g(n5, a4, n7, p3, n6, a5, b3, b5);
                    oyp.j().g(n5, a.a, n7, oyp.p, oyp.n, oyp.a, b3, a.b);
                }
                if (n3 <= 0) {
                    r = oyp.r;
                }
                oyp.r = r;
                oyp.b = currentTimeMillis;
                oyp.p = b2;
                oyp.g = a;
            }
        }
    }
    
    public abstract double a();
    
    public abstract void b(final oyp p0, final oxw p1);
    
    public abstract void c();
}
