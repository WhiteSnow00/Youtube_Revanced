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
        CREATOR = (Parcelable$Creator)new nlj(10);
    }
    
    public PhoneEntity(final PersonFieldMetadataEntity a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final PersonFieldMetadata a() {
        return (PersonFieldMetadata)this.a;
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
        return khl.be((Object)((Phone)this).a(), (Object)phone.a()) && khl.be((Object)((Phone)this).c(), (Object)phone.c()) && khl.be((Object)((Phone)this).b(), (Object)phone.b());
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { ((Phone)this).a(), ((Phone)this).c(), ((Phone)this).b() });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.af(parcel, 2, (Parcelable)this.a, n);
        khl.ag(parcel, 3, this.b);
        khl.ag(parcel, 4, this.c);
        khl.N(parcel, m);
    }
}
