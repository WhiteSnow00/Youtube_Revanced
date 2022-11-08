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
        CREATOR = (Parcelable$Creator)new njx(10);
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
        return kgk.ba((Object)this.b(), (Object)personFieldMetadata.b()) && kgk.ba((Object)this.a(), (Object)personFieldMetadata.a());
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b(), this.a() });
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.X(parcel, 3, this.a);
        kgk.Q(parcel, 4, this.b);
        kgk.J(parcel, i);
    }
}
