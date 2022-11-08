// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx.tvsignin;

import j$.util.Optional;
import com.google.android.libraries.youtube.mdx.model.AppStatus;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.Executor;

public class MdxTvFoundForSignInListener implements tfh, xpl, tec
{
    public final arhr a;
    public final arhr b;
    public final atjj c;
    public final arhr d;
    public final Executor e;
    public boolean f;
    public boolean g;
    public boolean h;
    public aexq i;
    public aexq j;
    private final arhr k;
    private final arhr l;
    private final arhr m;
    private final arhr n;
    private final arhr o;
    private final xdm p;
    private final Handler q;
    private final wzt r;
    private final arhr s;
    private final arhr t;
    private final asib u;
    private final arhr v;
    
    public MdxTvFoundForSignInListener(final arhr k, final arhr o, final arhr l, final arhr m, final arhr n, final arhr a, final arhr b, final atjj c, final arhr d, final Executor e, final wzt r, final xdm p15, final arhr s, final arhr t, final arhr v) {
        this.u = new asib();
        final aewp a2 = aewp.a;
        this.i = (aexq)a2;
        this.j = (aexq)a2;
        this.k = k;
        this.o = o;
        this.l = l;
        this.m = m;
        this.n = n;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.q = new Handler(Looper.getMainLooper());
        this.r = r;
        this.p = p15;
        this.s = s;
        this.t = t;
        this.v = v;
    }
    
    public final void j(final xph xph) {
        final fkk j = ((fjp)this.o.a()).j();
        final int a = xph.a();
        int n = 0;
        if (a == 0 || xph.a() == 1) {
            final boolean b = j != fkk.a || (((xlv)this.n.a()).g() != null && ((xlv)this.n.a()).g().v() != null);
            if (xph.a() == 1 && this.f && this.j.h() && (boolean)this.j.c()) {
                if (((wzw)this.t.a()).ay) {
                    final Iterator iterator = ((xll)this.s.a()).f().iterator();
                    while (iterator.hasNext()) {
                        final AppStatus a2 = ((xhf)iterator.next()).a;
                        if (a2 != null && a2.a() == 1 && a2.e() != null) {
                            ++n;
                        }
                    }
                    if (n >= 2) {
                        return;
                    }
                }
                this.q.postDelayed((Runnable)new hrw(this, xph, b, 2), TimeUnit.SECONDS.toMillis(2L));
                return;
            }
            if (xph.a() == 0 && this.g) {
                ((gau)this.b.a()).e(true);
                this.n(xph.d(), b);
            }
        }
        if ((!j.k() && j != fkk.g && j != fkk.e) || xph.a() != 2) {
            if (xph.a() == 2 && this.h) {
                final MdxAssistedTvSignInDialogFragmentController mdxAssistedTvSignInDialogFragmentController = (MdxAssistedTvSignInDialogFragmentController)this.k.a();
                if (!mdxAssistedTvSignInDialogFragmentController.b.getBoolean("MdxDisableMdxAssistedSignInTvDenylist", false)) {
                    final String concat = "mdx.mdx_assisted_tv_sign_in_last_shown_time_ms_".concat(((xhs)xph.c()).b);
                    final long millis = TimeUnit.DAYS.toMillis(mdxAssistedTvSignInDialogFragmentController.d);
                    if (mdxAssistedTvSignInDialogFragmentController.b.contains(concat)) {
                        final long long1 = mdxAssistedTvSignInDialogFragmentController.b.getLong(concat, 0L);
                        if (long1 != 0L) {
                            if (mdxAssistedTvSignInDialogFragmentController.c.c() - long1 < millis) {
                                mdxAssistedTvSignInDialogFragmentController.g();
                                return;
                            }
                        }
                    }
                    mdxAssistedTvSignInDialogFragmentController.b.edit().putLong(concat, mdxAssistedTvSignInDialogFragmentController.c.c()).apply();
                }
                mdxAssistedTvSignInDialogFragmentController.k();
                if (mdxAssistedTvSignInDialogFragmentController.i() == null) {
                    final xpe a3 = mdxAssistedTvSignInDialogFragmentController.a;
                    final ias ias = new ias();
                    ias.ag = a3;
                    aenz.e((br)ias, ((zjy)mdxAssistedTvSignInDialogFragmentController.g.a()).a(((zki)mdxAssistedTvSignInDialogFragmentController.f.a()).c()));
                    mdxAssistedTvSignInDialogFragmentController.pL((bi)ias);
                }
            }
            return;
        }
        ((MdxAssistedTvSignInDialogFragmentController)this.k.a()).g();
    }
    
    public final void m(final Optional optional, final int n) {
        if (n == 1 && optional.isPresent()) {
            tcp.m(((aagm)this.c.a()).c((aexg)new hwh((xha)optional.get(), 2), this.e), (tcn)gnh.n);
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final xph xph = (xph)o;
            final boolean e = xph.e();
            array = null;
            if (e) {
                if (xph.a() != 1) {
                    this.j(xph);
                }
                else if (!this.j.h()) {
                    this.i = aexq.k(xph);
                }
                else {
                    this.j(xph);
                }
            }
        }
        else {
            array = new Class[] { xph.class };
        }
        return array;
    }
    
    public final boolean n(final String s, final boolean b) {
        return ((xor)this.l.a()).a((fa)this.m.a(), ((fa)this.m.a()).getString(2132018585, new Object[] { s }), aexq.k(((fa)this.m.a()).getString(2132018584)), b);
    }
    
    public final void oS(final aum aum) {
        this.u.f(this.r.r().p(tmy.ch(((mrm)this.v.a()).u())).aB((asix)new hzh(this, 9)), this.r.s().p(tmy.ch(((mrm)this.v.a()).u())).aB((asix)new hzh(this, 10)), this.r.k().p(tmy.ch(((mrm)this.v.a()).u())).aB((asix)new hzh(this, 8)), ((ashe)this.p.a).p(tmy.ch(((mrm)this.v.a()).u())).aB((asix)new hzh(this, 7)));
    }
    
    public final void oW(final aum aum) {
        this.u.b();
    }
}
