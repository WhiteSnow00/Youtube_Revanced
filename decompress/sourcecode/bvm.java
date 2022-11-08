import androidx.media3.common.Metadata$Entry;
import androidx.media3.extractor.metadata.scte35.SpliceNullCommand;
import androidx.media3.extractor.metadata.scte35.PrivateCommand;
import androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand;
import java.util.List;
import androidx.media3.extractor.metadata.scte35.SpliceInsertCommand;
import java.util.ArrayList;
import java.util.Collections;
import androidx.media3.extractor.metadata.scte35.TimeSignalCommand;
import androidx.media3.common.Metadata;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bvm extends bvf
{
    private final bar a;
    private bav b;
    private final athu c;
    
    public bvm() {
        this.a = new bar();
        this.c = new athu((byte[])null);
    }
    
    protected final Metadata b(final bve bve, final ByteBuffer byteBuffer) {
        final bav b = this.b;
        if (b == null || bve.g != b.e()) {
            (this.b = new bav(bve.e)).a(bve.e - bve.g);
        }
        final byte[] array = byteBuffer.array();
        final int limit = byteBuffer.limit();
        this.a.E(array, limit);
        this.c.l(array, limit);
        this.c.o(39);
        final long n = (long)this.c.g(1) << 32 | (long)this.c.g(32);
        this.c.o(20);
        final int g = this.c.g(12);
        final int g2 = this.c.g(8);
        this.a.H(14);
        Object o;
        if (g2 != 0) {
            if (g2 != 255) {
                if (g2 != 4) {
                    if (g2 != 5) {
                        if (g2 != 6) {
                            o = null;
                        }
                        else {
                            final bar a = this.a;
                            final bav b2 = this.b;
                            final long d = TimeSignalCommand.d(a, n);
                            o = new TimeSignalCommand(d, b2.b(d));
                        }
                    }
                    else {
                        final bar a2 = this.a;
                        final bav b3 = this.b;
                        final long q = a2.q();
                        final boolean b4 = (a2.i() & 0x80) != 0x0;
                        List<bvn> emptyList = Collections.emptyList();
                        boolean b5;
                        boolean b6;
                        boolean b7;
                        long d2;
                        boolean b8;
                        long n3;
                        int m;
                        int i2;
                        int i3;
                        if (!b4) {
                            final int i = a2.i();
                            b5 = ((i & 0x80) != 0x0);
                            b6 = ((i & 0x40) != 0x0);
                            b7 = ((i & 0x10) != 0x0);
                            if (b6 && !b7) {
                                d2 = TimeSignalCommand.d(a2, n);
                            }
                            else {
                                d2 = -9223372036854775807L;
                            }
                            if (!b6) {
                                final int j = a2.i();
                                emptyList = new ArrayList<bvn>(j);
                                for (int k = 0; k < j; ++k) {
                                    final int l = a2.i();
                                    long d3;
                                    if (!b7) {
                                        d3 = TimeSignalCommand.d(a2, n);
                                    }
                                    else {
                                        d3 = -9223372036854775807L;
                                    }
                                    emptyList.add(new bvn(l, d3, b3.b(d3)));
                                }
                            }
                            if ((i & 0x20) != 0x0) {
                                final long n2 = a2.i();
                                b8 = ((0x80L & n2) != 0x0L);
                                n3 = ((n2 & 0x1L) << 32 | a2.q()) * 1000L / 90L;
                            }
                            else {
                                b8 = false;
                                n3 = -9223372036854775807L;
                            }
                            m = a2.m();
                            i2 = a2.i();
                            i3 = a2.i();
                        }
                        else {
                            d2 = -9223372036854775807L;
                            b5 = false;
                            b6 = false;
                            b7 = false;
                            b8 = false;
                            n3 = -9223372036854775807L;
                            m = 0;
                            i2 = 0;
                            i3 = 0;
                        }
                        o = new SpliceInsertCommand(q, b4, b5, b6, b7, d2, b3.b(d2), (List)emptyList, b8, n3, m, i2, i3);
                    }
                }
                else {
                    final bar a3 = this.a;
                    final int i4 = a3.i();
                    final ArrayList list = new ArrayList<bvo>(i4);
                    for (int n4 = 0; n4 < i4; ++n4) {
                        list.add(bvo.b(a3));
                    }
                    o = new SpliceScheduleCommand((List)list);
                }
            }
            else {
                final bar a4 = this.a;
                final long q2 = a4.q();
                final int n5 = g - 4;
                final byte[] array2 = new byte[n5];
                a4.B(array2, 0, n5);
                o = new PrivateCommand(q2, array2, n);
            }
        }
        else {
            o = new SpliceNullCommand();
        }
        Metadata metadata;
        if (o == null) {
            metadata = new Metadata(new Metadata$Entry[0]);
        }
        else {
            metadata = new Metadata(new Metadata$Entry[] { (Metadata$Entry)o });
        }
        return metadata;
    }
}
