// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final float b;
    public Object c;
    
    static {
        CREATOR = (Parcelable$Creator)new aw(8);
    }
    
    public RatingCompat(final int a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    public final int describeContents() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.a);
        sb.append(" rating=");
        final float b = this.b;
        String value;
        if (b < 0.0f) {
            value = "unrated";
        }
        else {
            value = String.valueOf(b);
        }
        sb.append(value);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
