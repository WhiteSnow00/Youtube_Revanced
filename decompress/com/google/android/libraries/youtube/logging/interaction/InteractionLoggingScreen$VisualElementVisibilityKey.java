// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.logging.interaction;

import com.google.protobuf.MessageLite;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class InteractionLoggingScreen$VisualElementVisibilityKey implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new vjo(13);
    }
    
    public static wzo c() {
        return new wzo();
    }
    
    public abstract appm a();
    
    public abstract aqss b();
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        vdh.bp((MessageLite)this.a(), parcel);
        vdh.bp((MessageLite)this.b(), parcel);
    }
}
