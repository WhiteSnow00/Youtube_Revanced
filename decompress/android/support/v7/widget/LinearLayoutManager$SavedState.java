// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class LinearLayoutManager$SavedState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    int a;
    int b;
    boolean c;
    
    static {
        CREATOR = (Parcelable$Creator)new aw(18);
    }
    
    public LinearLayoutManager$SavedState() {
    }
    
    public LinearLayoutManager$SavedState(final Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        final int int1 = parcel.readInt();
        boolean c = true;
        if (int1 != 1) {
            c = false;
        }
        this.c = c;
    }
    
    public LinearLayoutManager$SavedState(final LinearLayoutManager$SavedState linearLayoutManager$SavedState) {
        this.a = linearLayoutManager$SavedState.a;
        this.b = linearLayoutManager$SavedState.b;
        this.c = linearLayoutManager$SavedState.c;
    }
    
    final void a() {
        this.a = -1;
    }
    
    final boolean b() {
        return this.a >= 0;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt((int)(this.c ? 1 : 0));
    }
}
