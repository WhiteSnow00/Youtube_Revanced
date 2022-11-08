// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.model;

public final class AutoValue_ShareButtonData extends ShareButtonData
{
    public final agyc a;
    private final int c;
    
    public AutoValue_ShareButtonData(final int c, final agyc a) {
        this.c = c;
        this.a = a;
    }
    
    public final int a() {
        return this.c;
    }
    
    public final agyc b() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ShareButtonData) {
            final ShareButtonData shareButtonData = (ShareButtonData)o;
            if (this.c == shareButtonData.a() && this.a.equals((Object)shareButtonData.b())) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return (this.c ^ 0xF4243) * 1000003 ^ this.a.hashCode();
    }
    
    public final String toString() {
        final int c = this.c;
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("ShareButtonData{state=");
        sb.append(c);
        sb.append(", trackingParams=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
