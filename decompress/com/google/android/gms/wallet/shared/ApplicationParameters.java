// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wallet.shared;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import android.os.Bundle;
import android.accounts.Account;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ApplicationParameters extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public Account b;
    public Bundle c;
    boolean d;
    public int e;
    public WalletCustomTheme f;
    int g;
    double h;
    double i;
    int j;
    int k;
    
    static {
        CREATOR = (Parcelable$Creator)new nnr(1);
    }
    
    public ApplicationParameters() {
        this.d = false;
        this.a = 1;
        this.e = 1;
        this.g = 0;
        this.j = 0;
        this.k = -1;
    }
    
    public ApplicationParameters(final int a, final Account b, final Bundle c, final boolean d, final int e, final WalletCustomTheme f, final int g, final double h, final double i, final int j, final int k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.O(parcel, 2, this.a);
        kgk.ab(parcel, 3, (Parcelable)this.b, n);
        kgk.R(parcel, 4, this.c);
        kgk.K(parcel, 5, this.d);
        kgk.O(parcel, 6, this.e);
        kgk.ab(parcel, 7, (Parcelable)this.f, n);
        kgk.O(parcel, 8, this.g);
        kgk.L(parcel, 9, this.h);
        kgk.L(parcel, 10, this.i);
        kgk.O(parcel, 11, this.j);
        kgk.O(parcel, 12, this.k);
        kgk.J(parcel, i);
    }
}
