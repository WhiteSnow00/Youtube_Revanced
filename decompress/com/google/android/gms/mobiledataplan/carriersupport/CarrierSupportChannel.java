// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.mobiledataplan.carriersupport;

import android.os.Parcel;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class CarrierSupportChannel extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    
    static {
        CREATOR = (Parcelable$Creator)new njy(6);
    }
    
    private CarrierSupportChannel() {
    }
    
    public CarrierSupportChannel(final String a, final String b, final String c, final String d, final String e, final int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof CarrierSupportChannel) {
            final CarrierSupportChannel carrierSupportChannel = (CarrierSupportChannel)o;
            if (khl.be((Object)this.a, (Object)carrierSupportChannel.a) && khl.be((Object)this.b, (Object)carrierSupportChannel.b) && khl.be((Object)this.c, (Object)carrierSupportChannel.c) && khl.be((Object)this.d, (Object)carrierSupportChannel.d) && khl.be((Object)this.e, (Object)carrierSupportChannel.e) && khl.be((Object)this.f, (Object)carrierSupportChannel.f)) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d, this.e, this.f });
    }
    
    public final String toString() {
        final ArrayList list = new ArrayList();
        khl.bg("Title", (Object)this.a, (List)list);
        khl.bg("SubTitle", (Object)this.b, (List)list);
        khl.bg("Target", (Object)this.c, (List)list);
        khl.bg("DefaultMessageSubject", (Object)this.d, (List)list);
        khl.bg("DefaultMessageBody", (Object)this.e, (List)list);
        khl.bg("Type", (Object)this.f, (List)list);
        return khl.bf((List)list, (Object)this);
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.ag(parcel, 1, this.a);
        khl.ag(parcel, 2, this.b);
        khl.ag(parcel, 3, this.c);
        khl.ag(parcel, 4, this.d);
        khl.ag(parcel, 5, this.e);
        khl.S(parcel, 6, this.f);
        khl.N(parcel, m);
    }
}
