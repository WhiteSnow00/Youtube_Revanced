import android.view.View$OnClickListener;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixq extends ius implements iuu
{
    public final arkg b;
    public final arkg c;
    public final arkg d;
    public final String e;
    public final String f;
    public final wzz g;
    public final wzz h;
    public abbr i;
    public ControlsState j;
    public boolean k;
    public final toz l;
    private final boolean m;
    private final wyw n;
    private final abcb o;
    private ControlsOverlayStyle p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private final boolean x;
    
    public ixq(final vaf vaf, final arkg arkg, final arkg b, final arkg d, final arkg c, final abbr i, final wyw n, final ImageView imageView) {
        this.j = ControlsState.b();
        this.p = ControlsOverlayStyle.a;
        this.l = new toz((View)imageView, (long)imageView.getResources().getInteger(2131492903), 4);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = imageView.getResources().getString(2132019824);
        this.f = imageView.getResources().getString(2132019823).toUpperCase(imageView.getResources().getConfiguration().locale);
        alxp alxp;
        if ((alxp = vaf.b().e) == null) {
            alxp = alxp.a;
        }
        this.m = alxp.aX;
        imageView.setOnClickListener((View$OnClickListener)new ixg(this, 5, (byte[])null));
        this.o = new abcb(imageView, imageView.getContext(), true, ((vai)arkg.a()).cD());
        this.i = i;
        this.n = n;
        this.x = ((vai)arkg.a()).cE();
        final wyt g = new wyt(xaa.c(56385));
        this.g = (wzz)g;
        final wyt h = new wyt(xaa.c(56384));
        this.h = (wzz)h;
        n.D((wzz)g);
        n.D((wzz)h);
    }
    
    private final wzz A(final boolean b) {
        if (b) {
            wzz wzz;
            if (this.j.a == abbx.b) {
                wzz = this.h;
            }
            else {
                wzz = this.g;
            }
            return wzz;
        }
        wzz wzz2;
        if (this.j.a == abbx.b) {
            wzz2 = this.g;
        }
        else {
            wzz2 = this.h;
        }
        return wzz2;
    }
    
    @Override
    protected final void a(final boolean b) {
        this.l.a(b);
    }
    
    @Override
    protected final void d(final boolean b) {
        this.l.b(b);
    }
    
    @Override
    protected final boolean h(final boolean b) {
        final boolean s = this.s;
        final boolean b2 = false;
        final boolean b3 = false;
        boolean b4 = b2;
        if (!s) {
            b4 = b2;
            if (!this.t) {
                b4 = b2;
                if (!this.u) {
                    b4 = b2;
                    if (!this.v) {
                        if (this.w) {
                            b4 = b2;
                        }
                        else {
                            if (b) {
                                if (!this.j.k()) {
                                    boolean b5 = b3;
                                    if (!this.k) {
                                        return b5;
                                    }
                                    b5 = b3;
                                    if (!this.j.b) {
                                        return b5;
                                    }
                                }
                                boolean b5 = b3;
                                if (this.p.t) {
                                    if (this.q) {
                                        if (this.r) {
                                            return true;
                                        }
                                        b5 = b3;
                                    }
                                    else {
                                        b5 = true;
                                    }
                                }
                                return b5;
                            }
                            b4 = b2;
                            if (this.k) {
                                b4 = b2;
                                if (this.j.b) {
                                    if (this.q) {
                                        if (this.r) {
                                            return true;
                                        }
                                        b4 = b2;
                                    }
                                    else {
                                        b4 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return b4;
    }
    
    @Override
    public final void i(final boolean b) {
    }
    
    @Override
    public final void j(final ControlsOverlayStyle p) {
        this.p = p;
        this.f();
    }
    
    @Override
    public final void l(final boolean w) {
        this.w = w;
        this.g(false);
    }
    
    @Override
    public final void m(final boolean b) {
    }
    
    @Override
    public final void n(final trs trs) {
    }
    
    @Override
    public final void oY(final boolean b) {
        this.n.o(this.A(false), (alhi)null);
        this.b(b);
    }
    
    @Override
    public final void oZ(final ControlsState j) {
        this.n.o(this.A(false), (alhi)null);
        this.n.t(this.A(true), (alhi)null);
        this.j = j;
        this.o.a(j);
        this.f();
    }
    
    @Override
    public final void pa(final boolean t) {
        this.t = t;
        this.g(false);
    }
    
    @Override
    public final void pb(final boolean b) {
    }
    
    @Override
    public final void pc(final boolean q) {
        this.q = q;
        this.f();
    }
    
    @Override
    public final void r(final fkr fkr) {
    }
    
    @Override
    public final void s(final boolean r) {
        this.r = r;
        this.f();
    }
    
    @Override
    public final void t(final boolean u) {
        if (this.m) {
            if (this.u != u) {
                this.u = u;
                this.g(true);
            }
        }
    }
    
    @Override
    public final void u(final boolean v) {
        this.v = v;
        this.g(false);
    }
    
    @Override
    public final void v(final boolean b) {
    }
    
    @Override
    public final void w(final boolean s) {
        this.s = s;
        this.g(false);
    }
    
    @Override
    public final void x(final int n) {
    }
    
    @Override
    public final void y(final boolean b) {
        this.n.t(this.A(true), (alhi)null);
        this.c(b);
    }
    
    final void z(final wzz wzz) {
        if (!this.x) {
            return;
        }
        this.n.J(3, wzz, (alhi)null);
    }
}
