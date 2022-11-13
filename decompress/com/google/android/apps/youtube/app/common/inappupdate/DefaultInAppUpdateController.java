// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.inappupdate;

import java.util.Set;
import com.google.android.play.core.install.InstallState;
import android.content.IntentSender$SendIntentException;
import android.view.View$OnClickListener;
import android.app.Activity;

public final class DefaultInAppUpdateController implements fjl, aebu, aua
{
    public final aebd a;
    public final fzw b;
    private final Activity c;
    private final acwb d;
    private int e;
    private volatile boolean f;
    private volatile boolean g;
    
    public DefaultInAppUpdateController(final Activity c, final acwb d, final aebd a, final fzw b, final byte[] array) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    private final void k() {
        if (this.g) {
            return;
        }
        this.g = true;
        final acwb d = this.d;
        final gbv gbv = (gbv)d.j();
        gbv.k((CharSequence)this.c.getString(2132018175));
        ((acwc)gbv).m((CharSequence)this.c.getString(2132018177), (View$OnClickListener)new jl(this, 18));
        d.n((acwd)gbv.a());
    }
    
    @Override
    public final void g(final int n, final int n2) {
        if (n == 2400) {
            if (n2 != -1) {
                if (n2 == 0) {
                    this.b.v(akei.i);
                    return;
                }
                if (n2 == 1) {
                    this.b.v(akei.j);
                }
            }
            else {
                this.b.v(akei.h);
            }
        }
    }
    
    public final void h(final aebb aebb) {
        if (aebb.a == 2 && aebb.a(aebg.a(this.e)) != null) {
            this.b.v(akei.c);
            try {
                this.a.e(aebb, this.e, this.c);
                this.b.v(akei.f);
                return;
            }
            catch (final IntentSender$SendIntentException ex) {
                this.b.v(akei.g);
                return;
            }
        }
        if (aebb.b != 11) {
            if (aebb.a == 1) {
                this.b.v(akei.d);
            }
            return;
        }
        this.b.v(akei.m);
        this.k();
    }
    
    public final void i(final Object o) {
        final InstallState installState = (InstallState)o;
        if (installState.b() == 2) {
            this.b.v(akei.l);
            if (!this.f) {
                this.f = true;
                final acwb d = this.d;
                final gbv gbv = (gbv)d.j();
                gbv.k((CharSequence)this.c.getString(2132018176));
                gbv.c(0);
                d.n((acwd)gbv.a());
            }
        }
        else {
            if (installState.b() == 11) {
                this.b.v(akei.m);
                this.k();
                return;
            }
            if (installState.b() == 6) {
                this.b.v(akei.o);
                return;
            }
            if (installState.b() == 5) {
                this.b.v(akei.n);
            }
        }
    }
    
    @Override
    public final void j(final akeg akeg) {
        int bc;
        if ((bc = adyf.bC(akeg.b)) == 0) {
            bc = 1;
        }
        Object o;
        if (bc == 2) {
            o = aezp.k((Object)0);
        }
        else if (bc == 3) {
            o = aezp.k((Object)1);
        }
        else {
            o = aeyo.a;
        }
        if (!((aezp)o).h()) {
            return;
        }
        this.e = (int)((aezp)o).c();
        this.f = false;
        this.g = false;
        final fzw b = this.b;
        ((acmr)b.b).g(new wye(akei.b.q, 7), ajtz.g);
        ((Set)b.a).clear();
        this.a.b((aebu)this);
        final nnc a = this.a.a();
        a.q((nmy)new kal(this, 1));
        a.m((nmw)new mjn(this, 1));
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
        this.a.c((aebu)this);
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oX(final aun aun) {
    }
}
