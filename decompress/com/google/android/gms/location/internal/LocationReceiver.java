// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.location.internal;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.IInterface;
import android.os.Build$VERSION;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LocationReceiver extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final IBinder b;
    public final IBinder c;
    public final PendingIntent d;
    public final String e;
    public final String f;
    
    static {
        CREATOR = (Parcelable$Creator)new nbu(4);
    }
    
    public LocationReceiver(final int a, final IBinder b, final IBinder c, final PendingIntent d, String e, final String f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        if (Build$VERSION.SDK_INT >= 30) {
            e = null;
        }
        this.e = e;
        this.f = f;
    }
    
    public static LocationReceiver a(final IInterface interface1, final nbp nbp, final String s) {
        Object o = interface1;
        if (interface1 == null) {
            o = null;
        }
        return new LocationReceiver(2, (IBinder)o, (IBinder)nbp, null, null, s);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.Y(parcel, 2, this.b);
        khl.Y(parcel, 3, this.c);
        khl.af(parcel, 4, (Parcelable)this.d, n);
        khl.ag(parcel, 5, this.e);
        khl.ag(parcel, 6, this.f);
        khl.N(parcel, m);
    }
}
