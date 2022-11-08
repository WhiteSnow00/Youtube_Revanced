// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.people.consentprimitive;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ContactsConsentsStatus extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final ContactsConsentsCoarseStatus a;
    public final ContactsConsentsDetailedStatus b;
    public final ContactsConsentsConfig c;
    
    static {
        CREATOR = (Parcelable$Creator)new njx(1);
    }
    
    public ContactsConsentsStatus(final ContactsConsentsCoarseStatus a, final ContactsConsentsDetailedStatus b, final ContactsConsentsConfig c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContactsConsentsStatus)) {
            return false;
        }
        final ContactsConsentsStatus contactsConsentsStatus = (ContactsConsentsStatus)o;
        return aeda.v((Object)this.a, (Object)contactsConsentsStatus.a) && aeda.v((Object)this.b, (Object)contactsConsentsStatus.b) && aeda.v((Object)this.c, (Object)contactsConsentsStatus.c);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.ab(parcel, 1, (Parcelable)this.a, n);
        kgk.ab(parcel, 2, (Parcelable)this.b, n);
        kgk.ab(parcel, 3, (Parcelable)this.c, n);
        kgk.J(parcel, i);
    }
}
