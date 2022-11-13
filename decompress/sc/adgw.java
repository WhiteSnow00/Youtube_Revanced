import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adgw implements tua
{
    private final adhe a;
    private final vai b;
    private final afaj c;
    
    public adgw(final afaj c, final vai b, final adhe a, final byte[] array) {
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
        final ahaz builder = ((ahbh)ailo.a).createBuilder();
        final ahaz builder2 = ((ahbh)ailq.a).createBuilder();
        builder2.copyOnWrite();
        final ailq ailq = (ailq)builder2.instance;
        ailq.c = 28;
        ailq.b |= 0x1;
        final ailq c = (ailq)builder2.build();
        builder.copyOnWrite();
        final ailo ailo = (ailo)builder.instance;
        c.getClass();
        ailo.c = c;
        ailo.b |= 0x1;
        final ahaz builder3 = ((ahbh)ailt.a).createBuilder();
        builder3.copyOnWrite();
        final ailt ailt = (ailt)builder3.instance;
        ailt.d = 1;
        ailt.b |= 0x2;
        builder3.copyOnWrite();
        final ailt ailt2 = (ailt)builder3.instance;
        format.getClass();
        ailt2.b |= 0x1;
        ailt2.c = format;
        final ailt e = (ailt)builder3.build();
        builder.copyOnWrite();
        final ailo ailo2 = (ailo)builder.instance;
        e.getClass();
        ailo2.e = e;
        ailo2.b |= 0x4;
        if (ex != null) {
            Throwable a = ex;
            if (zls.b((Throwable)ex)) {
                a = zls.a((Throwable)ex);
            }
            final ahaz builder4 = ((ahbh)ailr.a).createBuilder();
            final ahaz builder5 = ((ahbh)ailm.a).createBuilder();
            final ahab byteString = ((agzk)afse.b(a).build()).toByteString();
            builder5.copyOnWrite();
            final ailm ailm = (ailm)builder5.instance;
            ailm.b |= 0x1;
            ailm.c = byteString;
            final ailm c2 = (ailm)builder5.build();
            builder4.copyOnWrite();
            final ailr ailr = (ailr)builder4.instance;
            c2.getClass();
            ailr.c = c2;
            ailr.b = 2;
            builder.copyOnWrite();
            final ailo ailo3 = (ailo)builder.instance;
            final ailr d = (ailr)builder4.build();
            d.getClass();
            ailo3.d = d;
            ailo3.b |= 0x2;
        }
        this.c.i((ailo)builder.build());
    }
    
    public final void a(final String s, final Exception ex) {
        this.c(null, null, s, ex);
    }
    
    public final void b(final String s, final String s2, final String s3, final Exception ex) {
        this.c(s, s2, s3, ex);
    }
}
