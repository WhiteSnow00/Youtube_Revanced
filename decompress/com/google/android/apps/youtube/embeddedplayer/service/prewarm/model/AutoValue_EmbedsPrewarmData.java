// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.prewarm.model;

public final class AutoValue_EmbedsPrewarmData extends EmbedsPrewarmData
{
    private final int a;
    private final String b;
    
    public AutoValue_EmbedsPrewarmData(final int a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final int a() {
        return this.a;
    }
    
    @Override
    public final String b() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof EmbedsPrewarmData) {
            final EmbedsPrewarmData embedsPrewarmData = (EmbedsPrewarmData)o;
            if (this.a == embedsPrewarmData.a() && this.b.equals(embedsPrewarmData.b())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder("EmbedsPrewarmData{playbackType=");
        sb.append(a);
        sb.append(", videoId=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
