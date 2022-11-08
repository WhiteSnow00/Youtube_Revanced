// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.mp4;

import java.util.Arrays;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.media3.common.Metadata$Entry;

public final class MdtaMetadataEntry implements Metadata$Entry
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;
    
    static {
        CREATOR = (Parcelable$Creator)new bvl(2);
    }
    
    public MdtaMetadataEntry(final Parcel parcel) {
        final String string = parcel.readString();
        final int a = baw.a;
        this.a = string;
        this.b = (byte[])baw.L(parcel.createByteArray());
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }
    
    public MdtaMetadataEntry(final String a, final byte[] b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry)o;
                if (this.a.equals(mdtaMetadataEntry.a) && Arrays.equals(this.b, mdtaMetadataEntry.b) && this.c == mdtaMetadataEntry.c && this.d == mdtaMetadataEntry.d) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((this.a.hashCode() + 527) * 31 + Arrays.hashCode(this.b)) * 31 + this.c) * 31 + this.d;
    }
    
    @Override
    public final String toString() {
        return "mdta: key=".concat(String.valueOf(this.a));
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
