// 
// Decompiled by Procyon v0.6.0
// 

package androidx.drawerlayout.widget;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.customview.view.AbsSavedState;

public class DrawerLayout$SavedState extends AbsSavedState
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public int b;
    public int e;
    public int f;
    public int g;
    
    static {
        CREATOR = (Parcelable$Creator)new of(6);
    }
    
    public DrawerLayout$SavedState(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = 0;
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
    }
    
    public DrawerLayout$SavedState(final Parcelable parcelable) {
        super(parcelable);
        this.a = 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }
}
