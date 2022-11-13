// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.actionbar;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class AutoValue_ActionBarColor_TransformAlphaActionBarColor extends $AutoValue_ActionBarColor_TransformAlphaActionBarColor
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new fzn(2);
    }
    
    public AutoValue_ActionBarColor_TransformAlphaActionBarColor(final ActionBarColor actionBarColor, final int n) {
        super(actionBarColor, n);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)super.a, n);
        parcel.writeInt(super.b);
    }
}
