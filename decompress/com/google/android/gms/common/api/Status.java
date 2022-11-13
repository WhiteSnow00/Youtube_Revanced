// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import com.google.android.gms.common.ConnectionResult;
import android.app.PendingIntent;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class Status extends AbstractSafeParcelable implements ReflectedParcelable, mrg
{
    public static final Parcelable$Creator CREATOR;
    public static final Status a;
    public static final Status b;
    public static final Status c;
    public static final Status d;
    public static final Status e;
    final int f;
    public final int g;
    public final String h;
    public final PendingIntent i;
    public final ConnectionResult j;
    
    static {
        a = new Status(0);
        b = new Status(14);
        c = new Status(8);
        d = new Status(15);
        e = new Status(16);
        CREATOR = (Parcelable$Creator)new mpg(8);
    }
    
    public Status(final int n) {
        this(n, null);
    }
    
    public Status(final int f, final int g, final String h, final PendingIntent i, final ConnectionResult j) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public Status(final int n, final String s) {
        this(n, s, null, null);
    }
    
    public Status(final int n, final String s, final PendingIntent pendingIntent) {
        this(n, s, pendingIntent, null);
    }
    
    public Status(final int n, final String s, final PendingIntent pendingIntent, final byte[] array) {
        this(1, n, s, pendingIntent, null);
    }
    
    @Deprecated
    public Status(final ConnectionResult connectionResult, final String s, final int n) {
        this(1, n, s, connectionResult.d, connectionResult);
    }
    
    public final Status a() {
        return this;
    }
    
    public final String b() {
        final String h = this.h;
        if (h != null) {
            return h;
        }
        final int g = this.g;
        String string = null;
        switch (g) {
            default: {
                final StringBuilder sb = new StringBuilder("unknown status code: ");
                sb.append(g);
                string = sb.toString();
                break;
            }
            case 22: {
                string = "RECONNECTION_TIMED_OUT";
                break;
            }
            case 21: {
                string = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                break;
            }
            case 20: {
                string = "CONNECTION_SUSPENDED_DURING_CALL";
                break;
            }
            case 19: {
                string = "REMOTE_EXCEPTION";
                break;
            }
            case 18: {
                string = "DEAD_CLIENT";
                break;
            }
            case 17: {
                string = "API_NOT_CONNECTED";
                break;
            }
            case 16: {
                string = "CANCELED";
                break;
            }
            case 15: {
                string = "TIMEOUT";
                break;
            }
            case 14: {
                string = "INTERRUPTED";
                break;
            }
            case 13: {
                string = "ERROR";
                break;
            }
            case 10: {
                string = "DEVELOPER_ERROR";
                break;
            }
            case 8: {
                string = "INTERNAL_ERROR";
                break;
            }
            case 7: {
                string = "NETWORK_ERROR";
                break;
            }
            case 6: {
                string = "RESOLUTION_REQUIRED";
                break;
            }
            case 5: {
                string = "INVALID_ACCOUNT";
                break;
            }
            case 4: {
                string = "SIGN_IN_REQUIRED";
                break;
            }
            case 3: {
                string = "SERVICE_DISABLED";
                break;
            }
            case 2: {
                string = "SERVICE_VERSION_UPDATE_REQUIRED";
                break;
            }
            case 0: {
                string = "SUCCESS";
                break;
            }
            case -1: {
                string = "SUCCESS_CACHE";
                break;
            }
        }
        return string;
    }
    
    public final boolean c() {
        return this.g <= 0;
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof Status)) {
            return false;
        }
        final Status status = (Status)o;
        return this.f == status.f && this.g == status.g && khl.be((Object)this.h, (Object)status.h) && khl.be((Object)this.i, (Object)status.i) && khl.be((Object)this.j, (Object)status.j);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.f, this.g, this.h, this.i, this.j });
    }
    
    public final String toString() {
        final ArrayList list = new ArrayList();
        khl.bg("statusCode", (Object)this.b(), (List)list);
        khl.bg("resolution", (Object)this.i, (List)list);
        return khl.bf((List)list, (Object)this);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.S(parcel, 1, this.g);
        khl.ag(parcel, 2, this.h);
        khl.af(parcel, 3, (Parcelable)this.i, n);
        khl.af(parcel, 4, (Parcelable)this.j, n);
        khl.S(parcel, 1000, this.f);
        khl.N(parcel, m);
    }
}
