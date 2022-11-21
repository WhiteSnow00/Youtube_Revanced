import java.util.ArrayList;
import androidx.media3.common.StreamKey;
import java.util.Collections;
import java.util.Collection;
import java.util.LinkedList;
import java.io.InputStream;
import android.net.Uri;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bmu implements brt
{
    private final brt a;
    private final List b;
    
    public bmu(final brt a, final List b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final /* bridge */ Object a(final Uri uri, final InputStream inputStream) {
        final bjk f = ((bjm)this.a).f(uri, inputStream);
        final List b = this.b;
        if (b != null && !b.isEmpty()) {
            final LinkedList list = new LinkedList(this.b);
            Collections.sort((List<Comparable>)list);
            list.add(new StreamKey());
            final ArrayList list2 = new ArrayList();
            int i = 0;
            long n = 0L;
            while (i < f.a()) {
                if (list.peek().a != i) {
                    final long b2 = f.b(i);
                    long n2 = n;
                    if (b2 != -9223372036854775807L) {
                        n2 = n + b2;
                    }
                    n = n2;
                }
                else {
                    final adix d = f.d(i);
                    final Object d2 = d.d;
                    StreamKey streamKey = list.poll();
                    final int a = streamKey.a;
                    final ArrayList<bji> list3 = new ArrayList<bji>();
                    while (true) {
                        final int b3 = streamKey.b;
                        final bji bji = ((List<bji>)d2).get(b3);
                        final List c = bji.c;
                        final ArrayList<bjs> list4 = new ArrayList<bjs>();
                        do {
                            list4.add(c.get(streamKey.c));
                            streamKey = list.poll();
                        } while (streamKey.a == a && streamKey.b == b3);
                        list3.add(new bji(bji.a, bji.b, (List)list4, bji.d, bji.e, bji.f));
                        if (streamKey.a != a) {
                            break;
                        }
                    }
                    list.addFirst(streamKey);
                    list2.add(new adix((String)d.c, d.a - n, list3, (List)d.b));
                }
                ++i;
            }
            final long b4 = f.b;
            long n3;
            if (b4 != -9223372036854775807L) {
                n3 = b4 - n;
            }
            else {
                n3 = -9223372036854775807L;
            }
            return new bjk(f.a, n3, f.c, f.d, f.e, f.f, f.g, f.h, f.l, f.i, f.j, f.k, (List)list2);
        }
        return f;
    }
}
