// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.droidguard;

import android.os.Parcel;
import java.util.concurrent.TimeUnit;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DroidGuardResultsRequest extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    private static final int b;
    public Bundle a;
    
    static {
        b = (int)TimeUnit.SECONDS.toMillis(60L);
        CREATOR = (Parcelable$Creator)new mvv(0);
    }
    
    public DroidGuardResultsRequest() {
        (this.a = new Bundle()).putInt("clientVersion", mpv.b);
        String property;
        try {
            property = System.getProperty("os.arch");
        }
        catch (final Exception ex) {
            property = "?";
        }
        this.a.putString("appArchitecture", property);
    }
    
    public DroidGuardResultsRequest(final Bundle a) {
        new Bundle();
        this.a = a;
    }
    
    public final int a() {
        return this.a.getInt("timeoutMs", DroidGuardResultsRequest.b);
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.V(parcel, 2, this.a);
        khl.N(parcel, m);
    }
}
