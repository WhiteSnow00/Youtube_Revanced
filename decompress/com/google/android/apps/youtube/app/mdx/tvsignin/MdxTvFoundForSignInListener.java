// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx.tvsignin;

import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;
import j$.util.Optional;
import com.google.android.libraries.youtube.mdx.model.AppStatus;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.Executor;

public class MdxTvFoundForSignInListener implements thl, xrk, tgg
{
    public final arkg a;
    public final arkg b;
    public final atke c;
    public final arkg d;
    public final Executor e;
    public boolean f;
    public boolean g;
    public boolean h;
    public aezp i;
    public aezp j;
    private final arkg k;
    private final arkg l;
    private final arkg m;
    private final arkg n;
    private final arkg o;
    private final xfl p;
    private final Handler q;
    private final xbt r;
    private final arkg s;
    private final arkg t;
    private final asiq u;
    private final arkg v;
    
    public MdxTvFoundForSignInListener(final arkg k, final arkg o, final arkg l, final arkg m, final arkg n, final arkg a, final arkg b, final atke c, final arkg d, final Executor e, final xbt r, final xfl p15, final arkg s, final arkg t, final arkg v) {
        this.u = new asiq();
        final aeyo a2 = aeyo.a;
        this.i = (aezp)a2;
        this.j = (aezp)a2;
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
    
    public static void k(final Throwable t) {
        ttr.f("MdxTvFFSignInListener", "Failed to store passive last time shown.", t);
    }
    
    public static void l(final Throwable t) {
        ttr.f("MdxTvFFSignInListener", "Failed to denylist screen after successfully finishing.", t);
    }
    
    public final thh g() {
        return thh.b;
    }
    
    public final void j(final xrg xrg) {
        final fkr j = ((fjv)this.o.a()).j();
        final int a = xrg.a();
        int n = 0;
        if (a == 0 || xrg.a() == 1) {
            final boolean b = j != fkr.a || (((xnt)this.n.a()).g() != null && ((xnt)this.n.a()).g().v() != null);
            if (xrg.a() == 1 && this.f && this.j.h() && (boolean)this.j.c()) {
                if (((xbv)this.t.a()).ay) {
                    final Iterator iterator = ((xnj)this.s.a()).f().iterator();
                    while (iterator.hasNext()) {
                        final AppStatus a2 = ((xje)iterator.next()).a;
                        if (a2 != null && a2.a() == 1 && a2.e() != null) {
                            ++n;
                        }
                    }
                    if (n >= 2) {
                        return;
                    }
                }
                this.q.postDelayed((Runnable)new hss(this, xrg, b, 2), TimeUnit.SECONDS.toMillis(2L));
                return;
            }
            if (xrg.a() == 0 && this.g) {
                ((gbc)this.b.a()).e(true);
                this.n(xrg.d(), b);
            }
        }
        if ((!j.k() && j != fkr.g && j != fkr.e) || xrg.a() != 2) {
            if (xrg.a() == 2 && this.h) {
                final MdxAssistedTvSignInDialogFragmentController mdxAssistedTvSignInDialogFragmentController = (MdxAssistedTvSignInDialogFragmentController)this.k.a();
                if (!mdxAssistedTvSignInDialogFragmentController.b.getBoolean("MdxDisableMdxAssistedSignInTvDenylist", false)) {
                    final String concat = "mdx.mdx_assisted_tv_sign_in_last_shown_time_ms_".concat(((xjr)xrg.c()).b);
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
                ((DialogFragmentController)mdxAssistedTvSignInDialogFragmentController).k();
                if (((DialogFragmentController)mdxAssistedTvSignInDialogFragmentController).i() == null) {
                    final xrd a3 = mdxAssistedTvSignInDialogFragmentController.a;
                    final ibo ibo = new ibo();
                    ibo.ag = a3;
                    aepz.e((br)ibo, ((zlv)mdxAssistedTvSignInDialogFragmentController.g.a()).a(((zmf)mdxAssistedTvSignInDialogFragmentController.f.a()).c()));
                    ((DialogFragmentController)mdxAssistedTvSignInDialogFragmentController).pQ((bi)ibo);
                }
            }
            return;
        }
        ((MdxAssistedTvSignInDialogFragmentController)this.k.a()).g();
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void m(final Optional optional, final int n) {
        if (n == 1 && optional.isPresent()) {
            teu.m(((qqr)this.c.a()).b((aezf)new hxb((xiz)optional.get(), 3), this.e), (tes)gnn.n);
        }
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final xrg xrg = (xrg)o;
            final boolean e = xrg.e();
            array = null;
            if (e) {
                if (xrg.a() != 1) {
                    this.j(xrg);
                }
                else if (!this.j.h()) {
                    this.i = aezp.k((Object)xrg);
                }
                else {
                    this.j(xrg);
                }
            }
        }
        else {
            array = new Class[] { xrg.class };
        }
        return array;
    }
    
    public final void my(final aun aun) {
    }
    
    public final boolean n(final String s, final boolean b) {
        return ((xqr)this.l.a()).a((fa)this.m.a(), ((fa)this.m.a()).getString(2132018586, new Object[] { s }), aezp.k((Object)((fa)this.m.a()).getString(2132018585)), b);
    }
    
    public final void oS(final aun aun) {
        this.u.f(new asir[] { this.r.r().q(tpe.cl(((msr)this.v.a()).K())).aH((asjm)new iad(this, 8)), this.r.s().q(tpe.cl(((msr)this.v.a()).K())).aH((asjm)new iad(this, 9)), this.r.k().q(tpe.cl(((msr)this.v.a()).K())).aH((asjm)new iad(this, 7)), ((asht)this.p.a).q(tpe.cl(((msr)this.v.a()).K())).aH((asjm)new iad(this, 6)) });
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        this.u.b();
    }
}
