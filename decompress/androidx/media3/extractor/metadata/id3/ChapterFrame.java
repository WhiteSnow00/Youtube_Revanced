// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.id3;

import android.os.Parcelable;
import java.util.Arrays;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class ChapterFrame extends Id3Frame
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    private final Id3Frame[] g;
    
    static {
        CREATOR = (Parcelable$Creator)new app(14);
    }
    
    public ChapterFrame(final Parcel parcel) {
        super("CHAP");
        final String string = parcel.readString();
        final int a = bax.a;
        this.a = string;
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        final int int1 = parcel.readInt();
        this.g = new Id3Frame[int1];
        for (int i = 0; i < int1; ++i) {
            this.g[i] = (Id3Frame)parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
    
    public ChapterFrame(final String a, final int b, final int c, final long d, final long e, final Id3Frame[] g) {
        super("CHAP");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final ChapterFrame chapterFrame = (ChapterFrame)o;
                if (this.b == chapterFrame.b && this.c == chapterFrame.c && this.d == chapterFrame.d && this.e == chapterFrame.e && bax.aa((Object)this.a, (Object)chapterFrame.a) && Arrays.equals(this.g, chapterFrame.g)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        final int b = this.b;
        final int c = this.c;
        final int n = (int)this.d;
        final int n2 = (int)this.e;
        final String a = this.a;
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        return ((((b + 527) * 31 + c) * 31 + n) * 31 + n2) * 31 + hashCode;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.g.length);
        final Id3Frame[] g = this.g;
        int length;
        for (length = g.length, i = 0; i < length; ++i) {
            parcel.writeParcelable((Parcelable)g[i], 0);
        }
    }
}
