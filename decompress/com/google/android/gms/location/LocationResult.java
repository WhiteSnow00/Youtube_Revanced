// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.location;

import android.os.Parcel;
import java.util.Arrays;
import java.util.Iterator;
import android.location.Location;
import android.os.Build$VERSION;
import java.util.Collections;
import java.util.List;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final List a;
    public final List b;
    
    static {
        a = Collections.emptyList();
        CREATOR = (Parcelable$Creator)new nbu(0);
    }
    
    public LocationResult(final List b) {
        this.b = b;
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof LocationResult)) {
            return false;
        }
        final LocationResult locationResult = (LocationResult)o;
        if (Build$VERSION.SDK_INT >= 31) {
            return this.b.equals(locationResult.b);
        }
        if (this.b.size() != locationResult.b.size()) {
            return false;
        }
        final Iterator iterator = this.b.iterator();
        final Iterator iterator2 = locationResult.b.iterator();
        while (iterator.hasNext()) {
            final Location location = (Location)iterator.next();
            final Location location2 = (Location)iterator2.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0) {
                return false;
            }
            if (Double.compare(location.getLongitude(), location2.getLongitude()) != 0) {
                return false;
            }
            if (location.getTime() != location2.getTime()) {
                return false;
            }
            if (location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos()) {
                return false;
            }
            if (!khl.be((Object)location.getProvider(), (Object)location2.getProvider())) {
                return false;
            }
        }
        return true;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b });
    }
    
    public final String toString() {
        return "LocationResult".concat(String.valueOf(String.valueOf(this.b)));
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.ak(parcel, 1, this.b);
        khl.N(parcel, m);
    }
}
