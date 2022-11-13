import java.util.List;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jcw implements jda, iuu, uwn
{
    public final abpu a;
    public final iuv b;
    public final asiq c;
    public ashj d;
    public ashi e;
    private final uve f;
    private final aonv g;
    private final aonu h;
    private final tmx i;
    private boolean j;
    
    public jcw(final abpu a, final iuv b, final uve f, final tmx i, final aonv g) {
        this.a = a;
        this.g = g;
        aonx aonx;
        if ((aonx = g.g) == null) {
            aonx = aonx.a;
        }
        this.h = (aonu)((ahbc)aonx).rx((ahaq)aonu.b);
        this.b = b;
        this.f = f;
        this.c = new asiq();
        this.i = i;
    }
    
    public final ashi a() {
        if (this.e == null) {
            this.e = ashi.m(new ixl(this, 3), ashb.c);
        }
        return this.e;
    }
    
    public final void b() {
        this.b.a((iuu)this);
        this.f.E().i((uwn)this);
    }
    
    public final void c() {
        final ashj d = this.d;
        if (d == null) {
            return;
        }
        final boolean j = this.j;
        boolean b2;
        final boolean b = b2 = false;
        Label_0188: {
            if (j) {
                if (((fqx)this.i.c()).j >= 2) {
                    b2 = b;
                }
                else {
                    final String h = this.f.h();
                    if (h != null) {
                        final Iterator<Object> iterator = ((List<Object>)this.h.c).iterator();
                        while (iterator.hasNext()) {
                            if (h.equals(iterator.next())) {
                                b2 = b;
                                break Label_0188;
                            }
                        }
                        for (final ajpl ajpl : this.h.d) {
                            String d2;
                            if ((ajpl.b & 0x2) != 0x0) {
                                d2 = ajpl.d;
                            }
                            else {
                                d2 = null;
                            }
                            if (h.equals(d2)) {
                                b2 = b;
                                break Label_0188;
                            }
                        }
                    }
                    b2 = true;
                }
            }
        }
        d.c(jcq.b(b2, this.g));
    }
    
    public final void i(final boolean b) {
    }
    
    public final void j(final ControlsOverlayStyle controlsOverlayStyle) {
    }
    
    public final void l(final boolean b) {
    }
    
    public final void m(final boolean b) {
    }
    
    public final void n(final trs trs) {
    }
    
    public final void oY(final boolean b) {
        if (this.j) {
            this.j = false;
            this.c();
        }
    }
    
    public final void oZ(final ControlsState controlsState) {
    }
    
    public final void pA(final uux uux) {
        this.c();
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
        if (!this.j) {
            this.j = true;
            this.c();
        }
    }
}
