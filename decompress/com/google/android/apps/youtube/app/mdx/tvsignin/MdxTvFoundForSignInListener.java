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

public class MdxTvFoundForSignInListener implements tio, xst, thj
{
    public final arna a;
    public final arna b;
    public final atnb c;
    public final arna d;
    public final Executor e;
    public boolean f;
    public boolean g;
    public boolean h;
    public afbh i;
    public afbh j;
    private final arna k;
    private final arna l;
    private final arna m;
    private final arna n;
    private final arna o;
    private final xgt p;
    private final Handler q;
    private final xda r;
    private final arna s;
    private final arna t;
    private final aslm u;
    private final arna v;
    
    public MdxTvFoundForSignInListener(final arna k, final arna o, final arna l, final arna m, final arna n, final arna a, final arna b, final atnb c, final arna d, final Executor e, final xda r, final xgt p15, final arna s, final arna t, final arna v) {
        this.u = new aslm();
        final afag a2 = afag.a;
        this.i = a2;
        this.j = a2;
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
        tut.f("MdxTvFFSignInListener", "Failed to store passive last time shown.", t);
    }
    
    public static void l(final Throwable t) {
        tut.f("MdxTvFFSignInListener", "Failed to denylist screen after successfully finishing.", t);
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final void j(final xsp xsp) {
        final fku j = ((fjy)this.o.a()).j();
        final int a = xsp.a();
        int n = 0;
        if (a == 0 || xsp.a() == 1) {
            final boolean b = j != fku.a || (((xpf)this.n.a()).g() != null && ((xpf)this.n.a()).g().v() != null);
            if (xsp.a() == 1 && this.f && this.j.h() && (boolean)this.j.c()) {
                if (((xdc)this.t.a()).ay) {
                    final Iterator iterator = ((xov)this.s.a()).f().iterator();
                    while (iterator.hasNext()) {
                        final AppStatus a2 = ((xkp)iterator.next()).a;
                        if (a2 != null && a2.a() == 1 && a2.e() != null) {
                            ++n;
                        }
                    }
                    if (n >= 2) {
                        return;
                    }
                }
                this.q.postDelayed((Runnable)new hta(this, xsp, b, 2), TimeUnit.SECONDS.toMillis(2L));
                return;
            }
            if (xsp.a() == 0 && this.g) {
                ((gbh)this.b.a()).e(true);
                this.n(xsp.d(), b);
            }
        }
        if ((!j.k() && j != fku.g && j != fku.e) || xsp.a() != 2) {
            if (xsp.a() == 2 && this.h) {
                final MdxAssistedTvSignInDialogFragmentController mdxAssistedTvSignInDialogFragmentController = (MdxAssistedTvSignInDialogFragmentController)this.k.a();
                if (!mdxAssistedTvSignInDialogFragmentController.b.getBoolean("MdxDisableMdxAssistedSignInTvDenylist", false)) {
                    final String concat = "mdx.mdx_assisted_tv_sign_in_last_shown_time_ms_".concat(((xlc)xsp.c()).b);
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
                    final xsm a3 = mdxAssistedTvSignInDialogFragmentController.a;
                    final ibx ibx = new ibx();
                    ibx.ag = a3;
                    aers.e((br)ibx, ((znq)mdxAssistedTvSignInDialogFragmentController.g.a()).a(((zoa)mdxAssistedTvSignInDialogFragmentController.f.a()).c()));
                    ((DialogFragmentController)mdxAssistedTvSignInDialogFragmentController).pP((bi)ibx);
                }
            }
            return;
        }
        ((MdxAssistedTvSignInDialogFragmentController)this.k.a()).g();
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void m(final Optional optional, final int n) {
        if (n == 1 && optional.isPresent()) {
            tfx.m(((qrk)this.c.a()).b((afax)new hxi((xkk)optional.get(), 3), this.e), (tfv)gny.m);
        }
    }
    
    public final void mp(final aup aup) {
    }
    
    public final Class[] mr(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final xsp xsp = (xsp)o;
            final boolean e = xsp.e();
            array = null;
            if (e) {
                if (xsp.a() != 1) {
                    this.j(xsp);
                }
                else if (!this.j.h()) {
                    this.i = afbh.k(xsp);
                }
                else {
                    this.j(xsp);
                }
            }
        }
        else {
            array = new Class[] { xsp.class };
        }
        return array;
    }
    
    public final void mx(final aup aup) {
    }
    
    public final boolean n(final String s, final boolean b) {
        return ((xsa)this.l.a()).a((fa)this.m.a(), ((fa)this.m.a()).getString(2132018588, new Object[] { s }), afbh.k(((fa)this.m.a()).getString(2132018587)), b);
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oT(final aup aup) {
        this.u.f(this.r.r().q(tqf.cl(((mtf)this.v.a()).q())).aH((asmi)new iam(this, 10)), this.r.s().q(tqf.cl(((mtf)this.v.a()).q())).aH((asmi)new iam(this, 11)), this.r.k().q(tqf.cl(((mtf)this.v.a()).q())).aH((asmi)new iam(this, 9)), ((askp)this.p.a).q(tqf.cl(((mtf)this.v.a()).q())).aH((asmi)new iam(this, 8)));
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        this.u.b();
    }
}
