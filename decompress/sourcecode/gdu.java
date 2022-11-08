import java.util.List;
import java.util.Map;
import java.util.HashMap;
import android.graphics.drawable.Drawable;
import java.util.function.Consumer;
import java.util.function.Function;
import j$.util.Optional;
import android.view.View;
import android.animation.ObjectAnimator;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import android.content.Context;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gdu implements View$OnClickListener, gdv
{
    public final Context a;
    public final acts b;
    public FloatingActionButton c;
    public gdr d;
    public gdr e;
    public ObjectAnimator f;
    public ObjectAnimator g;
    public gdw h;
    public gdx i;
    public wwv j;
    public boolean k;
    public final uyi l;
    public final fzo m;
    private final atjj n;
    private final acng o;
    private final ggs p;
    private final kzd q;
    private int r;
    private final pgf s;
    private final agmd t;
    private final blt u;
    private final alm v;
    private final bx w;
    
    public gdu(final Context a, final atjj n, final acng o, final acts b, final bx w, final alm v, final ggs p16, final blt u, final pgf s, final uyi l, final kzd q, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.m = new fzo((char[])null, (byte[])null);
        this.a = a;
        this.n = n;
        this.o = o;
        this.t = new agmd((byte[])null, (byte[])null);
        this.b = b;
        this.w = w;
        this.v = v;
        this.p = p16;
        this.u = u;
        this.s = s;
        this.l = l;
        this.q = q;
    }
    
    private final void j(final gdr d) {
        this.d = d;
        this.b();
        if (d != null) {
            final gdw a = this.a(d);
            if (a != null) {
                a.b();
                a.c(this.r);
                if (a instanceof gdx) {
                    final gdx gdx = (gdx)a;
                    final fzo m = this.m;
                    final int af = m.af(d);
                    cxz cxz;
                    if (af != -1) {
                        cxz = ((List<cxz>)m.a).get(af);
                    }
                    else {
                        cxz = null;
                    }
                    gdx.f((View)Optional.ofNullable((Object)cxz).map((Function)fwc.l).orElse((Object)null));
                }
            }
            final FloatingActionButton c = this.c;
            if (c != null) {
                final Optional ofNullable = Optional.ofNullable((Object)this.d);
                final Optional map = ofNullable.map((Function)fwc.n).map((Function)fwc.o);
                final acng o = this.o;
                o.getClass();
                final Optional map2 = map.map((Function)new fnm(o, 5));
                if (map2.isPresent()) {
                    map2.ifPresent((Consumer)new fva(c, 20));
                }
                else {
                    c.setImageDrawable((Drawable)null);
                }
                c.setContentDescription((CharSequence)ofNullable.map((Function)fwc.k).orElse((Object)null));
            }
            this.h();
            return;
        }
        this.c(false);
    }
    
    private static final void k(final ObjectAnimator objectAnimator) {
        if (objectAnimator != null && objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
    }
    
    private static final boolean l(final gdr gdr) {
        return gdr instanceof gdq || gdr instanceof gdy;
    }
    
    public final gdw a(final gdr gdr) {
        if (gdr instanceof gdp) {
            return this.h;
        }
        if (!(gdr instanceof gdq) && !(gdr instanceof gdy)) {
            return null;
        }
        return this.i;
    }
    
    public final void b() {
        Optional.ofNullable((Object)this.i).ifPresent((Consumer)fwb.l);
    }
    
    public final void c(final boolean b) {
        final FloatingActionButton c = this.c;
        if (c == null) {
            return;
        }
        if (!b) {
            k(this.f);
            c.setScaleX(0.0f);
            c.setScaleY(0.0f);
            c.setVisibility(8);
            return;
        }
        final ObjectAnimator g = this.g;
        if (g != null) {
            if (!g.isStarted()) {
                k(this.f);
                if (c.getVisibility() != 8) {
                    g.start();
                }
            }
        }
    }
    
    public final void d() {
        final gdr e = this.e;
        if (e != null && (!l(e) || this.m.ag(this.e))) {
            this.j(this.e);
            this.e = null;
        }
    }
    
    public final void e() {
        final FloatingActionButton c = this.c;
        if (c != null) {
            c.setTranslationY(0.0f);
            this.c.setScaleX(1.0f);
            this.c.setScaleY(1.0f);
            this.c.setVisibility(8);
        }
    }
    
    public final void f(final gdr e) {
        if (!this.k) {
            return;
        }
        Label_0114: {
            if (e != null) {
                if (this.d != e) {
                    final Optional map = Optional.ofNullable((Object)this.f).map((Function)fwc.j);
                    final Boolean value = false;
                    if (!(boolean)map.orElse((Object)value)) {
                        if (!(boolean)Optional.ofNullable((Object)this.g).map((Function)fwc.j).orElse((Object)value)) {
                            if (!l(e)) {
                                break Label_0114;
                            }
                            if (this.m.ag(e)) {
                                break Label_0114;
                            }
                        }
                    }
                    this.e = e;
                    return;
                }
                this.h();
                return;
            }
        }
        this.j(e);
        this.e = null;
    }
    
    public final void g(final gdr gdr, final wwv j) {
        j.getClass();
        this.j = j;
        this.f(gdr);
    }
    
    public final void h() {
        final ObjectAnimator f = this.f;
        if (f != null) {
            if (!f.isRunning()) {
                k(this.g);
                if (Optional.ofNullable((Object)this.c).map((Function)fwc.m).orElse((Object)false)) {
                    this.c(false);
                    f.start();
                }
            }
        }
    }
    
    public final void i(final fxr fxr, int b) {
        int n = b;
        Label_0072: {
            if (this.p.d() != null) {
                if (!this.v.T(this.p.d())) {
                    n = b;
                    if (!this.w.V(this.p.d())) {
                        break Label_0072;
                    }
                }
                n = b;
                if (this.q.g()) {
                    n = b + 134;
                }
            }
        }
        this.t.x(fxr, n);
        b = this.t.b;
        this.r = b;
        final gdr d = this.d;
        if (d != null) {
            final gdw a = this.a(d);
            if (a != null) {
                a.c(b);
            }
        }
    }
    
    public final void onClick(final View view) {
        final gdr d = this.d;
        if (d == null) {
            return;
        }
        if (!((String)this.l.cd().j().af()).isEmpty() && this.p.d() != null && (this.v.T(this.p.d()) || this.w.V(this.p.d()))) {
            this.p.d().getClass();
            final jlx y = this.s.y((br)this.p.f(), this.u.z((String)null, (String)null), (String)null, this.j, new acvr());
            if (y.e()) {
                y.i = this.j.i();
                y.c(null, true);
            }
            return;
        }
        final aioe aioe = (aioe)Optional.ofNullable((Object)d.a()).orElse((Object)d.b());
        if (aioe != null) {
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", d);
            ((vax)this.n.a()).c(aioe, (Map)hashMap);
        }
    }
}
