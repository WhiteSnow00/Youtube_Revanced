// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.navigation.panels;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import android.os.Parcelable$Creator;

public final class AutoValue_PaneFragmentPanelDescriptor extends $AutoValue_PaneFragmentPanelDescriptor
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new fzn(7);
    }
    
    public AutoValue_PaneFragmentPanelDescriptor(final PaneDescriptor paneDescriptor) {
        super(paneDescriptor);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)super.a, n);
    }
}
