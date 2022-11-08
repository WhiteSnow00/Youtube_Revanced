// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.media3.common.Metadata$Entry;

public final class SmtaMetadataEntry implements Metadata$Entry
{
    public static final Parcelable$Creator CREATOR;
    public final float a;
    public final int b;
    
    static {
        CREATOR = (Parcelable$Creator)new bvl(4);
    }
    
    public SmtaMetadataEntry(final float a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public SmtaMetadataEntry(final Parcel parcel) {
        this.a = parcel.readFloat();
        this.b = parcel.readInt();
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
                final SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry)o;
                if (this.a == smtaMetadataEntry.a && this.b == smtaMetadataEntry.b) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (Float.valueOf(this.a).hashCode() + 527) * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final float a = this.a;
        final int b = this.b;
        final StringBuilder sb = new StringBuilder("smta: captureFrameRate=");
        sb.append(a);
        sb.append(", svcTemporalLayerCount=");
        sb.append(b);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeFloat(this.a);
        parcel.writeInt(this.b);
    }
}
