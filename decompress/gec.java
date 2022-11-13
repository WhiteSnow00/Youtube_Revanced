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

public final class gec implements View$OnClickListener, ged
{
    public final Context a;
    public final acvw b;
    public FloatingActionButton c;
    public gdz d;
    public gdz e;
    public ObjectAnimator f;
    public ObjectAnimator g;
    public gee h;
    public gef i;
    public wyw j;
    public boolean k;
    public final vai l;
    public final fzw m;
    private final atke n;
    private final acpk o;
    private final ghb p;
    private final lag q;
    private int r;
    private final php s;
    private final agoe t;
    private final aln u;
    private final blu v;
    private final bx w;
    
    public gec(final Context a, final atke n, final acpk o, final acvw b, final bx w, final aln u, final ghb p16, final blu v, final php s, final vai l, final lag q, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.m = new fzw((char[])null, null);
        this.a = a;
        this.n = n;
        this.o = o;
        this.t = new agoe((byte[])null, (byte[])null);
        this.b = b;
        this.w = w;
        this.u = u;
        this.p = p16;
        this.v = v;
        this.s = s;
        this.l = l;
        this.q = q;
    }
    
    private final void j(final gdz d) {
        this.d = d;
        this.b();
        if (d != null) {
            final gee a = this.a(d);
            if (a != null) {
                a.b();
                a.c(this.r);
                if (a instanceof gef) {
                    final gef gef = (gef)a;
                    final fzw m = this.m;
                    final int ae = m.ae(d);
                    cya cya;
                    if (ae != -1) {
                        cya = ((List<cya>)m.a).get(ae);
                    }
                    else {
                        cya = null;
                    }
                    gef.f((View)Optional.ofNullable((Object)cya).map((Function)fwk.l).orElse((Object)null));
                }
            }
            final FloatingActionButton c = this.c;
            if (c != null) {
                final Optional ofNullable = Optional.ofNullable((Object)this.d);
                final Optional map = ofNullable.map((Function)fwk.n).map((Function)fwk.o);
                final acpk o = this.o;
                o.getClass();
                final Optional map2 = map.map((Function)new fnr(o, 5));
                if (map2.isPresent()) {
                    map2.ifPresent((Consumer)new fvj(c, 20));
                }
                else {
                    c.setImageDrawable((Drawable)null);
                }
                c.setContentDescription((CharSequence)ofNullable.map((Function)fwk.k).orElse((Object)null));
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
    
    private static final boolean l(final gdz gdz) {
        return gdz instanceof gdy || gdz instanceof geg;
    }
    
    public final gee a(final gdz gdz) {
        if (gdz instanceof gdx) {
            return this.h;
        }
        if (!(gdz instanceof gdy) && !(gdz instanceof geg)) {
            return null;
        }
        return (gee)this.i;
    }
    
    public final void b() {
        Optional.ofNullable((Object)this.i).ifPresent((Consumer)fwj.l);
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
        final gdz e = this.e;
        if (e != null && (!l(e) || this.m.af(this.e))) {
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
    
    public final void f(final gdz e) {
        if (!this.k) {
            return;
        }
        Label_0114: {
            if (e != null) {
                if (this.d != e) {
                    final Optional map = Optional.ofNullable((Object)this.f).map((Function)fwk.j);
                    final Boolean value = false;
                    if (!(boolean)map.orElse((Object)value)) {
                        if (!(boolean)Optional.ofNullable((Object)this.g).map((Function)fwk.j).orElse((Object)value)) {
                            if (!l(e)) {
                                break Label_0114;
                            }
                            if (this.m.af(e)) {
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
    
    public final void g(final gdz gdz, final wyw j) {
        j.getClass();
        this.j = j;
        this.f(gdz);
    }
    
    public final void h() {
        final ObjectAnimator f = this.f;
        if (f != null) {
            if (!f.isRunning()) {
                k(this.g);
                if (Optional.ofNullable((Object)this.c).map((Function)fwk.m).orElse((Object)false)) {
                    this.c(false);
                    f.start();
                }
            }
        }
    }
    
    public final void i(final fxz fxz, int b) {
        int n = b;
        Label_0072: {
            if (this.p.d() != null) {
                if (!this.u.R(this.p.d())) {
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
        this.t.x(fxz, n);
        b = this.t.b;
        this.r = b;
        final gdz d = this.d;
        if (d != null) {
            final gee a = this.a(d);
            if (a != null) {
                a.c(b);
            }
        }
    }
    
    public final void onClick(final View view) {
        final gdz d = this.d;
        if (d == null) {
            return;
        }
        if (!((String)this.l.ce().j().af()).isEmpty() && this.p.d() != null && (this.u.R(this.p.d()) || this.w.V(this.p.d()))) {
            this.p.d().getClass();
            final jna y = this.s.y((br)this.p.f(), this.v.z(null, null), (String)null, this.j, new acxt());
            if (y.e()) {
                y.i = this.j.i();
                y.c((byte[])null, true);
            }
            return;
        }
        final aiqj aiqj = (aiqj)Optional.ofNullable((Object)d.a()).orElse((Object)d.b());
        if (aiqj != null) {
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", d);
            ((vcy)this.n.a()).c(aiqj, (Map)hashMap);
        }
    }
}
