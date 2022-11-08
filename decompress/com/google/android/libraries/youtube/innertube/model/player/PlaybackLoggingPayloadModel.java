// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.innertube.model.player;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class PlaybackLoggingPayloadModel implements Comparable, Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final agyc a;
    public final int b;
    
    static {
        CREATOR = (Parcelable$Creator)new uik(18);
    }
    
    public PlaybackLoggingPayloadModel(final andn andn) {
        this.a = andn.c;
        this.b = andn.d;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeSerializable((Serializable)this.a);
        parcel.writeInt(this.b);
    }
}
