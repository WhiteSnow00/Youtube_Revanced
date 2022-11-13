// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.mobstore;

import android.os.Parcelable;
import android.os.Parcel;
import android.net.Uri;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class RenameRequest extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final Uri a;
    public final Uri b;
    
    static {
        CREATOR = (Parcelable$Creator)new njy(16);
    }
    
    public RenameRequest(final Uri a, final Uri b) {
        this.a = a;
        this.b = b;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.af(parcel, 1, (Parcelable)this.a, n);
        khl.af(parcel, 2, (Parcelable)this.b, n);
        khl.N(parcel, m);
    }
}
