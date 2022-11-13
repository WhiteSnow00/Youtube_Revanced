import java.util.concurrent.TimeUnit;
import android.support.v7.widget.RecyclerView;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import android.view.Choreographer;
import android.view.Choreographer$FrameCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adhj extends iw implements Choreographer$FrameCallback
{
    public final boolean a;
    public wyw b;
    public adhw c;
    public boolean d;
    public final aujg e;
    private final oby f;
    private final Choreographer g;
    private final adhh h;
    private boolean i;
    
    public adhj(final wxx wxx, final tdz tdz, final vaf vaf, final ExecutorService executorService, final aujg e, final oby f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        final aipx b = vaf.b();
        float g = 0.0f;
        if (b != null) {
            g = g;
            if ((b.b & 0x1000) != 0x0) {
                anuz anuz;
                if ((anuz = b.j) == null) {
                    anuz = anuz.a;
                }
                g = anuz.g;
            }
        }
        this.a = tdz.c(g, tea.b);
        this.f = f;
        this.g = Choreographer.getInstance();
        this.h = new adhh(wxx, executorService);
        this.e = e;
        this.i = false;
        this.d = false;
    }
    
    public final void b(final RecyclerView recyclerView, int n) {
        if (n != 0) {
            if (n == 1) {
                if (!this.i) {
                    this.g.postFrameCallback((Choreographer$FrameCallback)this);
                    this.i = true;
                    final adhh h = this.h;
                    h.g = 0L;
                    h.h = 0L;
                    h.i = 0;
                    h.c = new int[6];
                    h.d = new long[6];
                    h.e = new long[6];
                    h.f = new int[6];
                    h.j = false;
                    h.k = false;
                    h.l = anws.a;
                    h.m = anwt.a;
                    final adhw c = this.c;
                    if (c != null) {
                        c.c();
                    }
                }
            }
        }
        else if (this.i) {
            final adhw c2 = this.c;
            if (c2 != null) {
                c2.b();
                this.c = null;
            }
            final adhh h2 = this.h;
            final long c3 = this.f.c();
            final wyw b = this.b;
            String i;
            if (b != null) {
                i = b.i();
            }
            else {
                i = "";
            }
            final long millis = TimeUnit.NANOSECONDS.toMillis(h2.g - h2.h);
            if ((!h2.j || !h2.k) && millis > 0L) {
                final adhi adhi = new adhi(h2.c, h2.e, h2.f, millis);
                n = h2.i;
                if (n < 0) {
                    h2.l = anws.c;
                }
                else if (n > 0) {
                    h2.l = anws.b;
                }
                else {
                    h2.l = anws.a;
                }
                if (!i.isEmpty()) {
                    n = Math.abs(h2.i);
                    h2.o.execute(new adhg(h2, i, adhi, n, h2.m, h2.l, c3));
                }
            }
            this.i = false;
        }
    }
    
    public final void doFrame(final long g) {
        if (this.i) {
            this.g.postFrameCallback((Choreographer$FrameCallback)this);
            final adhh h = this.h;
            if (h.h == 0L) {
                h.h = g;
                h.g = g;
                return;
            }
            final long millis = TimeUnit.NANOSECONDS.toMillis(g - h.g);
            if (millis > 17L) {
                final long millis2 = TimeUnit.NANOSECONDS.toMillis(g);
                for (int i = 0; i < 6; ++i) {
                    final double n = (double)millis;
                    final int n2 = adhh.a[i];
                    Double.isNaN(n);
                    if (n2 > (int)(n / 16.67)) {
                        break;
                    }
                    final long[] d = h.d;
                    final long n3 = d[i];
                    if (n3 != 0L) {
                        final long[] e = h.e;
                        e[i] += millis2 - n3;
                        final int[] f = h.f;
                        ++f[i];
                    }
                    d[i] = millis2;
                    final int[] c = h.c;
                    ++c[i];
                }
            }
            h.g = g;
        }
    }
    
    public final void py(final RecyclerView recyclerView, final int n, final int n2) {
        final adhh h = this.h;
        if (n != 0) {
            h.j = true;
            h.m = anwt.b;
        }
        if (n2 != 0) {
            h.k = true;
            h.m = anwt.c;
        }
        h.i += n2 + n;
    }
}
