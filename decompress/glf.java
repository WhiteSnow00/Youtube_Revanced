import android.util.Pair;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class glf extends szk
{
    public final fxw a;
    public kuf b;
    public fjt c;
    public final fxu d;
    private final Activity i;
    private final geu j;
    private Object k;
    private final zfw l;
    
    public glf(final Activity i, final acku acku, final wyv wyv, final fxw a, final geu j, final zfw l, final byte[] array) {
        super(i, acku, wyv);
        this.i = i;
        this.a = a;
        this.j = j;
        this.d = (fxu)new hkz(this, 1);
        this.l = l;
    }
    
    private final void f() {
        final Object k = this.k;
        if (k == null) {
            return;
        }
        this.l.f(k);
        this.k = null;
    }
    
    public final void a() {
        super.a();
        this.f();
        fbu.u(this.i, true);
        fbu.t(this.i, true);
        this.j.k(3);
    }
    
    public final void b(final Object o, final Pair pair) {
        final kuf b = this.b;
        if (b != null) {
            b.f();
        }
        if (pair != null && ((String)pair.first).equals("overlay_lock_orientation")) {
            if (pair.second.equals(true)) {
                if (this.k == null) {
                    this.k = this.l.e(1);
                }
            }
            else {
                this.f();
            }
        }
        this.j.g(3);
        super.b(o, pair);
        fbu.u(this.i, false);
        fbu.t(this.i, false);
    }
}
