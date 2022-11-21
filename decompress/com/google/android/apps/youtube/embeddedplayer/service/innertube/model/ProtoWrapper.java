// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.innertube.model;

import com.google.protobuf.MessageLite;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class ProtoWrapper implements Parcelable
{
    public final ahcz a;
    
    public ProtoWrapper(final ahcz a) {
        this.a = a;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        ume.ad((MessageLite)this.a, parcel);
    }
}
