// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.people.consentprimitive;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import java.util.List;
import android.accounts.Account;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ContactsConsentsConfig extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Account d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final List h;
    public final boolean i;
    
    static {
        CREATOR = (Parcelable$Creator)new njy(18);
    }
    
    public ContactsConsentsConfig(final boolean a, final boolean b, final boolean c, final Account d, final boolean e, final boolean f, final String g, final List h, final boolean i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContactsConsentsConfig)) {
            return false;
        }
        final ContactsConsentsConfig contactsConsentsConfig = (ContactsConsentsConfig)o;
        return this.a == contactsConsentsConfig.a && this.b == contactsConsentsConfig.b && this.c == contactsConsentsConfig.c && this.e == contactsConsentsConfig.e && this.f == contactsConsentsConfig.f && this.i == contactsConsentsConfig.i && adkp.ae(this.d, contactsConsentsConfig.d) && adkp.ae(this.g, contactsConsentsConfig.g) && adkp.ae(this.h, contactsConsentsConfig.h);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d, this.e, this.i, this.f, this.g, this.h });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.O(parcel, 1, this.a);
        khl.O(parcel, 2, this.b);
        khl.O(parcel, 3, this.c);
        khl.af(parcel, 4, (Parcelable)this.d, n);
        khl.O(parcel, 5, this.e);
        khl.O(parcel, 6, this.f);
        khl.ag(parcel, 7, this.g);
        khl.ak(parcel, 8, this.h);
        khl.O(parcel, 9, this.i);
        khl.N(parcel, m);
    }
}
