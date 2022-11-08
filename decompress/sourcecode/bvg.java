import java.util.List;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTable;
import java.util.ArrayList;
import androidx.media3.common.Metadata;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bvg extends bvf
{
    protected final Metadata b(final bve bve, final ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        final athu athu = new athu(byteBuffer.array(), byteBuffer.limit());
        athu.o(12);
        final int g = athu.g(12);
        final int e = athu.e();
        athu.o(44);
        athu.p(athu.g(12));
        athu.o(16);
        final ArrayList list = new ArrayList();
        while (athu.e() < e + g - 4) {
            athu.o(48);
            final int g2 = athu.g(8);
            athu.o(4);
            final int n = athu.e() + athu.g(12);
            String s2;
            String s = s2 = null;
            while (athu.e() < n) {
                final int g3 = athu.g(8);
                final int g4 = athu.g(8);
                final int n2 = athu.e() + g4;
                String s3;
                String h;
                if (g3 == 2) {
                    final int g5 = athu.g(16);
                    athu.o(8);
                    s3 = s;
                    if (g5 != 3) {
                        s3 = s;
                        h = s2;
                    }
                    else {
                        while (true) {
                            h = s2;
                            if (athu.e() >= n2) {
                                break;
                            }
                            final String h2 = athu.h(athu.g(8), aexb.a);
                            final int g6 = athu.g(8);
                            int n3 = 0;
                            while (true) {
                                s3 = h2;
                                if (n3 >= g6) {
                                    break;
                                }
                                athu.p(athu.g(8));
                                ++n3;
                            }
                        }
                    }
                }
                else {
                    s3 = s;
                    h = s2;
                    if (g3 == 21) {
                        h = athu.h(g4, aexb.a);
                        s3 = s;
                    }
                }
                athu.m(n2 * 8);
                s = s3;
                s2 = h;
            }
            athu.m(n * 8);
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
