import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;
import j$.util.Optional;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.view.ViewStub;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class abgj implements abcc, abgo
{
    private final abgp a;
    public ViewStub g;
    public abgl h;
    public boolean i;
    
    public abgj(final ViewStub g, final abgp a) {
        g.getClass();
        this.g = g;
        a.getClass();
        (this.a = a).d((abgo)this);
    }
    
    private final void c(final abgq abgq) {
        if (this.i) {
            final abgl b = this.b();
            if (!b.d) {
                if (b.c.isStarted()) {
                    b.c.reverse();
                }
                else {
                    b.c.start();
                }
                b.d = true;
            }
            final ImageView a = b.a;
            Bitmap a2;
            if (abgq != null) {
                a2 = abgq.a;
            }
            else {
                a2 = null;
            }
            a.setImageBitmap(a2);
            return;
        }
        final abgl b2 = this.b();
        if (b2.d) {
            b2.c.reverse();
            b2.d = false;
        }
    }
    
    private final void d(long a) {
        final abgp a2 = this.a;
        if (a2.i() && !a2.m) {
            final Optional optional = (Optional)a2.e.aF();
            if (optional != null && optional.isPresent()) {
                final abgr abgr = (abgr)optional.get();
                final int a3 = abgr.a(a);
                if (a3 < 0) {
                    a2.m();
                }
                else if (!a2.n) {
                    a2.n = true;
                    a2.b.execute((Runnable)new wqx(a2, abgr, a3, 6));
                }
                else {
                    a2.m();
                }
            }
            else {
                a2.m();
            }
        }
        else {
            a2.m();
        }
        final abgl b = this.b();
        a = this.a(a);
        b.b.setText((CharSequence)TimeBar.I(a));
        this.e(this.b());
    }
    
    protected long a(final long n) {
        throw null;
    }
    
    protected abgl b() {
        throw null;
    }
    
    protected abstract void e(final abgl p0);
    
    public final void f(final boolean i) {
        if (this.i == i) {
            return;
        }
        this.i = i;
        final abgp a = this.a;
        synchronized (a.l) {
            final Bitmap j = a.i;
            abgq a2;
            if (j != null) {
                a2 = abgq.a(j);
            }
            else {
                a2 = null;
            }
            monitorexit(a.l);
            this.c(a2);
        }
    }
    
    public final boolean g() {
        return this.a.i();
    }
    
    public final void h(final int n, final long n2) {
        if (!this.g()) {
            return;
        }
        if (n == 1) {
            this.d(n2);
            this.f(true);
            return;
        }
        if (n == 2) {
            this.d(n2);
            return;
        }
        if (n != 3 && n != 4) {
            return;
        }
        this.f(false);
    }
    
    public final void j(final abgq abgq) {
        this.c(abgq);
    }
}
