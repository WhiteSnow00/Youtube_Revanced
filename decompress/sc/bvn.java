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

public final class bvn extends bvg
{
    private final bas a;
    private baw b;
    private final atim c;
    
    public bvn() {
        this.a = new bas();
        this.c = new atim((byte[])null);
    }
    
    @Override
    protected final Metadata b(final bvf bvf, final ByteBuffer byteBuffer) {
        final baw b = this.b;
        if (b == null || bvf.g != b.e()) {
            (this.b = new baw(bvf.e)).a(bvf.e - bvf.g);
        }
        final byte[] array = byteBuffer.array();
        final int limit = byteBuffer.limit();
        this.a.E(array, limit);
        this.c.l(array, limit);
        this.c.o(39);
        final long n = this.c.g(1);
        final long n2 = this.c.g(32);
        this.c.o(20);
        int g = this.c.g(12);
        final int g2 = this.c.g(8);
        this.a.H(14);
        final long n3 = n << 32 | n2;
        Object o;
        if (g2 != 0) {
            if (g2 != 255) {
                if (g2 != 4) {
                    if (g2 != 5) {
                        if (g2 != 6) {
                            o = null;
                        }
                        else {
                            final bas a = this.a;
                            final baw b2 = this.b;
                            final long d = TimeSignalCommand.d(a, n3);
                            o = new TimeSignalCommand(d, b2.b(d));
                        }
                    }
                    else {
                        final bas a2 = this.a;
                        final baw b3 = this.b;
                        final long q = a2.q();
                        final int i = a2.i();
                        List<bvo> emptyList = Collections.emptyList();
                        final boolean b4 = (i & 0x80) != 0x0;
                        boolean b5;
                        long d2;
                        boolean b8;
                        long n5;
                        int m2;
                        int i2;
                        int i3;
                        boolean b10;
                        boolean b11;
                        if (!b4) {
                            final int j = a2.i();
                            b5 = ((j & 0x80) != 0x0);
                            final boolean b6 = (j & 0x40) != 0x0;
                            final boolean b7 = (j & 0x10) != 0x0;
                            if (b6 && !b7) {
                                d2 = TimeSignalCommand.d(a2, n3);
                            }
                            else {
                                d2 = -9223372036854775807L;
                            }
                            if (!b6) {
                                final int k = a2.i();
                                emptyList = new ArrayList<bvo>(k);
                                for (int l = 0; l < k; ++l) {
                                    final int m = a2.i();
                                    long d3;
                                    if (!b7) {
                                        d3 = TimeSignalCommand.d(a2, n3);
                                    }
                                    else {
                                        d3 = -9223372036854775807L;
                                    }
                                    emptyList.add(new bvo(m, d3, b3.b(d3)));
                                }
                            }
                            if ((j & 0x20) != 0x0) {
                                final long n4 = a2.i();
                                b8 = ((0x80L & n4) != 0x0L);
                                n5 = ((n4 & 0x1L) << 32 | a2.q()) * 1000L / 90L;
                            }
                            else {
                                b8 = false;
                                n5 = -9223372036854775807L;
                            }
                            m2 = a2.m();
                            i2 = a2.i();
                            i3 = a2.i();
                            final boolean b9 = b7;
                            b10 = b6;
                            b11 = b9;
                        }
                        else {
                            d2 = -9223372036854775807L;
                            b10 = false;
                            b11 = false;
                            b5 = false;
                            b8 = false;
                            n5 = -9223372036854775807L;
                            m2 = 0;
                            i2 = 0;
                            i3 = 0;
                        }
                        o = new SpliceInsertCommand(q, b4, b5, b10, b11, d2, b3.b(d2), emptyList, b8, n5, m2, i2, i3);
                    }
                }
                else {
                    final bas a3 = this.a;
                    final int i4 = a3.i();
                    final ArrayList list = new ArrayList<bvp>(i4);
                    for (int n6 = 0; n6 < i4; ++n6) {
                        list.add(bvp.b(a3));
                    }
                    o = new SpliceScheduleCommand(list);
                }
            }
            else {
                final bas a4 = this.a;
                final long q2 = a4.q();
                g -= 4;
                final byte[] array2 = new byte[g];
                a4.B(array2, 0, g);
                o = new PrivateCommand(q2, array2, n3);
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
