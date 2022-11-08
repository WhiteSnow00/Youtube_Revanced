// 
// Decompiled by Procyon v0.6.0
// 

package androidx.coordinatorlayout.widget;

import android.os.Parcelable;
import android.os.Parcel;
import android.util.SparseArray;
import android.os.Parcelable$Creator;
import androidx.customview.view.AbsSavedState;

public class CoordinatorLayout$SavedState extends AbsSavedState
{
    public static final Parcelable$Creator CREATOR;
    SparseArray a;
    
    static {
        CREATOR = (Parcelable$Creator)new of(4);
    }
    
    public CoordinatorLayout$SavedState(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        final int int1 = parcel.readInt();
        final int[] array = new int[int1];
        parcel.readIntArray(array);
        final Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.a = new SparseArray(int1);
        for (int i = 0; i < int1; ++i) {
            this.a.append(array[i], (Object)parcelableArray[i]);
        }
    }
    
    public CoordinatorLayout$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        final SparseArray a = this.a;
        int i = 0;
        int size;
        if (a != null) {
            size = a.size();
        }
        else {
            size = 0;
        }
        parcel.writeInt(size);
        final int[] array = new int[size];
        final Parcelable[] array2 = new Parcelable[size];
        while (i < size) {
            array[i] = this.a.keyAt(i);
            array2[i] = (Parcelable)this.a.valueAt(i);
            ++i;
        }
        parcel.writeIntArray(array);
        parcel.writeParcelableArray(array2, n);
    }
}
