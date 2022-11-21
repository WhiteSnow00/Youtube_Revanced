// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay.suggestedactions;

import android.view.TouchDelegate;
import android.content.Context;
import java.util.HashSet;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import android.view.ViewGroup;
import java.util.Set;

public class SuggestedActionsMainController implements tio, aaqg
{
    public final aclz a;
    public final aslm b;
    public final Set c;
    public final Set d;
    public final atmj e;
    public final jdm f;
    public boolean g;
    public ViewGroup h;
    public aoqi i;
    public WatchNextResponseModel j;
    public boolean k;
    public int l;
    public atnb m;
    public String n;
    public aske o;
    public tqa p;
    public final jku q;
    public final lje r;
    public final e s;
    public final alo t;
    private final acrw u;
    private final abqz v;
    private final aslm w;
    private final Handler x;
    private final uxg y;
    private boolean z;
    
    public SuggestedActionsMainController(final lje r, final jku q, final alo t, final e s, final qdr qdr, final xab xab, final abfd abfd, final acrw u, final abqz v, final Handler x, final uxg y, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        (this.a = new aclz()).a(xab);
        this.b = new aslm();
        this.c = new HashSet();
        this.d = new HashSet();
        this.r = r;
        this.q = q;
        this.t = t;
        this.s = s;
        this.u = u;
        this.v = v;
        this.x = x;
        this.w = new aslm();
        this.g = false;
        this.e = atmj.e();
        this.i = null;
        this.j = null;
        this.o = null;
        final ipi ipi = new ipi(this, 20, (byte[])null);
        final Context context = (Context)((atnb)qdr.a).a();
        context.getClass();
        final veh veh = (veh)((atnb)qdr.g).a();
        veh.getClass();
        final acqv acqv = (acqv)((atnb)qdr.b).a();
        acqv.getClass();
        final acig acig = (acig)((atnb)qdr.f).a();
        acig.getClass();
        final vbo vbo = (vbo)((atnb)qdr.e).a();
        vbo.getClass();
        final tnz tnz = (tnz)((atnb)qdr.c).a();
        tnz.getClass();
        final iyj iyj = (iyj)((atnb)qdr.d).a();
        iyj.getClass();
        this.f = new jdm(context, veh, acqv, acig, vbo, tnz, iyj, (Runnable)ipi);
        this.y = y;
        abfd.q((abfc)new jcs(this, 2));
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final ViewGroup j() {
        final ViewGroup h = this.h;
        h.getClass();
        return h;
    }
    
    public final void k() {
        if (!this.c.isEmpty()) {
            final aoqf aoqf = this.c.iterator().next();
            this.m(aoqf);
            this.c.remove(aoqf);
        }
    }
    
    public final void l(final Runnable runnable) {
        final ViewGroup h = this.h;
        if (h != null && h.getChildCount() != 0) {
            this.p(false, true);
            this.x.postDelayed((Runnable)new jdo(this, runnable, 0), (long)this.l);
            this.j().setTouchDelegate((TouchDelegate)null);
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void m(final aoqf aoqf) {
        this.l((Runnable)new jdo(this, aoqf, 2));
    }
    
    public final void mp(final aup aup) {
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void n() {
        final atmj e = this.e;
        final ViewGroup h = this.h;
        boolean b = false;
        if (h != null) {
            b = b;
            if (h.getChildCount() > 0) {
                b = true;
            }
        }
        e.tt((Object)b);
    }
    
    public final void o() {
        this.b.b();
        this.c.clear();
        this.d.clear();
        this.l(null);
    }
    
    public final void oO(final aup aup) {
        this.c.clear();
        this.d.clear();
    }
    
    public final void oT(final aup aup) {
        final aslm w = this.w;
        final abqz v = this.v;
        asln asln;
        if (((vbs)v.cg().g).bA()) {
            asln = v.Q().an((asmi)new jdn(this), (asmi)ixz.r);
        }
        else {
            asln = v.P().R().P(aslh.a()).an((asmi)new jdn(this), (asmi)ixz.r);
        }
        w.f(asln, v.D().an((asmi)new jcf(this, 16), (asmi)ixz.r), this.y.B().am((asmi)new jcf(this, 17)));
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        this.w.b();
        this.b.b();
    }
    
    public final void p(boolean b, final boolean b2) {
        final tqa p2 = this.p;
        if (p2 != null) {
            if (this.h != null) {
                if (this.g || this.u.isInMultiWindowMode() || this.k || this.z || this.y.G()) {
                    b = false;
                }
                p2.l(b, b2);
                if (this.j().getChildCount() != 0) {
                    if (b) {
                        final jdm f = this.f;
                        final xab f2 = f.f;
                        if (f2 != null) {
                            final ahbt b3 = f.b();
                            if (b3 != null) {
                                f2.t((xbe)new wzy(b3), (alji)null);
                                f2.t((xbe)new wzy(xbf.c(87958)), (alji)null);
                            }
                        }
                    }
                    else {
                        final jdm f3 = this.f;
                        final xab f4 = f3.f;
                        if (f4 != null) {
                            final ahbt b4 = f3.b();
                            if (b4 != null) {
                                f4.o((xbe)new wzy(b4), (alji)null);
                                f4.o((xbe)new wzy(xbf.c(87958)), (alji)null);
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final void pg(final boolean z) {
        if (this.z == z) {
            return;
        }
        this.p((this.z = z) ^ true, false);
    }
}
