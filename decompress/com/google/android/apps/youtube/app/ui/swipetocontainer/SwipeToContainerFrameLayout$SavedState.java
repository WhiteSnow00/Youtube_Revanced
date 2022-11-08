// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui.swipetocontainer;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

public final class SwipeToContainerFrameLayout$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    public boolean a;
    
    static {
        CREATOR = (Parcelable$Creator)new hxf(3);
    }
    
    public SwipeToContainerFrameLayout$SavedState(final Parcel parcel) {
        super(parcel);
        this.a = (parcel.readInt() != 0);
    }
    
    public SwipeToContainerFrameLayout$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt((int)(this.a ? 1 : 0));
    }
}
