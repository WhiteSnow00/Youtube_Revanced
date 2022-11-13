// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PersonFieldMetadataEntity extends AbstractSafeParcelable implements PersonFieldMetadata
{
    public static final Parcelable$Creator CREATOR;
    public final Integer a;
    public final Boolean b;
    
    static {
        CREATOR = (Parcelable$Creator)new nlj(9);
    }
    
    public PersonFieldMetadataEntity(final Integer a, final Boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final Boolean a() {
        return this.b;
    }
    
    public final Integer b() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof PersonFieldMetadata)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final PersonFieldMetadata personFieldMetadata = (PersonFieldMetadata)o;
        return khl.be((Object)((PersonFieldMetadata)this).b(), (Object)personFieldMetadata.b()) && khl.be((Object)((PersonFieldMetadata)this).a(), (Object)personFieldMetadata.a());
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { ((PersonFieldMetadata)this).b(), ((PersonFieldMetadata)this).a() });
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.ab(parcel, 3, this.a);
        khl.U(parcel, 4, this.b);
        khl.N(parcel, m);
    }
}
