// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LogVerifierResultParcelable extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public boolean a;
    
    static {
        CREATOR = (Parcelable$Creator)new mji(19);
    }
    
    public LogVerifierResultParcelable(final boolean a) {
        this.a = a;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof LogVerifierResultParcelable && this.a == ((LogVerifierResultParcelable)o).a);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a });
    }
    
    public final String toString() {
        final boolean a = this.a;
        final StringBuilder sb = new StringBuilder("LogVerifierResultParcelable[");
        sb.append(a);
        sb.append("]");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.O(parcel, 1, this.a);
        khl.N(parcel, m);
    }
}
