// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class UrlLinkFrame extends Id3Frame
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    
    static {
        CREATOR = (Parcelable$Creator)new bvm(0);
    }
    
    public UrlLinkFrame(final Parcel parcel) {
        final String string = parcel.readString();
        final int a = bax.a;
        super(string);
        this.a = parcel.readString();
        this.b = parcel.readString();
    }
    
    public UrlLinkFrame(final String s, final String a, final String b) {
        super(s);
        this.a = a;
        this.b = b;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final UrlLinkFrame urlLinkFrame = (UrlLinkFrame)o;
                if (this.f.equals(urlLinkFrame.f) && bax.aa((Object)this.a, (Object)urlLinkFrame.a) && bax.aa((Object)this.b, (Object)urlLinkFrame.b)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        final int hashCode = this.f.hashCode();
        final String a = this.a;
        int hashCode2 = 0;
        int hashCode3;
        if (a != null) {
            hashCode3 = a.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String b = this.b;
        if (b != null) {
            hashCode2 = b.hashCode();
        }
        return ((hashCode + 527) * 31 + hashCode3) * 31 + hashCode2;
    }
    
    public final String toString() {
        final String f = this.f;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append(f);
        sb.append(": url=");
        sb.append(b);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.f);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
