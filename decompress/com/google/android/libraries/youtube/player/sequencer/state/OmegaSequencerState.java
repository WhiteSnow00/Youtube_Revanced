// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.player.sequencer.state;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.os.Parcelable$Creator;

public final class OmegaSequencerState implements SequencerState
{
    public static final Parcelable$Creator CREATOR;
    public final PlayerResponseModel a;
    public final WatchNextResponseModel b;
    public final SequenceNavigatorState c;
    public PlaybackStartDescriptor d;
    public PlaybackStartDescriptor e;
    public final boolean f;
    
    static {
        CREATOR = (Parcelable$Creator)new abcf(8);
    }
    
    public OmegaSequencerState(final Parcel parcel) {
        final ClassLoader classLoader = this.getClass().getClassLoader();
        this.a = (PlayerResponseModel)parcel.readParcelable(classLoader);
        this.b = (WatchNextResponseModel)parcel.readParcelable(classLoader);
        this.d = (PlaybackStartDescriptor)parcel.readParcelable(classLoader);
        this.e = (PlaybackStartDescriptor)parcel.readParcelable(classLoader);
        final int int1 = parcel.readInt();
        boolean f = true;
        if (int1 != 1) {
            f = false;
        }
        this.f = f;
        this.c = (SequenceNavigatorState)parcel.readParcelable(classLoader);
    }
    
    public OmegaSequencerState(final PlayerResponseModel a, final WatchNextResponseModel b, final PlaybackStartDescriptor d, final PlaybackStartDescriptor e, final boolean f, final SequenceNavigatorState c) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
        this.c = c;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.a, 0);
        parcel.writeParcelable((Parcelable)this.b, 0);
        parcel.writeParcelable((Parcelable)this.d, 0);
        parcel.writeParcelable((Parcelable)this.e, 0);
        parcel.writeInt((int)(this.f ? 1 : 0));
        parcel.writeParcelable((Parcelable)this.c, 0);
    }
}
