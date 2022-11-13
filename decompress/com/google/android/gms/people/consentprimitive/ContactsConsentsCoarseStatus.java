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
        CREATOR = (Parcelable$Creator)new njy(17);
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
        return this.a == contactsConsentsCoarseStatus.a && this.b == contactsConsentsCoarseStatus.b && adkp.ae(this.f, contactsConsentsCoarseStatus.f) && adkp.ae(this.e, contactsConsentsCoarseStatus.e) && adkp.ae(this.c, contactsConsentsCoarseStatus.c) && this.d == contactsConsentsCoarseStatus.d && adkp.ae(this.g, contactsConsentsCoarseStatus.g);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.e, this.f, this.c, this.d, this.g });
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.O(parcel, 1, this.a);
        khl.O(parcel, 2, this.b);
        final List e = this.e;
        afeq afeq;
        if (e == null) {
            afeq = afeq.q();
        }
        else {
            afeq = afeq.o((Collection)e);
        }
        khl.ak(parcel, 3, (List)afeq);
        final List f = this.f;
        afeq afeq2;
        if (f == null) {
            afeq2 = afeq.q();
        }
        else {
            afeq2 = afeq.o((Collection)f);
        }
        khl.ak(parcel, 4, (List)afeq2);
        khl.ag(parcel, 5, this.c);
        khl.O(parcel, 6, this.d);
        final List g = this.g;
        afeq afeq3;
        if (g == null) {
            afeq3 = afeq.q();
        }
        else {
            afeq3 = afeq.o((Collection)g);
        }
        khl.ak(parcel, 7, (List)afeq3);
        khl.N(parcel, m);
    }
}
