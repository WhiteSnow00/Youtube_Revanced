// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.iid;

import android.os.Looper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.io.IOException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import java.util.concurrent.ScheduledExecutorService;

@Deprecated
public class FirebaseInstanceId
{
    static ScheduledExecutorService a;
    public static aujg h;
    private static final long j;
    private static final Pattern k;
    public final Executor b;
    public final agia c;
    public final agla d;
    public final agkz e;
    public final aglk f;
    public final List g;
    public final arzp i;
    private boolean l;
    
    static {
        j = TimeUnit.HOURS.toSeconds(8L);
        k = Pattern.compile("\\AA[\\w-]{38}\\z");
    }
    
    public FirebaseInstanceId(final agia c, final agla d, final Executor executor, final Executor b, final aglh aglh, final aglh aglh2, final aglk f) {
        this.l = false;
        this.g = new ArrayList();
        if (agla.e(c) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (FirebaseInstanceId.h == null) {
                    FirebaseInstanceId.h = new aujg(c.a());
                }
                monitorexit(FirebaseInstanceId.class);
                this.c = c;
                this.d = d;
                this.e = new agkz(c, d, new mpq(c.a()), aglh, aglh2, f);
                this.b = b;
                this.i = new arzp(executor);
                this.f = f;
                return;
            }
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }
    
    public static void g(final agia agia) {
        khl.ba(agia.e().d, "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        khl.ba(agia.e().b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        khl.ba(agia.e().a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        khl.aR(agia.e().b.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        khl.aR(FirebaseInstanceId.k.matcher(agia.e().a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }
    
    public static FirebaseInstanceId getInstance(final agia agia) {
        g(agia);
        final FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId)agia.f((Class)FirebaseInstanceId.class);
        khl.bb(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }
    
    public static final void m(final Runnable runnable, final long n) {
        synchronized (FirebaseInstanceId.class) {
            if (FirebaseInstanceId.a == null) {
                FirebaseInstanceId.a = new ScheduledThreadPoolExecutor(1, (ThreadFactory)new emj("FirebaseInstanceId", 2));
            }
            FirebaseInstanceId.a.schedule(runnable, n, TimeUnit.SECONDS);
        }
    }
    
    private final Object n(final nnc nnc) {
        try {
            return nnv.e(nnc, 30000L, TimeUnit.MILLISECONDS);
        }
        catch (final InterruptedException | TimeoutException ex) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        catch (final ExecutionException ex2) {
            final Throwable cause = ex2.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    this.h();
                }
                throw (IOException)cause;
            }
            if (cause instanceof RuntimeException) {
                throw (RuntimeException)cause;
            }
            throw new IOException(ex2);
        }
    }
    
    public final nnc a(final String s, final String s2) {
        if (!s2.isEmpty() && !s2.equalsIgnoreCase("fcm")) {
            final String s3 = s2;
            if (!s2.equalsIgnoreCase("gcm")) {
                return nnv.c((Object)null).b(this.b, (nmr)new agkx(this, s, s3));
            }
        }
        final String s3 = "*";
        return nnv.c((Object)null).b(this.b, (nmr)new agkx(this, s, s3));
    }
    
    public final agle b() {
        return this.c(agla.e(this.c), "*");
    }
    
    public final agle c(final String s, final String s2) {
        return FirebaseInstanceId.h.b(this.d(), s, s2);
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
    
    @Deprecated
    public final String e() {
        g(this.c);
        final agle b = this.b();
        if (this.l(b)) {
            this.j();
        }
        return agle.c(b);
    }
    
    @Deprecated
    public final String f(final String s, final String s2) {
        g(this.c);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return (String)((agnj)this.n(this.a(s, s2))).a;
        }
        throw new IOException("MAIN_THREAD");
    }
    
    final void h() {
        synchronized (this) {
            FirebaseInstanceId.h.c();
        }
    }
    
    public final void i(final boolean l) {
        synchronized (this) {
            this.l = l;
        }
    }
    
    final void j() {
        synchronized (this) {
            if (!this.l) {
                this.k(0L);
            }
        }
    }
    
    public final void k(final long n) {
        synchronized (this) {
            m(new agmv(this, Math.min(Math.max(30L, n + n), FirebaseInstanceId.j), 1), n);
            this.l = true;
        }
    }
    
    public final boolean l(final agle agle) {
        if (agle != null) {
            final String c = this.d.c();
            if (System.currentTimeMillis() <= agle.d + agle.a) {
                if (c.equals(agle.c)) {
                    return false;
                }
            }
        }
        return true;
    }
}
