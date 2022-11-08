// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.net.impl;

import android.os.Process;
import android.os.Handler;
import android.os.Looper;
import org.chromium.net.NetworkChangeNotifier;
import J.N;
import android.content.Context;
import android.os.ConditionVariable;
import android.os.HandlerThread;

public class CronetLibraryLoader
{
    private static final Object a;
    private static final String b = "cronet.108.0.5340.9";
    private static final String c = "CronetLibraryLoader";
    private static final HandlerThread d;
    private static volatile boolean e;
    private static volatile boolean f;
    private static final ConditionVariable g;
    
    static {
        a = new Object();
        d = new HandlerThread("CronetInit");
        CronetLibraryLoader.e = false;
        g = new ConditionVariable();
    }
    
    public static void a(final Context a, final aucl aucl) {
        synchronized (CronetLibraryLoader.a) {
            if (!CronetLibraryLoader.f) {
                auaf.a = a;
                final HandlerThread d = CronetLibraryLoader.d;
                if (!d.isAlive()) {
                    d.start();
                }
                c((Runnable)new aess(8));
            }
            if (!CronetLibraryLoader.e) {
                if (aucl.c() != null) {
                    aucl.c().loadLibrary(CronetLibraryLoader.b);
                }
                else {
                    System.loadLibrary(CronetLibraryLoader.b);
                }
                if (!"108.0.5340.9".equals(N.M6xubM8G())) {
                    throw new RuntimeException(String.format("Expected Cronet version number %s, actual version number %s.", "108.0.5340.9", N.M6xubM8G()));
                }
                auak.e(CronetLibraryLoader.c, "Cronet version: %s, arch: %s", (Object)"108.0.5340.9", (Object)System.getProperty("os.arch"));
                CronetLibraryLoader.e = true;
                CronetLibraryLoader.g.open();
            }
        }
    }
    
    public static void b() {
        if (CronetLibraryLoader.f) {
            return;
        }
        NetworkChangeNotifier.init();
        NetworkChangeNotifier.registerToReceiveNotificationsAlways();
        CronetLibraryLoader.g.block();
        N.MROCxiBo();
        CronetLibraryLoader.f = true;
    }
    
    public static void c(final Runnable runnable) {
        final HandlerThread d = CronetLibraryLoader.d;
        if (d.getLooper() == Looper.myLooper()) {
            runnable.run();
            return;
        }
        new Handler(d.getLooper()).post(runnable);
    }
    
    private static void ensureInitializedFromNative() {
        synchronized (CronetLibraryLoader.a) {
            CronetLibraryLoader.e = true;
            CronetLibraryLoader.g.open();
            monitorexit(CronetLibraryLoader.a);
            a(auaf.a, null);
        }
    }
    
    private static String getDefaultUserAgent() {
        return audx.a(auaf.a);
    }
    
    private static void setNetworkThreadPriorityOnNetworkThread(final int threadPriority) {
        Process.setThreadPriority(threadPriority);
    }
}
