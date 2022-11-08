// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import androidx.customview.view.AbsSavedState;

public class RecyclerView$SavedState extends AbsSavedState
{
    public static final Parcelable$Creator CREATOR;
    Parcelable a;
    
    static {
        CREATOR = (Parcelable$Creator)new of(0);
    }
    
    public RecyclerView$SavedState(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        ClassLoader classLoader2 = classLoader;
        if (classLoader == null) {
            classLoader2 = nw.class.getClassLoader();
        }
        this.a = parcel.readParcelable(classLoader2);
    }
    
    public RecyclerView$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeParcelable(this.a, 0);
    }
}
