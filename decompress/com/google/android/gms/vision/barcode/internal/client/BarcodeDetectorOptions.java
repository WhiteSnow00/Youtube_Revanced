// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.vision.barcode.internal.client;

import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class BarcodeDetectorOptions extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public boolean b;
    
    static {
        CREATOR = (Parcelable$Creator)new nmx(1);
    }
    
    public BarcodeDetectorOptions() {
    }
    
    public BarcodeDetectorOptions(final int a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BarcodeDetectorOptions)) {
            return false;
        }
        final BarcodeDetectorOptions barcodeDetectorOptions = (BarcodeDetectorOptions)o;
        return this.a == barcodeDetectorOptions.a && kgk.ba((Object)this.b, (Object)barcodeDetectorOptions.b);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.O(parcel, 2, this.a);
        kgk.K(parcel, 3, this.b);
        kgk.J(parcel, i);
    }
}
