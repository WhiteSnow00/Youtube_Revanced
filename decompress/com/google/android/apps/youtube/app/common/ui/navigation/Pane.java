// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.navigation;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class Pane implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final PaneBackStack b;
    public PaneDescriptor c;
    public PaneDescriptor d;
    
    static {
        CREATOR = (Parcelable$Creator)new fzn(3);
    }
    
    public Pane(final int a) {
        this.a = a;
        this.b = new PaneBackStack();
        this.c = null;
        this.d = null;
    }
    
    public Pane(final Parcel parcel) {
        this.a = parcel.readInt();
        this.b = (PaneBackStack)parcel.readParcelable(PaneBackStack.class.getClassLoader());
        this.c = (PaneDescriptor)parcel.readParcelable(PaneDescriptor.class.getClassLoader());
        this.d = (PaneDescriptor)parcel.readParcelable(PaneDescriptor.class.getClassLoader());
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeParcelable((Parcelable)this.b, n);
        parcel.writeParcelable((Parcelable)this.c, n);
        parcel.writeParcelable((Parcelable)this.d, n);
    }
}
