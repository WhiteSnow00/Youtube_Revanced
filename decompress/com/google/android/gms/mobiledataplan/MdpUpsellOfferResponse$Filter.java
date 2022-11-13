// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class MdpUpsellOfferResponse$Filter extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    private final String a;
    private final String b;
    
    static {
        CREATOR = (Parcelable$Creator)new njy(2);
    }
    
    public MdpUpsellOfferResponse$Filter(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
    
    public final String toString() {
        final ArrayList list = new ArrayList();
        khl.bg("tag", (Object)this.a, (List)list);
        khl.bg("display_text", (Object)this.b, (List)list);
        return khl.bf((List)list, (Object)this);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
