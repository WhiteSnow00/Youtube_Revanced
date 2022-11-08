// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.textfield;

import android.os.Parcelable;
import android.text.TextUtils;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.customview.view.AbsSavedState;

public class TextInputLayout$SavedState extends AbsSavedState
{
    public static final Parcelable$Creator CREATOR;
    CharSequence a;
    boolean b;
    
    static {
        CREATOR = (Parcelable$Creator)new adrl(7);
    }
    
    public TextInputLayout$SavedState(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        final int int1 = parcel.readInt();
        boolean b = true;
        if (int1 != 1) {
            b = false;
        }
        this.b = b;
    }
    
    public TextInputLayout$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public final String toString() {
        final String hexString = Integer.toHexString(System.identityHashCode(this));
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("TextInputLayout.SavedState{");
        sb.append(hexString);
        sb.append(" error=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        TextUtils.writeToParcel(this.a, parcel, n);
        parcel.writeInt((int)(this.b ? 1 : 0));
    }
}
