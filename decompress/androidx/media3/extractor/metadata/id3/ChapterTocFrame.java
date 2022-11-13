// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.id3;

import android.os.Parcelable;
import java.util.Arrays;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class ChapterTocFrame extends Id3Frame
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String[] d;
    private final Id3Frame[] e;
    
    static {
        CREATOR = (Parcelable$Creator)new app(15);
    }
    
    public ChapterTocFrame(final Parcel parcel) {
        super("CTOC");
        final String string = parcel.readString();
        final int a = bax.a;
        this.a = string;
        final byte byte1 = parcel.readByte();
        final boolean b = true;
        int i = 0;
        this.b = (byte1 != 0);
        this.c = (parcel.readByte() != 0 && b);
        this.d = (String[])bax.L((Object)parcel.createStringArray());
        final int int1 = parcel.readInt();
        this.e = new Id3Frame[int1];
        while (i < int1) {
            this.e[i] = (Id3Frame)parcel.readParcelable(Id3Frame.class.getClassLoader());
            ++i;
        }
    }
    
    public ChapterTocFrame(final String a, final boolean b, final boolean c, final String[] d, final Id3Frame[] e) {
        super("CTOC");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final ChapterTocFrame chapterTocFrame = (ChapterTocFrame)o;
                if (this.b == chapterTocFrame.b && this.c == chapterTocFrame.c && bax.aa((Object)this.a, (Object)chapterTocFrame.a) && Arrays.equals(this.d, chapterTocFrame.d) && Arrays.equals(this.e, chapterTocFrame.e)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        final int b = this.b ? 1 : 0;
        final int c = this.c ? 1 : 0;
        final String a = this.a;
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        return ((b + 527) * 31 + c) * 31 + hashCode;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByte((byte)(byte)(this.b ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.c ? 1 : 0));
        parcel.writeStringArray(this.d);
        parcel.writeInt(this.e.length);
        final Id3Frame[] e = this.e;
        int length;
        for (length = e.length, i = 0; i < length; ++i) {
            parcel.writeParcelable((Parcelable)e[i], 0);
        }
    }
}
