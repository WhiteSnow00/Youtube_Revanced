// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.edit.fragment;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class ReelEditModel$DeletedItem implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new fzf(14);
    }
    
    public static final ReelEditModel$DeletedItem c(final int n, final ReelItemEditModel reelItemEditModel) {
        agot.u(n >= 0);
        return new AutoValue_ReelEditModel_DeletedItem(n, reelItemEditModel);
    }
    
    public abstract int a();
    
    public abstract ReelItemEditModel b();
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a());
        parcel.writeParcelable((Parcelable)this.b(), n);
    }
}
