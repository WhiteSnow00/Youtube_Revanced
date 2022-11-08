// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livecreation.ui.view;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

public final class NetworkOperationView$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    int a;
    
    static {
        CREATOR = (Parcelable$Creator)new vho(8);
    }
    
    public NetworkOperationView$SavedState(final Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }
    
    public NetworkOperationView$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.a);
    }
}
