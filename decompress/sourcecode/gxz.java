import android.content.DialogInterface$OnClickListener;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import java.util.concurrent.atomic.AtomicReference;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.ShortsEditFragmentPeer$DestroyableBrowseFragmentLifecycleObserver;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxz implements wwu, tvw, umv, ufj, twl, hck
{
    public uqs A;
    public final gxa B;
    public final hnc C;
    public final zhb D;
    public final abpj E;
    public final cya F;
    public final avt G;
    public final avt H;
    public final aeby I;
    public final auip J;
    public final qpt K;
    private final tzs L;
    public final gxr a;
    public final wwv b;
    public final tvx c;
    final gzb d;
    public final Context e;
    public final hcu f;
    public final twm g;
    public final ucs h;
    public final atjj i;
    public final hce j;
    public final gko k;
    public final tyj l;
    final tyl m;
    public final gbn n;
    public boolean o;
    public boolean p;
    public boolean q;
    public final aioe r;
    public final ShortsEditFragmentPeer$DestroyableBrowseFragmentLifecycleObserver s;
    public hcn t;
    tvc u;
    public twy v;
    public tvr w;
    public acqu x;
    public gbq y;
    twg z;
    
    public gxz(final gxr a, final wwv b, final avt h, final tvx c, final gxa b2, final auip j, final gzb d, final hnc c2, final Context e, final hcu f, final twm g, final ucs h2, final atjj i, final cya f2, final avt g2, final tzs l, final hce k, final gko m, final tyj l2, final tyl m2, final abpj e2, final zhb d2, final gbn n, final qpt k2, final aeby i2, final hdm hdm, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        this.a = a;
        this.b = b;
        this.H = h;
        this.c = c;
        this.B = b2;
        this.J = j;
        this.d = d;
        this.C = c2;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h2;
        this.i = i;
        this.F = f2;
        this.G = g2;
        this.L = l;
        this.j = k;
        this.k = m;
        this.l = l2;
        this.m = m2;
        this.E = e2;
        this.D = d2;
        this.n = n;
        this.K = k2;
        this.I = i2;
        aioe r;
        if ((r = hdm.c) == null) {
            r = aioe.a;
        }
        this.r = r;
        this.s = new ShortsEditFragmentPeer$DestroyableBrowseFragmentLifecycleObserver(c.r);
    }
    
    public final void a() {
        final acqu x = this.x;
        if (x != null) {
            x.d(true);
        }
    }
    
    public final void b(final aqwa aqwa) {
    }
    
    public final void c(final aqwf aqwf) {
        this.w.c(aqwf);
    }
    
    public final hcu d() {
        return this.f;
    }
    
    public final void e(final aqxf aqxf) {
        if (this.l()) {
            final aqxd i = aqxf.i();
            aqxt a;
            if (i.c == 1) {
                a = (aqxt)i.d;
            }
            else {
                a = aqxt.a;
            }
            if (!a.c.isEmpty()) {
                this.c.r.W();
                this.d.i(aqxf.e());
            }
            return;
        }
        this.w.e(aqxf);
    }
    
    public final void f(final aqxa aqxa) {
        this.w.f(aqxa);
    }
    
    public final void g(final boolean b) {
        this.w.g(b);
    }
    
    public final void h() {
        final tvx c = this.c;
        c.d().b();
        final uab b = c.c.b();
        if (c.A || c.x) {
            final asic h = c.h;
            if (h != null) {
                asjg.b((AtomicReference)h);
            }
        }
        if (b != null) {
            b.x();
            if (b.n().h()) {
                c.d.p((aqyo)b.n().c(), true);
            }
            else {
                c.d.l();
            }
        }
        else {
            c.d.l();
        }
        tmy.bG(c.f);
        final br c2 = ((br)this.a).C;
        if (c2 instanceof gxs) {
            final gxs gxs = (gxs)c2;
            if (gxs != null) {
                gxs.h();
            }
        }
    }
    
    public final void i() {
        if (this.o && !this.l.w()) {
            this.l.e();
            return;
        }
        ((tya)this.i.a()).c(true);
        this.b.J(3, (wxz)new wws(wya.c(96638)), (alff)null);
        final uab b = this.L.b();
        if (b != null && uab.ab(b) && this.c.n(b)) {
            final tvc u = this.u;
            if (u != null) {
                ((usa)u).K();
                this.b.l((wxz)new wws(wya.c(139910)));
                this.b.l((wxz)new wws(wya.c(139911)));
                this.b.l((wxz)new wws(wya.c(139912)));
            }
            return;
        }
        Label_0351: {
            if (b != null && !uab.ab(b)) {
                final tvx c = this.c;
                agot.v(uab.ac(b) ^ true, (Object)"Should not be used when editor drafts are supported");
                if ((!c.H.bw() || c.d.a() == null) && (!c.H.bG() || FilterMapTable$FilterDescriptor.g(c.o.i().b))) {
                    if (!c.t.r()) {
                        if (!c.y) {
                            break Label_0351;
                        }
                        if (!c.v.v()) {
                            break Label_0351;
                        }
                    }
                }
                this.I.af(this.e).setTitle(2132019754).setMessage(2132019753).setPositiveButton(2132019755, (DialogInterface$OnClickListener)new ceg(this, 4)).setNegativeButton(2132019752, (DialogInterface$OnClickListener)gxw.a).create().show();
                return;
            }
        }
        this.h();
    }
    
    public final void j(final boolean b, final boolean b2) {
        if (!b) {
            final twy v = this.v;
            if (v.i > 0) {
                v.f.J(3, (wxz)v.g, (alff)null);
            }
        }
        if (!b) {
            this.c.g();
        }
        if (this.l()) {
            return;
        }
        this.w.j(b, b2);
    }
    
    public final void k(final boolean b) {
        if (!b) {
            this.c.g();
        }
    }
    
    public final boolean l() {
        return !this.d.j();
    }
    
    public final yor m() {
        return this.c.p();
    }
    
    public final wwv n() {
        return this.b;
    }
}
