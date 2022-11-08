// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.review;

import android.os.Parcel;
import android.app.PendingIntent;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class ReviewInfo implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new abyl(5);
    }
    
    public static ReviewInfo c(final PendingIntent pendingIntent, final boolean b) {
        return (ReviewInfo)new AutoValue_ReviewInfo(pendingIntent, b);
    }
    
    public abstract PendingIntent a();
    
    public abstract boolean b();
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.a(), 0);
        parcel.writeInt((int)(this.b() ? 1 : 0));
    }
}
