// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.people.consentprimitive;

import java.util.Collection;
import android.os.Parcel;
import java.util.Arrays;
import java.util.List;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ContactsConsentsCoarseStatus extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    private final List e;
    private final List f;
    private final List g;
    
    static {
        CREATOR = (Parcelable$Creator)new nit(18);
    }
    
    public ContactsConsentsCoarseStatus(final boolean a, final boolean b, final List e, final List f, final String c, final boolean d, final List g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        this.f = f;
        this.d = d;
        this.g = g;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContactsConsentsCoarseStatus)) {
            return false;
        }
        final ContactsConsentsCoarseStatus contactsConsentsCoarseStatus = (ContactsConsentsCoarseStatus)o;
        return this.a == contactsConsentsCoarseStatus.a && this.b == contactsConsentsCoarseStatus.b && aeda.v((Object)this.f, (Object)contactsConsentsCoarseStatus.f) && aeda.v((Object)this.e, (Object)contactsConsentsCoarseStatus.e) && aeda.v((Object)this.c, (Object)contactsConsentsCoarseStatus.c) && this.d == contactsConsentsCoarseStatus.d && aeda.v((Object)this.g, (Object)contactsConsentsCoarseStatus.g);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.e, this.f, this.c, this.d, this.g });
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.K(parcel, 1, this.a);
        kgk.K(parcel, 2, this.b);
        final List e = this.e;
        afcr afcr;
        if (e == null) {
            afcr = afcr.q();
        }
        else {
            afcr = afcr.o((Collection)e);
        }
        kgk.ag(parcel, 3, (List)afcr);
        final List f = this.f;
        afcr afcr2;
        if (f == null) {
            afcr2 = afcr.q();
        }
        else {
            afcr2 = afcr.o((Collection)f);
        }
        kgk.ag(parcel, 4, (List)afcr2);
        kgk.ac(parcel, 5, this.c);
        kgk.K(parcel, 6, this.d);
        final List g = this.g;
        afcr afcr3;
        if (g == null) {
            afcr3 = afcr.q();
        }
        else {
            afcr3 = afcr.o((Collection)g);
        }
        kgk.ag(parcel, 7, (List)afcr3);
        kgk.J(parcel, i);
    }
}
