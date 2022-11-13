// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.location.internal;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Iterator;
import com.google.android.gms.common.internal.ClientIdentity;
import android.os.WorkSource;
import java.util.List;
import com.google.android.gms.location.LocationRequest;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public class LocationRequestInternal extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    LocationRequest a;
    
    static {
        CREATOR = (Parcelable$Creator)new nbu(5);
    }
    
    public LocationRequestInternal(final LocationRequest locationRequest, final List list, final boolean b, final boolean b2, final String s, final boolean b3, final boolean b4, final String s2, final long b5) {
        final nbs nbs = new nbs(locationRequest);
        if (list != null) {
            WorkSource f;
            if (list.isEmpty()) {
                f = null;
            }
            else {
                final WorkSource workSource = new WorkSource();
                final Iterator iterator = list.iterator();
                while (true) {
                    f = workSource;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final ClientIdentity clientIdentity = (ClientIdentity)iterator.next();
                    mvq.b(workSource, clientIdentity.a, clientIdentity.b);
                }
            }
            nbs.f = f;
        }
        final boolean b6 = false;
        if (b) {
            khl.aS(true, "granularity %d must be a Granularity.GRANULARITY_* constant", new Object[] { 1 });
            nbs.c = 1;
        }
        if (b2) {
            khl.aS(true, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", new Object[] { 2 });
            nbs.d = 2;
        }
        if (s != null) {
            nbs.b(s);
        }
        else if (s2 != null) {
            nbs.b(s2);
        }
        if (b3) {
            nbs.e = true;
        }
        if (b4) {
            nbs.a = true;
        }
        if (b5 != Long.MAX_VALUE) {
            boolean b7 = false;
            Label_0229: {
                if (b5 != -1L) {
                    b7 = b6;
                    if (b5 < 0L) {
                        break Label_0229;
                    }
                }
                b7 = true;
            }
            khl.aR(b7, (Object)"maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            nbs.b = b5;
        }
        this.a = nbs.a();
    }
    
    public final boolean equals(final Object o) {
        return o instanceof LocationRequestInternal && khl.be((Object)this.a, (Object)((LocationRequestInternal)o).a);
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final String toString() {
        return this.a.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.af(parcel, 1, (Parcelable)this.a, n);
        khl.N(parcel, m);
    }
}
