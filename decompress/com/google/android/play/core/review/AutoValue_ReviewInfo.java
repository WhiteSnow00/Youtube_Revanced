// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.review;

import android.app.PendingIntent;

final class AutoValue_ReviewInfo extends ReviewInfo
{
    private final PendingIntent a;
    private final boolean b;
    
    public AutoValue_ReviewInfo(final PendingIntent a, final boolean b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }
    
    public final PendingIntent a() {
        return this.a;
    }
    
    public final boolean b() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ReviewInfo) {
            final ReviewInfo reviewInfo = (ReviewInfo)o;
            if (this.a.equals((Object)reviewInfo.a()) && this.b == reviewInfo.b()) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int n;
        if (!this.b) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return (hashCode ^ 0xF4243) * 1000003 ^ n;
    }
    
    public final String toString() {
        final String string = this.a.toString();
        final boolean b = this.b;
        final StringBuilder sb = new StringBuilder("ReviewInfo{pendingIntent=");
        sb.append(string);
        sb.append(", isNoOp=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
