// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.checkbox;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

public class MaterialCheckBox$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    
    static {
        CREATOR = (Parcelable$Creator)new abyl(4);
    }
    
    public MaterialCheckBox$SavedState(final Parcel parcel) {
        super(parcel);
        this.a = (int)parcel.readValue(this.getClass().getClassLoader());
    }
    
    public MaterialCheckBox$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public final String toString() {
        final String hexString = Integer.toHexString(System.identityHashCode(this));
        final int a = this.a;
        String s;
        if (a != 1) {
            if (a != 2) {
                s = "unchecked";
            }
            else {
                s = "indeterminate";
            }
        }
        else {
            s = "checked";
        }
        final StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(hexString);
        sb.append(" CheckedState=");
        sb.append(s);
        sb.append("}");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeValue((Object)this.a);
    }
}
