// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.scte35;

import java.util.ArrayList;
import android.os.Parcel;
import java.util.Collections;
import java.util.List;
import android.os.Parcelable$Creator;

public final class SpliceInsertCommand extends SpliceCommand
{
    public static final Parcelable$Creator CREATOR;
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final List h;
    public final boolean i;
    public final long j;
    public final int k;
    public final int l;
    public final int m;
    
    static {
        CREATOR = (Parcelable$Creator)new bvp(6);
    }
    
    public SpliceInsertCommand(final long a, final boolean b, final boolean c, final boolean d, final boolean e, final long f, final long g, final List list, final boolean i, final long j, final int k, final int l, final int m) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = Collections.unmodifiableList((List<?>)list);
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    public SpliceInsertCommand(final Parcel parcel) {
        this.a = parcel.readLong();
        final byte byte1 = parcel.readByte();
        final boolean b = false;
        this.b = (byte1 == 1);
        this.c = (parcel.readByte() == 1);
        this.d = (parcel.readByte() == 1);
        this.e = (parcel.readByte() == 1);
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        final int int1 = parcel.readInt();
        final ArrayList list = new ArrayList(int1);
        for (int i = 0; i < int1; ++i) {
            list.add((Object)new bvr(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.h = Collections.unmodifiableList((List<?>)list);
        boolean j = b;
        if (parcel.readByte() == 1) {
            j = true;
        }
        this.i = j;
        this.j = parcel.readLong();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeByte((byte)(byte)(this.b ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.c ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.d ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.e ? 1 : 0));
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        final int size = this.h.size();
        parcel.writeInt(size);
        bvr bvr;
        for (i = 0; i < size; ++i) {
            bvr = this.h.get(i);
            parcel.writeInt(bvr.a);
            parcel.writeLong(bvr.b);
            parcel.writeLong(bvr.c);
        }
        parcel.writeByte((byte)(byte)(this.i ? 1 : 0));
        parcel.writeLong(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
    }
}
