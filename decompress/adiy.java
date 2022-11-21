import java.util.concurrent.TimeUnit;
import android.support.v7.widget.RecyclerView;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import android.view.Choreographer;
import android.view.Choreographer$FrameCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adiy extends hz implements Choreographer$FrameCallback
{
    public final boolean a;
    public xab b;
    public adjm c;
    public boolean d;
    public final aapu e;
    private final oco f;
    private final Choreographer g;
    private final adiw h;
    private boolean i;
    
    public adiy(final wza wza, final tfd tfd, final vbo vbo, final ExecutorService executorService, final aapu e, final oco f, final byte[] array, final byte[] array2, final byte[] array3) {
        final airq b = vbo.b();
        float g = 0.0f;
        if (b != null) {
            g = g;
            if ((b.b & 0x1000) != 0x0) {
                anxf anxf;
                if ((anxf = b.j) == null) {
                    anxf = anxf.a;
                }
                g = anxf.g;
            }
        }
        this.a = tfd.c(g, tfe.b);
        this.f = f;
        this.g = Choreographer.getInstance();
        this.h = new adiw(wza, executorService);
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
                    final adiw h = this.h;
                    h.g = 0L;
                    h.h = 0L;
                    h.i = 0;
                    h.c = new int[6];
                    h.d = new long[6];
                    h.e = new long[6];
                    h.f = new int[6];
                    h.j = false;
                    h.k = false;
                    h.l = anyy.a;
                    h.m = anyz.a;
                    final adjm c = this.c;
                    if (c != null) {
                        c.c();
                    }
                }
            }
        }
        else if (this.i) {
            final adjm c2 = this.c;
            if (c2 != null) {
                c2.b();
                this.c = null;
            }
            final adiw h2 = this.h;
            final long c3 = this.f.c();
            final xab b = this.b;
            String i;
            if (b != null) {
                i = b.i();
            }
            else {
                i = "";
            }
            final long millis = TimeUnit.NANOSECONDS.toMillis(h2.g - h2.h);
            if ((!h2.j || !h2.k) && millis > 0L) {
                final adix adix = new adix(h2.c, h2.e, h2.f, millis);
                n = h2.i;
                if (n < 0) {
                    h2.l = anyy.c;
                }
                else if (n > 0) {
                    h2.l = anyy.b;
                }
                else {
                    h2.l = anyy.a;
                }
                if (!i.isEmpty()) {
                    n = Math.abs(h2.i);
                    h2.o.execute(new adiv(h2, i, adix, n, h2.m, h2.l, c3));
                }
            }
            this.i = false;
        }
    }
    
    public final void doFrame(final long g) {
        if (this.i) {
            this.g.postFrameCallback((Choreographer$FrameCallback)this);
            final adiw h = this.h;
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
                    final int n2 = adiw.a[i];
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
        final adiw h = this.h;
        if (n != 0) {
            h.j = true;
            h.m = anyz.b;
        }
        if (n2 != 0) {
            h.k = true;
            h.m = anyz.c;
        }
        h.i += n2 + n;
    }
}
