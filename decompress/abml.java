import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abml implements asmn
{
    public final long a;
    public final Object b;
    private final int c;
    
    public abml(final abmo b, final long a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public abml(final ilu b, final long a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Object a(final Object o) {
        if (this.c != 0) {
            final Object b = this.b;
            final long a = this.a;
            final amyg amyg = (amyg)o;
            amyg.getClass();
            final int n = (int)TimeUnit.SECONDS.toDays(amyg.getExpirationTimestamp() - a);
            final ahcr builder = amjn.a.createBuilder();
            final ajws g = acbu.g(new String[] { ((ilu)b).a.getResources().getQuantityString(2131886121, n, new Object[] { n }) });
            builder.copyOnWrite();
            final amjn amjn = (amjn)builder.instance;
            g.getClass();
            amjn.c = g;
            amjn.b |= 0x1;
            final amjn c = (amjn)builder.build();
            final ahcr builder2 = amjl.a.createBuilder();
            final ahcr builder3 = amjo.a.createBuilder();
            builder3.copyOnWrite();
            final amjo amjo = (amjo)builder3.instance;
            c.getClass();
            amjo.c = c;
            amjo.b |= 0x1;
            builder2.copyOnWrite();
            final amjl amjl = (amjl)builder2.instance;
            final amjo f = (amjo)builder3.build();
            f.getClass();
            amjl.f = f;
            amjl.b |= 0x2;
            final ahcr builder4 = amjm.a.createBuilder();
            builder4.copyOnWrite();
            final amjm amjm = (amjm)builder4.instance;
            amjm.c = 2;
            amjm.b |= 0x1;
            builder2.copyOnWrite();
            final amjl amjl2 = (amjl)builder2.instance;
            final amjm g2 = (amjm)builder4.build();
            g2.getClass();
            amjl2.g = g2;
            amjl2.b |= 0x20;
            return builder2.build();
        }
        final Object b2 = this.b;
        final long a2 = this.a;
        final PlayerResponseModel playerResponseModel = (PlayerResponseModel)o;
        final abmo abmo = (abmo)b2;
        return abmo.g.P(abmo.f).B((asmo)new uti(playerResponseModel, 9)).aj().J(aaqs.s).T(a2, TimeUnit.MILLISECONDS, asla.I(true));
    }
}
