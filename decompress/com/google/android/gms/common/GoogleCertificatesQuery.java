// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common;

import android.os.Parcel;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.os.IBinder;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GoogleCertificatesQuery extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final boolean b;
    public final boolean c;
    private final mus d;
    
    static {
        CREATOR = (Parcelable$Creator)new mpg(6);
    }
    
    public GoogleCertificatesQuery(final String a, final IBinder binder, final boolean b, final boolean c) {
        this.a = a;
        final mus mus = null;
        Object d;
        if (binder == null) {
            d = mus;
        }
        else {
            try {
                final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                Object o;
                if (queryLocalInterface instanceof mut) {
                    o = queryLocalInterface;
                }
                else {
                    o = new mur(binder);
                }
                final mws b2 = ((mut)o).b();
                byte[] array;
                if (b2 == null) {
                    array = null;
                }
                else {
                    array = (byte[])mwr.b(b2);
                }
                if (array != null) {
                    d = new mqb(array);
                }
                else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                    d = mus;
                }
            }
            catch (final RemoteException ex) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", (Throwable)ex);
                d = mus;
            }
        }
        this.d = (mus)d;
        this.b = b;
        this.c = c;
    }
    
    public GoogleCertificatesQuery(final String a, final mus d, final boolean b, final boolean c) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.ag(parcel, 1, this.a);
        Object d;
        if ((d = this.d) == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            d = null;
        }
        khl.Y(parcel, 2, (IBinder)d);
        khl.O(parcel, 3, this.b);
        khl.O(parcel, 4, this.c);
        khl.N(parcel, m);
    }
}
