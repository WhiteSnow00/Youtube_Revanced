// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class EditTextPreference$SavedState extends Preference$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    String a;
    
    static {
        CREATOR = (Parcelable$Creator)new bvl(11);
    }
    
    public EditTextPreference$SavedState(final Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
    }
    
    public EditTextPreference$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeString(this.a);
    }
}
