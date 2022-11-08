// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.stateful;

import android.os.Parcelable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.customview.view.AbsSavedState;

public class ExtendableSavedState extends AbsSavedState
{
    public static final Parcelable$Creator CREATOR;
    public final abn a;
    
    static {
        CREATOR = (Parcelable$Creator)new adrl(6);
    }
    
    public ExtendableSavedState(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        final int int1 = parcel.readInt();
        final String[] array = new String[int1];
        parcel.readStringArray(array);
        final Bundle[] array2 = new Bundle[int1];
        parcel.readTypedArray((Object[])array2, Bundle.CREATOR);
        this.a = new abn(int1);
        for (int i = 0; i < int1; ++i) {
            this.a.put((Object)array[i], (Object)array2[i]);
        }
    }
    
    public ExtendableSavedState(final Parcelable parcelable) {
        super(parcelable);
        this.a = new abn();
    }
    
    public final String toString() {
        final String hexString = Integer.toHexString(System.identityHashCode(this));
        final String string = this.a.toString();
        final StringBuilder sb = new StringBuilder("ExtendableSavedState{");
        sb.append(hexString);
        sb.append(" states=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        final int d = this.a.d;
        parcel.writeInt(d);
        final String[] array = new String[d];
        final Bundle[] array2 = new Bundle[d];
        for (i = 0; i < d; ++i) {
            array[i] = (String)this.a.c(i);
            array2[i] = (Bundle)this.a.f(i);
        }
        parcel.writeStringArray(array);
        parcel.writeTypedArray((Parcelable[])array2, 0);
    }
}
