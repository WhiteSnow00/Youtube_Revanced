import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjo implements adkx
{
    public final adjv a;
    public final Uri b;
    public final boolean c;
    public final String d;
    
    public adjo(final adjv a, final Uri b, final boolean c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final admv a(final admv admv) {
        final adjv a = this.a;
        final Uri b = this.b;
        final boolean c = this.c;
        final String d = this.d;
        admv.getClass();
        final ahaz builder = ((ahbh)admv).toBuilder();
        final String string = b.toString();
        builder.copyOnWrite();
        final admv admv2 = (admv)builder.instance;
        string.getClass();
        admv2.b |= 0x4;
        admv2.g = string;
        final String string2 = b.toString();
        builder.copyOnWrite();
        final admv admv3 = (admv)builder.instance;
        string2.getClass();
        admv3.b |= 0x2;
        admv3.f = string2;
        if (c) {
            final adjz adjz = a.q.get(d);
            adjz.getClass();
            final adjy a2 = adjz.a();
            a2.d(d);
            a2.g(adjz.b);
            a2.e(adjz.c);
            a2.c(adjz.f);
            a.q.put(d, a2.a());
            a.p.remove(d);
            adkp.H(((admv)builder.instance).w);
            builder.copyOnWrite();
            final admv admv4 = (admv)builder.instance;
            admv4.b &= 0xFFFFFEFF;
            admv4.m = 0;
            builder.copyOnWrite();
            ((admv)builder.instance).X = ahbh.emptyProtobufList();
            builder.copyOnWrite();
            final admv admv5 = (admv)builder.instance;
            admv5.u = null;
            admv5.b &= 0xFFFBFFFF;
            builder.copyOnWrite();
            final admv admv6 = (admv)builder.instance;
            admv6.j = null;
            admv6.b &= 0xFFFFFFDF;
            builder.copyOnWrite();
            final admv admv7 = (admv)builder.instance;
            admv7.t = null;
            admv7.b &= 0xFFFDFFFF;
            builder.copyOnWrite();
            final admv admv8 = (admv)builder.instance;
            admv8.i = null;
            admv8.b &= 0xFFFFFFEF;
            builder.copyOnWrite();
            final admv admv9 = (admv)builder.instance;
            admv9.b &= 0xFFFFEFFF;
            admv9.o = admv.a.o;
            builder.copyOnWrite();
            final admv admv10 = (admv)builder.instance;
            admv10.b &= 0xFFFFDFFF;
            admv10.p = admv.a.p;
            builder.copyOnWrite();
            final admv admv11 = (admv)builder.instance;
            admv11.aw = null;
            admv11.d &= 0xFFFFF7FF;
            builder.copyOnWrite();
            final admv admv12 = (admv)builder.instance;
            admv12.d &= 0xFFFFEFFF;
            admv12.ax = admv.a.ax;
            builder.copyOnWrite();
            final admv admv13 = (admv)builder.instance;
            admv13.b &= 0xFFFFBFFF;
            admv13.q = false;
            builder.copyOnWrite();
            final admv admv14 = (admv)builder.instance;
            admv14.b &= 0xFFFF7FFF;
            admv14.r = 0L;
            builder.copyOnWrite();
            final admv admv15 = (admv)builder.instance;
            admv15.b &= 0xFFFEFFFF;
            admv15.s = false;
            builder.copyOnWrite();
            ((admv)builder.instance).ay = admv.emptyProtobufList();
            builder.copyOnWrite();
            final admv admv16 = (admv)builder.instance;
            admv16.d &= 0xFFFFDFFF;
            admv16.az = 0.0f;
        }
        return (admv)builder.build();
    }
}
