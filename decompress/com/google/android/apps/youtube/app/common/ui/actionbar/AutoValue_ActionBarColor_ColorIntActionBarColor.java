// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.actionbar;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class AutoValue_ActionBarColor_ColorIntActionBarColor extends $AutoValue_ActionBarColor_ColorIntActionBarColor
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new fzn(1);
    }
    
    public AutoValue_ActionBarColor_ColorIntActionBarColor(final int n) {
        super(n);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(super.a);
    }
}
