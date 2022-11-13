import com.google.protos.youtube.api.innertube.ItemSectionRendererOuterClass;
import java.util.List;
import com.google.protos.youtube.api.innertube.HorizontalListRendererOuterClass;

// 
// Decompiled by Procyon v0.6.0
// 

final class goo implements acoq
{
    private final int a;
    private final lex b;
    private final gom c;
    
    public goo(final lex b, final gom c) {
        this.a = b.g();
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final acab acab, final abzz abzz) {
        if (this.a == this.b.g()) {
            final anuu a = acab.a();
            final ahab ahab = null;
            final ahab ahab2 = null;
            final ahab ahab3 = null;
            anuk anuk;
            if (a != null) {
                anuk = (anuk)((ahbc)a).rx((ahaq)anuk.b);
            }
            else {
                anuk = null;
            }
            if (anuk == null) {
                return;
            }
            anuv anuv;
            if ((anuv = anuk.c) == null) {
                anuv = anuv.a;
            }
            akck akck;
            if (((ahbc)anuv).ry((ahaq)HorizontalListRendererOuterClass.horizontalListRenderer)) {
                anuv anuv2;
                if ((anuv2 = anuk.c) == null) {
                    anuv2 = anuv.a;
                }
                akck = (akck)((ahbc)anuv2).rx((ahaq)HorizontalListRendererOuterClass.horizontalListRenderer);
            }
            else {
                akck = null;
            }
            if (akck != null) {
                final lex b = this.b;
                if (b instanceof lew) {
                    ((lez)b).j((List)akck.c);
                    final gom c = this.c;
                    ahab g = ahab3;
                    if ((akck.b & 0x400) != 0x0) {
                        g = akck.g;
                    }
                    c.a(g);
                    return;
                }
            }
            anuv anuv3;
            if ((anuv3 = anuk.c) == null) {
                anuv3 = anuv.a;
            }
            apka apka;
            if (((ahbc)anuv3).ry((ahaq)apkc.a)) {
                anuv anuv4;
                if ((anuv4 = anuk.c) == null) {
                    anuv4 = anuv.a;
                }
                apka = (apka)((ahbc)anuv4).rx((ahaq)apkc.a);
            }
            else {
                apka = null;
            }
            if (apka != null) {
                final lex b2 = this.b;
                if (b2 instanceof lfa) {
                    ((lez)b2).j((List)apka.c);
                    final gom c2 = this.c;
                    ahab j = ahab;
                    if ((apka.b & 0x100) != 0x0) {
                        j = apka.j;
                    }
                    c2.a(j);
                    return;
                }
            }
            anuv anuv5;
            if ((anuv5 = anuk.c) == null) {
                anuv5 = anuv.a;
            }
            alke alke;
            if (((ahbc)anuv5).ry((ahaq)ItemSectionRendererOuterClass.itemSectionRenderer)) {
                anuv anuv6;
                if ((anuv6 = anuk.c) == null) {
                    anuv6 = anuv.a;
                }
                alke = (alke)((ahbc)anuv6).rx((ahaq)ItemSectionRendererOuterClass.itemSectionRenderer);
            }
            else {
                alke = null;
            }
            if (alke != null) {
                final lex b3 = this.b;
                if (b3 instanceof lfb) {
                    final lfb lfb = (lfb)b3;
                    final ahbx e = alke.e;
                    if (!((List)e).isEmpty()) {
                        ((acqa)lfb).K((aezs)kdf.l);
                        final ahbb ahbb = (ahbb)((ahbh)alke.a).createBuilder();
                        ahbb.k((Iterable)e);
                        ((jup)lfb).qS(new vgr((alke)((ahaz)ahbb).build()));
                        ++lfb.b;
                    }
                    final gom c3 = this.c;
                    ahab n = ahab2;
                    if ((alke.c & 0x400) != 0x0) {
                        n = alke.n;
                    }
                    c3.a(n);
                }
            }
        }
    }
}
