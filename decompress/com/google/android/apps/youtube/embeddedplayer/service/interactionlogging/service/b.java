// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service;

import java.util.Arrays;

public final class b
{
    public final a a;
    public final byte[] b;
    public final xbg c;
    
    public b(final a a, final xbg c) {
        this.a = a;
        this.c = c;
        this.b = null;
    }
    
    public b(final a a, final byte[] b) {
        this.a = a;
        this.b = b;
        this.c = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b2 = (b)o;
        if (this.a == b2.a && Arrays.equals(this.b, b2.b)) {
            final xbg c = this.c;
            final xbg c2 = b2.c;
            if (c == c2) {
                return b;
            }
            if (c != null && c2 != null) {
                if (c.equals((Object)c2)) {
                    return true;
                }
            }
        }
        b = false;
        return b;
    }
    
    @Override
    public final int hashCode() {
        final xbg c = this.c;
        int a;
        if (c == null) {
            a = 0;
        }
        else {
            a = c.a;
        }
        return Arrays.deepHashCode(new Object[] { this.a, this.b, a });
    }
}
