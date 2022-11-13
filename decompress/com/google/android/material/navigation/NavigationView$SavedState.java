// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.navigation;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import androidx.customview.view.AbsSavedState;

public class NavigationView$SavedState extends AbsSavedState
{
    public static final Parcelable$Creator CREATOR;
    public Bundle a;
    
    static {
        CREATOR = (Parcelable$Creator)new adtn(5);
    }
    
    public NavigationView$SavedState(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readBundle(classLoader);
    }
    
    public NavigationView$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeBundle(this.a);
    }
}
