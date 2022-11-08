// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model;

public final class AutoValue_SubscriptionNotificationButtonData extends SubscriptionNotificationButtonData
{
    private final int b;
    private final int c;
    private final String d;
    private final agyc e;
    
    public AutoValue_SubscriptionNotificationButtonData(final int b, final int c, final String d, final agyc e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final int a() {
        return this.c;
    }
    
    public final int b() {
        return this.b;
    }
    
    public final agyc c() {
        return this.e;
    }
    
    public final String d() {
        return this.d;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof SubscriptionNotificationButtonData) {
            final SubscriptionNotificationButtonData subscriptionNotificationButtonData = (SubscriptionNotificationButtonData)o;
            if (this.b == subscriptionNotificationButtonData.b() && this.c == subscriptionNotificationButtonData.a()) {
                final String d = this.d;
                if (d == null) {
                    if (subscriptionNotificationButtonData.d() != null) {
                        return false;
                    }
                }
                else if (!d.equals(subscriptionNotificationButtonData.d())) {
                    return false;
                }
                if (this.e.equals((Object)subscriptionNotificationButtonData.c())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        final int b = this.b;
        final int c = this.c;
        final String d = this.d;
        int hashCode;
        if (d == null) {
            hashCode = 0;
        }
        else {
            hashCode = d.hashCode();
        }
        return (((b ^ 0xF4243) * 1000003 ^ c) * 1000003 ^ hashCode) * 1000003 ^ this.e.hashCode();
    }
    
    public final String toString() {
        final int b = this.b;
        final int c = this.c;
        final String d = this.d;
        final String value = String.valueOf(this.e);
        final StringBuilder sb = new StringBuilder("SubscriptionNotificationButtonData{stateId=");
        sb.append(b);
        sb.append(", iconType=");
        sb.append(c);
        sb.append(", accessibilityText=");
        sb.append(d);
        sb.append(", trackingParams=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
