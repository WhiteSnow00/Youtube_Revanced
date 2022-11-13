// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.fragments.panels;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import android.os.Parcel;
import android.support.v4.app.Fragment$SavedState;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class PanelsBackStack$PanelsBackStackEntry implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final PanelDescriptor a;
    public final Fragment$SavedState b;
    public final Object c;
    public final String d;
    
    static {
        CREATOR = (Parcelable$Creator)new ics(1);
    }
    
    public PanelsBackStack$PanelsBackStackEntry(final Parcel parcel) {
        this.a = (PanelDescriptor)parcel.readParcelable(PaneDescriptor.class.getClassLoader());
        this.b = (Fragment$SavedState)parcel.readParcelable(Fragment$SavedState.class.getClassLoader());
        this.c = null;
        this.d = parcel.readString();
    }
    
    public PanelsBackStack$PanelsBackStackEntry(final PanelDescriptor a, final Fragment$SavedState b, final Object c, final String d) {
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
