// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar;

import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService;
import java.util.ArrayList;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;
import com.google.android.apps.youtube.embeddedplayer.service.model.PlayerViewModeData;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.DisconnectedApiPlayerService;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Bundle;
import java.util.Map;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import j$.util.Optional;
import android.view.ViewGroup;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.b;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService;
import com.google.android.apps.youtube.embeddedplayer.service.model.c;
import android.content.Context;
import java.util.HashSet;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.s;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.aa;
import java.lang.ref.WeakReference;

public final class g implements veh
{
    public static final int i = 0;
    private static WeakReference k;
    private static WeakReference l;
    public final aa a;
    public s b;
    public s c;
    public s d;
    public final d e;
    public final atmj f;
    final f g;
    final oqz h;
    private final HashSet m;
    private final boolean n;
    private boolean o;
    private final i p;
    
    public g(final Context context, final a a, final boolean n, final d e, final i p5) {
        final atmj aw = atmj.aW((Object)com.google.android.apps.youtube.embeddedplayer.service.model.c.a);
        this.f = aw;
        this.e = e;
        this.p = p5;
        this.n = n;
        final f g = new f(this, 1);
        this.g = g;
        final f f = new f(this, 0);
        final oqz h = new oqz(this);
        this.h = h;
        final e e2 = new e(this);
        this.m = new HashSet();
        this.a = new aa(context, a, h, f, e, p5, g, (askp)aw, e2, n, null, null, null, null);
    }
    
    private static asla A(asla o, final a a, final IApiPlayerFactoryService apiPlayerFactoryService, final boolean b) {
        monitorenter(g.class);
        try {
            try {
                com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.b.h(System.currentTimeMillis());
            }
            finally {}
        }
        catch (final RemoteException ex) {
            aftr.l("Csi controller service is disconnected");
        }
        o = o.L(aslh.a()).J(new abmz(a, b, 1)).L(atmg.a()).J((asmn)new lmy(apiPlayerFactoryService, 2)).o();
        monitorexit(g.class);
        return o;
        monitorexit(g.class);
    }
    
    private static asla B() {
        final WeakReference l = g.l;
        Object o;
        if (l == null) {
            o = null;
        }
        else {
            o = l.get();
        }
        if (o != null) {
            return asla.I(o);
        }
        final WeakReference k = g.k;
        if (k == null) {
            return null;
        }
        return (asla)k.get();
    }
    
    private static void C(final Tick tick) {
        try {
            com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.b.e(tick, System.currentTimeMillis());
        }
        catch (final RemoteException ex) {
            aftr.l("Csi controller service is disconnected");
        }
    }
    
    private final void D() {
        if (this.b == null) {
            return;
        }
        this.p.a(null);
        this.f.tt((Object)com.google.android.apps.youtube.embeddedplayer.service.model.c.a);
        final aa a = this.a;
        if (!a.f()) {
            lma.z();
        }
        else {
            try {
                a.l = false;
                a.d.g();
            }
            catch (final RemoteException ex) {
                lma.y(ex);
            }
        }
        final s b = this.b;
        if (b != null) {
            final b c = b.c;
            final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e g = c.g;
            if (g != null) {
                final View md = g.md();
                final ViewGroup c2 = c.c;
                if (md != null) {
                    final View d = c.d;
                    if (d != null && c2 != null) {
                        c2.removeView(d);
                        c2.addView(md);
                    }
                }
            }
            this.b = null;
        }
    }
    
    private final boolean E(final s b, final boolean b2) {
        final s c = this.c;
        final boolean b3 = false;
        Label_0038: {
            if (c != null) {
                if (c == b) {
                    break Label_0038;
                }
            }
            else {
                if (!b2) {
                    break Label_0038;
                }
                if (this.b == null) {
                    break Label_0038;
                }
            }
            return false;
        }
        if (!b.equals(this.b)) {
            this.D();
            final abvo n = this.a.n;
            final b c2 = b.c;
            final View d = c2.d;
            boolean b4 = false;
            Label_0094: {
                if (d != null) {
                    b4 = b3;
                    if (d != n) {
                        break Label_0094;
                    }
                }
                b4 = true;
            }
            adme.L(b4, "Another player view is already attached.");
            c2.d = (View)n;
            final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e g = c2.g;
            if (g != null) {
                final View md = g.md();
                final ViewGroup c3 = c2.c;
                if (md != null && c3 != null) {
                    c3.removeView(md);
                    c3.addView((View)n);
                }
            }
            final aa a = this.a;
            try {
                a.d.m();
            }
            catch (final RemoteException ex) {
                lma.y(ex);
            }
            this.b = b;
            ((askp)b.m).E((asmc)new lkz(this, 10)).aP((asku)this.f);
            this.p.a(this.b);
            this.w(b);
            final Optional ofNullable = Optional.ofNullable((Object)b.e.get());
            final aa a2 = this.a;
            a2.getClass();
            ofNullable.ifPresent((Consumer)new llr(a2, 7));
        }
        return true;
    }
    
    private final boolean F(final s s) {
        return this.c != null && this.d == s;
    }
    
    private final boolean G(final s s) {
        return this.o && (s == this.b || this.F(s));
    }
    
    public static g g(final Context context, final a a, final boolean b) {
        synchronized (g.class) {
            C(Tick.a);
            final g g = new g(context, a, b, new d((ConcurrentMap)new ConcurrentHashMap()), new i());
            C(Tick.b);
            com.google.android.apps.youtube.embeddedplayer.service.jar.g.l = new WeakReference(g);
            return g;
        }
    }
    
    public static asla h(final asla asla, final a a, final IApiPlayerFactoryService apiPlayerFactoryService, final boolean b) {
        synchronized (g.class) {
            final asla b2 = B();
            if (b2 == null) {
                final asla a2 = A(asla, a, apiPlayerFactoryService, b);
                g.k = new WeakReference(a2);
                return a2;
            }
            return b2;
        }
    }
    
    public static void u() {
        synchronized (g.class) {
            final asla b = B();
            if (b != null) {
                b.aa((asmi)lgi.o);
                return;
            }
            aftr.l("No coordinator instance, player did not tear down.");
        }
    }
    
    public final void a(final aisc aisc) {
        final veh c = this.a.c;
        if (c != null) {
            veg.a(c, aisc);
            return;
        }
        aftr.l("Command routing not available");
    }
    
    public final void b(final List list) {
        veg.b((veh)this, list);
    }
    
    @Deprecated
    public final void c(final aisc aisc, final Map map) {
        if (map != null) {
            aftr.k("Routing in the remote-loaded process does not support arguments");
        }
        this.a(aisc);
    }
    
    public final void d(final List list, final Map map) {
        veg.c((veh)this, list, map);
    }
    
    public final void e(final List list, final Object o) {
        veg.d((veh)this, list, o);
    }
    
    public final Bundle f(final s s) {
        synchronized (this) {
            final s b = this.b;
            final Bundle bundle = null;
            final byte[] array = null;
            if (s != b) {
                return null;
            }
            final aa a = this.a;
            Bundle bundle2;
            if (!a.f()) {
                bundle2 = bundle;
            }
            else {
                final Bundle bundle3 = new Bundle();
                final com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c v = a.v;
                final Bundle bundle4 = new Bundle();
                bundle4.putBoolean("isFullscreen", v.g);
                bundle3.putBundle("fullscreenHelperState", bundle4);
                byte[] q;
                try {
                    q = a.d.Q();
                }
                catch (final RemoteException ex) {
                    lma.y(ex);
                    q = array;
                }
                if (q != null) {
                    bundle3.putByteArray("apiPlayerState", q);
                    return bundle3;
                }
                bundle2 = bundle3;
            }
            return bundle2;
        }
    }
    
    public final void i(final s s) {
        monitorenter(this);
        if (s == null) {
            monitorexit(this);
            return;
        }
        try {
            if (this.b == s) {
                tut.b("Deregistering currently playing fragment.");
                this.p(s);
            }
            if (this.c == s) {
                this.c = null;
                this.d = null;
                this.a.e(false);
            }
            if (this.d == s) {
                this.d = null;
            }
            this.m.remove(s);
            if (!this.n && this.m.isEmpty()) {
                this.o();
            }
        }
        finally {
            monitorexit(this);
        }
    }
    
    public final void j(final String s) {
        synchronized (this) {
            final d e = this.e;
            if (s != null) {
                e.b.remove(s);
            }
        }
    }
    
    public final void k() {
        synchronized (this) {
            final aa a = this.a;
            try {
                a.d.w();
            }
            catch (final RemoteException ex) {
                lma.y(ex);
            }
        }
    }
    
    public final void l(final s s) {
        synchronized (this) {
            this.m.add(s);
        }
    }
    
    public final void m(final s c) {
        synchronized (this) {
            if (this.c != null) {
                tut.b("Attempting to register more than one fullscreen embed.");
                this.i(this.c);
            }
            this.l(this.c = c);
            this.p(this.b);
        }
    }
    
    public final void n(final String s, final s s2) {
        synchronized (this) {
            this.e.a(s, s2);
        }
    }
    
    public final void o() {
        final aa a = this.a;
        if (a.f()) {
            final com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c v = a.v;
            ((tqx)v.b).i();
            v.f = false;
            a.w.f();
            asmr.b((AtomicReference)a.A);
            asmr.b((AtomicReference)a.z);
            a.o.L();
            a.r.c.dispose();
            try {
                a.d.B(true);
            }
            catch (final RemoteException ex) {
                lma.y(ex);
            }
            final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e d = a.D;
            if (d != null) {
                d.c();
            }
            final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.g s = a.s;
            final asln d2 = s.d;
            if (d2 != null) {
                asmr.b((AtomicReference)d2);
            }
            if (!s.f.tz()) {
                asmr.b((AtomicReference)s.f);
            }
            final com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.f t = a.t;
            if (!t.a.tz()) {
                asmr.b((AtomicReference)t.a);
            }
            a.C.c();
            a.F.c();
            a.I.d();
            a.P.d();
            a.H.c();
            a.J.c();
            a.G.c();
            final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.e n = a.N;
            final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded.a b = n.b;
            if (b != null) {
                b.a = null;
                n.b = null;
            }
            n.a = null;
            com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.d.a().c();
            com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.c.a().d();
            com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.b = com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.a;
            a.e = null;
            a.i = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;
            a.d = (IApiPlayerService)new DisconnectedApiPlayerService();
        }
        com.google.android.apps.youtube.embeddedplayer.service.jar.g.k = null;
        com.google.android.apps.youtube.embeddedplayer.service.jar.g.l = null;
    }
    
    public final void p(final s s) {
        monitorenter(this);
        if (s == null) {
            monitorexit(this);
            return;
        }
        try {
            if (s == this.b) {
                this.D();
                return;
            }
            if (this.F(s)) {
                this.z(s, false);
                return;
            }
            tut.b("Attempting to relinquish an ungranted playback.");
        }
        finally {
            monitorexit(this);
        }
    }
    
    public final void q(final s s, final SimplePlaybackDescriptor simplePlaybackDescriptor, final com.google.android.apps.youtube.embeddedplayer.service.model.d e, final boolean b) {
        monitorenter(this);
        Label_0015: {
            if (simplePlaybackDescriptor != null) {
                break Label_0015;
            }
            try {
                tut.b("No description for playback provided.");
                return;
            Block_9_Outer:
                while (true) {
                    ArrayList d = null;
                    aa a = null;
                    int f = 0;
                    int g = 0;
                    int o = 0;
                    Block_10: {
                        while (true) {
                        Block_7_Outer:
                            while (true) {
                                lma.z();
                                return;
                                Label_0398: {
                                    d = simplePlaybackDescriptor.d;
                                }
                                a = this.a;
                                f = simplePlaybackDescriptor.f;
                                g = simplePlaybackDescriptor.g;
                                o = s.o;
                                iftrue(Label_0473:)(!a.f());
                                break Block_10;
                                Label_0034:
                                final String b2 = simplePlaybackDescriptor.b;
                                iftrue(Label_0311:)(b2 == null);
                                while (true) {
                                    Block_4: {
                                        break Block_4;
                                        try {
                                            final aa a2;
                                            a2.l = false;
                                            a2.s.n();
                                            final boolean b3;
                                            if (!b3) {
                                                a2.s.m();
                                            }
                                            final com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.a r = a2.r;
                                            r.m(4);
                                            r.e.removeMessages(1);
                                            a2.o.oD();
                                            ((abcq)a2.t).mk();
                                            a2.Q.b(new PlayerViewModeData(0));
                                            final com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c v = a2.v;
                                            if (v.e != e) {
                                                v.e = e;
                                                final trn b4 = v.b;
                                                final int n2;
                                                int n = n2;
                                                if (v.e.b) {
                                                    n = n2;
                                                    if (v.c != null) {
                                                        n = n2;
                                                        if (!v.d.hasFeature(9)) {
                                                            n = 1;
                                                        }
                                                    }
                                                }
                                                b4.r((boolean)((n ^ 0x1) != 0x0));
                                            }
                                            a2.f.g(Tick.f, System.currentTimeMillis());
                                            final int g2;
                                            final int o2;
                                            a2.d.p(b2, b3, g2, b, o2);
                                            return;
                                        }
                                        catch (final RemoteException ex) {
                                            lma.y(ex);
                                            return;
                                        }
                                        Label_0305: {
                                            break Label_0305;
                                            Label_0311:
                                            final String c = simplePlaybackDescriptor.c;
                                            iftrue(Label_0398:)(c == null);
                                            break Block_7_Outer;
                                        }
                                        lma.z();
                                        return;
                                    }
                                    final aa a2 = this.a;
                                    final boolean b3 = simplePlaybackDescriptor.e == 2 && !b;
                                    final int g2 = simplePlaybackDescriptor.g;
                                    final int o2 = s.o;
                                    iftrue(Label_0305:)(!a2.f());
                                    continue Block_9_Outer;
                                }
                                lma.z();
                                return;
                                final int n2 = 0;
                                iftrue(Label_0034:)(this.E(s, false));
                                return;
                                try {
                                    final aa a3;
                                    a3.l = false;
                                    final String c;
                                    final int f2;
                                    final int g3;
                                    final int o3;
                                    a3.d.o(c, f2, g3, b, o3);
                                    return;
                                }
                                catch (final RemoteException ex2) {
                                    lma.y(ex2);
                                    return;
                                }
                                continue Block_7_Outer;
                            }
                            final aa a3 = this.a;
                            final int f2 = simplePlaybackDescriptor.f;
                            final int g3 = simplePlaybackDescriptor.g;
                            final int o3 = s.o;
                            iftrue(Label_0392:)(!a3.f());
                            continue;
                        }
                    }
                    try {
                        a.l = false;
                        a.d.q(d, f, g, b, o);
                        return;
                    }
                    catch (final RemoteException ex3) {
                        lma.y(ex3);
                        return;
                    }
                    continue;
                }
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    public final void r(final s s, final Bundle bundle) {
        synchronized (this) {
            if (!this.E(s, true)) {
                return;
            }
            final aa a = this.a;
            if (a.f()) {
                final Bundle bundle2 = bundle.getBundle("fullscreenHelperState");
                if (bundle2 != null) {
                    final com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c v = a.v;
                    if (bundle2.getBoolean("isFullscreen")) {
                        ((aa)v.h.a).e(true);
                    }
                }
                if (!a.w.l()) {
                    aftr.l("Aborting Fragment restoration because player is not visible");
                }
                else {
                    final byte[] byteArray = bundle.getByteArray("apiPlayerState");
                    if (byteArray != null) {
                        try {
                            a.d.t(byteArray);
                        }
                        catch (final RemoteException ex) {
                            lma.y(ex);
                        }
                    }
                }
            }
            final s c = this.c;
            if (c == null || c != s) {
                if (!this.n) {
                    return;
                }
            }
            final aa a2 = this.a;
            if (a2.B || a2.a) {
                a2.b();
            }
        }
    }
    
    public final void s(final String s) {
        synchronized (this) {
            final aa a = this.a;
            if (!a.f()) {
                lma.z();
                return;
            }
            try {
                a.d.K(s);
            }
            catch (final RemoteException ex) {
                lma.y(ex);
            }
        }
    }
    
    public final void t() {
        synchronized (this) {
            final aa a = this.a;
            if (!a.f()) {
                lma.z();
                return;
            }
            try {
                a.d.L();
            }
            catch (final RemoteException ex) {
                lma.y(ex);
            }
        }
    }
    
    public final boolean v(final s s) {
        synchronized (this) {
            final boolean g = this.G(s);
            if (g) {
                final aa a = this.a;
                if (!a.f()) {
                    lma.z();
                }
                else {
                    try {
                        a.d.y();
                    }
                    catch (final RemoteException ex) {
                        lma.y(ex);
                    }
                }
            }
            return g;
        }
    }
    
    public final void w(final s s) {
        synchronized (this) {
            if (s == this.b) {
                if (!this.o) {
                    this.o = true;
                    final aa a = this.a;
                    if (!a.f()) {
                        lma.z();
                        return;
                    }
                    try {
                        a.d.f();
                    }
                    catch (final RemoteException ex) {
                        lma.y(ex);
                    }
                }
            }
        }
    }
    
    public final void x(final s s, final boolean b) {
        synchronized (this) {
            if (s == this.b) {
                if (this.o) {
                    this.o = false;
                    final aa a = this.a;
                    if (!a.f()) {
                        lma.z();
                        return;
                    }
                    try {
                        a.d.k(b);
                    }
                    catch (final RemoteException ex) {
                        lma.y(ex);
                    }
                }
            }
        }
    }
    
    public final void y(final s s) {
        synchronized (this) {
            if (this.G(s)) {
                this.a.d();
            }
        }
    }
    
    public final void z(final s s, final boolean b) {
        synchronized (this) {
            if (this.G(s)) {
                this.a.e(b);
            }
        }
    }
}
