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
    private akok a;
    
    static {
        CREATOR = (Parcelable$Creator)new fzf(17);
    }
    
    public ReelSequenceNavigator$ReelSequenceNavigatorState(final akok a) {
        this.a = a;
    }
    
    public ReelSequenceNavigator$ReelSequenceNavigatorState(final Parcel parcel) {
        try {
            if (parcel.readInt() != 0) {
                this.a = (akok)aeda.ao(parcel, (MessageLite)akok.a, ExtensionRegistryLite.getGeneratedRegistry());
                return;
            }
            this.a = null;
        }
        catch (final ahab ahab) {
            trn.d("Invalid ReelItemWatchResponse", (Throwable)ahab);
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
        final akok a = this.a;
        if (a != null) {
            aeda.au(parcel, (MessageLite)a);
        }
    }
}
