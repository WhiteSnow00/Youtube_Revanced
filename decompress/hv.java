import android.view.animation.Interpolator;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hv
{
    public final ArrayList a;
    anl b;
    public boolean c;
    private long d;
    private Interpolator e;
    private final anm f;
    
    public hv() {
        this.d = -1L;
        this.f = (anm)new hu(this);
        this.a = new ArrayList();
    }
    
    public final void a() {
        if (!this.c) {
            return;
        }
        final ArrayList a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            ((bx)a.get(i)).n();
        }
        this.c = false;
    }
    
    public final void b() {
        if (this.c) {
            return;
        }
        final ArrayList a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            final bx bx = (bx)a.get(i);
            final long d = this.d;
            if (d >= 0L) {
                bx.q(d);
            }
            final Interpolator e = this.e;
            if (e != null) {
                bx.r(e);
            }
            if (this.b != null) {
                bx.s((anl)this.f);
            }
            bx.o();
        }
        this.c = true;
    }
    
    public final void c() {
        if (!this.c) {
            this.d = 250L;
        }
    }
    
    public final void d(final Interpolator e) {
        if (!this.c) {
            this.e = e;
        }
    }
    
    public final void e(final anl b) {
        if (!this.c) {
            this.b = b;
        }
    }
    
    public final void f(final bx bx) {
        if (!this.c) {
            this.a.add(bx);
        }
    }
}
