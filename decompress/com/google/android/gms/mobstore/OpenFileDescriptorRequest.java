// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.mobstore;

import android.os.Parcelable;
import android.os.Parcel;
import android.net.Uri;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class OpenFileDescriptorRequest extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final Uri a;
    public final int b;
    
    static {
        CREATOR = (Parcelable$Creator)new nit(15);
    }
    
    public OpenFileDescriptorRequest(final Uri a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.ab(parcel, 1, (Parcelable)this.a, n);
        kgk.O(parcel, 2, this.b);
        kgk.J(parcel, i);
    }
}
