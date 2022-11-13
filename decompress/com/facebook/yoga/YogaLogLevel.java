// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.yoga;

public enum YogaLogLevel
{
    a("ERROR", 0), 
    b("WARN", 1), 
    c("INFO", 2), 
    d("DEBUG", 3), 
    e("VERBOSE", 4), 
    f("FATAL", 5);
    
    private static final YogaLogLevel[] g;
    
    private YogaLogLevel(final String s, final int n) {
    }
    
    public static YogaLogLevel fromInt(final int n) {
        if (n == 0) {
            return YogaLogLevel.a;
        }
        if (n == 1) {
            return YogaLogLevel.b;
        }
        if (n == 2) {
            return YogaLogLevel.c;
        }
        if (n == 3) {
            return YogaLogLevel.d;
        }
        if (n == 4) {
            return YogaLogLevel.e;
        }
        if (n == 5) {
            return YogaLogLevel.f;
        }
        final StringBuilder sb = new StringBuilder("Unknown enum value: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
}
