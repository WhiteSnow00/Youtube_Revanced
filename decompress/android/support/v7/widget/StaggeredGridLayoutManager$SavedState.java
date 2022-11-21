// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class StaggeredGridLayoutManager$SavedState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    int a;
    int b;
    int c;
    int[] d;
    int e;
    int[] f;
    List g;
    boolean h;
    boolean i;
    boolean j;
    
    static {
        CREATOR = (Parcelable$Creator)new aw(20);
    }
    
    public StaggeredGridLayoutManager$SavedState() {
    }
    
    public StaggeredGridLayoutManager$SavedState(final Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        final int int1 = parcel.readInt();
        this.c = int1;
        if (int1 > 0) {
            parcel.readIntArray(this.d = new int[int1]);
        }
        final int int2 = parcel.readInt();
        if ((this.e = int2) > 0) {
            parcel.readIntArray(this.f = new int[int2]);
        }
        final int int3 = parcel.readInt();
        final boolean b = false;
        this.h = (int3 == 1);
        this.i = (parcel.readInt() == 1);
        boolean j = b;
        if (parcel.readInt() == 1) {
            j = true;
        }
        this.j = j;
        this.g = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
    }
    
    public StaggeredGridLayoutManager$SavedState(final StaggeredGridLayoutManager$SavedState staggeredGridLayoutManager$SavedState) {
        this.c = staggeredGridLayoutManager$SavedState.c;
        this.a = staggeredGridLayoutManager$SavedState.a;
        this.b = staggeredGridLayoutManager$SavedState.b;
        this.d = staggeredGridLayoutManager$SavedState.d;
        this.e = staggeredGridLayoutManager$SavedState.e;
        this.f = staggeredGridLayoutManager$SavedState.f;
        this.h = staggeredGridLayoutManager$SavedState.h;
        this.i = staggeredGridLayoutManager$SavedState.i;
        this.j = staggeredGridLayoutManager$SavedState.j;
        this.g = staggeredGridLayoutManager$SavedState.g;
    }
    
    final void a() {
        this.d = null;
        this.c = 0;
        this.a = -1;
        this.b = -1;
    }
    
    final void b() {
        this.d = null;
        this.c = 0;
        this.e = 0;
        this.f = null;
        this.g = null;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        if (this.c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.e);
        if (this.e > 0) {
            parcel.writeIntArray(this.f);
        }
        parcel.writeInt((int)(this.h ? 1 : 0));
        parcel.writeInt((int)(this.i ? 1 : 0));
        parcel.writeInt((int)(this.j ? 1 : 0));
        parcel.writeList(this.g);
    }
}
