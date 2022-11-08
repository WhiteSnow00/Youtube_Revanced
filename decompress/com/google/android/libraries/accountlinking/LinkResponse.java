// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.accountlinking;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class LinkResponse implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final boolean a;
    public final String b;
    
    static {
        CREATOR = (Parcelable$Creator)new nnr(10);
    }
    
    public LinkResponse(final boolean a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.K(parcel, 1, this.a);
        kgk.ac(parcel, 2, this.b);
        kgk.J(parcel, i);
    }
}
