// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.customview.view.AbsSavedState;

public class Toolbar$SavedState extends AbsSavedState
{
    public static final Parcelable$Creator CREATOR;
    int a;
    boolean b;
    
    static {
        CREATOR = (Parcelable$Creator)new of(3);
    }
    
    public Toolbar$SavedState(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = (parcel.readInt() != 0);
    }
    
    public Toolbar$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.a);
        parcel.writeInt((int)(this.b ? 1 : 0));
    }
}
