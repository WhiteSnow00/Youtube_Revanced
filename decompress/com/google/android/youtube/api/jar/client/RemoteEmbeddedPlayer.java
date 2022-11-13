// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.youtube.api.jar.client;

import android.view.TextureView;
import android.view.KeyEvent;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import java.lang.reflect.Field;
import android.os.IInterface;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService$Stub$Proxy;
import android.os.IBinder;
import java.util.List;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.h;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.DisconnectedApiPlayerService;
import com.google.android.apps.youtube.embeddedplayer.service.jar.a;
import com.google.android.apps.youtube.embeddedplayer.service.jar.l;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService;
import android.app.Activity;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.k;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService;

public final class RemoteEmbeddedPlayer extends aehe
{
    private IApiPlayerService S;
    private final int T;
    private c U;
    private d V;
    private final b W;
    private final e X;
    private final k Y;
    private final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b Z;
    public boolean a;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b aa;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b ab;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b ac;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b ad;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b ae;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b af;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b ag;
    private final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.e ah;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    
    static {
        ttr.k("YouTubeAndroidPlayerAPI");
    }
    
    private RemoteEmbeddedPlayer(final Context context, final Activity activity, final IApiPlayerFactoryService apiPlayerFactoryService, final boolean b) {
        final Context s = kzr.s(context, (Context)activity);
        final l l = new l(activity, 1);
        super(s, (a)l, new abue(s));
        this.S = (IApiPlayerService)new DisconnectedApiPlayerService();
        apiPlayerFactoryService.getClass();
        Object i;
        if (!b) {
            i = com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.d.i(s, (com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.b)new com.google.android.youtube.api.jar.client.b(this));
            this.X = new e((com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.d)i, s, this.h);
            this.Y = null;
        }
        else {
            i = new h(s, new g(this));
            this.X = null;
            this.Y = new k((h)i, s, this.h);
        }
        this.j.k((View)i);
        final b w = new b((ttg)new com.google.android.youtube.api.jar.client.a(this, 0), this.j, this.h);
        this.W = w;
        final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b z = new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b((com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.c)i, this.h);
        this.Z = z;
        final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b aa = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b(this.x, this.h);
        this.aa = aa;
        final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b ab = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b((sjs)this.y, this.h);
        this.ab = ab;
        final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b ac = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b((abbs)this.k, (abdi)this.l, (abeg)this.m, (abcy)this.n, this.p, this.q, this.r, this.s, this.t, this.o, this.h);
        this.ac = ac;
        final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b ad = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b((abcg)this.z, this.h);
        this.ad = ad;
        final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b ae = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b((abdb)this.A, this.h);
        this.ae = ae;
        final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b af = new com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b((abdl)this.B, this.h);
        this.af = af;
        final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b ag = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b((abek)this.w, this.h);
        this.ag = ag;
        final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.e e = com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.e.e((List)com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.l.a, this.h, this.R);
        this.ah = e;
        this.S = apiPlayerFactoryService.a((com.google.android.apps.youtube.embeddedplayer.service.jar.client.g)new f(this), (com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.c)w, this.X, this.Y, z, aa, (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c)ab, (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c)ac, (com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f)e, (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c)ad, (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c)ae, (com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c)af, (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c)ag, (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.e((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c)this.C, this.h), (com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c)this.M, (com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f)this.N, b);
        com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.d.a().b(this.S.b());
        com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.c.a().b(this.S.b());
        zlm.a((zlj)com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.c.a().b);
        final d d = this.S.d();
        this.V = d;
        final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.c c = new com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.c(d);
        this.U = this.S.e();
        final com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.f v = this.v;
        if (v != null) {
            v.m(this.N, this.U, (com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b)c);
        }
        d.g(this.T = d.a(((a)l).a()));
    }
    
    public RemoteEmbeddedPlayer(final IBinder binder, final IBinder binder2) {
        this(binder, binder2, false);
    }
    
    public RemoteEmbeddedPlayer(final IBinder binder, final IBinder binder2, final IBinder binder3, final boolean b) {
        final IApiPlayerFactoryService apiPlayerFactoryService = null;
        Object o;
        if (binder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof aehx) {
                o = queryLocalInterface;
            }
            else {
                o = new aehv(binder);
            }
        }
        final Context context = (Context)aehw.b((aehx)o);
        Object o2;
        if (binder2 == null) {
            o2 = null;
        }
        else {
            final IInterface queryLocalInterface2 = binder2.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            if (queryLocalInterface2 instanceof aehx) {
                o2 = queryLocalInterface2;
            }
            else {
                o2 = new aehv(binder2);
            }
        }
        final Activity activity = (Activity)aehw.b((aehx)o2);
        IApiPlayerFactoryService apiPlayerFactoryService2;
        if (binder3 == null) {
            apiPlayerFactoryService2 = apiPlayerFactoryService;
        }
        else {
            final IInterface queryLocalInterface3 = binder3.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService");
            if (queryLocalInterface3 instanceof IApiPlayerFactoryService) {
                apiPlayerFactoryService2 = (IApiPlayerFactoryService)queryLocalInterface3;
            }
            else {
                apiPlayerFactoryService2 = new IApiPlayerFactoryService$Stub$Proxy(binder3);
            }
        }
        this(context, activity, apiPlayerFactoryService2, b);
    }
    
    public RemoteEmbeddedPlayer(final IBinder binder, final IBinder binder2, final boolean b) {
        final IApiPlayerFactoryService apiPlayerFactoryService = null;
        Object o;
        if (binder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof aehx) {
                o = queryLocalInterface;
            }
            else {
                o = new aehv(binder);
            }
        }
        final Activity activity = (Activity)aehw.b((aehx)o);
        IApiPlayerFactoryService apiPlayerFactoryService2;
        if (binder2 == null) {
            apiPlayerFactoryService2 = apiPlayerFactoryService;
        }
        else {
            final IInterface queryLocalInterface2 = binder2.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService");
            if (queryLocalInterface2 instanceof IApiPlayerFactoryService) {
                apiPlayerFactoryService2 = (IApiPlayerFactoryService)queryLocalInterface2;
            }
            else {
                apiPlayerFactoryService2 = new IApiPlayerFactoryService$Stub$Proxy(binder2);
            }
        }
        final Class<? super Activity> superclass = activity.getClass().getSuperclass();
        int i = 0;
        Field[] declaredFields;
        if (superclass != null) {
            declaredFields = superclass.getDeclaredFields();
        }
        else {
            declaredFields = new Field[0];
        }
        while (i < declaredFields.length) {
            final Field field = declaredFields[i];
            if (field.getType() == Activity.class) {
                field.setAccessible(true);
                try {
                    final Activity activity2 = (Activity)field.get(activity);
                    if (activity2 != null) {
                        this((Context)activity, activity2, apiPlayerFactoryService2, b);
                        return;
                    }
                }
                catch (final IllegalAccessException ex) {
                    throw new IllegalStateException("Could not get the activity from the ActivityWrapper", ex);
                }
            }
            ++i;
        }
        throw new IllegalStateException("Failed to extract the wrapped activity");
    }
    
    private final void aD(final SimplePlaybackDescriptor simplePlaybackDescriptor) {
        final d v = this.V;
        if (v != null) {
            try {
                v.f(this.T, simplePlaybackDescriptor, true);
            }
            catch (final RemoteException ex) {
                mft.v(ex);
            }
        }
    }
    
    public final void A() {
        try {
            this.d = false;
            this.S.M();
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final boolean B() {
        return this.b;
    }
    
    public final boolean C() {
        return this.c;
    }
    
    public final boolean D() {
        try {
            return this.S.O();
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final boolean E() {
        return this.a;
    }
    
    public final boolean F(final VisibilityChangeEventData visibilityChangeEventData) {
        if (!this.aw()) {
            return false;
        }
        try {
            this.S.s(visibilityChangeEventData);
            return true;
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final boolean G(final int n, final KeyEvent keyEvent) {
        try {
            this.S.u(n, keyEvent);
            return false;
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final boolean H(final int n, final KeyEvent keyEvent) {
        try {
            this.S.v(n, keyEvent);
            return false;
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    protected final boolean I(final byte[] array) {
        try {
            return this.S.P(array);
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    protected final byte[] J() {
        try {
            return this.S.R();
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final int a() {
        final long f = this.f;
        if (f < -2147483648L || f > 2147483647L) {
            final StringBuilder sb = new StringBuilder("32 bit time overflow: ");
            sb.append(f);
            ttr.l(sb.toString());
        }
        return (int)this.f;
    }
    
    public final int b() {
        final long g = this.g;
        if (g < -2147483648L || g > 2147483647L) {
            final StringBuilder sb = new StringBuilder("32 bit time overflow: ");
            sb.append(g);
            ttr.l(sb.toString());
        }
        return (int)this.g;
    }
    
    public final void c() {
        try {
            this.S.m();
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final void d(final String s, final int n, final int n2) {
        this.aD(SimplePlaybackDescriptor.b(s, 0, n, n2));
        try {
            this.d = false;
            this.f = n2;
            this.S.h(s, n, n2, this.T);
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final void e(final String s, final int n) {
        this.aD(SimplePlaybackDescriptor.d(s, 0, n));
        try {
            this.d = false;
            this.f = n;
            this.S.i(s, n, this.T);
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final void f(final List list, final int n, final int n2) {
        this.aD(SimplePlaybackDescriptor.e(list, 0, n, n2));
        try {
            this.d = false;
            this.f = n2;
            this.S.j(list, n, n2, this.T);
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final void g() {
        if (!this.e) {
            this.d = true;
            return;
        }
        try {
            this.d = false;
            this.S.n();
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final void h(final String s, final int n, final int n2) {
        this.aD(SimplePlaybackDescriptor.b(s, 1, n, n2));
        try {
            this.d = false;
            this.f = n2;
            this.S.o(s, n, n2, false, this.T);
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final void i(final String s, final int n) {
        this.aD(SimplePlaybackDescriptor.d(s, 1, n));
        try {
            this.d = false;
            this.f = n;
            this.S.p(s, false, n, false, this.T);
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final void j(final List list, final int n, final int n2) {
        this.aD(SimplePlaybackDescriptor.e(list, 1, n, n2));
        try {
            this.d = false;
            this.f = n2;
            this.S.q(list, n, n2, false, this.T);
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final void k(final xab xab) {
        final d v = this.V;
        if (v != null) {
            try {
                v.h(xab.a);
            }
            catch (final RemoteException ex) {
                throw new IllegalStateException((Throwable)ex);
            }
        }
    }
    
    public final void l() {
        try {
            this.S.r();
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final void m() {
        try {
            this.S.x();
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final void n() {
        try {
            this.S.y();
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    protected final void o() {
        try {
            this.S.f();
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    protected final void p(final boolean b) {
        try {
            this.S.k(b);
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final void q() {
        try {
            this.d = false;
            this.S.x();
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final void r() {
        try {
            this.d = false;
            this.S.y();
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final void s() {
        try {
            this.S.z();
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final void t(final boolean b) {
        while (true) {
            try {
                this.S.B(b);
                final e x = this.X;
                if (x != null) {
                    x.c();
                }
                final k y = this.Y;
                if (y != null) {
                    final h c = y.c;
                    final TextureView a = c.a;
                    if (a != null) {
                        c.removeView((View)a);
                    }
                    c.a = null;
                    final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.g b2 = y.b;
                    if (b2 != null) {
                        b2.a = null;
                        b2.b = null;
                        y.b = null;
                    }
                }
                final d v = this.V;
                if (v != null) {
                    v.l(this.T);
                }
                this.W.c();
                this.aa.c();
                this.ah.d();
                this.N.d();
                this.ac.c();
                this.ad.c();
                this.ab.c();
                this.V = null;
                this.U = null;
                com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.d.a().c();
                com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.c.a().d();
                this.S = (IApiPlayerService)new DisconnectedApiPlayerService();
            }
            catch (final RemoteException ex) {
                continue;
            }
            break;
        }
    }
    
    public final void u(final int n) {
        try {
            this.d = false;
            this.f += n;
            this.S.E(n);
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final void v(final int n) {
        try {
            this.d = false;
            this.f = n;
            this.S.F(n);
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final void w(final boolean b) {
        try {
            this.S.G(b);
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final void x(final boolean b) {
        try {
            this.S.H(b);
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final void y(final boolean b) {
        try {
            this.S.I(b);
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public final void z() {
        try {
            this.S.J();
        }
        catch (final RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
}
