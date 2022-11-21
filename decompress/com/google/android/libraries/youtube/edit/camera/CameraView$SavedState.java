// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.camera;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

public final class CameraView$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    boolean a;
    int b;
    int c;
    
    static {
        CREATOR = (Parcelable$Creator)new ulj(0);
    }
    
    public CameraView$SavedState(final Parcel parcel) {
        super(parcel);
        final int int1 = parcel.readInt();
        boolean a = true;
        if (int1 != 1) {
            a = false;
        }
        this.a = a;
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }
    
    public CameraView$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt((int)(this.a ? 1 : 0));
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
