// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.usagereporting;

import android.os.Parcel;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class UsageReportingOptInOptions extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public boolean b;
    public final List c;
    public int d;
    public String e;
    public boolean f;
    
    static {
        CREATOR = (Parcelable$Creator)new nkt(8);
    }
    
    public UsageReportingOptInOptions(final int a, final boolean b, final List list, final int d, final String e, final boolean f) {
        final ArrayList c = new ArrayList();
        this.c = c;
        this.a = a;
        this.b = b;
        if (list != null) {
            c.addAll(list);
        }
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.O(parcel, 2, this.a);
        kgk.K(parcel, 3, this.b);
        kgk.ae(parcel, 4, this.c);
        kgk.O(parcel, 5, this.d);
        kgk.ac(parcel, 6, this.e);
        kgk.K(parcel, 7, this.f);
        kgk.J(parcel, i);
    }
}
