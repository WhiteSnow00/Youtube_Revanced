// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class IpcCompatiblePlaybackState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final boolean a;
    public final int b;
    public final PlaybackStartDescriptor c;
    
    static {
        CREATOR = (Parcelable$Creator)new ics(17);
    }
    
    public IpcCompatiblePlaybackState(final int b, final PlaybackStartDescriptor c, final boolean a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.b);
        int n2;
        if (this.c != null) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        parcel.writeInt(n2);
        final PlaybackStartDescriptor c = this.c;
        if (c != null) {
            parcel.writeParcelable((Parcelable)c, n);
        }
        parcel.writeInt((int)(this.a ? 1 : 0));
    }
}
