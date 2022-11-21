// 
// Decompiled by Procyon v0.6.0
// 

package androidx.activity.result;

import android.os.Parcel;
import android.content.Intent;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class ActivityResult implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final Intent b;
    
    static {
        CREATOR = (Parcelable$Creator)new cko(1);
    }
    
    public ActivityResult(final int a, final Intent b) {
        this.a = a;
        this.b = b;
    }
    
    public ActivityResult(final Parcel parcel) {
        this.a = parcel.readInt();
        Intent b;
        if (parcel.readInt() == 0) {
            b = null;
        }
        else {
            b = (Intent)Intent.CREATOR.createFromParcel(parcel);
        }
        this.b = b;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        final int a = this.a;
        String value;
        if (a != -1) {
            if (a != 0) {
                value = String.valueOf(a);
            }
            else {
                value = "RESULT_CANCELED";
            }
        }
        else {
            value = "RESULT_OK";
        }
        sb.append(value);
        sb.append(", data=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        int n2;
        if (this.b == null) {
            n2 = 0;
        }
        else {
            n2 = 1;
        }
        parcel.writeInt(n2);
        final Intent b = this.b;
        if (b != null) {
            b.writeToParcel(parcel, n);
        }
    }
}
