import com.google.protos.youtube.api.innertube.RefreshCommandOuterClass$RefreshCommand;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ind implements hyz
{
    public final aiqj a;
    public final jki b;
    public final avu c;
    private final fmh d;
    private final asid e;
    private final asid f;
    private final ims g;
    private final iqj h;
    private final Context i;
    private final vai j;
    
    public ind(final Context i, final jki b, final fmh d, final asid e, final asid f, final avu c, final ims g, final iqj h, final vai j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.i = i;
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
        this.c = c;
        this.g = g;
        this.h = h;
        this.j = j;
        final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
        final ahbf refreshCommand = RefreshCommandOuterClass$RefreshCommand.refreshCommand;
        final ahaz builder = RefreshCommandOuterClass$RefreshCommand.a.createBuilder();
        builder.copyOnWrite();
        final RefreshCommandOuterClass$RefreshCommand refreshCommandOuterClass$RefreshCommand = (RefreshCommandOuterClass$RefreshCommand)builder.instance;
        refreshCommandOuterClass$RefreshCommand.c = 1;
        refreshCommandOuterClass$RefreshCommand.b |= 0x1;
        ahbb.e((ahaq)refreshCommand, (Object)builder.build());
        this.a = (aiqj)((ahaz)ahbb).build();
    }
    
    private final ajut b(final int n) {
        return acak.g(new String[] { this.i.getString(n) });
    }
    
    @Override
    public final asie a(final vns vns) {
        if ("FEwhat_to_watch".equals(vns.c)) {
            final ashn h = this.d.a().j((asjr)ijp.k).u((asjr)new ina(this)).aB((Object)((ahbh)alke.a).createBuilder(), (asjh)inb.a).h((asjr)ijp.l);
            final ahaz builder = ((ahbh)ahyj.a).createBuilder();
            final ahbb ahbb = (ahbb)((ahbh)aicz.a).createBuilder();
            ((ahaz)ahbb).copyOnWrite();
            final aicz aicz = (aicz)ahbb.instance;
            aicz.d = 2;
            aicz.c = 1;
            ((ahaz)ahbb).copyOnWrite();
            final aicz aicz2 = (aicz)ahbb.instance;
            aicz2.e = 3;
            aicz2.b |= 0x8;
            final ajut b = this.b(2132018890);
            ((ahaz)ahbb).copyOnWrite();
            final aicz aicz3 = (aicz)ahbb.instance;
            b.getClass();
            aicz3.i = b;
            aicz3.b |= 0x200;
            final aiqj a = this.a;
            ((ahaz)ahbb).copyOnWrite();
            final aicz aicz4 = (aicz)ahbb.instance;
            a.getClass();
            aicz4.p = a;
            aicz4.b |= 0x10000;
            builder.copyOnWrite();
            final ahyj ahyj = (ahyj)builder.instance;
            final aicz c = (aicz)((ahaz)ahbb).build();
            c.getClass();
            ahyj.c = c;
            ahyj.b = 65153809;
            final ahyj h2 = (ahyj)builder.build();
            final ahaz builder2 = ((ahbh)ahyk.a).createBuilder();
            final ahaz builder3 = ((ahbh)ahyl.a).createBuilder();
            final ahyi c2 = ahyi.c;
            builder3.copyOnWrite();
            final ahyl ahyl = (ahyl)builder3.instance;
            ahyl.c = c2.g;
            ahyl.b |= 0x1;
            builder2.copyOnWrite();
            final ahyk ahyk = (ahyk)builder2.instance;
            final ahyl j = (ahyl)builder3.build();
            j.getClass();
            ahyk.j = j;
            ahyk.b |= 0x100;
            final ahaz builder4 = ((ahbh)ahym.a).createBuilder();
            final akdh w = akdh.w;
            builder4.copyOnWrite();
            final ahym ahym = (ahym)builder4.instance;
            ahym.c = w.sy;
            ahym.b |= 0x1;
            builder2.copyOnWrite();
            final ahyk ahyk2 = (ahyk)builder2.instance;
            final ahym d = (ahym)builder4.build();
            d.getClass();
            ahyk2.d = d;
            ahyk2.c = 3;
            final ajut b2 = this.b(2132018877);
            builder2.copyOnWrite();
            final ahyk ahyk3 = (ahyk)builder2.instance;
            b2.getClass();
            ahyk3.e = b2;
            ahyk3.b |= 0x1;
            final ajut b3 = this.b(2132018869);
            builder2.copyOnWrite();
            final ahyk ahyk4 = (ahyk)builder2.instance;
            b3.getClass();
            ahyk4.f = b3;
            ahyk4.b |= 0x2;
            builder2.copyOnWrite();
            final ahyk ahyk5 = (ahyk)builder2.instance;
            h2.getClass();
            ahyk5.h = h2;
            ahyk5.b |= 0x40;
            final ahyk u = (ahyk)builder2.build();
            final ahaz builder5 = ((ahbh)alkh.a).createBuilder();
            builder5.copyOnWrite();
            final alkh alkh = (alkh)builder5.instance;
            u.getClass();
            alkh.U = u;
            alkh.f |= 0x2000;
            final alkh alkh2 = (alkh)builder5.build();
            final ahbb ahbb2 = (ahbb)((ahbh)alke.a).createBuilder();
            ahbb2.l(alkh2);
            ((ahaz)ahbb2).copyOnWrite();
            final alke alke = (alke)ahbb2.instance;
            alke.c |= 0x8;
            alke.i = "offline_homepage_error_view_id";
            final alke i = (alke)((ahaz)ahbb2).build();
            final ahaz builder6 = ((ahbh)anyy.a).createBuilder();
            builder6.copyOnWrite();
            final anyy anyy = (anyy)builder6.instance;
            i.getClass();
            anyy.j = i;
            anyy.b |= 0x10;
            final ashn k = h.Y((asih)asie.I((Object)builder6.build())).i();
            ashn ashn;
            if (!this.j.bh()) {
                ashn = ashn.t();
            }
            else {
                final afeq a2 = this.h.a(this.g.c(ajhp.b));
                if (a2.isEmpty()) {
                    ashn = ashn.t();
                }
                else {
                    ashn = ashn.B((Object)((iqv)a2.get(0)).a);
                }
            }
            final ashi f = ashn.f((ashq)k, (ashq)ashn);
            final ahaz builder7 = ((ahbh)anyv.a).createBuilder();
            final inb c3 = inb.c;
            askk.b((Object)builder7, "initialItem is null");
            final asnp asnp = new asnp(f, askj.h((Object)builder7), (asjh)c3);
            final asjr o = atqx.o;
            return ((asie)asnp).E((asjr)ijp.m).J((asjr)new inc(this)).Q(this.f).L(this.e);
        }
        return asie.C((Throwable)new IllegalArgumentException("Home offline response is only used for Homepage"));
    }
}
