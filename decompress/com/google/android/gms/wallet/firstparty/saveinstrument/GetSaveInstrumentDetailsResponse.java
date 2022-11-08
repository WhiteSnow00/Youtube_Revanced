// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcelable;
import android.os.Parcel;
import android.widget.RemoteViews;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetSaveInstrumentDetailsResponse extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    String[] a;
    int[] b;
    RemoteViews c;
    byte[] d;
    
    static {
        CREATOR = (Parcelable$Creator)new nmx(20);
    }
    
    private GetSaveInstrumentDetailsResponse() {
    }
    
    public GetSaveInstrumentDetailsResponse(final String[] a, final int[] b, final RemoteViews c, final byte[] d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.ad(parcel, 1, this.a);
        kgk.V(parcel, 2, this.b);
        kgk.ab(parcel, 3, (Parcelable)this.c, n);
        kgk.S(parcel, 4, this.d);
        kgk.J(parcel, i);
    }
}
