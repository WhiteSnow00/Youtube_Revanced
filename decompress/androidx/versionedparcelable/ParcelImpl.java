// 
// Decompiled by Procyon v0.6.0
// 

package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ParcelImpl implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final ckn a;
    
    static {
        CREATOR = (Parcelable$Creator)new ckk(0);
    }
    
    public ParcelImpl(final Parcel parcel) {
        this.a = new ckm(parcel).c();
    }
    
    public ParcelImpl(final ckn a) {
        this.a = a;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        new ckm(parcel).k(this.a);
    }
}
