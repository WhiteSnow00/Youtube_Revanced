// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.player.features.queue;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import android.os.Parcelable$Creator;
import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;

public final class PlaybackQueueSequenceNavigator$PlaybackQueueSequenceNavigatorState implements SequenceNavigatorState
{
    public static final Parcelable$Creator CREATOR;
    public final WatchNextResponseModel a;
    
    static {
        CREATOR = (Parcelable$Creator)new abcf(2);
    }
    
    public PlaybackQueueSequenceNavigator$PlaybackQueueSequenceNavigatorState(final Parcel parcel) {
        this.a = (WatchNextResponseModel)parcel.readParcelable(this.getClass().getClassLoader());
    }
    
    public PlaybackQueueSequenceNavigator$PlaybackQueueSequenceNavigatorState(final WatchNextResponseModel a) {
        this.a = a;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.a, 0);
    }
}
