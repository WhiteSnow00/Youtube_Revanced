// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

public final class AutoValue_VideoDetails extends VideoDetails
{
    private final VideoDetailsCollapsed b;
    private final VideoDetailsExpanded c;
    
    public AutoValue_VideoDetails(final VideoDetailsCollapsed b, final VideoDetailsExpanded c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final VideoDetailsCollapsed a() {
        return this.b;
    }
    
    @Override
    public final VideoDetailsExpanded b() {
        return this.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof VideoDetails) {
            final VideoDetails videoDetails = (VideoDetails)o;
            if (this.b.equals(videoDetails.a()) && this.c.equals(videoDetails.b())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.b.hashCode() ^ 0xF4243) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("VideoDetails{videoDetailsCollapsed=");
        sb.append(value);
        sb.append(", videoDetailsExpanded=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
