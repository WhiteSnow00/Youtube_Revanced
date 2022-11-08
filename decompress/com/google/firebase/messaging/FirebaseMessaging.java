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
    static lql a;
    static ScheduledExecutorService b;
    private static final long j;
    private static agli p;
    public final agfz c;
    public final Context d;
    public final agkm e;
    public final Executor f;
    public final nly g;
    public final agkp h;
    private final agjf k;
    private final agkl l;
    private final Executor m;
    private boolean n;
    private final Application$ActivityLifecycleCallbacks o;
    private final ahbd q;
    
    static {
        j = TimeUnit.HOURS.toSeconds(8L);
    }
    
    public FirebaseMessaging(final agfz c, final agjf k, final agjg agjg, final agjg agjg2, final agjj agjj, final lql a, final agio agio) {
        final agkp h = new agkp(c.a());
        final agkm e = new agkm(c, h, new mol(c.a()), agjg, agjg2, agjj);
        final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor((ThreadFactory)new emi("Firebase-Messaging-Task", 2));
        final ScheduledThreadPoolExecutor m = new ScheduledThreadPoolExecutor(1, (ThreadFactory)new emi("Firebase-Messaging-Init", 2));
        final ThreadPoolExecutor f = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)new emi("Firebase-Messaging-File-Io", 2));
        this.n = false;
        FirebaseMessaging.a = a;
        this.c = c;
        this.k = k;
        this.l = new agkl(this, agio);
        final Context a2 = c.a();
        this.d = a2;
        final agkh o = new agkh(0);
        this.o = (Application$ActivityLifecycleCallbacks)o;
        this.h = h;
        this.e = e;
        this.q = new ahbd(singleThreadExecutor);
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
            k.c(new xpb(this));
        }
        m.execute((Runnable)new aesf(this, 11));
        (this.g = agkx.a(this, h, e, a2, (ScheduledExecutorService)new ScheduledThreadPoolExecutor(1, (ThreadFactory)new emi("Firebase-Messaging-Topics-Io", 2)))).o((Executor)m, (nlu)new jzl(this, 9));
        m.execute((Runnable)new aesf(this, 12));
    }
    
    public static FirebaseMessaging a() {
        synchronized (FirebaseMessaging.class) {
            return getInstance(agfz.b());
        }
    }
    
    static FirebaseMessaging getInstance(final agfz agfz) {
        synchronized (FirebaseMessaging.class) {
            final FirebaseMessaging firebaseMessaging = (FirebaseMessaging)agfz.f((Class)FirebaseMessaging.class);
            kgk.aX((Object)firebaseMessaging, (Object)"Firebase Messaging component is not present");
            return firebaseMessaging;
        }
    }
    
    public static final void k(final Runnable runnable, final long n) {
        synchronized (FirebaseMessaging.class) {
            if (FirebaseMessaging.b == null) {
                FirebaseMessaging.b = new ScheduledThreadPoolExecutor(1, (ThreadFactory)new emi("TAG", 2));
            }
            FirebaseMessaging.b.schedule(runnable, n, TimeUnit.SECONDS);
        }
    }
    
    public static agli l(final Context context) {
        synchronized (FirebaseMessaging.class) {
            if (FirebaseMessaging.p == null) {
                FirebaseMessaging.p = new agli(context);
            }
            return FirebaseMessaging.p;
        }
    }
    
    private final void m() {
        synchronized (this) {
            if (!this.n) {
                this.h(0L);
            }
        }
    }
    
    final agks b() {
        return l(this.d).a(this.d(), agkp.e(this.c));
    }
    
    public final String c() {
        Object k = this.k;
        if (k != null) {
            try {
                k = nmr.d(((agjf)k).a());
                return (String)k;
            }
            catch (final InterruptedException k) {}
            catch (final ExecutionException ex) {}
            throw new IOException((Throwable)k);
        }
        final agks b = this.b();
        if (!this.j(b)) {
            return b.b;
        }
        final String e = agkp.e(this.c);
        Object f = this.q.f(e, new arvv(this, e, b));
        try {
            f = nmr.d((nly)f);
            return (String)f;
        }
        catch (final InterruptedException f) {}
        catch (final ExecutionException ex2) {}
        throw new IOException((Throwable)f);
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
            agkg.b(intent, this.d, (Executor)rr.j);
        }
    }
    
    public final void f(final boolean n) {
        synchronized (this) {
            this.n = n;
        }
    }
    
    public final void g() {
        final agjf k = this.k;
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
            k((Runnable)new agku(this, Math.min(Math.max(30L, n + n), FirebaseMessaging.j), 0), n);
            this.n = true;
        }
    }
    
    public final boolean i() {
        return this.l.b();
    }
    
    final boolean j(final agks agks) {
        if (agks != null) {
            final String c = this.h.c();
            if (System.currentTimeMillis() <= agks.d + agks.a) {
                if (c.equals(agks.c)) {
                    return false;
                }
            }
        }
        return true;
    }
}
