import java.util.Map;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

final class bnn implements bbl
{
    private final bbl a;
    private final int b;
    private final bnm c;
    private final byte[] d;
    private int e;
    
    public bnn(final bbl a, final int n, final bnm c) {
        dk.f(n > 0);
        this.a = a;
        this.b = n;
        this.c = c;
        this.d = new byte[1];
        this.e = n;
    }
    
    public final int a(final byte[] array, int a, final int n) {
        int e = 0;
        Label_0286: {
            if ((e = this.e) == 0) {
                final bbl a2 = this.a;
                final byte[] d = this.d;
                int n2 = 0;
                if (a2.a(d, 0, 1) != -1) {
                    final int n3 = (this.d[0] & 0xFF) << 4;
                    if (n3 != 0) {
                        final byte[] array2 = new byte[n3];
                        int n4 = n3;
                        int i;
                        while (true) {
                            i = n3;
                            if (n4 <= 0) {
                                break;
                            }
                            final int a3 = this.a.a(array2, n2, n4);
                            if (a3 == -1) {
                                return -1;
                            }
                            n2 += a3;
                            n4 -= a3;
                        }
                        while (i > 0) {
                            final int n5 = i - 1;
                            if (array2[n5] != 0) {
                                break;
                            }
                            i = n5;
                        }
                        if (i > 0) {
                            final bnm c = this.c;
                            final bas bas = new bas(array2, i);
                            final bok bok = (bok)c;
                            long n6;
                            if (!bok.f) {
                                n6 = bok.c;
                            }
                            else {
                                n6 = Math.max(bok.g.k(true), bok.c);
                            }
                            final int a4 = bas.a();
                            final bud e2 = bok.e;
                            dk.d((Object)e2);
                            bhq.g(e2, bas, a4);
                            e2.e(n6, 1, a4, 0, (buc)null);
                            bok.f = true;
                        }
                    }
                    e = this.b;
                    this.e = e;
                    break Label_0286;
                }
                return -1;
            }
        }
        a = this.a.a(array, a, Math.min(e, n));
        if (a != -1) {
            this.e -= a;
        }
        return a;
    }
    
    public final long b(final bbp bbp) {
        throw new UnsupportedOperationException();
    }
    
    public final Uri c() {
        return this.a.c();
    }
    
    public final Map d() {
        return this.a.d();
    }
    
    public final void e(final bco bco) {
        dk.d((Object)bco);
        this.a.e(bco);
    }
    
    public final void f() {
        throw new UnsupportedOperationException();
    }
}
