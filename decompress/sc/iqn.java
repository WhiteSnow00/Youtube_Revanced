import com.google.protobuf.MessageLite;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iqn implements iqx
{
    private final Context a;
    private final vai b;
    private final vai c;
    private final heo d;
    private final jki e;
    private final fzw f;
    
    public iqn(final Context a, final heo d, final jki e, final vai b, final vai c, final fzw f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.d = d;
        this.e = e;
        this.b = b;
        this.c = c;
        this.f = f;
    }
    
    @Override
    public final afeq a(final imt imt) {
        final ashn w = ((flu)this.e.b).a(flt.a).w((asjr)ijp.q);
        final ahaz builder = ajiv.a.createBuilder();
        final String e = (String)w.C((asjr)iqm.b).n((Object)"").af();
        if (this.b.ap() && e.isEmpty()) {
            final aqdy e2 = (aqdy)w.C((asjr)iqm.a).n((Object)aqdy.a).af();
            builder.copyOnWrite();
            final ajiv ajiv = (ajiv)builder.instance;
            e2.getClass();
            ajiv.e = e2;
            ajiv.d = 9;
        }
        else {
            builder.copyOnWrite();
            final ajiv ajiv2 = (ajiv)builder.instance;
            e.getClass();
            ajiv2.d = 4;
            ajiv2.e = e;
        }
        final String string = this.a.getString(2132019847);
        String i;
        final String s = i = this.a.getString(2132017892);
        String c = string;
        if (!this.c.aO()) {
            c = aevy.c(string);
            i = aevy.c(s);
        }
        final heo d = this.d;
        final ahbf b = ajiv.b;
        final String string2 = this.a.getString(2132019850);
        builder.copyOnWrite();
        final ajiv ajiv3 = (ajiv)builder.instance;
        string2.getClass();
        ajiv3.c |= 0x8;
        ajiv3.g = string2;
        builder.copyOnWrite();
        final ajiv ajiv4 = (ajiv)builder.instance;
        c.getClass();
        ajiv4.c |= 0x40;
        ajiv4.h = c;
        builder.copyOnWrite();
        final ajiv ajiv5 = (ajiv)builder.instance;
        i.getClass();
        ajiv5.c |= 0x80;
        ajiv5.i = i;
        final String string3 = this.a.getString(2132019846);
        builder.copyOnWrite();
        final ajiv ajiv6 = (ajiv)builder.instance;
        string3.getClass();
        ajiv6.c |= 0x100;
        ajiv6.j = string3;
        final aqfl ao = this.f.ao();
        builder.copyOnWrite();
        final ajiv ajiv7 = (ajiv)builder.instance;
        ao.getClass();
        ajiv7.f = ao;
        ajiv7.c |= 0x2;
        final aezp q = d.q(2131951653, (ahaq)b, (Object)builder.build());
        if (!q.h()) {
            return afeq.q();
        }
        final ahaz builder2 = ((ahbh)alkh.a).createBuilder();
        final ajmo al = (ajmo)q.c();
        builder2.copyOnWrite();
        final alkh alkh = (alkh)builder2.instance;
        alkh.al = al;
        alkh.h |= 0x2000000;
        return afeq.r((Object)new iqv((MessageLite)builder2.build()));
    }
}
