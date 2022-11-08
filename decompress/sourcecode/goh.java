import com.google.protos.youtube.api.innertube.ItemSectionRendererOuterClass;
import java.util.List;
import com.google.protos.youtube.api.innertube.HorizontalListRendererOuterClass;

// 
// Decompiled by Procyon v0.6.0
// 

final class goh implements acmn
{
    private final int a;
    private final ldv b;
    private final gof c;
    
    public goh(final ldv b, final gof c) {
        this.a = b.g();
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final abxy abxy, final abxw abxw) {
        if (this.a == this.b.g()) {
            final ansr a = abxy.a();
            final agyc agyc = null;
            final agyc agyc2 = null;
            final agyc agyc3 = null;
            ansh ansh;
            if (a != null) {
                ansh = (ansh)((agzd)a).rr((agyr)ansh.b);
            }
            else {
                ansh = null;
            }
            if (ansh == null) {
                return;
            }
            anss anss;
            if ((anss = ansh.c) == null) {
                anss = anss.a;
            }
            akah akah;
            if (((agzd)anss).rs((agyr)HorizontalListRendererOuterClass.horizontalListRenderer)) {
                anss anss2;
                if ((anss2 = ansh.c) == null) {
                    anss2 = anss.a;
                }
                akah = (akah)((agzd)anss2).rr((agyr)HorizontalListRendererOuterClass.horizontalListRenderer);
            }
            else {
                akah = null;
            }
            if (akah != null) {
                final ldv b = this.b;
                if (b instanceof ldu) {
                    ((ldx)b).j((List)akah.c);
                    final gof c = this.c;
                    agyc g = agyc3;
                    if ((akah.b & 0x400) != 0x0) {
                        g = akah.g;
                    }
                    c.a(g);
                    return;
                }
            }
            anss anss3;
            if ((anss3 = ansh.c) == null) {
                anss3 = anss.a;
            }
            aphw aphw;
            if (((agzd)anss3).rs((agyr)aphy.a)) {
                anss anss4;
                if ((anss4 = ansh.c) == null) {
                    anss4 = anss.a;
                }
                aphw = (aphw)((agzd)anss4).rr((agyr)aphy.a);
            }
            else {
                aphw = null;
            }
            if (aphw != null) {
                final ldv b2 = this.b;
                if (b2 instanceof ldy) {
                    ((ldx)b2).j((List)aphw.c);
                    final gof c2 = this.c;
                    agyc j = agyc;
                    if ((aphw.b & 0x100) != 0x0) {
                        j = aphw.j;
                    }
                    c2.a(j);
                    return;
                }
            }
            anss anss5;
            if ((anss5 = ansh.c) == null) {
                anss5 = anss.a;
            }
            alib alib;
            if (((agzd)anss5).rs((agyr)ItemSectionRendererOuterClass.itemSectionRenderer)) {
                anss anss6;
                if ((anss6 = ansh.c) == null) {
                    anss6 = anss.a;
                }
                alib = (alib)((agzd)anss6).rr((agyr)ItemSectionRendererOuterClass.itemSectionRenderer);
            }
            else {
                alib = null;
            }
            if (alib != null) {
                final ldv b3 = this.b;
                if (b3 instanceof ldz) {
                    final ldz ldz = (ldz)b3;
                    final agzy e = alib.e;
                    if (!((List)e).isEmpty()) {
                        ((acnw)ldz).K((aext)kcf.l);
                        final agzc agzc = (agzc)((agzi)alib.a).createBuilder();
                        agzc.k((Iterable)e);
                        ((jtn)ldz).qN(new ver((alib)((agza)agzc).build()));
                        ++ldz.b;
                    }
                    final gof c3 = this.c;
                    agyc n = agyc2;
                    if ((alib.c & 0x400) != 0x0) {
                        n = alib.n;
                    }
                    c3.a(n);
                }
            }
        }
    }
}
