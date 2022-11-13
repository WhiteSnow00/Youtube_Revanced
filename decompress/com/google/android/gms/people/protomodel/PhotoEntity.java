// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.people.protomodel;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PhotoEntity extends AbstractSafeParcelable implements Photo
{
    public static final Parcelable$Creator CREATOR;
    public final PersonFieldMetadataEntity a;
    public final String b;
    
    static {
        CREATOR = (Parcelable$Creator)new nlj(11);
    }
    
    public PhotoEntity(final PersonFieldMetadataEntity a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final PersonFieldMetadata a() {
        return (PersonFieldMetadata)this.a;
    }
    
    public final String b() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof Photo)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final Photo photo = (Photo)o;
        return khl.be((Object)((Photo)this).a(), (Object)photo.a()) && khl.be((Object)((Photo)this).b(), (Object)photo.b());
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { ((Photo)this).a(), ((Photo)this).b() });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.af(parcel, 2, (Parcelable)this.a, n);
        khl.ag(parcel, 3, this.b);
        khl.N(parcel, m);
    }
}
