// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.people.protomodel;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class EmailEntity extends AbstractSafeParcelable implements Email
{
    public static final Parcelable$Creator CREATOR;
    public final PersonFieldMetadataEntity a;
    public final String b;
    
    static {
        CREATOR = (Parcelable$Creator)new njx(6);
    }
    
    public EmailEntity(final PersonFieldMetadataEntity a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final PersonFieldMetadata a() {
        return this.a;
    }
    
    public final String b() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof Email)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final Email email = (Email)o;
        return kgk.ba((Object)this.a(), (Object)email.a()) && kgk.ba((Object)this.b(), (Object)email.b());
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a(), this.b() });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.ab(parcel, 2, (Parcelable)this.a, n);
        kgk.ac(parcel, 3, this.b);
        kgk.J(parcel, i);
    }
}
