// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ActionMenuPresenter$SavedState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    
    static {
        CREATOR = (Parcelable$Creator)new aw(16);
    }
    
    public ActionMenuPresenter$SavedState() {
    }
    
    public ActionMenuPresenter$SavedState(final Parcel parcel) {
        this.a = parcel.readInt();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
    }
}
