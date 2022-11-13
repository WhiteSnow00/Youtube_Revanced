import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class imj extends ilp
{
    private final Context a;
    
    public imj(final atke atke, final Context a) {
        super(atke, (Class)amhi.class);
        this.a = a;
    }
    
    protected final /* bridge */ Object a(final aaeh aaeh, final afev afev) {
        while (true) {
            for (final aabf aabf : aaeh.l().j()) {
                aabf.getClass();
                final aabe j = aabf.j;
                if (j != null && j.a() > 0L) {
                    final int n = (int)TimeUnit.SECONDS.toDays(j.a());
                    if (n > 0) {
                        final ahaz builder = ((ahbh)amhk.a).createBuilder();
                        final ajut g = acak.g(new String[] { this.a.getResources().getQuantityString(2131886121, n, new Object[] { n }) });
                        builder.copyOnWrite();
                        final amhk amhk = (amhk)builder.instance;
                        g.getClass();
                        amhk.c = g;
                        amhk.b |= 0x1;
                        final amhk c = (amhk)builder.build();
                        final ahaz builder2 = ((ahbh)amhi.a).createBuilder();
                        final ahaz builder3 = ((ahbh)amhl.a).createBuilder();
                        builder3.copyOnWrite();
                        final amhl amhl = (amhl)builder3.instance;
                        c.getClass();
                        amhl.c = c;
                        amhl.b |= 0x1;
                        builder2.copyOnWrite();
                        final amhi amhi = (amhi)builder2.instance;
                        final amhl f = (amhl)builder3.build();
                        f.getClass();
                        amhi.f = f;
                        amhi.b |= 0x2;
                        final ahaz builder4 = ((ahbh)amhj.a).createBuilder();
                        builder4.copyOnWrite();
                        final amhj amhj = (amhj)builder4.instance;
                        amhj.c = 2;
                        amhj.b |= 0x1;
                        builder2.copyOnWrite();
                        final amhi amhi2 = (amhi)builder2.instance;
                        final amhj g2 = (amhj)builder4.build();
                        g2.getClass();
                        amhi2.g = g2;
                        amhi2.b |= 0x20;
                        return builder2.build();
                    }
                    return null;
                }
            }
            final int n = -1;
            continue;
        }
    }
    
    protected final /* bridge */ Object f() {
        return null;
    }
}
