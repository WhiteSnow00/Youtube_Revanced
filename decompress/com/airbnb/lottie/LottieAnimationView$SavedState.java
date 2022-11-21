// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.lottie;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

public class LottieAnimationView$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    String a;
    int b;
    float c;
    boolean d;
    String e;
    int f;
    int g;
    
    static {
        CREATOR = (Parcelable$Creator)new bvp(19);
    }
    
    public LottieAnimationView$SavedState(final Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
        this.c = parcel.readFloat();
        final int int1 = parcel.readInt();
        boolean d = true;
        if (int1 != 1) {
            d = false;
        }
        this.d = d;
        this.e = parcel.readString();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
    }
    
    public LottieAnimationView$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeString(this.a);
        parcel.writeFloat(this.c);
        parcel.writeInt((int)(this.d ? 1 : 0));
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }
}
