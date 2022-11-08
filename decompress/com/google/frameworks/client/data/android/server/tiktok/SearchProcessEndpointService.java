// 
// Decompiled by Procyon v0.6.0
// 

package com.google.frameworks.client.data.android.server.tiktok;

import java.util.concurrent.Executor;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.io.IOException;
import io.grpc.binder.LifecycleOnDestroyHelper$2;
import java.util.Collections;
import java.util.Collection;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import com.google.protobuf.ExtensionRegistryLite;
import android.os.IBinder;
import android.content.Intent;

public final class SearchProcessEndpointService extends agmi
{
    public agmg a;
    public arvw b;
    
    public final IBinder onBind(final Intent intent) {
        super.onBind(intent);
        final IBinder a = this.a.e.a();
        a.getClass();
        return a;
    }
    
    public final void onCreate() {
        super.onCreate();
        final agmg a = this.a;
        final arxi b = arvy.b();
        final arvw b2 = this.b;
        if (oxf.a.compareAndSet(false, true)) {
            asfn.c(ExtensionRegistryLite.getGeneratedRegistry());
        }
        final arvr c = arvr.c((Context)a.a);
        final acnx e = a.e;
        final arvg arvg = null;
        final arso arso = new arso(c, e, (byte[])null, (byte[])null);
        arso.d = b;
        b2.getClass();
        arso.c = b2;
        final ScheduledExecutorService b3 = a.b;
        final ases a2 = arso.a;
        Object b4;
        if (b3 != null) {
            b4 = new asfb((Object)b3, 1);
        }
        else {
            b4 = ases.b;
        }
        a2.h = (ascu)b4;
        final ScheduledExecutorService b5 = a.b;
        b5.getClass();
        arso.b = (ascu)new asfb((Object)b5, 1);
        final arsq c2 = a.c;
        final ases a3 = arso.a;
        arsq c3 = c2;
        if (c2 == null) {
            c3 = ases.c;
        }
        a3.g = c3;
        ((arve)arso).b(arsj.b());
        ((arve)arso).a(arrw.a());
        final Iterator iterator = ((List)((aexw)a.d).a).iterator();
        while (iterator.hasNext()) {
            ((arve)arso).c((arvf)iterator.next());
        }
        final ases a4 = arso.a;
        final arvv o = a4.o;
        final ArrayList list = new ArrayList();
        if (a4.l) {
            arvg arvg2 = null;
            Label_0414: {
                try {
                    final Method declaredMethod = Class.forName("arxi").getDeclaredMethod("getServerStreamTracerFactory", Boolean.TYPE, Boolean.TYPE, Boolean.TYPE);
                    final Boolean value = true;
                    arvg2 = (arvg)declaredMethod.invoke(null, value, value, false);
                    break Label_0414;
                }
                catch (final InvocationTargetException ex) {
                    ases.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", ex);
                }
                catch (final IllegalAccessException ex2) {
                    ases.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", ex2);
                }
                catch (final NoSuchMethodException ex3) {
                    ases.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", ex3);
                }
                catch (final ClassNotFoundException ex4) {
                    ases.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", ex4);
                }
                arvg2 = null;
            }
            if (arvg2 != null) {
                list.add(arvg2);
            }
        }
        if (a4.m) {
            arvg arvg3;
            try {
                arvg3 = (arvg)Class.forName("arxj").getDeclaredMethod("getServerStreamTracerFactory", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
            }
            catch (final InvocationTargetException ex5) {
                ases.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", ex5);
                arvg3 = arvg;
            }
            catch (final IllegalAccessException ex6) {
                ases.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", ex6);
                arvg3 = arvg;
            }
            catch (final NoSuchMethodException ex7) {
                ases.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", ex7);
                arvg3 = arvg;
            }
            catch (final ClassNotFoundException ex8) {
                ases.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", ex8);
                arvg3 = arvg;
            }
            if (arvg3 != null) {
                list.add(arvg3);
            }
        }
        list.addAll(a4.f);
        list.trimToSize();
        final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)list);
        final Object c4 = o.c;
        final Object a5 = o.a;
        final Object b6 = o.b;
        final arso arso2 = (arso)c4;
        final arwd arwd = new arwd((arvr)a5, arso2.b, (List)unmodifiableList, arso2.d, arso2.c, (byte[])null, (byte[])null);
        ((acnx)b6).b((IBinder)arwd.b);
        final aseq aseq = new aseq(a4, (asaw)arwd, arsg.d);
        try {
            Object o2 = aseq.p;
            synchronized (o2) {
                agot.E(aseq.k ^ true, (Object)"Already started");
                agot.E(aseq.l ^ true, (Object)"Shutting down");
                aseq.o.c(new xpb(aseq));
                final Object a6 = aseq.d.a();
                a6.getClass();
                aseq.e = (Executor)a6;
                aseq.k = true;
                monitorexit(o2);
                o2 = a.a.getLifecycle();
                if (((aun)o2).b == aug.a) {
                    ((arvd)aseq).a();
                    return;
                }
                ((auh)o2).b((aul)new LifecycleOnDestroyHelper$2((arvd)aseq));
            }
        }
        catch (final IOException ex9) {
            throw new IllegalStateException("Failed to start Server for Endpoint Service ".concat(String.valueOf(String.valueOf(a.a.getClass()))), ex9);
        }
    }
}
