// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import com.google.android.apps.youtube.embeddedplayer.service.jar.g;
import android.view.Window;
import android.app.Activity;
import android.os.IInterface;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService$Stub$Proxy;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService$Stub$Proxy;
import android.os.IBinder;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService;
import android.content.Context;

public class RemoteEmbedFragmentFactory extends aeiv
{
    private final Context a;
    private final IApiPlayerFactoryService b;
    private final IEmbedFragmentServiceFactoryService c;
    
    public RemoteEmbedFragmentFactory(final IBinder binder, final IBinder binder2, final IBinder binder3) {
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
        final Context a = (Context)aejp.b((aejq)o);
        IApiPlayerFactoryService b;
        if (binder2 == null) {
            b = null;
        }
        else {
            final IInterface queryLocalInterface2 = binder2.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService");
            if (queryLocalInterface2 instanceof IApiPlayerFactoryService) {
                b = (IApiPlayerFactoryService)queryLocalInterface2;
            }
            else {
                b = new IApiPlayerFactoryService$Stub$Proxy(binder2);
            }
        }
        IEmbedFragmentServiceFactoryService c;
        if (binder3 == null) {
            c = embedFragmentServiceFactoryService;
        }
        else {
            final IInterface queryLocalInterface3 = binder3.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService");
            if (queryLocalInterface3 instanceof IEmbedFragmentServiceFactoryService) {
                c = (IEmbedFragmentServiceFactoryService)queryLocalInterface3;
            }
            else {
                c = new IEmbedFragmentServiceFactoryService$Stub$Proxy(binder3);
            }
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final aeiu a(final IBinder binder) {
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
        final Activity activity = (Activity)aejp.b((aejq)o);
        activity.getClass();
        final RemoteEmbedFragment remoteEmbedFragment = new RemoteEmbedFragment(this.a, this.b, this.c);
        remoteEmbedFragment.y();
        remoteEmbedFragment.f(activity);
        return (aeiu)remoteEmbedFragment;
    }
    
    public final aeiu b(final IBinder binder) {
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
        final Window window = (Window)aejp.b((aejq)o);
        window.getClass();
        final RemoteEmbedFragment remoteEmbedFragment = new RemoteEmbedFragment(this.a, this.b, this.c);
        remoteEmbedFragment.y();
        remoteEmbedFragment.i(window);
        return (aeiu)remoteEmbedFragment;
    }
    
    public final void c() {
        g.u();
    }
}
