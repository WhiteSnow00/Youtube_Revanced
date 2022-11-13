// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class InternalFrame extends Id3Frame
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    
    static {
        CREATOR = (Parcelable$Creator)new app(18);
    }
    
    public InternalFrame(final Parcel parcel) {
        super("----");
        final String string = parcel.readString();
        final int a = bax.a;
        this.a = string;
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
    
    public InternalFrame(final String a, final String b, final String c) {
        super("----");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final InternalFrame internalFrame = (InternalFrame)o;
                if (bax.aa((Object)this.b, (Object)internalFrame.b) && bax.aa((Object)this.a, (Object)internalFrame.a) && bax.aa((Object)this.c, (Object)internalFrame.c)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String b = this.b;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return ((hashCode2 + 527) * 31 + hashCode3) * 31 + hashCode;
    }
    
    public final String toString() {
        final String f = this.f;
        final String a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append(f);
        sb.append(": domain=");
        sb.append(a);
        sb.append(", description=");
        sb.append(b);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.f);
        parcel.writeString(this.a);
        parcel.writeString(this.c);
    }
}
