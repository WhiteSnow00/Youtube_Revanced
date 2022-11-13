import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdf implements jda, iuu, tgg
{
    public final tgd a;
    public boolean b;
    public int c;
    public ashj d;
    public ashi e;
    private final aonv f;
    private final aonw g;
    private final iuv h;
    private boolean i;
    
    public jdf(final tgd a, final iuv h, final aonv f) {
        this.c = -1;
        this.a = a;
        this.h = h;
        this.f = f;
        aonx aonx;
        if ((aonx = f.g) == null) {
            aonx = aonx.a;
        }
        this.g = (aonw)((ahbc)aonx).rx((ahaq)aonw.b);
    }
    
    public static int c(final long n) {
        final double n2 = (double)n;
        Double.isNaN(n2);
        return (int)(n2 / 1000.0);
    }
    
    public final ashi a() {
        if (this.e == null) {
            this.e = ashi.m(new ixl(this, 5), ashb.c);
        }
        return this.e;
    }
    
    public final void b() {
        this.h.a((iuu)this);
    }
    
    public final void d() {
        final ashj d = this.d;
        if (d != null) {
            final aonw g = this.g;
            boolean b = false;
            Label_0103: {
                if (g != null) {
                    final boolean f = g.f;
                    if (this.i || f) {
                        final int c = this.c;
                        if (c >= c(g.c) && c < c(g.d)) {
                            final boolean e = g.e;
                            b = true;
                            if (!e) {
                                break Label_0103;
                            }
                            if (this.b) {
                                b = b;
                                break Label_0103;
                            }
                        }
                    }
                }
                b = false;
            }
            d.c(jcq.c(b, this.f, 0));
        }
    }
    
    public final void i(final boolean b) {
    }
    
    public final void j(final ControlsOverlayStyle controlsOverlayStyle) {
    }
    
    public final void l(final boolean b) {
    }
    
    public final void m(final boolean b) {
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
                this.b = ((aanw)o).e();
                this.d();
            }
            else {
                c = c(((aant)o).e());
                if (c != this.c) {
                    this.c = c;
                    this.d();
                    return null;
                }
            }
        }
        else {
            array = new Class[] { aant.class, aanw.class };
        }
        return array;
    }
    
    public final void n(final trs trs) {
    }
    
    public final void oY(final boolean b) {
        if (this.i) {
            this.i = false;
            this.d();
        }
    }
    
    public final void oZ(final ControlsState controlsState) {
    }
    
    public final void pa(final boolean b) {
    }
    
    public final void pb(final boolean b) {
    }
    
    public final void pc(final boolean b) {
    }
    
    public final void r(final fkr fkr) {
    }
    
    public final void s(final boolean b) {
    }
    
    public final void t(final boolean b) {
    }
    
    public final void u(final boolean b) {
    }
    
    public final void v(final boolean b) {
    }
    
    public final void w(final boolean b) {
    }
    
    public final void x(final int n) {
    }
    
    public final void y(final boolean b) {
        if (!this.i) {
            this.i = true;
            this.d();
        }
    }
}
