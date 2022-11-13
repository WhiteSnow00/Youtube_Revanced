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
        CREATOR = (Parcelable$Creator)new nlj(4);
    }
    
    public DeviceVersionEntity(final Integer a) {
        this.a = a;
    }
    
    public final Integer a() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        return o instanceof DeviceVersion && (this == o || khl.be((Object)((DeviceVersion)this).a(), (Object)((DeviceVersion)o).a()));
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { ((DeviceVersion)this).a() });
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.ab(parcel, 2, this.a);
        khl.N(parcel, m);
    }
}
