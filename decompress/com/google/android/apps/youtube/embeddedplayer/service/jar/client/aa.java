// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import android.os.RemoteException;
import android.os.Handler$Callback;
import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import java.util.List;
import com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.h;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.DisconnectedApiPlayerService;
import com.google.android.apps.youtube.embeddedplayer.service.jar.i;
import com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.f;
import com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.a;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.g;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.k;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.c;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.b;

public final class aa
{
    public static final int S = 0;
    public final asln A;
    public boolean B;
    public final b C;
    public final e D;
    public final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b E;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b F;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b G;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b H;
    public final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.e I;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b J;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b K;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b L;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b M;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.e N;
    public final com.google.android.apps.youtube.embeddedplayer.service.databus.shared.b O;
    public final com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e P;
    public final c Q;
    public final oqz R;
    private final skb T;
    private final abek U;
    private final abet V;
    private final abfo W;
    private final c X;
    public final boolean a;
    public Context b;
    public veh c;
    public IApiPlayerService d;
    public com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c e;
    public d f;
    public final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.d g;
    public final aeip h;
    public com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final Handler m;
    public final abvo n;
    public final k o;
    public final g p;
    public final abdr q;
    public final a r;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.g s;
    public final f t;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded.c u;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c v;
    public final com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.f w;
    public final com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.c x;
    public final atmv y;
    public final asln z;
    
    static {
        tut.k("YouTubeAndroidPlayerAPI");
    }
    
    public aa(final Context b, final com.google.android.apps.youtube.embeddedplayer.service.jar.a a, final oqz r, final com.google.android.apps.youtube.embeddedplayer.service.jar.f f, final com.google.android.apps.youtube.embeddedplayer.service.jar.d d, final i i, final com.google.android.apps.youtube.embeddedplayer.service.jar.f f2, askp r2, final aeip h, final boolean a2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = (IApiPlayerService)new DisconnectedApiPlayerService();
        this.i = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;
        final atmv ag = atmv.ag();
        this.y = ag;
        this.b = b;
        a.getClass();
        r.getClass();
        this.R = r;
        this.h = h;
        this.a = a2;
        final abvo n = new abvo(b);
        this.n = n;
        final Handler m = new Handler(b.getMainLooper());
        this.m = m;
        final com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a a3 = new com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a(m);
        this.P = new com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e(m);
        final c x = new c(0);
        this.X = x;
        final c q = new c(1, null);
        this.Q = q;
        final com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.d x2 = new com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.d((View)n, (com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.b)new u(this, 0));
        this.x = x2;
        final com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.f b2 = com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.f.b((View)n, a, (h)new z(this, 0), x2);
        this.w = b2;
        b2.p.c(((askp)x.a).A().aH((asmi)new lol(b2, 16)));
        final trn trn = new trn(a.d(), a.c(), (View)n);
        final com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c v = new com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c(b, a, new oqz(this), trn, null, null, null);
        ((tqx)v.b).e((trq)v);
        n.i((trg)v.b);
        this.v = v;
        final mbb mbb = new mbb((char[])null);
        this.I = com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.e.e((List)com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.k.a, m, mbb);
        final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.g s = new com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.g(b);
        s.f = com.google.android.apps.youtube.embeddedplayer.service.jar.b.a.a((asmi)new ins(s, r2, 18));
        this.s = s;
        r2 = jzq.r(b, m, ((asla)ag).k(), (ViewGroup)n);
        final k w = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.k.W(b, b2, new acoe(mbb, null, null), (askp)q.a, (asla)ag, r2);
        this.o = w;
        final com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.a a4 = new com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.a(this, 1);
        final atmj a5 = x.a;
        final atmj a6 = q.a;
        final a r3 = new a(b, (View$OnClickListener)a4);
        r3.l = MutedAutoplayState.a;
        r3.m = 0;
        r3.e = new Handler((Handler$Callback)new bnh(r3, 5));
        r3.c.f(((askp)a5).A().aH((asmi)new lol(r3, 18)), ((askp)a6).A().aH((asmi)new lol(r3, 19)));
        this.r = r3;
        final f t = new f(b);
        this.t = t;
        try {
            final g p14 = new g(b);
            (this.p = p14).m((asla)ag);
            final skb t2 = new skb(b);
            this.T = t2;
            final abdr q2 = new abdr(b);
            this.q = q2;
            final abek u = new abek(b);
            this.U = u;
            final abet v2 = new abet(b);
            this.V = v2;
            final abfo w2 = new abfo(b);
            this.W = w2;
            final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded.c u2 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded.c(b);
            this.u = u2;
            n.c((abvm)v2, (abvm)u, (abvm)w2, (abvm)t2, (abvm)q2);
            n.setFocusable(true);
            final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.d j = com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.d.i(b, (com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.b)new w(this));
            this.g = j;
            this.D = new e(j, b, m);
            n.k((View)j);
            this.C = new b((tui)new knj(trn, 14), n, m);
            this.E = new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b((com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.c)j, m);
            this.F = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b(p14, m);
            this.G = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b((sks)t2, m);
            this.H = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b((abcy)w, (abeo)w, (abfm)w, (abee)w, w, w, w, w, w, w, m);
            this.J = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b((abdn)q2, m);
            this.K = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b((abeh)u, m);
            this.L = new com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b((aber)v2, m);
            this.M = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b((abfp)w2, m);
            this.N = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.e(u2, m);
            this.O = new com.google.android.apps.youtube.embeddedplayer.service.databus.shared.b(a3, (byte[])null);
            final com.google.android.apps.youtube.embeddedplayer.service.jar.b a7 = com.google.android.apps.youtube.embeddedplayer.service.jar.b.a;
            this.A = a7.a((asmi)new lol(this, 13));
            a3.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.a, (com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.a)d);
            a3.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.i, (com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.a)t);
            a3.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.e, (com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.a)x);
            a3.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.d, (com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.a)f);
            a3.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.f, (com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.a)i);
            a3.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.b, (com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.a)f2);
            a3.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.c, (com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.a)a7);
            a3.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.g, (com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.a)q);
            d.a = (com.google.android.apps.youtube.embeddedplayer.service.jar.c)new v(this, 0);
            this.z = ((askp)q.a).A().aH((asmi)new lol(this, 14));
            s.ml((abcr)new t(this, 2));
            p14.ml((abcr)new t(this, 3));
            r3.ml((abcr)new t(this, 4));
            w.ml((abcr)new t(this, 5));
            ((abcq)t).ml((abcr)new t(this, 1));
            u2.ml((abcr)new t(this, 0));
        }
        catch (final RuntimeException ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
    
    public final void a() {
        if (this.f()) {
            if (this.f()) {
                if (this.j) {
                    this.d();
                    this.w.c();
                }
                return;
            }
            lma.z();
        }
    }
    
    public final void b() {
        if (!this.k) {
            this.l = true;
            return;
        }
        try {
            this.l = false;
            this.d.n();
        }
        catch (final RemoteException ex) {
            lma.y(ex);
        }
    }
    
    public final void c(final Tick tick) {
        try {
            com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.b.e(tick, System.currentTimeMillis());
        }
        catch (final RemoteException ex) {
            aftr.l("Csi controller service is disconnected");
        }
    }
    
    public final void d() {
        if (!this.f()) {
            lma.z();
            return;
        }
        try {
            this.d.x();
        }
        catch (final RemoteException ex) {
            lma.y(ex);
        }
    }
    
    public final void e(final boolean b) {
        if (this.f()) {
            try {
                this.d.G(b);
                return;
            }
            catch (final RemoteException ex) {
                lma.y(ex);
                return;
            }
        }
        lma.z();
    }
    
    public final boolean f() {
        return !(this.d instanceof DisconnectedApiPlayerService);
    }
}
