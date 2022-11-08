// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.customview.view.AbsSavedState;

public class SearchView$SavedState extends AbsSavedState
{
    public static final Parcelable$Creator CREATOR;
    boolean a;
    
    static {
        CREATOR = (Parcelable$Creator)new of(2);
    }
    
    public SearchView$SavedState(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = (boolean)parcel.readValue((ClassLoader)null);
    }
    
    public SearchView$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("SearchView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" isIconified=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeValue((Object)this.a);
    }
}
