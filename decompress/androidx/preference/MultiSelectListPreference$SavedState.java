// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.os.Parcelable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import android.os.Parcel;
import java.util.Set;
import android.os.Parcelable$Creator;

public class MultiSelectListPreference$SavedState extends Preference$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    Set a;
    
    static {
        CREATOR = (Parcelable$Creator)new bvl(13);
    }
    
    public MultiSelectListPreference$SavedState(final Parcel parcel) {
        super(parcel);
        final int int1 = parcel.readInt();
        this.a = new HashSet();
        final String[] array = new String[int1];
        parcel.readStringArray(array);
        Collections.addAll(this.a, array);
    }
    
    public MultiSelectListPreference$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.a.size());
        final Set a = this.a;
        parcel.writeStringArray((String[])a.toArray(new String[a.size()]));
    }
}
