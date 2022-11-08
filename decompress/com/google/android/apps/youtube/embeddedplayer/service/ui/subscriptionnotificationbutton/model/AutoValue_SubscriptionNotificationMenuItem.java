// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model;

public final class AutoValue_SubscriptionNotificationMenuItem extends SubscriptionNotificationMenuItem
{
    public final boolean a;
    private final int b;
    private final int c;
    private final String d;
    private final String e;
    private final agyc f;
    
    public AutoValue_SubscriptionNotificationMenuItem(final int b, final boolean a, final int c, final String d, final String e, final agyc f) {
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final int a() {
        return this.c;
    }
    
    public final int b() {
        return this.b;
    }
    
    public final agyc c() {
        return this.f;
    }
    
    public final String d() {
        return this.e;
    }
    
    public final String e() {
        return this.d;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof SubscriptionNotificationMenuItem) {
            final SubscriptionNotificationMenuItem subscriptionNotificationMenuItem = (SubscriptionNotificationMenuItem)o;
            if (this.b == subscriptionNotificationMenuItem.b() && this.a == subscriptionNotificationMenuItem.f() && this.c == subscriptionNotificationMenuItem.a()) {
                final String d = this.d;
                if (d == null) {
                    if (subscriptionNotificationMenuItem.e() != null) {
                        return false;
                    }
                }
                else if (!d.equals(subscriptionNotificationMenuItem.e())) {
                    return false;
                }
                final String e = this.e;
                if (e == null) {
                    if (subscriptionNotificationMenuItem.d() != null) {
                        return false;
                    }
                }
                else if (!e.equals(subscriptionNotificationMenuItem.d())) {
                    return false;
                }
                if (this.f.equals((Object)subscriptionNotificationMenuItem.c())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final boolean f() {
        return this.a;
    }
    
    public final int hashCode() {
        final int b = this.b;
        int n;
        if (!this.a) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        final int c = this.c;
        final String d = this.d;
        int hashCode = 0;
        int hashCode2;
        if (d == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d.hashCode();
        }
        final String e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((((b ^ 0xF4243) * 1000003 ^ n) * 1000003 ^ c) * 1000003 ^ hashCode2) * 1000003 ^ hashCode) * 1000003 ^ this.f.hashCode();
    }
    
    public final String toString() {
        final int b = this.b;
        final boolean a = this.a;
        final int c = this.c;
        final String d = this.d;
        final String e = this.e;
        final String value = String.valueOf(this.f);
        final StringBuilder sb = new StringBuilder("SubscriptionNotificationMenuItem{stateId=");
        sb.append(b);
        sb.append(", isDisabled=");
        sb.append(a);
        sb.append(", iconType=");
        sb.append(c);
        sb.append(", label=");
        sb.append(d);
        sb.append(", accessibilityLabel=");
        sb.append(e);
        sb.append(", trackingParams=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
