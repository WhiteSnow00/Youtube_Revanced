// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

public final class a
{
    public String a;
    private int b;
    private int c;
    private byte d;
    
    public final AdEventData a() {
        if (this.d != 3) {
            final StringBuilder sb = new StringBuilder();
            if ((this.d & 0x1) == 0x0) {
                sb.append(" adEventType");
            }
            if ((this.d & 0x2) == 0x0) {
                sb.append(" adBreakType");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return (AdEventData)new AutoValue_AdEventData(this.b, this.c, this.a);
    }
    
    public final void b(final int c) {
        this.c = c;
        this.d |= 0x2;
    }
    
    public final void c(final int b) {
        this.b = b;
        this.d |= 0x1;
    }
    
    public final lly d() {
        if (this.d == 3) {
            final String a = this.a;
            if (a != null) {
                return new lly(a, this.b, this.c);
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" pivotIdentifier");
        }
        if ((this.d & 0x1) == 0x0) {
            sb.append(" tabIndex");
        }
        if ((this.d & 0x2) == 0x0) {
            sb.append(" paneIndex");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void e(final int c) {
        this.c = c;
        this.d |= 0x2;
    }
    
    public final void f(final String a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null pivotIdentifier");
    }
    
    public final void g(final int b) {
        this.b = b;
        this.d |= 0x1;
    }
}
