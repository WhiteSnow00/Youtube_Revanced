// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.icy;

import java.util.Arrays;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.media3.common.Metadata$Entry;

public final class IcyInfo implements Metadata$Entry
{
    public static final Parcelable$Creator CREATOR;
    public final byte[] a;
    public final String b;
    public final String c;
    
    static {
        CREATOR = (Parcelable$Creator)new apo(11);
    }
    
    public IcyInfo(final Parcel parcel) {
        this.a = (byte[])dk.d((Object)parcel.createByteArray());
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
    
    public IcyInfo(final byte[] a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void b(final ayv ayv) {
        final String b = this.b;
        if (b != null) {
            ayv.a = b;
        }
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && Arrays.equals(this.a, ((IcyInfo)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.b, this.c, this.a.length);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeByteArray(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
