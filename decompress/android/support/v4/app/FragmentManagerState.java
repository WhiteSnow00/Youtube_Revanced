// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.app;

import java.util.List;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class FragmentManagerState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public ArrayList a;
    public ArrayList b;
    public BackStackRecordState[] c;
    public int d;
    public String e;
    public ArrayList f;
    public ArrayList g;
    public ArrayList h;
    
    static {
        CREATOR = (Parcelable$Creator)new aw(3);
    }
    
    public FragmentManagerState() {
        this.e = null;
        this.f = new ArrayList();
        this.g = new ArrayList();
    }
    
    public FragmentManagerState(final Parcel parcel) {
        this.e = null;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.a = parcel.createStringArrayList();
        this.b = parcel.createStringArrayList();
        this.c = (BackStackRecordState[])parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.d = parcel.readInt();
        this.e = parcel.readString();
        this.f = parcel.createStringArrayList();
        this.g = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.h = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeStringList((List)this.a);
        parcel.writeStringList((List)this.b);
        parcel.writeTypedArray((Parcelable[])this.c, n);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeStringList((List)this.f);
        parcel.writeTypedList((List)this.g);
        parcel.writeTypedList((List)this.h);
    }
}
