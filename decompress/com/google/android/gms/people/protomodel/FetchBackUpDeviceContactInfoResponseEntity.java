// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class FetchBackUpDeviceContactInfoResponseEntity extends AbstractSafeParcelable implements FetchBackUpDeviceContactInfoResponse
{
    public static final Parcelable$Creator CREATOR;
    private final List a;
    private List b;
    
    static {
        CREATOR = (Parcelable$Creator)new nlj(6);
    }
    
    public FetchBackUpDeviceContactInfoResponseEntity(final List a) {
        this.a = a;
    }
    
    public final List a() {
        if (this.b == null) {
            final List a = this.a;
            if (a != null) {
                this.b = new ArrayList(a.size());
                final Iterator iterator = this.a.iterator();
                while (iterator.hasNext()) {
                    this.b.add(iterator.next());
                }
            }
        }
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        return o instanceof FetchBackUpDeviceContactInfoResponse && (this == o || khl.be((Object)((FetchBackUpDeviceContactInfoResponse)this).a(), (Object)((FetchBackUpDeviceContactInfoResponse)o).a()));
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { ((FetchBackUpDeviceContactInfoResponse)this).a() });
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.ak(parcel, 2, this.a());
        khl.N(parcel, m);
    }
}
