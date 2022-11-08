// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.emsg;

import java.util.Arrays;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.media3.common.Metadata$Entry;

public final class EventMessage implements Metadata$Entry
{
    public static final Parcelable$Creator CREATOR;
    private static final ayf f;
    private static final ayf g;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    private int h;
    
    static {
        final aye aye = new aye();
        aye.k = "application/id3";
        f = aye.a();
        final aye aye2 = new aye();
        aye2.k = "application/x-scte35";
        g = aye2.a();
        CREATOR = (Parcelable$Creator)new apo(7);
    }
    
    public EventMessage(final Parcel parcel) {
        final String string = parcel.readString();
        final int a = baw.a;
        this.a = string;
        this.b = parcel.readString();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = (byte[])baw.L(parcel.createByteArray());
    }
    
    public EventMessage(final String a, final String b, final long c, final long d, final byte[] e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final ayf a() {
        final String a = this.a;
        final int hashCode = a.hashCode();
        int n = 0;
        Label_0075: {
            if (hashCode != -1468477611) {
                if (hashCode != -795945609) {
                    if (hashCode == 1303648457) {
                        if (a.equals("https://developer.apple.com/streaming/emsg-id3")) {
                            n = 1;
                            break Label_0075;
                        }
                    }
                }
                else if (a.equals("https://aomedia.org/emsg/ID3")) {
                    n = 0;
                    break Label_0075;
                }
            }
            else if (a.equals("urn:scte:scte35:2014:bin")) {
                n = 2;
                break Label_0075;
            }
            n = -1;
        }
        if (n == 0 || n == 1) {
            return EventMessage.f;
        }
        if (n != 2) {
            return null;
        }
        return EventMessage.g;
    }
    
    public final byte[] c() {
        if (this.a() != null) {
            return this.e;
        }
        return null;
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
                final EventMessage eventMessage = (EventMessage)o;
                if (this.c == eventMessage.c && this.d == eventMessage.d && baw.aa(this.a, eventMessage.a) && baw.aa(this.b, eventMessage.b) && Arrays.equals(this.e, eventMessage.e)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int h;
        if ((h = this.h) == 0) {
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
            if (b != null) {
                hashCode = b.hashCode();
            }
            final long c = this.c;
            final long d = this.d;
            h = ((((hashCode2 + 527) * 31 + hashCode) * 31 + (int)(c ^ c >>> 32)) * 31 + (int)(d >>> 32 ^ d)) * 31 + Arrays.hashCode(this.e);
            this.h = h;
        }
        return h;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final long d = this.d;
        final long c = this.c;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder("EMSG: scheme=");
        sb.append(a);
        sb.append(", id=");
        sb.append(d);
        sb.append(", durationMs=");
        sb.append(c);
        sb.append(", value=");
        sb.append(b);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeByteArray(this.e);
    }
}
