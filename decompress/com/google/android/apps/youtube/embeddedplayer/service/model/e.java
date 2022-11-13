// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

public final class e
{
    public String a;
    private int b;
    private long c;
    private long d;
    private float e;
    private byte f;
    
    public final PlaybackEventData a() {
        if (this.f != 15) {
            final StringBuilder sb = new StringBuilder();
            if ((this.f & 0x1) == 0x0) {
                sb.append(" eventType");
            }
            if ((this.f & 0x2) == 0x0) {
                sb.append(" timestampMillis");
            }
            if ((this.f & 0x4) == 0x0) {
                sb.append(" durationMillis");
            }
            if ((this.f & 0x8) == 0x0) {
                sb.append(" aspectRatio");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return (PlaybackEventData)new AutoValue_PlaybackEventData(this.b, this.a, this.c, this.d, this.e);
    }
    
    public final void b(final float e) {
        this.e = e;
        this.f |= 0x8;
    }
    
    public final void c(final long d) {
        this.d = d;
        this.f |= 0x4;
    }
    
    public final void d(final int b) {
        this.b = b;
        this.f |= 0x1;
    }
    
    public final void e(final long c) {
        this.c = c;
        this.f |= 0x2;
    }
}
