// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.graphics.Bitmap;

public final class c
{
    public static final c a;
    public final CharSequence b;
    public final CharSequence c;
    public final Bitmap d;
    
    static {
        a = kzr.m((CharSequence)"", (CharSequence)"", (Bitmap)null);
    }
    
    public c() {
    }
    
    public c(final CharSequence b, final CharSequence c, final Bitmap d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof c) {
            final c c = (c)o;
            final CharSequence b = this.b;
            if (b == null) {
                if (c.b != null) {
                    return false;
                }
            }
            else if (!b.equals(c.b)) {
                return false;
            }
            final CharSequence c2 = this.c;
            if (c2 == null) {
                if (c.c != null) {
                    return false;
                }
            }
            else if (!c2.equals(c.c)) {
                return false;
            }
            final Bitmap d = this.d;
            final Bitmap d2 = c.d;
            if (d == null) {
                if (d2 != null) {
                    return false;
                }
            }
            else if (!d.equals(d2)) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final CharSequence b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final CharSequence c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final Bitmap d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return ((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final String value3 = String.valueOf(this.d);
        final StringBuilder sb = new StringBuilder("EmbedVideoMetadata{title=");
        sb.append(value);
        sb.append(", subtitle=");
        sb.append(value2);
        sb.append(", thumbnail=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
