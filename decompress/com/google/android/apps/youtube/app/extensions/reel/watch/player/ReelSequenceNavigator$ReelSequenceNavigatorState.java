// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.watch.player;

import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;

public final class ReelSequenceNavigator$ReelSequenceNavigatorState implements SequenceNavigatorState
{
    public static final Parcelable$Creator CREATOR;
    private akso a;
    
    static {
        CREATOR = (Parcelable$Creator)new fzs(16);
    }
    
    public ReelSequenceNavigator$ReelSequenceNavigatorState(final akso a) {
        this.a = a;
    }
    
    public ReelSequenceNavigator$ReelSequenceNavigatorState(final Parcel parcel) {
        try {
            if (parcel.readInt() != 0) {
                this.a = (akso)adzw.ax(parcel, (MessageLite)akso.a, ExtensionRegistryLite.getGeneratedRegistry());
                return;
            }
            this.a = null;
        }
        catch (final ahds ahds) {
            tut.d("Invalid ReelItemWatchResponse", (Throwable)ahds);
        }
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, int n) {
        if (this.a != null) {
            n = 1;
        }
        else {
            n = 0;
        }
        parcel.writeInt(n);
        final akso a = this.a;
        if (a != null) {
            adzw.aD(parcel, (MessageLite)a);
        }
    }
}
