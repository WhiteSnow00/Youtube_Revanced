// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model;

final class AutoValue_WatchLaterButtonData extends WatchLaterButtonData
{
    private final int b;
    private final String c;
    private final String d;
    private final agyc e;
    
    public AutoValue_WatchLaterButtonData(final int b, final String c, final String d, final agyc e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final int a() {
        return this.b;
    }
    
    public final agyc b() {
        return this.e;
    }
    
    public final String c() {
        return this.d;
    }
    
    public final String d() {
        return this.c;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof WatchLaterButtonData) {
            final WatchLaterButtonData watchLaterButtonData = (WatchLaterButtonData)o;
            if (this.b == watchLaterButtonData.a()) {
                final String c = this.c;
                if (c == null) {
                    if (watchLaterButtonData.d() != null) {
                        return false;
                    }
                }
                else if (!c.equals(watchLaterButtonData.d())) {
                    return false;
                }
                final String d = this.d;
                if (d == null) {
                    if (watchLaterButtonData.c() != null) {
                        return false;
                    }
                }
                else if (!d.equals(watchLaterButtonData.c())) {
                    return false;
                }
                if (this.e.equals((Object)watchLaterButtonData.b())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        final int b = this.b;
        final String c = this.c;
        int hashCode = 0;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final String d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return (((b ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode) * 1000003 ^ this.e.hashCode();
    }
    
    public final String toString() {
        final int b = this.b;
        final String c = this.c;
        final String d = this.d;
        final String value = String.valueOf(this.e);
        final StringBuilder sb = new StringBuilder("WatchLaterButtonData{state=");
        sb.append(b);
        sb.append(", label=");
        sb.append(c);
        sb.append(", accessibilityLabel=");
        sb.append(d);
        sb.append(", trackingParams=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
