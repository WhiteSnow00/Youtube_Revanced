// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model;

public final class a
{
    public String a;
    public String b;
    private int c;
    private boolean d;
    private int e;
    private ahbt f;
    private byte g;
    
    public final SubscriptionNotificationMenuItem a() {
        if (this.g == 7 && this.f != null) {
            return (SubscriptionNotificationMenuItem)new AutoValue_SubscriptionNotificationMenuItem(this.c, this.d, this.e, this.a, this.b, this.f);
        }
        final StringBuilder sb = new StringBuilder();
        if ((this.g & 0x1) == 0x0) {
            sb.append(" stateId");
        }
        if ((this.g & 0x2) == 0x0) {
            sb.append(" isDisabled");
        }
        if ((this.g & 0x4) == 0x0) {
            sb.append(" iconType");
        }
        if (this.f == null) {
            sb.append(" trackingParams");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final int e) {
        this.e = e;
        this.g |= 0x4;
    }
    
    public final void c(final boolean d) {
        this.d = d;
        this.g |= 0x2;
    }
    
    public final void d(final int c) {
        this.c = c;
        this.g |= 0x1;
    }
    
    public final void e(final ahbt f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new NullPointerException("Null trackingParams");
    }
}
