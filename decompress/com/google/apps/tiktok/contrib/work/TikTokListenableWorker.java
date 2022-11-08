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

public final class TikTokListenableWorker extends cmq
{
    private static final afik a;
    private final aeru b;
    private final atjj g;
    private final WorkerParameters h;
    private aekw i;
    private boolean j;
    
    static {
        a = afik.m("com/google/apps/tiktok/contrib/work/TikTokListenableWorker");
    }
    
    public TikTokListenableWorker(final Context context, final aeru b, final atjj g, final WorkerParameters h) {
        super(context, h);
        this.i = null;
        this.j = false;
        this.g = g;
        this.b = b;
        this.h = h;
    }
    
    public final ListenableFuture a() {
        final String c = aelh.c(this.h);
        final aers c2 = this.b.c("WorkManager:TikTokListenableWorker getForegroundInfoAsync()");
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append(c);
            sb.append(" getForegroundInfoAsync()");
            final aere o = aesw.o(sb.toString());
            try {
                agot.E(this.i == null, (Object)"A TikTokListenableWorker's worker was null during getForegroundInfoAsync(), which should always be called before `startWork()`. Please report any instance of this Exception at go/tiktok-bug.");
                final aekw i = (aekw)this.g.a();
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
                    agnj.M(t, t2);
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
                agnj.M(t3, t4);
            }
        }
    }
    
    public final ListenableFuture b() {
        final String c = aelh.c(this.h);
        final aers c2 = this.b.c("WorkManager:TikTokListenableWorker startWork");
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append(c);
            sb.append(" startWork()");
            final aere o = aesw.o(sb.toString());
            try {
                final String c3 = aelh.c(this.h);
                final aere o2 = aesw.o(String.valueOf(c3).concat(" startWork()"));
                try {
                    agot.E(this.j ^ true, (Object)"A TikTokListenableWorker started twice. Please report any instance of this Exception at go/tiktok-bug.");
                    this.j = true;
                    if (this.i == null) {
                        this.i = (aekw)this.g.a();
                    }
                    final ListenableFuture a = this.i.a(this.h);
                    a.addListener(aesm.h((Runnable)new adpd(a, new agmj((Object)c3), 12)), (Executor)afsl.a);
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
                        agnj.M(t, t2);
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
                    agnj.M(t3, t4);
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
                agnj.M(t5, t6);
            }
        }
    }
}
