// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.media3.common.Metadata$Entry;

@Deprecated
public class VorbisComment implements Metadata$Entry
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    
    static {
        CREATOR = (Parcelable$Creator)new apo(9);
    }
    
    public VorbisComment(final Parcel parcel) {
        final String string = parcel.readString();
        final int a = baw.a;
        this.a = string;
        this.b = parcel.readString();
    }
    
    public VorbisComment(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final ayv ayv) {
        final String a = this.a;
        int n = 0;
        Label_0135: {
            switch (a.hashCode()) {
                case 1939198791: {
                    if (a.equals("ARTIST")) {
                        n = 1;
                        break Label_0135;
                    }
                    break;
                }
                case 1746739798: {
                    if (a.equals("ALBUMARTIST")) {
                        n = 3;
                        break Label_0135;
                    }
                    break;
                }
                case 428414940: {
                    if (a.equals("DESCRIPTION")) {
                        n = 4;
                        break Label_0135;
                    }
                    break;
                }
                case 79833656: {
                    if (a.equals("TITLE")) {
                        n = 0;
                        break Label_0135;
                    }
                    break;
                }
                case 62359119: {
                    if (a.equals("ALBUM")) {
                        n = 2;
                        break Label_0135;
                    }
                    break;
                }
            }
            n = -1;
        }
        if (n == 0) {
            ayv.a = this.b;
            return;
        }
        if (n == 1) {
            ayv.b = this.b;
            return;
        }
        if (n == 2) {
            ayv.c = this.b;
            return;
        }
        if (n == 3) {
            ayv.d = this.b;
            return;
        }
        if (n != 4) {
            return;
        }
        ayv.e = this.b;
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
                final VorbisComment vorbisComment = (VorbisComment)o;
                if (this.a.equals(vorbisComment.a) && this.b.equals(vorbisComment.b)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() + 527) * 31 + this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder("VC: ");
        sb.append(a);
        sb.append("=");
        sb.append(b);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
