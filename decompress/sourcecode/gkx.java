import android.util.Pair;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gkx extends sxe
{
    public final fxo a;
    public ktd b;
    public fjn c;
    public final fxm d;
    private final Activity h;
    private final gem i;
    private Object j;
    private final zed k;
    
    public gkx(final Activity h, final acir acir, final wwu wwu, final fxo a, final gem i, final zed k, final byte[] array) {
        super(h, acir, wwu);
        this.h = h;
        this.a = a;
        this.i = i;
        this.d = (fxm)new hke(this, 1);
        this.k = k;
    }
    
    private final void f() {
        final Object j = this.j;
        if (j == null) {
            return;
        }
        this.k.f(j);
        this.j = null;
    }
    
    public final void a() {
        super.a();
        this.f();
        gow.k(this.h, true);
        gow.j(this.h, true);
        this.i.k(3);
    }
    
    public final void b(final Object o, final Pair pair) {
        final ktd b = this.b;
        if (b != null) {
            b.f();
        }
        if (pair != null && ((String)pair.first).equals("overlay_lock_orientation")) {
            if (pair.second.equals(true)) {
                if (this.j == null) {
                    this.j = this.k.e(1);
                }
            }
            else {
                this.f();
            }
        }
        this.i.g(3);
        super.b(o, pair);
        gow.k(this.h, false);
        gow.j(this.h, false);
    }
}
