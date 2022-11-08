import java.util.concurrent.TimeUnit;
import android.support.v7.widget.RecyclerView;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import android.view.Choreographer;
import android.view.Choreographer$FrameCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adfg extends iw implements Choreographer$FrameCallback
{
    public final boolean a;
    public wwv b;
    public adft c;
    public boolean d;
    public final auip e;
    private final oas f;
    private final Choreographer g;
    private final adfe h;
    private boolean i;
    
    public adfg(final wvu wvu, final tbv tbv, final uyf uyf, final ExecutorService executorService, final auip e, final oas f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        final ains b = uyf.b();
        float g = 0.0f;
        if (b != null) {
            g = g;
            if ((b.b & 0x1000) != 0x0) {
                answ answ;
                if ((answ = b.j) == null) {
                    answ = answ.a;
                }
                g = answ.g;
            }
        }
        this.a = tbv.c(g, tbw.b);
        this.f = f;
        this.g = Choreographer.getInstance();
        this.h = new adfe(wvu, executorService);
        this.e = e;
        this.i = false;
        this.d = false;
    }
    
    @Override
    public final void b(final RecyclerView recyclerView, int n) {
        if (n != 0) {
            if (n == 1) {
                if (!this.i) {
                    this.g.postFrameCallback((Choreographer$FrameCallback)this);
                    this.i = true;
                    final adfe h = this.h;
                    h.g = 0L;
                    h.h = 0L;
                    h.i = 0;
                    h.c = new int[6];
                    h.d = new long[6];
                    h.e = new long[6];
                    h.f = new int[6];
                    h.j = false;
                    h.k = false;
                    h.l = anup.a;
                    h.m = anuq.a;
                    final adft c = this.c;
                    if (c != null) {
                        c.c();
                    }
                }
            }
        }
        else if (this.i) {
            final adft c2 = this.c;
            if (c2 != null) {
                c2.b();
                this.c = null;
            }
            final adfe h2 = this.h;
            final long c3 = this.f.c();
            final wwv b = this.b;
            String i;
            if (b != null) {
                i = b.i();
            }
            else {
                i = "";
            }
            final long millis = TimeUnit.NANOSECONDS.toMillis(h2.g - h2.h);
            if ((!h2.j || !h2.k) && millis > 0L) {
                final adff adff = new adff(h2.c, h2.e, h2.f, millis);
                n = h2.i;
                if (n < 0) {
                    h2.l = anup.c;
                }
                else if (n > 0) {
                    h2.l = anup.b;
                }
                else {
                    h2.l = anup.a;
                }
                if (!i.isEmpty()) {
                    n = Math.abs(h2.i);
                    h2.o.execute(new adfd(h2, i, adff, n, h2.m, h2.l, c3));
                }
            }
            this.i = false;
        }
    }
    
    public final void doFrame(final long g) {
        if (this.i) {
            this.g.postFrameCallback((Choreographer$FrameCallback)this);
            final adfe h = this.h;
            if (h.h == 0L) {
                h.h = g;
                h.g = g;
                return;
            }
            final long millis = TimeUnit.NANOSECONDS.toMillis(g - h.g);
            if (millis > 17L) {
                final long millis2 = TimeUnit.NANOSECONDS.toMillis(g);
                final double n = (double)millis;
                Double.isNaN(n);
                for (int n2 = (int)(n / 16.67), n3 = 0; n3 < 6 && adfe.a[n3] <= n2; ++n3) {
                    final long[] d = h.d;
                    final long n4 = d[n3];
                    if (n4 != 0L) {
                        final long[] e = h.e;
                        e[n3] += millis2 - n4;
                        final int[] f = h.f;
                        ++f[n3];
                    }
                    d[n3] = millis2;
                    final int[] c = h.c;
                    ++c[n3];
                }
            }
            h.g = g;
        }
    }
    
    @Override
    public final void pu(final RecyclerView recyclerView, final int n, final int n2) {
        final adfe h = this.h;
        if (n != 0) {
            h.j = true;
            h.m = anuq.b;
        }
        if (n2 != 0) {
            h.k = true;
            h.m = anuq.c;
        }
        h.i += n2 + n;
    }
}
