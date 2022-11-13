// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.data;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    ParcelFileDescriptor b;
    final int c;
    
    static {
        CREATOR = (Parcelable$Creator)new mpg(9);
    }
    
    public BitmapTeleporter(final int a, final ParcelFileDescriptor b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        if (this.b != null) {
            final int m = khl.M(parcel);
            khl.S(parcel, 1, this.a);
            khl.af(parcel, 2, (Parcelable)this.b, n | 0x1);
            khl.S(parcel, 3, this.c);
            khl.N(parcel, m);
            this.b = null;
            return;
        }
        khl.aP((Object)null);
        throw null;
    }
}
