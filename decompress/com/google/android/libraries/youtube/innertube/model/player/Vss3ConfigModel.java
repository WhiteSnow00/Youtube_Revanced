// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.innertube.model.player;

import com.google.protobuf.MessageLite;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class Vss3ConfigModel implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final agyc f;
    private final apnz g;
    
    static {
        CREATOR = (Parcelable$Creator)new vho(2);
    }
    
    public Vss3ConfigModel(final apnz g) {
        this.g = g;
        this.f = g.c;
        this.a = g.d;
        apoa apoa;
        if ((apoa = g.b) == null) {
            apoa = apoa.a;
        }
        this.b = apoa.b;
        this.c = apoa.c;
        this.e = apoa.e;
        this.d = apoa.d;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        uji.ag((MessageLite)this.g, parcel);
    }
}
