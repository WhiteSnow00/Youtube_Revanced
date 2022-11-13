import java.util.List;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTable;
import java.util.ArrayList;
import androidx.media3.common.Metadata;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bvh extends bvg
{
    @Override
    protected final Metadata b(final bvf bvf, final ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        final atim atim = new atim(byteBuffer.array(), byteBuffer.limit());
        atim.o(12);
        final int g = atim.g(12);
        final int e = atim.e();
        atim.o(44);
        atim.p(atim.g(12));
        atim.o(16);
        final ArrayList list = new ArrayList();
        while (atim.e() < e + g - 4) {
            atim.o(48);
            final int g2 = atim.g(8);
            atim.o(4);
            final int n = atim.e() + atim.g(12);
            String s = null;
            String s2 = null;
            while (atim.e() < n) {
                final int g3 = atim.g(8);
                final int g4 = atim.g(8);
                final int n2 = atim.e() + g4;
                String s3;
                String h;
                if (g3 == 2) {
                    final int g5 = atim.g(16);
                    atim.o(8);
                    s3 = s;
                    h = s2;
                    if (g5 == 3) {
                        while (true) {
                            s3 = s;
                            h = s2;
                            if (atim.e() >= n2) {
                                break;
                            }
                            final String h2 = atim.h(atim.g(8), aeza.a);
                            final int g6 = atim.g(8);
                            int n3 = 0;
                            while (true) {
                                s = h2;
                                if (n3 >= g6) {
                                    break;
                                }
                                atim.p(atim.g(8));
                                ++n3;
                            }
                        }
                    }
                }
                else {
                    s3 = s;
                    h = s2;
                    if (g3 == 21) {
                        h = atim.h(g4, aeza.a);
                        s3 = s;
                    }
                }
                atim.m(n2 * 8);
                s = s3;
                s2 = h;
            }
            atim.m(n * 8);
            if (s != null && s2 != null) {
                list.add(new AppInfoTable(g2, s.concat(s2)));
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return new Metadata((List)list);
    }
}
