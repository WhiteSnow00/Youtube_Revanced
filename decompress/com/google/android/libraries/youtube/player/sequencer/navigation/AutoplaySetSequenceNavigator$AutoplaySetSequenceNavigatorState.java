// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.player.sequencer.navigation;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import android.os.Parcelable$Creator;
import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;

public final class AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState implements SequenceNavigatorState
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final WatchNextResponseModel b;
    public final boolean c;
    public final int d;
    
    static {
        CREATOR = (Parcelable$Creator)new abdz(6);
    }
    
    public AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState(final Parcel parcel) {
        final ClassLoader classLoader = this.getClass().getClassLoader();
        String string;
        if ((string = parcel.readString()) == null) {
            string = "";
        }
        this.a = string;
        this.b = (WatchNextResponseModel)parcel.readParcelable(classLoader);
        final int int1 = parcel.readInt();
        boolean c = true;
        if (int1 != 1) {
            c = false;
        }
        this.c = c;
        this.d = parcel.readInt();
    }
    
    public AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState(final String a, final WatchNextResponseModel b, final boolean c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeParcelable((Parcelable)this.b, 0);
        parcel.writeInt((int)(this.c ? 1 : 0));
        parcel.writeInt(this.d);
    }
}
