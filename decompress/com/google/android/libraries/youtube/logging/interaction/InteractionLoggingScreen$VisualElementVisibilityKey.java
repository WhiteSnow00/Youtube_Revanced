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
        CREATOR = (Parcelable$Creator)new vho(13);
    }
    
    public static wxo c() {
        return new wxo();
    }
    
    public abstract apni a();
    
    public abstract aqqg b();
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        uji.ag((MessageLite)this.a(), parcel);
        uji.ag((MessageLite)this.b(), parcel);
    }
}
