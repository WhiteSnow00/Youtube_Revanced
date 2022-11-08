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
        CREATOR = (Parcelable$Creator)new nit(19);
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
        return this.a == contactsConsentsConfig.a && this.b == contactsConsentsConfig.b && this.c == contactsConsentsConfig.c && this.e == contactsConsentsConfig.e && this.f == contactsConsentsConfig.f && this.i == contactsConsentsConfig.i && aeda.v((Object)this.d, (Object)contactsConsentsConfig.d) && aeda.v((Object)this.g, (Object)contactsConsentsConfig.g) && aeda.v((Object)this.h, (Object)contactsConsentsConfig.h);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d, this.e, this.i, this.f, this.g, this.h });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.K(parcel, 1, this.a);
        kgk.K(parcel, 2, this.b);
        kgk.K(parcel, 3, this.c);
        kgk.ab(parcel, 4, (Parcelable)this.d, n);
        kgk.K(parcel, 5, this.e);
        kgk.K(parcel, 6, this.f);
        kgk.ac(parcel, 7, this.g);
        kgk.ag(parcel, 8, this.h);
        kgk.K(parcel, 9, this.i);
        kgk.J(parcel, i);
    }
}
