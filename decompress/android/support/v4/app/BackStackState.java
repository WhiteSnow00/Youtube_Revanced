// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.app;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class BackStackState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final List a;
    final List b;
    
    static {
        CREATOR = (Parcelable$Creator)new aw(0);
    }
    
    public BackStackState(final Parcel parcel) {
        this.a = parcel.createStringArrayList();
        this.b = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeStringList(this.a);
        parcel.writeTypedList(this.b);
    }
}
