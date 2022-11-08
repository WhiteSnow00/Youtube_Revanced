import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jce implements jby, itw, tec
{
    public final tdz a;
    public boolean b;
    public int c;
    public asgu d;
    public asgt e;
    private final aols f;
    private final aolt g;
    private final itx h;
    private boolean i;
    
    public jce(final tdz a, final itx h, final aols f) {
        this.c = -1;
        this.a = a;
        this.h = h;
        this.f = f;
        aolu aolu;
        if ((aolu = f.g) == null) {
            aolu = aolu.a;
        }
        this.g = (aolt)((agzd)aolu).rr((agyr)aolt.b);
    }
    
    public static int c(final long n) {
        final double n2 = (double)n;
        Double.isNaN(n2);
        return (int)(n2 / 1000.0);
    }
    
    public final asgt a() {
        if (this.e == null) {
            this.e = asgt.m((asgv)new iwo(this, 5), asgm.c);
        }
        return this.e;
    }
    
    public final void b() {
        this.h.a(this);
    }
    
    public final void d() {
        final asgu d = this.d;
        if (d != null) {
            final aolt g = this.g;
            boolean b = false;
            Label_0101: {
                if (g != null) {
                    final boolean f = g.f;
                    if (this.i || f) {
                        final int c = this.c;
                        if (c >= c(g.c) && c < c(g.d)) {
                            final boolean e = g.e;
                            b = true;
                            if (!e) {
                                break Label_0101;
                            }
                            if (this.b) {
                                b = b;
                                break Label_0101;
                            }
                        }
                    }
                }
                b = false;
            }
            d.c((Object)jbr.c(b, this.f, 0));
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, int c) {
        Class[] array;
        if (c != -1) {
            array = null;
            if (c != 0) {
                if (c != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(c);
                    throw new IllegalStateException(sb.toString());
                }
                this.b = ((aamc)o).e();
                this.d();
            }
            else {
                c = c(((aalz)o).e());
                if (c != this.c) {
                    this.c = c;
                    this.d();
                    return null;
                }
            }
        }
        else {
            array = new Class[] { aalz.class, aamc.class };
        }
        return array;
    }
    
    public final void oX(final boolean b) {
        if (this.i) {
            this.i = false;
            this.d();
        }
    }
    
    public final void y(final boolean b) {
        if (!this.i) {
            this.i = true;
            this.d();
        }
    }
}
