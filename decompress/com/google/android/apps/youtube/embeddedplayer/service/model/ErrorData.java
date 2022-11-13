// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;

public class ErrorData implements BusSupported$Data
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    
    static {
        CREATOR = (Parcelable$Creator)new ics(14);
    }
    
    public ErrorData(final int a) {
        this.a = a;
    }
    
    @Override
    public final b d() {
        return b.b;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ErrorData && this.a == ((ErrorData)o).a;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a });
    }
    
    @Override
    public final String toString() {
        final String string = super.toString();
        final int a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(" ERROR_TYPE: ");
        sb.append(a);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
    }
}
