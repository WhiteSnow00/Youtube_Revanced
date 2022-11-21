// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

public class AppCompatSpinner$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    boolean a;
    
    static {
        CREATOR = (Parcelable$Creator)new aw(17);
    }
    
    public AppCompatSpinner$SavedState(final Parcel parcel) {
        super(parcel);
        this.a = (parcel.readByte() != 0);
    }
    
    public AppCompatSpinner$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeByte((byte)(byte)(this.a ? 1 : 0));
    }
}
