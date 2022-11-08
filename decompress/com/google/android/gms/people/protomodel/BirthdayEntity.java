// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.people.protomodel;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class BirthdayEntity extends AbstractSafeParcelable implements Birthday
{
    public static final Parcelable$Creator CREATOR;
    public final PersonFieldMetadataEntity a;
    public final Long b;
    
    static {
        CREATOR = (Parcelable$Creator)new njx(4);
    }
    
    public BirthdayEntity(final PersonFieldMetadataEntity a, final Long b) {
        this.a = a;
        this.b = b;
    }
    
    public final PersonFieldMetadata a() {
        return this.a;
    }
    
    public final Long b() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof Birthday)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final Birthday birthday = (Birthday)o;
        return kgk.ba((Object)this.a(), (Object)birthday.a()) && kgk.ba((Object)this.b(), (Object)birthday.b());
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a(), this.b() });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.ab(parcel, 2, (Parcelable)this.a, n);
        kgk.aa(parcel, 3, this.b);
        kgk.J(parcel, i);
    }
}
