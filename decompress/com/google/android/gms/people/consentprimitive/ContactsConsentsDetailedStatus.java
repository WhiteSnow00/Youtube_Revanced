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
        CREATOR = (Parcelable$Creator)new nit(20);
    }
    
    public ContactsConsentsDetailedStatus(final int a, final Bundle b) {
        this.a = a;
        this.b = b;
    }
    
    public final afcw a() {
        final afct afct = new afct();
        for (final String s : this.b.keySet()) {
            afct.g((Object)new Account(s, "com.mgoogle"), (Object)this.b.getInt(s));
        }
        return afct.c();
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContactsConsentsDetailedStatus)) {
            return false;
        }
        final ContactsConsentsDetailedStatus contactsConsentsDetailedStatus = (ContactsConsentsDetailedStatus)o;
        return this.a == contactsConsentsDetailedStatus.a && aeda.v((Object)this.a(), (Object)contactsConsentsDetailedStatus.a());
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.a() });
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.O(parcel, 1, this.a);
        kgk.R(parcel, 2, this.b);
        kgk.J(parcel, i);
    }
}
