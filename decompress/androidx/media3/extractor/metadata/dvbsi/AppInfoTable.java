// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.media3.common.Metadata$Entry;

public final class AppInfoTable implements Metadata$Entry
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final String b;
    
    static {
        CREATOR = (Parcelable$Creator)new apo(6);
    }
    
    public AppInfoTable(final int a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(a);
        sb.append(",url=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.b);
        parcel.writeInt(this.a);
    }
}
