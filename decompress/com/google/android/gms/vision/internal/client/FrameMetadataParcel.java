// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.vision.internal.client;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class FrameMetadataParcel extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;
    
    static {
        CREATOR = (Parcelable$Creator)new nmx(0);
    }
    
    public FrameMetadataParcel() {
    }
    
    public FrameMetadataParcel(final int a, final int b, final int c, final long d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.O(parcel, 2, this.a);
        kgk.O(parcel, 3, this.b);
        kgk.O(parcel, 4, this.c);
        kgk.P(parcel, 5, this.d);
        kgk.O(parcel, 6, this.e);
        kgk.J(parcel, i);
    }
}
