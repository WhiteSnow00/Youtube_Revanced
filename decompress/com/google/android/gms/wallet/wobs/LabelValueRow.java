// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wallet.wobs;

import java.util.List;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LabelValueRow extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    @Deprecated
    String a;
    @Deprecated
    String b;
    ArrayList c;
    
    static {
        CREATOR = (Parcelable$Creator)new nnr(3);
    }
    
    LabelValueRow() {
        this.c = kgk.F();
    }
    
    public LabelValueRow(final String a, final String b, final ArrayList c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.ac(parcel, 2, this.a);
        kgk.ac(parcel, 3, this.b);
        kgk.ag(parcel, 4, (List)this.c);
        kgk.J(parcel, i);
    }
}
