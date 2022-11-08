// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.mdx.mediaroute;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import android.content.ContextWrapper;
import android.app.Activity;
import android.util.AttributeSet;
import android.content.Context;
import androidx.mediarouter.app.MediaRouteButton;

public class MdxMediaRouteButton extends MediaRouteButton implements xfr
{
    public final atix d;
    public atjj e;
    public xlv f;
    public atjj g;
    public xbq h;
    public xbt i;
    public boolean j;
    public ggc k;
    public aepj l;
    public bx m;
    
    public MdxMediaRouteButton(final Context context) {
        super(context);
        this.d = atix.e();
        this.j = false;
    }
    
    public MdxMediaRouteButton(final Context context, final AttributeSet set) {
        super(context, set);
        this.d = atix.e();
        this.j = false;
    }
    
    public MdxMediaRouteButton(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.d = atix.e();
        this.j = false;
    }
    
    private final Activity j() {
        for (Context context = this.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity)context;
            }
        }
        return null;
    }
    
    public final ashe h() {
        return ((ashe)this.d).S();
    }
    
    public final void i() {
        final aepj l = this.l;
        if (l != null) {
            ((xfq)l.a).a().l((wxz)new wws(wya.c(126925)));
        }
    }
    
    public final boolean performClick() {
        szc.f();
        final bx m = this.m;
        if (m != null) {
            m.O();
        }
        if (!this.j && this.d.aT()) {
            this.d.tr((Object)ttx.a);
            return true;
        }
        final aepj l = this.l;
        cl supportFragmentManager = null;
        if (l != null) {
            ((xfq)l.a).a().J(3, (wxz)new wws(wya.c(11208)), (alff)null);
        }
        if (!this.i.a()) {
            final xbt i = this.i;
            final Activity j = this.j();
            final moq c = i.c;
            kgk.aQ("makeGooglePlayServicesAvailable must be called from the main thread");
            final int h = ((mor)c).h((Context)j, 202100000);
            Object o;
            if (h == 0) {
                o = nmr.c((Object)null);
            }
            else {
                final mrn k = mrs.m(j);
                final mrs mrs = (mrs)k.b("GmsAvailabilityHelper", (Class)mrs.class);
                mrs mrs2;
                if (mrs != null) {
                    mrs2 = mrs;
                    if (((nly)mrs.d.a).i()) {
                        mrs.d = new nmo();
                        mrs2 = mrs;
                    }
                }
                else {
                    mrs2 = new mrs(k);
                }
                mrs2.o(new ConnectionResult(h, (PendingIntent)null));
                o = mrs2.d.a;
            }
            ((nly)o).m((nls)jzm.c);
            return true;
        }
        final dmk dmk = (dmk)this.e.a();
        final ccs y = dmk.y();
        if (this.f.g() == null && ((xfw)this.g.a()).E(y)) {
            dmk.C(1);
        }
        final xbq h2 = this.h;
        if (h2 != null && !h2.e()) {
            h2.b();
        }
        final ggc k2 = this.k;
        if (k2 != null) {
            final Activity j2 = this.j();
            if (j2 instanceof bu) {
                supportFragmentManager = ((bu)j2).getSupportFragmentManager();
            }
            if (k2.a) {
                final abtt q = ((abno)((atjj)k2.b).a()).q();
                if (q != null && q.d() != null && q.d().S()) {
                    final xgr xgr = new xgr();
                    ((bi)xgr).rD(supportFragmentManager, ((bi)xgr).getClass().getCanonicalName());
                    return true;
                }
            }
        }
        if (!super.performClick()) {
            return false;
        }
        return true;
    }
}
