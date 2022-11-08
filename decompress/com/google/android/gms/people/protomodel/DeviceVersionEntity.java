// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DeviceVersionEntity extends AbstractSafeParcelable implements DeviceVersion
{
    public static final Parcelable$Creator CREATOR;
    public final Integer a;
    
    static {
        CREATOR = (Parcelable$Creator)new njx(5);
    }
    
    public DeviceVersionEntity(final Integer a) {
        this.a = a;
    }
    
    public final Integer a() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        return o instanceof DeviceVersion && (this == o || kgk.ba((Object)this.a(), (Object)((DeviceVersion)o).a()));
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a() });
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.X(parcel, 2, this.a);
        kgk.J(parcel, i);
    }
}
