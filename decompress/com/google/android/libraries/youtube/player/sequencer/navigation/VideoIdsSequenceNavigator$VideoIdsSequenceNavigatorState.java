// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.player.sequencer.navigation;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.os.Parcelable$Creator;
import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;

public final class VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState implements SequenceNavigatorState
{
    public static final Parcelable$Creator CREATOR;
    public final PlaybackStartDescriptor a;
    public final int b;
    
    static {
        CREATOR = (Parcelable$Creator)new abcf(7);
    }
    
    public VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState(final Parcel parcel) {
        this.a = (PlaybackStartDescriptor)parcel.readParcelable(this.getClass().getClassLoader());
        this.b = parcel.readInt();
    }
    
    public VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState(final PlaybackStartDescriptor a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.a, 0);
        parcel.writeInt(this.b);
    }
}
