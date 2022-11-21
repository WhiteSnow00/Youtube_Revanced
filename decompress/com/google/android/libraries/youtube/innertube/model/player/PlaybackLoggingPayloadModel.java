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
    public final ahbt a;
    public final int b;
    
    static {
        CREATOR = (Parcelable$Creator)new ulj(18);
    }
    
    public PlaybackLoggingPayloadModel(final anhy anhy) {
        this.a = anhy.c;
        this.b = anhy.d;
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        final PlaybackLoggingPayloadModel playbackLoggingPayloadModel = (PlaybackLoggingPayloadModel)o;
        final int b = this.b;
        final int b2 = playbackLoggingPayloadModel.b;
        int n;
        if (b != b2) {
            if (b < b2) {
                return -1;
            }
            n = 1;
        }
        else {
            n = 0;
        }
        return n;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeSerializable((Serializable)this.a);
        parcel.writeInt(this.b);
    }
}
