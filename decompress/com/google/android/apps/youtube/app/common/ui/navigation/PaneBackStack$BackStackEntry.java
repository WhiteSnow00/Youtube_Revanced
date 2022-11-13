// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.navigation;

import android.os.Parcel;
import android.support.v4.app.Fragment$SavedState;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class PaneBackStack$BackStackEntry implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final PaneDescriptor a;
    public final Fragment$SavedState b;
    public final Object c;
    public final String d;
    
    static {
        CREATOR = (Parcelable$Creator)new fzn(5);
    }
    
    public PaneBackStack$BackStackEntry(final Parcel parcel) {
        final PaneDescriptor a = (PaneDescriptor)parcel.readParcelable(PaneDescriptor.class.getClassLoader());
        a.getClass();
        this.a = a;
        this.b = (Fragment$SavedState)parcel.readParcelable(Fragment$SavedState.class.getClassLoader());
        this.c = null;
        this.d = parcel.readString();
    }
    
    public PaneBackStack$BackStackEntry(final PaneDescriptor a, final Fragment$SavedState b, final Object c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.a, n);
        parcel.writeParcelable((Parcelable)this.b, n);
        parcel.writeString(this.d);
    }
}
