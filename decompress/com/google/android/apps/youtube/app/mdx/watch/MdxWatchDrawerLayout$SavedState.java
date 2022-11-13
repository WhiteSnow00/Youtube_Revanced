// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx.watch;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

public class MdxWatchDrawerLayout$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    boolean a;
    
    static {
        CREATOR = (Parcelable$Creator)new ics(0);
    }
    
    public MdxWatchDrawerLayout$SavedState(final Parcel parcel) {
        super(parcel);
        final int int1 = parcel.readInt();
        boolean a = true;
        if (int1 != 1) {
            a = false;
        }
        this.a = a;
    }
    
    public MdxWatchDrawerLayout$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt((int)(this.a ? 1 : 0));
    }
}
