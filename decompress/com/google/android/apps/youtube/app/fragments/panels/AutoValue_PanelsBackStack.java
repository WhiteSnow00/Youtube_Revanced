// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.fragments.panels;

import java.util.List;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;

public final class AutoValue_PanelsBackStack extends $AutoValue_PanelsBackStack
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new fzn(20);
    }
    
    public AutoValue_PanelsBackStack(final ArrayList list) {
        super(list);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeList((List)super.a);
    }
}
