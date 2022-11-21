// 
// Decompiled by Procyon v0.6.0
// 

package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class AbsSavedState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final AbsSavedState c;
    public final Parcelable d;
    
    static {
        c = (AbsSavedState)new AbsSavedState$1();
        CREATOR = (Parcelable$Creator)new og(5);
    }
    
    public AbsSavedState() {
        this.d = null;
    }
    
    protected AbsSavedState(final Parcel parcel, final ClassLoader classLoader) {
        Object d;
        if ((d = parcel.readParcelable(classLoader)) == null) {
            d = AbsSavedState.c;
        }
        this.d = (Parcelable)d;
    }
    
    protected AbsSavedState(final Parcelable parcelable) {
        if (parcelable != null) {
            Parcelable d;
            if ((d = parcelable) == AbsSavedState.c) {
                d = null;
            }
            this.d = d;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable(this.d, n);
    }
}
