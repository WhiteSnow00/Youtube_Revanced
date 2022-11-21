// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

public final class AutoValue_VideoDetailsCollapsed extends VideoDetailsCollapsed
{
    private final CharSequence b;
    private final CharSequence c;
    private final ahbt d;
    
    public AutoValue_VideoDetailsCollapsed(final CharSequence b, final CharSequence c, final ahbt d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final ahbt a() {
        return this.d;
    }
    
    @Override
    public final CharSequence b() {
        return this.c;
    }
    
    @Override
    public final CharSequence c() {
        return this.b;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final String value3 = String.valueOf(this.d);
        final StringBuilder sb = new StringBuilder("VideoDetailsCollapsed{title=");
        sb.append(value);
        sb.append(", subtitle=");
        sb.append(value2);
        sb.append(", trackingParams=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
