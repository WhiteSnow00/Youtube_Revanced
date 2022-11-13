// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.util.SparseArray;

public class ParcelableSparseArray extends SparseArray implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new adtn(4);
    }
    
    public ParcelableSparseArray() {
    }
    
    public ParcelableSparseArray(final Parcel parcel, final ClassLoader classLoader) {
        final int int1 = parcel.readInt();
        final int[] array = new int[int1];
        parcel.readIntArray(array);
        final Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        for (int i = 0; i < int1; ++i) {
            this.put(array[i], (Object)parcelableArray[i]);
        }
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int size = this.size();
        final int[] array = new int[size];
        final Parcelable[] array2 = new Parcelable[size];
        for (int i = 0; i < size; ++i) {
            array[i] = this.keyAt(i);
            array2[i] = (Parcelable)this.valueAt(i);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(array);
        parcel.writeParcelableArray(array2, n);
    }
}
