// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.messaging;

import android.content.Intent;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import android.util.Log;
import android.app.Application;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import android.app.Application$ActivityLifecycleCallbacks;
import java.util.concurrent.Executor;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public class FirebaseMessaging
{
    static lrp a;
    static ScheduledExecutorService b;
    public static final int i = 0;
    private static final long j;
    private static agnj q;
    public final agia c;
    public final Context d;
    public final agmn e;
    public final Executor f;
    public final nnc g;
    public final agmq h;
    private final aglg k;
    private final agmm l;
    private final Executor m;
    private boolean n;
    private final Application$ActivityLifecycleCallbacks o;
    private final ahdc p;
    
    static {
        j = TimeUnit.HOURS.toSeconds(8L);
    }
    
    public FirebaseMessaging(final agia c, final aglg k, final aglh aglh, final aglh aglh2, final aglk aglk, final lrp a, final agkp agkp) {
        final agmq h = new agmq(c.a());
        final agmn e = new agmn(c, h, new mpq(c.a()), aglh, aglh2, aglk);
        final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor((ThreadFactory)new emj("Firebase-Messaging-Task", 2));
        final ScheduledThreadPoolExecutor m = new ScheduledThreadPoolExecutor(1, (ThreadFactory)new emj("Firebase-Messaging-Init", 2));
        final ThreadPoolExecutor f = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)new emj("Firebase-Messaging-File-Io", 2));
        this.n = false;
        FirebaseMessaging.a = a;
        this.c = c;
        this.k = k;
        this.l = new agmm(this, agkp);
        final Context a2 = c.a();
        this.d = a2;
        final agmi o = new agmi(0);
        this.o = (Application$ActivityLifecycleCallbacks)o;
        this.h = h;
        this.e = e;
        this.p = new ahdc((Executor)singleThreadExecutor);
        this.m = m;
        this.f = f;
        final Context a3 = c.a();
        if (a3 instanceof Application) {
            ((Application)a3).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)o);
        }
        else {
            final String string = a3.toString();
            final StringBuilder sb = new StringBuilder("Context ");
            sb.append(string);
            sb.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        if (k != null) {
            k.c(new xra(this));
        }
        m.execute((Runnable)new aeue(this, 12));
        (this.g = agmy.a(this, h, e, a2, new ScheduledThreadPoolExecutor(1, (ThreadFactory)new emj("Firebase-Messaging-Topics-Io", 2)))).o((Executor)m, (nmy)new kal(this, 9));
        m.execute((Runnable)new aeue(this, 13));
    }
    
    public static FirebaseMessaging a() {
        synchronized (FirebaseMessaging.class) {
            return getInstance(agia.b());
        }
    }
    
    static FirebaseMessaging getInstance(final agia agia) {
        synchronized (FirebaseMessaging.class) {
            final FirebaseMessaging firebaseMessaging = (FirebaseMessaging)agia.f((Class)FirebaseMessaging.class);
            khl.bb(firebaseMessaging, "Firebase Messaging component is not present");
            return firebaseMessaging;
        }
    }
    
    public static final void k(final Runnable runnable, final long n) {
        synchronized (FirebaseMessaging.class) {
            if (FirebaseMessaging.b == null) {
                FirebaseMessaging.b = new ScheduledThreadPoolExecutor(1, (ThreadFactory)new emj("TAG", 2));
            }
            FirebaseMessaging.b.schedule(runnable, n, TimeUnit.SECONDS);
        }
    }
    
    public static agnj l(final Context context) {
        synchronized (FirebaseMessaging.class) {
            if (FirebaseMessaging.q == null) {
                FirebaseMessaging.q = new agnj(context);
            }
            return FirebaseMessaging.q;
        }
    }
    
    private final void m() {
        synchronized (this) {
            if (!this.n) {
                this.h(0L);
            }
        }
    }
    
    final agmt b() {
        return l(this.d).A(this.d(), agmq.e(this.c));
    }
    
    public final String c() {
        Object k = this.k;
        if (k != null) {
            try {
                k = nnv.d(((aglg)k).a());
                return (String)k;
            }
            catch (final InterruptedException k) {}
            catch (final ExecutionException ex) {}
            throw new IOException((Throwable)k);
        }
        final agmt b = this.b();
        if (!this.j(b)) {
            return b.b;
        }
        final String e = agmq.e(this.c);
        Object c = this.p.c(e, new aqtv(this, e, b));
        try {
            c = nnv.d((nnc)c);
            return (String)c;
        }
        catch (final InterruptedException c) {}
        catch (final ExecutionException ex2) {}
        throw new IOException((Throwable)c);
    }
    
    public final String d() {
        String h;
        if ("[DEFAULT]".equals(this.c.g())) {
            h = "";
        }
        else {
            h = this.c.h();
        }
        return h;
    }
    
    public final void e(final String s) {
        if ("[DEFAULT]".equals(this.c.g())) {
            final Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", s);
            agmh.b(intent, this.d, (Executor)rr.j);
        }
    }
    
    public final void f(final boolean n) {
        synchronized (this) {
            this.n = n;
        }
    }
    
    public final void g() {
        final aglg k = this.k;
        if (k != null) {
            k.b();
            return;
        }
        if (this.j(this.b())) {
            this.m();
        }
    }
    
    public final void h(final long n) {
        synchronized (this) {
            k(new agmv(this, Math.min(Math.max(30L, n + n), FirebaseMessaging.j), 0), n);
            this.n = true;
        }
    }
    
    public final boolean i() {
        return this.l.b();
    }
    
    final boolean j(final agmt agmt) {
        if (agmt != null) {
            final String c = this.h.c();
            if (System.currentTimeMillis() <= agmt.d + agmt.a) {
                if (c.equals(agmt.c)) {
                    return false;
                }
            }
        }
        return true;
    }
}
