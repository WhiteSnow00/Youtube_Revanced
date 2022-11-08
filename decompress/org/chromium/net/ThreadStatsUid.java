// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.net;

import java.lang.reflect.InvocationTargetException;
import android.net.TrafficStats;
import java.lang.reflect.Method;

public class ThreadStatsUid
{
    private static final Method sClearThreadStatsUid;
    private static final Method sSetThreadStatsUid;
    
    static {
        try {
            sSetThreadStatsUid = TrafficStats.class.getMethod("setThreadStatsUid", Integer.TYPE);
            sClearThreadStatsUid = TrafficStats.class.getMethod("clearThreadStatsUid", (Class<?>[])new Class[0]);
            return;
        }
        catch (final SecurityException ex) {}
        catch (final NoSuchMethodException ex2) {}
        final SecurityException ex;
        throw new RuntimeException("Unable to get TrafficStats methods", ex);
    }
    
    public static void clear() {
        try {
            ThreadStatsUid.sClearThreadStatsUid.invoke(null, new Object[0]);
        }
        catch (final InvocationTargetException ex) {
            throw new RuntimeException("TrafficStats.clearThreadStatsUid failed", ex);
        }
        catch (final IllegalAccessException ex2) {
            throw new RuntimeException("TrafficStats.clearThreadStatsUid failed", ex2);
        }
    }
    
    public static void set(final int n) {
        try {
            ThreadStatsUid.sSetThreadStatsUid.invoke(null, n);
        }
        catch (final InvocationTargetException ex) {
            throw new RuntimeException("TrafficStats.setThreadStatsUid failed", ex);
        }
        catch (final IllegalAccessException ex2) {
            throw new RuntimeException("TrafficStats.setThreadStatsUid failed", ex2);
        }
    }
}
