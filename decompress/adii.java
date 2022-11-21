import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adii implements tvc
{
    private final adit a;
    private final vbs b;
    private final afcb c;
    
    public adii(final afcb c, final vbs b, final adit a, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    private final void c(String format, String s, final String s2, final Exception ex) {
        if (!this.b.f(45353231L)) {
            return;
        }
        if (s != null && !"rpc-v1-browse".equals(this.a.a(s))) {
            return;
        }
        s = s2;
        if (ex != null) {
            s = ex.toString();
            final StringBuilder sb = new StringBuilder();
            sb.append(s2);
            sb.append(" Exception: ");
            sb.append(s);
            s = sb.toString();
        }
        format = String.format(Locale.US, "[%s] %s", format, s);
        final ahcr builder = ((ahcz)ainh.a).createBuilder();
        final ahcr builder2 = ((ahcz)ainj.a).createBuilder();
        builder2.copyOnWrite();
        final ainj ainj = (ainj)builder2.instance;
        ainj.c = 28;
        ainj.b |= 0x1;
        final ainj c = (ainj)builder2.build();
        builder.copyOnWrite();
        final ainh ainh = (ainh)builder.instance;
        c.getClass();
        ainh.c = c;
        ainh.b |= 0x1;
        final ahcr builder3 = ((ahcz)ainm.a).createBuilder();
        builder3.copyOnWrite();
        final ainm ainm = (ainm)builder3.instance;
        ainm.d = 1;
        ainm.b |= 0x2;
        builder3.copyOnWrite();
        final ainm ainm2 = (ainm)builder3.instance;
        format.getClass();
        ainm2.b |= 0x1;
        ainm2.c = format;
        final ainm e = (ainm)builder3.build();
        builder.copyOnWrite();
        final ainh ainh2 = (ainh)builder.instance;
        e.getClass();
        ainh2.e = e;
        ainh2.b |= 0x4;
        if (ex != null) {
            Throwable a = ex;
            if (znn.b((Throwable)ex)) {
                a = znn.a((Throwable)ex);
            }
            final ahcr builder4 = ((ahcz)aink.a).createBuilder();
            final ahcr builder5 = ((ahcz)ainf.a).createBuilder();
            final ahbt byteString = ((ahbc)aftz.s(a).build()).toByteString();
            builder5.copyOnWrite();
            final ainf ainf = (ainf)builder5.instance;
            ainf.b |= 0x1;
            ainf.c = byteString;
            final ainf c2 = (ainf)builder5.build();
            builder4.copyOnWrite();
            final aink aink = (aink)builder4.instance;
            c2.getClass();
            aink.c = c2;
            aink.b = 2;
            builder.copyOnWrite();
            final ainh ainh3 = (ainh)builder.instance;
            final aink d = (aink)builder4.build();
            d.getClass();
            ainh3.d = d;
            ainh3.b |= 0x2;
        }
        this.c.i((ainh)builder.build());
    }
    
    public final void a(final String s, final Exception ex) {
        this.c(null, null, s, ex);
    }
    
    public final void b(final String s, final String s2, final String s3, final Exception ex) {
        this.c(s, s2, s3, ex);
    }
}
