// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.contrib.work;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import com.google.common.util.concurrent.ListenableFuture;
import android.content.Context;
import androidx.work.WorkerParameters;

public final class TikTokListenableWorker extends cmr
{
    private static final afkk a;
    private final aetv b;
    private final atke g;
    private final WorkerParameters h;
    private aemx i;
    private boolean j;
    
    static {
        a = afkk.m("com/google/apps/tiktok/contrib/work/TikTokListenableWorker");
    }
    
    public TikTokListenableWorker(final Context context, final aetv b, final atke g, final WorkerParameters h) {
        super(context, h);
        this.i = null;
        this.j = false;
        this.g = g;
        this.b = b;
        this.h = h;
    }
    
    public static void c(final ListenableFuture listenableFuture, final agoh agoh) {
        try {
            afwm.u((Future)listenableFuture);
        }
        catch (final CancellationException ex) {
            ((afki)((afki)((afkg)TikTokListenableWorker.a).h()).j("com/google/apps/tiktok/contrib/work/TikTokListenableWorker", "lambda$logOnCancellationOrFailure$0", 170, "TikTokListenableWorker.java")).t("TikTokListenableWorker was cancelled while running client worker: %s", (Object)agoh);
        }
        catch (final ExecutionException ex2) {
            ((afki)((afki)((afki)((afkg)TikTokListenableWorker.a).g()).i(ex2.getCause())).j("com/google/apps/tiktok/contrib/work/TikTokListenableWorker", "lambda$logOnCancellationOrFailure$0", 165, "TikTokListenableWorker.java")).t("TikTokListenableWorker encountered an exception while running client worker: %s", (Object)agoh);
        }
    }
    
    public final ListenableFuture a() {
        final String c = aenh.c(this.h);
        final aett c2 = this.b.c("WorkManager:TikTokListenableWorker getForegroundInfoAsync()");
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append(c);
            sb.append(" getForegroundInfoAsync()");
            final aetf o = aeux.o(sb.toString());
            try {
                adkp.R(this.i == null, "A TikTokListenableWorker's worker was null during getForegroundInfoAsync(), which should always be called before `startWork()`. Please report any instance of this Exception at go/tiktok-bug.");
                final aemx i = (aemx)this.g.a();
                this.i = i;
                final ListenableFuture b = i.b(this.h);
                o.a(b);
                o.close();
                c2.close();
                return b;
            }
            finally {
                try {
                    o.close();
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    adyf.H(t, t2);
                }
            }
        }
        finally {
            try {
                c2.close();
            }
            finally {
                final Throwable t3;
                final Throwable t4;
                adyf.H(t3, t4);
            }
        }
    }
    
    public final ListenableFuture b() {
        final String c = aenh.c(this.h);
        final aett c2 = this.b.c("WorkManager:TikTokListenableWorker startWork");
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append(c);
            sb.append(" startWork()");
            final aetf o = aeux.o(sb.toString());
            try {
                final String c3 = aenh.c(this.h);
                final aetf o2 = aeux.o(String.valueOf(c3).concat(" startWork()"));
                try {
                    adkp.R(this.j ^ true, "A TikTokListenableWorker started twice. Please report any instance of this Exception at go/tiktok-bug.");
                    this.j = true;
                    if (this.i == null) {
                        this.i = (aemx)this.g.a();
                    }
                    final ListenableFuture a = this.i.a(this.h);
                    a.addListener(aeun.h((Runnable)new adqz(a, new agoh((Object)c3), 14)), (Executor)afum.a);
                    o2.a(a);
                    o2.close();
                    o.a(a);
                    o.close();
                    c2.close();
                    return a;
                }
                finally {
                    try {
                        o2.close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable t2;
                        adyf.H(t, t2);
                    }
                }
            }
            finally {
                try {
                    o.close();
                }
                finally {
                    final Throwable t3;
                    final Throwable t4;
                    adyf.H(t3, t4);
                }
            }
        }
        finally {
            try {
                c2.close();
            }
            finally {
                final Throwable t5;
                final Throwable t6;
                adyf.H(t5, t6);
            }
        }
    }
}
