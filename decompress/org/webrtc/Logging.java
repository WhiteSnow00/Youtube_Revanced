// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging
{
    private static final Logger a;
    private static volatile boolean b;
    
    static {
        final Logger logger = Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(Level.ALL);
        a = logger;
    }
    
    public static void a(final String s, final String s2) {
        f(2, s, s2);
    }
    
    public static void b(final String s, final String s2) {
        f(4, s, s2);
    }
    
    public static void c(final String s, final String s2, final Throwable t) {
        f(4, s, s2);
        f(4, s, t.toString());
        f(4, s, g(t));
    }
    
    public static void d(final String s, final String s2) {
        f(3, s, s2);
    }
    
    public static void e(final String s, final String s2, final Throwable t) {
        f(3, s, s2);
        f(3, s, t.toString());
        f(3, s, g(t));
    }
    
    public static void f(int n, final String s, final String s2) {
        if (s != null && s2 != null) {
            Level level;
            if (--n != 2) {
                if (n != 3) {
                    level = Level.INFO;
                }
                else {
                    level = Level.SEVERE;
                }
            }
            else {
                level = Level.WARNING;
            }
            final Logger a = Logging.a;
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append(": ");
            sb.append(s2);
            a.logp(level, "org.webrtc.Logging", "log", sb.toString());
            return;
        }
        throw new IllegalArgumentException("Logging tag or message may not be null.");
    }
    
    private static String g(final Throwable t) {
        final StringWriter stringWriter = new StringWriter();
        t.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
    
    private static native void nativeEnableLogThreads();
    
    private static native void nativeEnableLogTimeStamps();
    
    private static native void nativeEnableLogToDebugOutput(final int p0);
    
    private static native void nativeLog(final int p0, final String p1, final String p2);
}
