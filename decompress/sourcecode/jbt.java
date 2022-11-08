import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbt implements jby, itw
{
    public final abns a;
    public final asib b;
    public asgu c;
    public asgt d;
    public boolean e;
    public boolean f;
    private final aols g;
    private final aolq h;
    private final asho i;
    private final itx j;
    private boolean k;
    private boolean l;
    private boolean m;
    private asic n;
    
    public jbt(final abns a, final itx j, final asho i, final aols g) {
        this.a = a;
        this.j = j;
        this.g = g;
        this.b = new asib();
        this.i = i;
        aolu aolu;
        if ((aolu = g.g) == null) {
            aolu = aolu.a;
        }
        this.h = (aolq)((agzd)aolu).rr((agyr)aolq.b);
    }
    
    private final void f() {
        final asic n = this.n;
        if (n == null) {
            return;
        }
        athh.f((AtomicReference)n);
        this.e = true;
    }
    
    public final asgt a() {
        if (this.d == null) {
            this.d = asgt.m((asgv)new iwo(this, 2), asgm.c);
        }
        return this.d;
    }
    
    public final void b() {
        this.j.a(this);
    }
    
    public final void c() {
        final asgu c = this.c;
        if (c == null) {
            return;
        }
        final boolean d = this.h.d;
        int n = 1;
        final boolean m = (!d && !this.e) || this.k;
        if (!this.m) {
            this.m = m;
        }
        final aols g = this.g;
        if (!d && !this.e) {
            if (!this.k) {
                n = 2;
            }
        }
        else {
            n = 0;
        }
        c.c((Object)jbr.c(m, g, n));
    }
    
    public final void d() {
        final aolq h = this.h;
        if (!h.d && !this.e && this.f) {
            if (!this.l) {
                final asic am = asgt.ae((long)h.c, TimeUnit.MILLISECONDS, this.i).am((asix)new jbf(this, 9), (asix)iwn.q);
                this.n = am;
                this.b.c(am);
            }
        }
    }
    
    public final void i(final ControlsOverlayStyle controlsOverlayStyle) {
        if (this.l == ControlsOverlayStyle.a(controlsOverlayStyle)) {
            return;
        }
        final boolean a = ControlsOverlayStyle.a(controlsOverlayStyle);
        this.l = a;
        if (this.m && a) {
            this.f();
            this.c();
            return;
        }
        this.d();
    }
    
    public final void oX(final boolean b) {
        if (this.k) {
            this.k = false;
            this.c();
        }
    }
    
    public final void y(final boolean b) {
        if (!this.k) {
            this.k = true;
            this.c();
            if (this.m) {
                this.f();
            }
        }
    }
}
