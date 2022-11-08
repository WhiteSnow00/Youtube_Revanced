// 
// Decompiled by Procyon v0.6.0
// 

package androidx.swiperefreshlayout.widget;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

public class SwipeRefreshLayout$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    final boolean a;
    
    static {
        CREATOR = (Parcelable$Creator)new bvl(18);
    }
    
    public SwipeRefreshLayout$SavedState(final Parcel parcel) {
        super(parcel);
        this.a = (parcel.readByte() != 0);
    }
    
    public SwipeRefreshLayout$SavedState(final Parcelable parcelable, final boolean a) {
        super(parcelable);
        this.a = a;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeByte((byte)(byte)(this.a ? 1 : 0));
    }
}
