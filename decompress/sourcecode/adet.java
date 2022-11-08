import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adet implements trw
{
    private final adfb a;
    private final uyi b;
    private final aeyk c;
    
    public adet(final aeyk c, final uyi b, final adfb a, final byte[] array) {
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
        final agza builder = ((agzi)aijq.a).createBuilder();
        final agza builder2 = ((agzi)aijs.a).createBuilder();
        builder2.copyOnWrite();
        final aijs aijs = (aijs)builder2.instance;
        aijs.c = 28;
        aijs.b |= 0x1;
        final aijs c = (aijs)builder2.build();
        builder.copyOnWrite();
        final aijq aijq = (aijq)builder.instance;
        c.getClass();
        aijq.c = c;
        aijq.b |= 0x1;
        final agza builder3 = ((agzi)aijv.a).createBuilder();
        builder3.copyOnWrite();
        final aijv aijv = (aijv)builder3.instance;
        aijv.d = 1;
        aijv.b |= 0x2;
        builder3.copyOnWrite();
        final aijv aijv2 = (aijv)builder3.instance;
        format.getClass();
        aijv2.b |= 0x1;
        aijv2.c = format;
        final aijv e = (aijv)builder3.build();
        builder.copyOnWrite();
        final aijq aijq2 = (aijq)builder.instance;
        e.getClass();
        aijq2.e = e;
        aijq2.b |= 0x4;
        if (ex != null) {
            Throwable a = ex;
            if (zjv.b((Throwable)ex)) {
                a = zjv.a((Throwable)ex);
            }
            final agza builder4 = ((agzi)aijt.a).createBuilder();
            final agza builder5 = ((agzi)aijo.a).createBuilder();
            final agyc byteString = ((agxl)afqg.c(a).build()).toByteString();
            builder5.copyOnWrite();
            final aijo aijo = (aijo)builder5.instance;
            aijo.b |= 0x1;
            aijo.c = byteString;
            final aijo c2 = (aijo)builder5.build();
            builder4.copyOnWrite();
            final aijt aijt = (aijt)builder4.instance;
            c2.getClass();
            aijt.c = c2;
            aijt.b = 2;
            builder.copyOnWrite();
            final aijq aijq3 = (aijq)builder.instance;
            final aijt d = (aijt)builder4.build();
            d.getClass();
            aijq3.d = d;
            aijq3.b |= 0x2;
        }
        this.c.i((aijq)builder.build());
    }
    
    public final void a(final String s, final Exception ex) {
        this.c(null, null, s, ex);
    }
    
    public final void b(final String s, final String s2, final String s3, final Exception ex) {
        this.c(s, s2, s3, ex);
    }
}
