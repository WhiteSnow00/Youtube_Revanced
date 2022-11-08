// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.bottomsheet;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.customview.view.AbsSavedState;

public class BottomSheetBehavior$SavedState extends AbsSavedState
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    int b;
    boolean e;
    boolean f;
    boolean g;
    
    static {
        CREATOR = (Parcelable$Creator)new adrl(0);
    }
    
    public BottomSheetBehavior$SavedState(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        final int int1 = parcel.readInt();
        final boolean b = false;
        this.e = (int1 == 1);
        this.f = (parcel.readInt() == 1);
        boolean g = b;
        if (parcel.readInt() == 1) {
            g = true;
        }
        this.g = g;
    }
    
    public BottomSheetBehavior$SavedState(final Parcelable parcelable, final BottomSheetBehavior bottomSheetBehavior) {
        super(parcelable);
        this.a = bottomSheetBehavior.z;
        this.b = bottomSheetBehavior.c;
        this.e = bottomSheetBehavior.a;
        this.f = bottomSheetBehavior.w;
        this.g = bottomSheetBehavior.x;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt((int)(this.e ? 1 : 0));
        parcel.writeInt((int)(this.f ? 1 : 0));
        parcel.writeInt((int)(this.g ? 1 : 0));
    }
}
