// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.button;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.customview.view.AbsSavedState;

public class MaterialButton$SavedState extends AbsSavedState
{
    public static final Parcelable$Creator CREATOR;
    boolean a;
    
    static {
        CREATOR = (Parcelable$Creator)new adtn(2);
    }
    
    public MaterialButton$SavedState(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            this.getClass().getClassLoader();
        }
        final int int1 = parcel.readInt();
        boolean a = true;
        if (int1 != 1) {
            a = false;
        }
        this.a = a;
    }
    
    public MaterialButton$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt((int)(this.a ? 1 : 0));
    }
}
