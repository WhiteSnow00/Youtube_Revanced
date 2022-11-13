// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.location.internal;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.app.PendingIntent;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public class LocationRequestUpdateData extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final LocationRequestInternal b;
    public final PendingIntent c;
    public final String d;
    private final nbp e;
    private final nby f;
    private final nbq g;
    
    static {
        CREATOR = (Parcelable$Creator)new nbu(6);
    }
    
    public LocationRequestUpdateData(final int a, final LocationRequestInternal b, final IBinder binder, final IBinder binder2, final PendingIntent c, final IBinder binder3, final String d) {
        this.a = a;
        this.b = b;
        final nby nby = null;
        nbq g;
        if (binder != null) {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (queryLocalInterface instanceof nbq) {
                g = (nbq)queryLocalInterface;
            }
            else {
                g = new nbq(binder);
            }
        }
        else {
            g = null;
        }
        this.g = g;
        this.c = c;
        Object e;
        if (binder2 != null) {
            final IInterface queryLocalInterface2 = binder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (queryLocalInterface2 instanceof nbp) {
                e = queryLocalInterface2;
            }
            else {
                e = new nbn(binder2);
            }
        }
        else {
            e = null;
        }
        this.e = (nbp)e;
        Object f = nby;
        if (binder3 != null) {
            final IInterface queryLocalInterface3 = binder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface3 instanceof nby) {
                f = queryLocalInterface3;
            }
            else {
                f = new nbw(binder3);
            }
        }
        this.f = (nby)f;
        this.d = d;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.af(parcel, 2, (Parcelable)this.b, n);
        final nbq g = this.g;
        final IBinder binder = null;
        IBinder a;
        if (g == null) {
            a = null;
        }
        else {
            a = ((enz)g).a;
        }
        khl.Y(parcel, 3, a);
        khl.af(parcel, 4, (Parcelable)this.c, n);
        final nbp e = this.e;
        IBinder binder2;
        if (e == null) {
            binder2 = null;
        }
        else {
            binder2 = e.asBinder();
        }
        khl.Y(parcel, 5, binder2);
        final nby f = this.f;
        IBinder binder3;
        if (f == null) {
            binder3 = binder;
        }
        else {
            binder3 = f.asBinder();
        }
        khl.Y(parcel, 6, binder3);
        khl.ag(parcel, 8, this.d);
        khl.N(parcel, m);
    }
}
