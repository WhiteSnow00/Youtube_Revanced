import java.util.ArrayList;
import android.os.Parcel;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bvo
{
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final List f;
    public final boolean g;
    public final long h;
    public final int i;
    public final int j;
    public final int k;
    
    private bvo(final long a, final boolean b, final boolean c, final boolean d, final List list, final long e, final boolean g, final long h, final int i, final int j, final int k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = Collections.unmodifiableList((List<?>)list);
        this.e = e;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    private bvo(final Parcel parcel) {
        this.a = parcel.readLong();
        final byte byte1 = parcel.readByte();
        final boolean b = false;
        this.b = (byte1 == 1);
        this.c = (parcel.readByte() == 1);
        this.d = (parcel.readByte() == 1);
        final int int1 = parcel.readInt();
        final ArrayList list = new ArrayList<Object>(int1);
        for (int i = 0; i < int1; ++i) {
            list.add(new ynj(parcel.readInt(), parcel.readLong(), (short[])null));
        }
        this.f = Collections.unmodifiableList((List<?>)list);
        this.e = parcel.readLong();
        boolean g = b;
        if (parcel.readByte() == 1) {
            g = true;
        }
        this.g = g;
        this.h = parcel.readLong();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
    }
    
    private static bvo d(final Parcel parcel) {
        return new bvo(parcel);
    }
    
    private static bvo e(final bar bar) {
        final long q = bar.q();
        final boolean b = (bar.i() & 0x80) != 0x0;
        ArrayList<ynj> list = new ArrayList<ynj>();
        boolean b2;
        boolean b3;
        long q2;
        boolean b4;
        long n2;
        int m;
        int l;
        int i2;
        ArrayList<ynj> list2;
        if (!b) {
            final int i = bar.i();
            b2 = ((i & 0x80) != 0x0);
            b3 = ((i & 0x40) != 0x0);
            if (b3) {
                q2 = bar.q();
            }
            else {
                q2 = -9223372036854775807L;
            }
            if (!b3) {
                final int j = bar.i();
                list = new ArrayList<ynj>(j);
                for (int k = 0; k < j; ++k) {
                    list.add(new ynj(bar.i(), bar.q(), (short[])null));
                }
            }
            if ((i & 0x20) != 0x0) {
                final long n = bar.i();
                b4 = ((0x80L & n) != 0x0L);
                n2 = ((n & 0x1L) << 32 | bar.q()) * 1000L / 90L;
            }
            else {
                b4 = false;
                n2 = -9223372036854775807L;
            }
            m = bar.m();
            l = bar.i();
            i2 = bar.i();
            list2 = list;
        }
        else {
            list2 = list;
            b2 = false;
            q2 = -9223372036854775807L;
            b4 = false;
            n2 = -9223372036854775807L;
            m = 0;
            l = 0;
            i2 = 0;
            b3 = false;
        }
        return new bvo(q, b, b2, b3, list2, q2, b4, n2, m, l, i2);
    }
    
    private void f(final Parcel parcel) {
        parcel.writeLong(this.a);
        parcel.writeByte((byte)(byte)(this.b ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.c ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.d ? 1 : 0));
        final int size = this.f.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; ++i) {
            final ynj ynj = this.f.get(i);
            parcel.writeInt(ynj.b);
            parcel.writeLong(ynj.a);
        }
        parcel.writeLong(this.e);
        parcel.writeByte((byte)(byte)(this.g ? 1 : 0));
        parcel.writeLong(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
    }
}
