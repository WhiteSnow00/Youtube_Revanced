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

public class AdBreakRendererModel implements Parcelable, zlh
{
    public static final Parcelable$Creator CREATOR;
    public static final vii a;
    public final ahmk b;
    
    static {
        CREATOR = (Parcelable$Creator)new ulj(10);
        a = new vii();
    }
    
    public AdBreakRendererModel(final ahmk b) {
        b.getClass();
        this.b = b;
    }
    
    public final String a() {
        return this.b.f;
    }
    
    public final List b() {
        return (List)this.b.d;
    }
    
    public final List c() {
        return (List)this.b.h;
    }
    
    public final List d() {
        return (List)this.b.g;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o != null && this.getClass().equals(o.getClass()) && aexq.c(this.b, ((AdBreakRendererModel)o).b);
    }
    
    public final /* bridge */ zlg h() {
        return (zlg)new vii(this);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        ume.ad((MessageLite)this.b, parcel);
    }
}
