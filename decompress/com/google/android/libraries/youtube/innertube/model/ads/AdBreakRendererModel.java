// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.innertube.model.ads;

import com.google.protobuf.MessageLite;
import android.os.Parcel;
import java.util.Arrays;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class AdBreakRendererModel implements Parcelable, zhp
{
    public static final Parcelable$Creator CREATOR;
    public static final vfa a;
    public ahiv b;
    
    static {
        CREATOR = (Parcelable$Creator)new uik(10);
        a = new vfa();
    }
    
    public AdBreakRendererModel(final ahiv b) {
        b.getClass();
        this.b = b;
    }
    
    public final String a() {
        return this.b.f;
    }
    
    public final List b() {
        return this.b.d;
    }
    
    public final List c() {
        return this.b.h;
    }
    
    public final List d() {
        return this.b.g;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o != null && this.getClass().equals(o.getClass()) && aeda.v((Object)this.b, (Object)((AdBreakRendererModel)o).b);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        uji.ag((MessageLite)this.b, parcel);
    }
}
