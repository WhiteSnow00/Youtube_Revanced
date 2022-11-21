// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.view.Window;
import java.util.concurrent.TimeUnit;
import android.os.Bundle;
import java.util.List;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.SetOperationType;
import com.google.android.apps.youtube.embeddedplayer.service.jar.g;
import java.util.concurrent.Callable;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.embeddedplayer.service.jar.a;
import com.google.android.apps.youtube.embeddedplayer.service.jar.k;
import android.app.Activity;
import android.os.IInterface;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService$Stub$Proxy;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService$Stub$Proxy;
import android.os.IBinder;
import java.util.concurrent.Future;
import android.view.ViewGroup;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService;
import android.content.Context;

public class RemoteEmbedFragment extends aeit
{
    private final Context a;
    private final IApiPlayerFactoryService b;
    private final IEmbedFragmentServiceFactoryService c;
    private final aslm d;
    private ViewGroup e;
    private asla f;
    private Future g;
    private boolean h;
    
    public RemoteEmbedFragment(final Context a, final IApiPlayerFactoryService b, final IEmbedFragmentServiceFactoryService c) {
        this.d = new aslm();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public RemoteEmbedFragment(final IBinder binder, final IBinder binder2, final IBinder binder3) {
        final IEmbedFragmentServiceFactoryService embedFragmentServiceFactoryService = null;
        Object o;
        if (binder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof aejq) {
                o = queryLocalInterface;
            }
            else {
                o = new aejo(binder);
            }
        }
        final Context context = (Context)aejp.b((aejq)o);
        IApiPlayerFactoryService apiPlayerFactoryService;
        if (binder2 == null) {
            apiPlayerFactoryService = null;
        }
        else {
            final IInterface queryLocalInterface2 = binder2.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService");
            if (queryLocalInterface2 instanceof IApiPlayerFactoryService) {
                apiPlayerFactoryService = (IApiPlayerFactoryService)queryLocalInterface2;
            }
            else {
                apiPlayerFactoryService = new IApiPlayerFactoryService$Stub$Proxy(binder2);
            }
        }
        IEmbedFragmentServiceFactoryService embedFragmentServiceFactoryService2;
        if (binder3 == null) {
            embedFragmentServiceFactoryService2 = embedFragmentServiceFactoryService;
        }
        else {
            final IInterface queryLocalInterface3 = binder3.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService");
            if (queryLocalInterface3 instanceof IEmbedFragmentServiceFactoryService) {
                embedFragmentServiceFactoryService2 = (IEmbedFragmentServiceFactoryService)queryLocalInterface3;
            }
            else {
                embedFragmentServiceFactoryService2 = new IEmbedFragmentServiceFactoryService$Stub$Proxy(binder3);
            }
        }
        this(context, apiPlayerFactoryService, embedFragmentServiceFactoryService2);
    }
    
    public RemoteEmbedFragment(final IBinder binder, final IBinder binder2, final IBinder binder3, final IBinder binder4) {
        final aejq aejq = null;
        Object o;
        if (binder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof aejq) {
                o = queryLocalInterface;
            }
            else {
                o = new aejo(binder);
            }
        }
        final Context context = (Context)aejp.b((aejq)o);
        IApiPlayerFactoryService apiPlayerFactoryService;
        if (binder3 == null) {
            apiPlayerFactoryService = null;
        }
        else {
            final IInterface queryLocalInterface2 = binder3.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService");
            if (queryLocalInterface2 instanceof IApiPlayerFactoryService) {
                apiPlayerFactoryService = (IApiPlayerFactoryService)queryLocalInterface2;
            }
            else {
                apiPlayerFactoryService = new IApiPlayerFactoryService$Stub$Proxy(binder3);
            }
        }
        IEmbedFragmentServiceFactoryService embedFragmentServiceFactoryService;
        if (binder4 == null) {
            embedFragmentServiceFactoryService = null;
        }
        else {
            final IInterface queryLocalInterface3 = binder4.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService");
            if (queryLocalInterface3 instanceof IEmbedFragmentServiceFactoryService) {
                embedFragmentServiceFactoryService = (IEmbedFragmentServiceFactoryService)queryLocalInterface3;
            }
            else {
                embedFragmentServiceFactoryService = new IEmbedFragmentServiceFactoryService$Stub$Proxy(binder4);
            }
        }
        this(context, apiPlayerFactoryService, embedFragmentServiceFactoryService);
        Object o2;
        if (binder2 == null) {
            o2 = aejq;
        }
        else {
            final IInterface queryLocalInterface4 = binder2.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            if (queryLocalInterface4 instanceof aejq) {
                o2 = queryLocalInterface4;
            }
            else {
                o2 = new aejo(binder2);
            }
        }
        final Activity activity = (Activity)aejp.b((aejq)o2);
        this.I((Context)activity, new k(activity, 1));
    }
    
    private final void H(final asmi asmi) {
        this.d.c(this.f.ab(asmi, (asmi)lgi.q));
    }
    
    private final void I(final Context context, final a a) {
        (this.e = (ViewGroup)new FrameLayout(context)).setBackgroundColor(-16777216);
        final asla o = asla.F((Callable)new kya(this.a, context, 9)).Q(atmg.a()).o();
        final asla l = s.c(o, com.google.android.apps.youtube.embeddedplayer.service.jar.g.h(o, a, this.b, this.h), a, this.e, this.c).L(aslh.a());
        this.f = l;
        this.d.c(l.ab((asmi)m.b, (asmi)lgi.q));
        this.g = this.f.ad();
    }
    
    private static void J(final SetOperationType setOperationType) {
        final d b = com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.b;
        try {
            b.j(setOperationType, System.currentTimeMillis());
            b.g(Tick.e, System.currentTimeMillis());
        }
        catch (final RemoteException ex) {
            aftr.l("Csi Controller Service disconnected");
        }
    }
    
    public final void A(final String s) {
        this.H((asmi)new lol(s, 12));
    }
    
    @Deprecated
    public final void B(final List list, final boolean b) {
        this.H((asmi)new n(list, b, 2));
    }
    
    public final void C(final String s) {
        this.H((asmi)new lol(s, 7));
    }
    
    public final void D() {
        this.H((asmi)m.c);
    }
    
    public final void E() {
        com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.b.c();
        this.H((asmi)lgi.u);
    }
    
    public final void F(final aeiq aeiq) {
        this.H((asmi)new lol(aeiq, 10));
    }
    
    public final void G(final String s, final aeiq aeiq) {
        this.H((asmi)new ins(s, aeiq, 17));
    }
    
    public final Bundle a() {
        s s;
        try {
            s = this.g.get(1L, TimeUnit.SECONDS);
        }
        catch (final Exception ex) {
            if (ex instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            aftr.l("Cannot save state: ".concat(String.valueOf(ex.getMessage())));
            s = null;
        }
        if (s == null) {
            return null;
        }
        return s.b();
    }
    
    public final aejq b() {
        return aejp.a((Object)this.e);
    }
    
    @Deprecated
    public final void c() {
        this.H((asmi)lgi.s);
    }
    
    public final void d() {
        J(SetOperationType.b);
        this.H((asmi)m.d);
    }
    
    public final void e(final String s) {
        this.H((asmi)new lol(s, 11));
    }
    
    public final void f(final Activity activity) {
        this.I((Context)activity, new k(activity, 1));
    }
    
    public final void g(final IBinder binder) {
        Object o;
        if (binder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof aejq) {
                o = queryLocalInterface;
            }
            else {
                o = new aejo(binder);
            }
        }
        this.f((Activity)aejp.b((aejq)o));
    }
    
    public final void h(final IBinder binder) {
        Object o;
        if (binder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof aejq) {
                o = queryLocalInterface;
            }
            else {
                o = new aejo(binder);
            }
        }
        this.i((Window)aejp.b((aejq)o));
    }
    
    public final void i(final Window window) {
        this.I(window.getContext(), new k(window, 0));
    }
    
    public final void j() {
        this.d.dispose();
        this.f.ab((asmi)lgi.p, (asmi)lgi.q);
    }
    
    public final void k(final Bundle bundle) {
        this.H((asmi)new lol(bundle, 5));
    }
    
    public final void l() {
        this.H((asmi)lgi.r);
    }
    
    public final void m() {
        J(SetOperationType.a);
        this.H((asmi)m.a);
    }
    
    public final void n(final String s, final int n) {
        this.H((asmi)new jpw(s, n, 3));
    }
    
    public final void o(final int n) {
        this.H((asmi)new com.google.android.apps.youtube.embeddedplayer.service.jar.client.k(n, 0));
    }
    
    public final void p(final int n) {
        this.H((asmi)new com.google.android.apps.youtube.embeddedplayer.service.jar.client.k(n, 2));
    }
    
    public final void q() {
        this.H((asmi)lgi.t);
    }
    
    public final void r(final String s) {
        this.H((asmi)new lol(s, 8));
    }
    
    public final void s(final boolean b) {
        this.H((asmi)new l(b, 1));
    }
    
    public final void t(final boolean b) {
        this.H((asmi)new l(b, 0));
    }
    
    public final void u(final aeja aeja) {
        this.H((asmi)new lol(aeja, 9));
    }
    
    public final void v(final int n) {
        this.H((asmi)new com.google.android.apps.youtube.embeddedplayer.service.jar.client.k(n, 3));
    }
    
    @Deprecated
    public final void w(final String s, final boolean b) {
        this.H((asmi)new n(s, b, 0));
    }
    
    public final void x(final String s) {
        this.H((asmi)new lol(s, 6));
    }
    
    public final void y() {
        this.h = true;
    }
    
    public final void z(final String s, final boolean b) {
        this.H((asmi)new n(s, b, 1));
    }
}
