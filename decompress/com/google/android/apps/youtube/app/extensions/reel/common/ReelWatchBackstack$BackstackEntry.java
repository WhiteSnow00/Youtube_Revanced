// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.common;

import android.os.Parcel;
import android.support.v4.app.Fragment$SavedState;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class ReelWatchBackstack$BackstackEntry implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final aioe a;
    public final Bundle b;
    public final Fragment$SavedState c;
    public final Object d;
    
    static {
        CREATOR = (Parcelable$Creator)new fzf(10);
    }
    
    private ReelWatchBackstack$BackstackEntry(final aioe a, final Bundle b, final Fragment$SavedState c, final Object d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public ReelWatchBackstack$BackstackEntry(final Parcel parcel) {
        this.a = vba.c(parcel.createByteArray());
        this.b = parcel.readBundle(this.getClass().getClassLoader());
        this.c = (Fragment$SavedState)parcel.readParcelable(Fragment$SavedState.class.getClassLoader());
        this.d = null;
    }
    
    public static ReelWatchBackstack$BackstackEntry a(final aioe aioe, final Bundle bundle, final Fragment$SavedState fragment$SavedState, final Object o) {
        return new ReelWatchBackstack$BackstackEntry(aioe, bundle, fragment$SavedState, o);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeByteArray(((agxl)this.a).toByteArray());
        parcel.writeBundle(this.b);
        parcel.writeParcelable((Parcelable)this.c, n);
    }
}
