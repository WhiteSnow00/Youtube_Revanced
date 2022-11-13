// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class WalletBalanceInfo extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public long a;
    public String b;
    public int c;
    public Long d;
    public String e;
    public String f;
    public Long g;
    public Long h;
    public Long i;
    public String j;
    
    static {
        CREATOR = (Parcelable$Creator)new njy(5);
    }
    
    private WalletBalanceInfo() {
    }
    
    public WalletBalanceInfo(final long a, final String b, final int c, final Long d, final String e, final String f, final Long g, final Long h, final Long i, final String j) {
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
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof WalletBalanceInfo) {
            final WalletBalanceInfo walletBalanceInfo = (WalletBalanceInfo)o;
            if (khl.be((Object)this.a, (Object)walletBalanceInfo.a) && khl.be((Object)this.b, (Object)walletBalanceInfo.b) && khl.be((Object)this.c, (Object)walletBalanceInfo.c) && khl.be((Object)this.d, (Object)walletBalanceInfo.d) && khl.be((Object)this.e, (Object)walletBalanceInfo.e) && khl.be((Object)this.f, (Object)walletBalanceInfo.f) && khl.be((Object)this.g, (Object)walletBalanceInfo.g) && khl.be((Object)this.h, (Object)walletBalanceInfo.h) && khl.be((Object)this.i, (Object)walletBalanceInfo.i) && khl.be((Object)this.j, (Object)walletBalanceInfo.j)) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j });
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.T(parcel, 1, this.a);
        khl.ag(parcel, 2, this.b);
        khl.S(parcel, 3, this.c);
        khl.ae(parcel, 4, this.d);
        khl.ag(parcel, 5, this.e);
        khl.ag(parcel, 6, this.f);
        khl.ae(parcel, 7, this.g);
        khl.ae(parcel, 8, this.h);
        khl.ae(parcel, 9, this.i);
        khl.ag(parcel, 10, this.j);
        khl.N(parcel, m);
    }
}
