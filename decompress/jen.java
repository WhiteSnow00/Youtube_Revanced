import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jen extends abfo implements abgk
{
    private final aaxx a;
    private final aln c;
    
    public jen(final aaxx a, final aln c, final byte[] array, final byte[] array2) {
        this.a = a;
        this.c = c;
    }
    
    public final void a(final WatchNextResponseModel watchNextResponseModel) {
        if (watchNextResponseModel == null) {
            return;
        }
        final anjb g = watchNextResponseModel.g;
        if (g == null) {
            return;
        }
        if (this.a.a() != null) {
            this.a.a().D((wzz)new wyt(xaa.c(6192)));
        }
        final afel d = afeq.d();
        final Iterator<Object> iterator = ((List<Object>)g.i).iterator();
        int n = -1;
        int n2 = 0;
        while (iterator.hasNext()) {
            final anja anja = iterator.next();
            if ((anja.b & 0x1) != 0x0) {
                anjf anjf;
                if ((anjf = anja.c) == null) {
                    anjf = anjf.a;
                }
                final boolean m = anjf.m;
                int n3 = n;
                if (m) {
                    n3 = n2;
                }
                if (!m) {
                    n = n3;
                    if ((anjf.b & 0x800) != 0x0) {
                        continue;
                    }
                }
                final aln c = this.c;
                aiqj aiqj;
                if ((aiqj = anjf.n) == null) {
                    aiqj = aiqj.a;
                }
                d.h((Object)c.s(aiqj));
                ++n2;
                n = n3;
            }
        }
        final jem jem = new jem(d.g(), n);
        final afeq a = jem.a;
        if (!((List)a).isEmpty()) {
            final int max = Math.max(0, jem.b);
            final int i = this.i(0);
            this.c(i, (Collection)a);
            this.u(0, 0, i);
            this.b(max);
        }
    }
}
