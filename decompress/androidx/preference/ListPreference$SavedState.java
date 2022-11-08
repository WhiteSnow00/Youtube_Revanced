// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ListPreference$SavedState extends Preference$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    String a;
    
    static {
        CREATOR = (Parcelable$Creator)new bvl(12);
    }
    
    public ListPreference$SavedState(final Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
    }
    
    public ListPreference$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeString(this.a);
    }
}
