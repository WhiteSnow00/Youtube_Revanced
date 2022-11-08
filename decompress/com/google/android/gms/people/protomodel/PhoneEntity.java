// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.people.protomodel;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PhoneEntity extends AbstractSafeParcelable implements Phone
{
    public static final Parcelable$Creator CREATOR;
    public final PersonFieldMetadataEntity a;
    public final String b;
    public final String c;
    
    static {
        CREATOR = (Parcelable$Creator)new njx(11);
    }
    
    public PhoneEntity(final PersonFieldMetadataEntity a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final PersonFieldMetadata a() {
        return this.a;
    }
    
    public final String b() {
        return this.c;
    }
    
    public final String c() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof Phone)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final Phone phone = (Phone)o;
        return kgk.ba((Object)this.a(), (Object)phone.a()) && kgk.ba((Object)this.c(), (Object)phone.c()) && kgk.ba((Object)this.b(), (Object)phone.b());
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a(), this.c(), this.b() });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.ab(parcel, 2, (Parcelable)this.a, n);
        kgk.ac(parcel, 3, this.b);
        kgk.ac(parcel, 4, this.c);
        kgk.J(parcel, i);
    }
}
