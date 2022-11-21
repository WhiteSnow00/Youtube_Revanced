// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class FragmentManager$LaunchedFragmentInfo implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final int b;
    
    static {
        CREATOR = (Parcelable$Creator)new aw(2);
    }
    
    public FragmentManager$LaunchedFragmentInfo(final Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
    }
    
    public FragmentManager$LaunchedFragmentInfo(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
