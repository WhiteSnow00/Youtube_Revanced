import java.util.function.Consumer;
import java.util.function.Supplier;
import j$.util.Optional;
import android.view.MenuItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ksj implements fzi
{
    public final amel a;
    final /* synthetic */ ksl b;
    private final ardu c;
    
    public ksj(final ksl b, final amel a, final arcq arcq, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
        this.c = arcq.u();
    }
    
    public final int j() {
        return this.c.m();
    }
    
    public final int k() {
        return 0;
    }
    
    public final fyz l() {
        return null;
    }
    
    public final boolean n() {
        return false;
    }
    
    public final void o(final MenuItem menuItem) {
    }
    
    public final boolean p() {
        final wwv f = this.b.f;
        final amel a = this.a;
        amem amem;
        if ((amem = a.c) == null) {
            amem = amem.a;
        }
        agyc agyc;
        if ((amem.b & 0x10) != 0x0) {
            amem amem2;
            if ((amem2 = a.c) == null) {
                amem2 = amem.a;
            }
            agyc = amem2.f;
        }
        else {
            ameq ameq;
            if ((ameq = a.d) == null) {
                ameq = ameq.a;
            }
            if ((ameq.b & 0x80) != 0x0) {
                ameq ameq2;
                if ((ameq2 = a.d) == null) {
                    ameq2 = ameq.a;
                }
                agyc = ameq2.g;
            }
            else {
                amep amep;
                if ((amep = a.e) == null) {
                    amep = amep.a;
                }
                if ((amep.b & 0x4) != 0x0) {
                    amep amep2;
                    if ((amep2 = a.e) == null) {
                        amep2 = amep.a;
                    }
                    agyc = amep2.c;
                }
                else {
                    amew amew;
                    if ((amew = a.f) == null) {
                        amew = amew.a;
                    }
                    if ((amew.b & 0x800) != 0x0) {
                        amew amew2;
                        if ((amew2 = a.f) == null) {
                            amew2 = amew.a;
                        }
                        agyc = amew2.j;
                    }
                    else {
                        ameh ameh;
                        if ((ameh = a.g) == null) {
                            ameh = ameh.a;
                        }
                        if ((ameh.b & 0x10) != 0x0) {
                            ameh ameh2;
                            if ((ameh2 = a.g) == null) {
                                ameh2 = ameh.a;
                            }
                            agyc = ameh2.f;
                        }
                        else {
                            amei amei;
                            if ((amei = a.h) == null) {
                                amei = amei.a;
                            }
                            if ((amei.b & 0x10) != 0x0) {
                                amei amei2;
                                if ((amei2 = a.h) == null) {
                                    amei2 = amei.a;
                                }
                                agyc = amei2.f;
                            }
                            else {
                                apcm apcm;
                                if ((apcm = a.j) == null) {
                                    apcm = apcm.a;
                                }
                                if ((apcm.b & 0x400) != 0x0) {
                                    apcm apcm2;
                                    if ((apcm2 = a.j) == null) {
                                        apcm2 = apcm.a;
                                    }
                                    agyc = apcm2.c;
                                }
                                else {
                                    apcn apcn;
                                    if ((apcn = a.k) == null) {
                                        apcn = apcn.a;
                                    }
                                    if ((apcn.b & 0x400) != 0x0) {
                                        apcn apcn2;
                                        if ((apcn2 = a.k) == null) {
                                            apcn2 = apcn.a;
                                        }
                                        agyc = apcn2.c;
                                    }
                                    else {
                                        ames ames;
                                        if ((ames = a.l) == null) {
                                            ames = ames.a;
                                        }
                                        if ((ames.b & 0x8) != 0x0) {
                                            ames ames2;
                                            if ((ames2 = a.l) == null) {
                                                ames2 = ames.a;
                                            }
                                            agyc = ames2.d;
                                        }
                                        else {
                                            apbk apbk;
                                            if ((apbk = a.m) == null) {
                                                apbk = apbk.a;
                                            }
                                            if ((apbk.b & 0x200) != 0x0) {
                                                apbk apbk2;
                                                if ((apbk2 = a.m) == null) {
                                                    apbk2 = apbk.a;
                                                }
                                                agyc = apbk2.g;
                                            }
                                            else {
                                                amed amed;
                                                if ((amed = a.n) == null) {
                                                    amed = amed.a;
                                                }
                                                if ((amed.b & 0x10) != 0x0) {
                                                    amed amed2;
                                                    if ((amed2 = a.n) == null) {
                                                        amed2 = amed.a;
                                                    }
                                                    agyc = amed2.c;
                                                }
                                                else {
                                                    ajkj ajkj;
                                                    if ((ajkj = a.p) == null) {
                                                        ajkj = ajkj.a;
                                                    }
                                                    if ((ajkj.b & 0x8) != 0x0) {
                                                        ajkj ajkj2;
                                                        if ((ajkj2 = a.p) == null) {
                                                            ajkj2 = ajkj.a;
                                                        }
                                                        agyc = ajkj2.e;
                                                    }
                                                    else {
                                                        agyc = agyc.b;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        f.J(3, (wxz)new wws(agyc.I()), (alff)null);
        Optional.ofNullable((Object)Optional.ofNullable((Object)vwh.b(this.a)).orElseGet((Supplier)new gnu(this, 4))).ifPresent((Consumer)new jpl(this.b.e, 14));
        return true;
    }
    
    @Override
    public final int q() {
        return this.c.a;
    }
    
    @Override
    public final CharSequence r() {
        return vwh.f(this.a);
    }
}
