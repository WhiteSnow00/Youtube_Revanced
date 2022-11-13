// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.mobiledataplan.carriersupport;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class CarrierSupportInfo extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public String a;
    public String b;
    public CarrierSupportChannel[] c;
    
    static {
        CREATOR = (Parcelable$Creator)new njy(7);
    }
    
    private CarrierSupportInfo() {
    }
    
    public CarrierSupportInfo(final String a, final String b, final CarrierSupportChannel[] c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof CarrierSupportInfo) {
            final CarrierSupportInfo carrierSupportInfo = (CarrierSupportInfo)o;
            if (khl.be((Object)this.a, (Object)carrierSupportInfo.a) && khl.be((Object)this.b, (Object)carrierSupportInfo.b) && Arrays.equals(this.c, carrierSupportInfo.c)) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, Arrays.hashCode(this.c) });
    }
    
    public final String toString() {
        final ArrayList list = new ArrayList();
        khl.bg("TitleMessage", (Object)this.a, (List)list);
        khl.bg("LanguageCode", (Object)this.b, (List)list);
        khl.bg("SupportChannels", (Object)Arrays.toString(this.c), (List)list);
        return khl.bf((List)list, (Object)this);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.ag(parcel, 1, this.a);
        khl.ag(parcel, 2, this.b);
        khl.aj(parcel, 3, (Parcelable[])this.c, n);
        khl.N(parcel, m);
    }
}
