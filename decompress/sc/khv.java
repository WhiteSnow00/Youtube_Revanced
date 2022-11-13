import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khv implements fvq
{
    public final Object a;
    public final ahbh b;
    private final int c;
    
    public khv(final jkz a, final aprh b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public khv(final khw a, final aidi b, final int c) {
        this.c = c;
        this.a = a;
        this.b = (ahbh)b;
    }
    
    public final void a(final boolean b) {
        final int c = this.c;
        if (c == 0) {
            final Object a = this.a;
            final ahbh b2 = this.b;
            final khw khw = (khw)a;
            final hzo i = khw.c.i;
            final ahaz builder = b2.toBuilder();
            builder.copyOnWrite();
            final aidi aidi = (aidi)builder.instance;
            aidi.b |= 0x8;
            aidi.e = false;
            final aidi c2 = (aidi)builder.build();
            if ((i.a().c & 0x10) != 0x0) {
                apod apod;
                if ((apod = i.a().A) == null) {
                    apod = apod.a;
                }
                final ahaz builder2 = ((ahbh)apod).toBuilder();
                builder2.copyOnWrite();
                final apod apod2 = (apod)builder2.instance;
                c2.getClass();
                apod2.c = c2;
                apod2.b = 79971800;
                final apod a2 = (apod)builder2.build();
                final ahbb ahbb = (ahbb)((ahbh)i.a()).toBuilder();
                ((ahaz)ahbb).copyOnWrite();
                final apog apog = (apog)ahbb.instance;
                a2.getClass();
                apog.A = a2;
                apog.c |= 0x10;
                i.b((apog)((ahaz)ahbb).build());
            }
            khw.b.d();
            return;
        }
        if (c != 1) {
            final Object a3 = this.a;
            final ahbh b3 = this.b;
            final khw khw2 = (khw)a3;
            final hzo j = khw2.c.i;
            final ahaz builder3 = b3.toBuilder();
            builder3.copyOnWrite();
            final aidi aidi2 = (aidi)builder3.instance;
            aidi2.b |= 0x8;
            aidi2.e = false;
            final aidi c3 = (aidi)builder3.build();
            if ((j.a().c & 0x8) != 0x0) {
                apod apod3;
                if ((apod3 = j.a().z) == null) {
                    apod3 = apod.a;
                }
                final ahaz builder4 = ((ahbh)apod3).toBuilder();
                builder4.copyOnWrite();
                final apod apod4 = (apod)builder4.instance;
                c3.getClass();
                apod4.c = c3;
                apod4.b = 79971800;
                final apod z = (apod)builder4.build();
                final ahbb ahbb2 = (ahbb)((ahbh)j.a()).toBuilder();
                ((ahaz)ahbb2).copyOnWrite();
                final apog apog2 = (apog)ahbb2.instance;
                z.getClass();
                apog2.z = z;
                apog2.c |= 0x8;
                j.b((apog)((ahaz)ahbb2).build());
            }
            khw2.a.d();
            return;
        }
        final Object a4 = this.a;
        final ahbh b4 = this.b;
        final jkz jkz = (jkz)a4;
        final bx d = jkz.d;
        final String l = ((aprh)b4).l;
        final aidi d2 = jkz.c.d;
        if (l != null && d2 != null) {
            ((Map<String, aidi>)d.a).put(l, d2);
        }
    }
}
