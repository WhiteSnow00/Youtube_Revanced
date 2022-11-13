// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common;

import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.content.Context;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GoogleCertificatesLookupQuery extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    private final Context f;
    
    static {
        CREATOR = (Parcelable$Creator)new mpg(4);
    }
    
    public GoogleCertificatesLookupQuery(final String a, final boolean b, final boolean c, final IBinder binder, final boolean d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        Object o;
        if (binder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof mws) {
                o = queryLocalInterface;
            }
            else {
                o = new mwq(binder);
            }
        }
        this.f = (Context)mwr.b((mws)o);
        this.d = d;
        this.e = e;
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.ag(parcel, 1, this.a);
        khl.O(parcel, 2, this.b);
        khl.O(parcel, 3, this.c);
        khl.Y(parcel, 4, (IBinder)mwr.a((Object)this.f));
        khl.O(parcel, 5, this.d);
        khl.O(parcel, 6, this.e);
        khl.N(parcel, m);
    }
}
