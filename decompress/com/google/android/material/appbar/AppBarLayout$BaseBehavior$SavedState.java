// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.appbar;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.customview.view.AbsSavedState;

public class AppBarLayout$BaseBehavior$SavedState extends AbsSavedState
{
    public static final Parcelable$Creator CREATOR;
    boolean a;
    boolean b;
    int e;
    float f;
    boolean g;
    
    static {
        CREATOR = (Parcelable$Creator)new adtn(1);
    }
    
    public AppBarLayout$BaseBehavior$SavedState(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        final byte byte1 = parcel.readByte();
        final boolean b = true;
        this.a = (byte1 != 0);
        this.b = (parcel.readByte() != 0);
        this.e = parcel.readInt();
        this.f = parcel.readFloat();
        this.g = (parcel.readByte() != 0 && b);
    }
    
    public AppBarLayout$BaseBehavior$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeByte((byte)(byte)(this.a ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.b ? 1 : 0));
        parcel.writeInt(this.e);
        parcel.writeFloat(this.f);
        parcel.writeByte((byte)(byte)(this.g ? 1 : 0));
    }
}
