import android.content.Context;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import java.util.function.Consumer;
import java.util.concurrent.Callable;
import j$.util.Optional;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class igr implements aezf
{
    public final Object a;
    private final int b;
    
    public igr(final SharedPreferences a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public igr(final arwh a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public igr(final bx a, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        this.a = a;
    }
    
    public igr(final iia a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public igr(final ijz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public igr(final imw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public igr(final imz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public igr(final ipj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public igr(final Optional a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public igr(final Boolean a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public igr(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public igr(final jih a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public igr(final jim a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public igr(final jpt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public igr(final vns a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final Object apply(final Object o) {
        final int b = this.b;
        final boolean b2 = true;
        final boolean b3 = true;
        boolean b4 = false;
        final Boolean value = false;
        switch (b) {
            default: {
                final Object a = this.a;
                final ahaz builder = ((ahbh)o).toBuilder();
                final boolean booleanValue = (boolean)a;
                builder.copyOnWrite();
                final jqf jqf = (jqf)builder.instance;
                jqf.b |= 0x80;
                jqf.i = booleanValue;
                return builder.build();
            }
            case 19: {
                ((SharedPreferences)this.a).edit().putString("offline_quality", ((jqf)o).d).apply();
                return null;
            }
            case 18: {
                final Object a2 = this.a;
                final ahaz builder2 = ((ahbh)o).toBuilder();
                final boolean booleanValue2 = (boolean)a2;
                builder2.copyOnWrite();
                final jqf jqf2 = (jqf)builder2.instance;
                jqf2.b |= 0x40;
                jqf2.h = booleanValue2;
                return builder2.build();
            }
            case 17: {
                final Object a3 = this.a;
                final ahaz builder3 = ((ahbh)o).toBuilder();
                final boolean booleanValue3 = (boolean)a3;
                builder3.copyOnWrite();
                final jqf jqf3 = (jqf)builder3.instance;
                jqf3.b |= 0x20;
                jqf3.g = booleanValue3;
                return builder3.build();
            }
            case 16: {
                final Object a4 = this.a;
                final ahaz builder4 = ((ahbh)o).toBuilder();
                builder4.copyOnWrite();
                final jqf jqf4 = (jqf)builder4.instance;
                jqf4.b |= 0x100000;
                jqf4.v = true;
                final ahdy ap = adyf.ap((afss)afsr.a);
                builder4.copyOnWrite();
                final jqf jqf5 = (jqf)builder4.instance;
                ap.getClass();
                jqf5.u = ap;
                jqf5.b |= 0x80000;
                final MaterialButton af = ((jpt)a4).af;
                if (af != null) {
                    b4 = af.b;
                }
                builder4.copyOnWrite();
                final jqf jqf6 = (jqf)builder4.instance;
                jqf6.b |= 0x200000;
                jqf6.w = b4;
                return builder4.build();
            }
            case 15: {
                return ((bx)this.a).W((jae)o);
            }
            case 14: {
                final Object a5 = this.a;
                final fqx fqx = (fqx)o;
                String s;
                if ((fqx.b & 0x4) != 0x0) {
                    s = String.valueOf(fqx.e);
                }
                else {
                    s = String.valueOf(get.h((arwh)a5));
                }
                return s;
            }
            case 13: {
                final Object a6 = this.a;
                final tqt tqt = (tqt)o;
                final jim jim = (jim)a6;
                tqt.d = jim.aC;
                final affr i = afft.i();
                alxp alxp;
                if ((alxp = jim.az.b().e) == null) {
                    alxp = alxp.a;
                }
                if (alxp.aC) {
                    i.h(jim.aK.e());
                }
                afft afft;
                if (jim.aM.a) {
                    afft = i.g();
                }
                else {
                    final Context nt = ((br)a6).nT();
                    nt.getClass();
                    Label_0740: {
                        if (!tpe.bq(nt)) {
                            alxp alxp2;
                            if ((alxp2 = jim.az.b().e) == null) {
                                alxp2 = alxp.a;
                            }
                            if (alxp2.aD) {
                                i.h(jim.aA);
                                break Label_0740;
                            }
                        }
                        i.h(jim.as);
                    }
                    i.h(jim.af);
                    afft = i.g();
                }
                tqt.f(afft);
                return tqt;
            }
            case 12: {
                final Object a7 = this.a;
                final tqt tqt2 = (tqt)o;
                tqt2.d = ((jih)a7).as;
                tqt2.f((afft)afiq.a);
                return tqt2;
            }
            case 11: {
                final Object a8 = this.a;
                final affr affr = (affr)o;
                affr.h(((ipj)a8).c);
                return affr;
            }
            case 10: {
                final Object a9 = this.a;
                final tqt tqt3 = (tqt)o;
                tqt3.e((aezf)new igr((ipj)a9, 11));
                return tqt3;
            }
            case 9: {
                final Object a10 = this.a;
                final ahaz builder5 = ((ahbh)o).toBuilder();
                builder5.copyOnWrite();
                final fnd fnd = (fnd)builder5.instance;
                a10.getClass();
                fnd.b |= 0x1;
                fnd.c = (String)a10;
                return builder5.build();
            }
            case 8: {
                final Object a11 = this.a;
                final String s2 = (String)o;
                final imz imz = (imz)a11;
                return imz.b((Callable)new imy(imz, s2, 0));
            }
            case 7: {
                final Object a12 = this.a;
                ((Consumer)o).accept(a12);
                return a12;
            }
            case 6: {
                final Object a13 = this.a;
                final tqt tqt4 = (tqt)o;
                tqt4.f = ((ijz)a13).bb();
                return tqt4;
            }
            case 5: {
                final Object a14 = this.a;
                final alyh alyh = (alyh)o;
                ((iia)a14).b.w().tu((Object)value);
                aabz aabz;
                if (alyh != null) {
                    aiqj aiqj;
                    if ((aiqj = alyh.c) == null) {
                        aiqj = aiqj.a;
                    }
                    aabz = iia.e(iia.f((List)afeq.r((Object)aiqj)));
                }
                else {
                    final aaby b5 = aabz.b.b();
                    b5.b = 26;
                    aabz = b5.a();
                }
                return aabz;
            }
            case 4: {
                final Object a15 = this.a;
                ttr.d("GetDownloadsPage error", (Throwable)o);
                ((iia)a15).a.tu((Object)value);
                final aaby b6 = aabz.b.b();
                b6.b = 2;
                return b6.a();
            }
            case 3: {
                final Object a16 = this.a;
                final Throwable t = (Throwable)o;
                ((iia)a16).b.w().tu((Object)value);
                final aaby b7 = aabz.b.b();
                b7.b = 2;
                return b7.a();
            }
            case 2: {
                final Object a17 = this.a;
                final ijk ijk = (ijk)o;
                boolean b8 = b3;
                if (ijk != ijk.a) {
                    b8 = (igu.i((Optional)a17, ijk) && b3);
                }
                return b8;
            }
            case 1: {
                final Object a18 = this.a;
                ((imw)a18).a = (amtr)o;
                return a18;
            }
            case 0: {
                final Object a19 = this.a;
                final ijk ijk2 = (ijk)o;
                boolean b9 = b2;
                if (ijk2 != ijk.a) {
                    b9 = (igu.i((Optional)a19, ijk2) && b2);
                }
                return b9;
            }
        }
    }
}
