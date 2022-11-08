// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class WalletCustomTheme extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    int a;
    int b;
    int c;
    Bundle d;
    String e;
    
    static {
        CREATOR = (Parcelable$Creator)new nmx(18);
    }
    
    public WalletCustomTheme() {
        this.b = 0;
        this.c = 0;
        this.a = 0;
        this.d = new Bundle();
        this.e = "";
    }
    
    public WalletCustomTheme(final int a, final Bundle d, final String e, final int b, final int c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
    }
    
    public final void a() {
        this.a = 2132085371;
        this.b = 2132085371;
        this.c = 2132085371;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.O(parcel, 2, this.a);
        kgk.R(parcel, 3, this.d);
        kgk.ac(parcel, 4, this.e);
        kgk.O(parcel, 5, this.b);
        kgk.O(parcel, 6, this.c);
        kgk.J(parcel, i);
    }
}
