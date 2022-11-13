// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import android.text.TextUtils;
import android.os.Parcelable$Creator;

public class MutedAutoplayState implements BusSupported$Data
{
    public static final Parcelable$Creator CREATOR;
    public static final MutedAutoplayState a;
    public final long b;
    public final CharSequence c;
    public final SelectableItemKey d;
    public final SelectableItemKey e;
    public final SelectableItemKey f;
    public final int g;
    
    static {
        a = new MutedAutoplayState(null, null, null, null, 0L, 4);
        CREATOR = (Parcelable$Creator)new ics(18);
    }
    
    public MutedAutoplayState(final SelectableItemKey e, final SelectableItemKey f, final SelectableItemKey d, final CharSequence c, final long b, final int g) {
        this.e = e;
        this.f = f;
        this.d = d;
        this.c = c;
        this.b = b;
        this.g = g;
    }
    
    @Override
    public final b d() {
        return com.google.android.apps.youtube.embeddedplayer.service.model.b.e;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof MutedAutoplayState)) {
            return false;
        }
        final MutedAutoplayState mutedAutoplayState = (MutedAutoplayState)o;
        return adkp.ae(this.e, mutedAutoplayState.e) && adkp.ae(this.f, mutedAutoplayState.f) && adkp.ae(this.d, mutedAutoplayState.d) && TextUtils.equals(this.c, mutedAutoplayState.c) && mutedAutoplayState.b == this.b && mutedAutoplayState.g == this.g;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.e, this.f, this.d, this.c, this.b, this.g });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.e, n);
        parcel.writeParcelable((Parcelable)this.f, n);
        parcel.writeParcelable((Parcelable)this.d, n);
        TextUtils.writeToParcel(this.c, parcel, n);
        parcel.writeLong(this.b);
        parcel.writeInt(this.g);
    }
}
