// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.people.consentprimitive;

import android.os.Parcel;
import java.util.Arrays;
import java.util.Iterator;
import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ContactsConsentsDetailedStatus extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final Bundle b;
    
    static {
        CREATOR = (Parcelable$Creator)new njy(19);
    }
    
    public ContactsConsentsDetailedStatus(final int a, final Bundle b) {
        this.a = a;
        this.b = b;
    }
    
    public final afev a() {
        final afes afes = new afes();
        for (final String s : this.b.keySet()) {
            afes.g(new Account(s, "com.mgoogle"), this.b.getInt(s));
        }
        return afes.c();
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContactsConsentsDetailedStatus)) {
            return false;
        }
        final ContactsConsentsDetailedStatus contactsConsentsDetailedStatus = (ContactsConsentsDetailedStatus)o;
        return this.a == contactsConsentsDetailedStatus.a && adkp.ae(this.a(), contactsConsentsDetailedStatus.a());
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.a() });
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.V(parcel, 2, this.b);
        khl.N(parcel, m);
    }
}
