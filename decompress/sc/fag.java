import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class fag extends ezf
{
    public fag(final fah fah) {
        super(fah.a, fah.b, fah.c, fah.g, fah.d, (cya)null, fah.e, fah.f, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final aiqj b(final Object o) {
        aiqj aiqj;
        if ((aiqj = ((ajzb)o).i) == null) {
            aiqj = aiqj.a;
        }
        return aiqj;
    }
    
    public final /* bridge */ amgv d(final Object o) {
        final ajzb ajzb = (ajzb)o;
        amgv amgv;
        if ((ajzb.b & 0x200) != 0x0) {
            if ((amgv = ajzb.l) == null) {
                amgv = amgv.a;
            }
        }
        else {
            amgv = null;
        }
        return amgv;
    }
    
    public final /* bridge */ aome f(final Object o) {
        final ajzb ajzb = (ajzb)o;
        ajzc ajzc;
        if ((ajzc = ajzb.j) == null) {
            ajzc = ajzc.a;
        }
        aome a;
        if (ajzc.b == 55419609) {
            ajzc ajzc2;
            if ((ajzc2 = ajzb.j) == null) {
                ajzc2 = ajzc.a;
            }
            if (ajzc2.b == 55419609) {
                a = (aome)ajzc2.c;
            }
            else {
                a = aome.a;
            }
        }
        else {
            a = null;
        }
        return a;
    }
    
    public final /* bridge */ aotp g(final Object o) {
        final ajzb ajzb = (ajzb)o;
        aotp aotp;
        if ((ajzb.b & 0x2) != 0x0) {
            if ((aotp = ajzb.c) == null) {
                aotp = aotp.a;
            }
        }
        else {
            aotp = null;
        }
        return aotp;
    }
    
    public final /* bridge */ CharSequence h(final Object o) {
        final ajzb ajzb = (ajzb)o;
        ajut ajut;
        if ((ajzb.b & 0x40) != 0x0) {
            if ((ajut = ajzb.h) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        return (CharSequence)acak.b(ajut);
    }
    
    public final /* bridge */ CharSequence i(final Object o) {
        final ajzb ajzb = (ajzb)o;
        ajut ajut;
        if ((ajzb.b & 0x20) != 0x0) {
            if ((ajut = ajzb.g) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        return (CharSequence)acak.b(ajut);
    }
    
    public final /* bridge */ CharSequence j(final Object o) {
        final ajzb ajzb = (ajzb)o;
        ajut ajut;
        if ((ajzb.b & 0x10) != 0x0) {
            if ((ajut = ajzb.f) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        return (CharSequence)acak.b(ajut);
    }
    
    public final /* bridge */ CharSequence k(final Object o) {
        final ajzb ajzb = (ajzb)o;
        ajut ajut;
        if ((ajzb.b & 0x4) != 0x0) {
            if ((ajut = ajzb.d) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        return (CharSequence)acak.b(ajut);
    }
    
    public final /* bridge */ CharSequence l(final Object o) {
        final ajzb ajzb = (ajzb)o;
        ajut ajut;
        if ((ajzb.b & 0x8) != 0x0) {
            if ((ajut = ajzb.e) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        return (CharSequence)acak.b(ajut);
    }
    
    public final /* bridge */ Object m(final Object o, final aome c) {
        ajzb ajzb2;
        final ajzb ajzb = ajzb2 = (ajzb)o;
        if ((ajzb.b & 0x100) != 0x0) {
            final ahaz builder = ((ahbh)ajzb).toBuilder();
            ajzc ajzc;
            if ((ajzc = ajzb.j) == null) {
                ajzc = ajzc.a;
            }
            final ahaz builder2 = ((ahbh)ajzc).toBuilder();
            builder2.copyOnWrite();
            final ajzc ajzc2 = (ajzc)builder2.instance;
            c.getClass();
            ajzc2.c = c;
            ajzc2.b = 55419609;
            builder.copyOnWrite();
            final ajzb ajzb3 = (ajzb)builder.instance;
            final ajzc j = (ajzc)builder2.build();
            j.getClass();
            ajzb3.j = j;
            ajzb3.b |= 0x100;
            ajzb2 = (ajzb)builder.build();
        }
        return ajzb2;
    }
    
    public final List n(final Object o) {
        return (List)((ajzb)o).k;
    }
    
    public final /* bridge */ byte[] o(final Object o) {
        return ((ajzb)o).m.I();
    }
}
