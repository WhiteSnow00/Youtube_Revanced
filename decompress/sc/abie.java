import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;
import j$.util.Optional;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.view.ViewStub;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class abie implements abdw, abii
{
    private final abij a;
    public ViewStub g;
    public abig h;
    public boolean i;
    
    public abie(final ViewStub g, final abij a) {
        g.getClass();
        this.g = g;
        a.getClass();
        (this.a = a).d((abii)this);
    }
    
    private final void c(final abik abik) {
        if (this.i) {
            final abig b = this.b();
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
            if (abik != null) {
                a2 = abik.a;
            }
            else {
                a2 = null;
            }
            a.setImageBitmap(a2);
            return;
        }
        final abig b2 = this.b();
        if (b2.d) {
            b2.c.reverse();
            b2.d = false;
        }
    }
    
    private final void d(long a) {
        final abij a2 = this.a;
        if (a2.i() && !a2.m) {
            final Optional optional = (Optional)a2.e.aG();
            if (optional != null && optional.isPresent()) {
                final abil abil = (abil)optional.get();
                final int a3 = abil.a(a);
                if (a3 < 0) {
                    a2.m();
                }
                else if (!a2.n) {
                    a2.n = true;
                    a2.b.execute((Runnable)new wsx(a2, abil, a3, 6));
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
        final abig b = this.b();
        a = this.a(a);
        b.b.setText((CharSequence)TimeBar.I(a));
        this.e(this.b());
    }
    
    protected long a(final long n) {
        throw null;
    }
    
    protected abig b() {
        throw null;
    }
    
    protected abstract void e(final abig p0);
    
    public final void f(final boolean i) {
        if (this.i == i) {
            return;
        }
        this.i = i;
        final abij a = this.a;
        synchronized (a.l) {
            final Bitmap j = a.i;
            abik a2;
            if (j != null) {
                a2 = abik.a(j);
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
    
    public final void i() {
    }
    
    public final void j(final abik abik) {
        this.c(abik);
    }
}
