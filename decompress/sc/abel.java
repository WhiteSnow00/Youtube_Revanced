import android.view.View$OnClickListener;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abel implements abps, tgg
{
    final Object a;
    private final int b;
    
    public abel(final abem a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abel(final CreatorEndscreenOverlayPresenter a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final aamh aamh) {
        if (this.b != 0) {
            final abjv a = abjv.a;
            final abke a2 = abke.a;
            final int ordinal = aamh.d().ordinal();
            if (ordinal == 0 || ordinal == 2) {
                if (!((CreatorEndscreenOverlayPresenter)this.a).g.isEmpty()) {
                    final aazc l = ((CreatorEndscreenOverlayPresenter)this.a).l;
                    if (l != null) {
                        l.f = aamh.c();
                    }
                }
            }
            return;
        }
        ((abek)((abem)this.a).c).d(aamh.c() == abjv.c);
    }
    
    public final void b(final aans aans) {
        if (this.b != 0) {
            ((CreatorEndscreenOverlayPresenter)this.a).n = aans.e();
            ((CreatorEndscreenOverlayPresenter)this.a).o = aans.k();
            final abjv a = abjv.a;
            final abke a2 = abke.a;
            final int ordinal = aans.c().ordinal();
            if (ordinal == 0) {
                ((CreatorEndscreenOverlayPresenter)this.a).u();
                return;
            }
            if (ordinal == 5) {
                ((CreatorEndscreenOverlayPresenter)this.a).t(aans.d(), aans.a());
                return;
            }
            if (ordinal != 8) {
                if (ordinal == 9) {
                    final CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter = (CreatorEndscreenOverlayPresenter)this.a;
                    if (creatorEndscreenOverlayPresenter.h) {
                        creatorEndscreenOverlayPresenter.h = false;
                        creatorEndscreenOverlayPresenter.w();
                        ((CreatorEndscreenOverlayPresenter)this.a).p(false);
                    }
                }
                return;
            }
            ((CreatorEndscreenOverlayPresenter)this.a).t(aans.d(), aans.b());
        }
        else {
            final abke a3 = abke.a;
            final int ordinal2 = aans.c().ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 8) {
                    final Object a4 = this.a;
                    final akxi z = aans.b().z();
                    if ((z.b & 0x8000000) != 0x0) {
                        final abem abem = (abem)a4;
                        if (!abem.a) {
                            akwv akwv;
                            if ((akwv = z.C) == null) {
                                akwv = akwv.a;
                            }
                            amyj a5;
                            if (akwv.b == 130741768) {
                                a5 = (amyj)akwv.c;
                            }
                            else {
                                a5 = amyj.a;
                            }
                            ((abek)abem.c).c(a5.d);
                            final Object c = abem.c;
                            ajut ajut;
                            if ((a5.b & 0x1) != 0x0) {
                                if ((ajut = a5.c) == null) {
                                    ajut = ajut.a;
                                }
                            }
                            else {
                                ajut = null;
                            }
                            ((abek)c).f((CharSequence)acak.b(ajut));
                            if ((a5.b & 0x40) != 0x0) {
                                new wyt(a5.h);
                            }
                            if ((a5.b & 0x4) != 0x0) {
                                ((abek)abem.c).e((View$OnClickListener)new zgi(abem, a5, 4));
                            }
                            else {
                                ((abek)abem.c).e((View$OnClickListener)null);
                            }
                            if ((0x8 & a5.b) != 0x0) {
                                final Object c2 = abem.c;
                                akdi akdi;
                                if ((akdi = a5.f) == null) {
                                    akdi = akdi.a;
                                }
                                final int c3 = akdi.c;
                                final akdh a6 = akdh.a;
                                ((abek)c2).h();
                            }
                            else {
                                ((abek)abem.c).h();
                            }
                            abem.a = true;
                            ((abek)abem.c).g();
                        }
                    }
                }
                return;
            }
            final abem abem2 = (abem)this.a;
            abem2.a = false;
            ((abek)abem2.c).tf(false);
        }
    }
    
    public final asir[] lX(final abpu abpu) {
        if (this.b != 0) {
            final asir an = ((ashi)abpu.p().a).j(aale.s(abpu.bM(), 1024L)).j(aale.q(1)).an(new aauu(this, 11, null), (asjm)aaof.n);
            asir asir;
            if (((vai)abpu.ci().g).bw()) {
                asir = ((ashi)abpu.cc().a).an(new aauu(this, 12, null), (asjm)aaof.n);
            }
            else {
                asir = abpu.cc().c().j(aale.s(abpu.bM(), 1024L)).j(aale.q(0)).an(new aauu(this, 12, null), (asjm)aaof.n);
            }
            return new asir[] { an, asir };
        }
        final asir an2 = ((ashi)abpu.p().a).j(aale.s(abpu.bM(), 8388608L)).j(aale.q(1)).an((asjm)new abdd(this, 8), abba.q);
        asir asir2;
        if (((vai)abpu.ci().g).bw()) {
            asir2 = ((ashi)abpu.cc().a).an((asjm)new abdd(this, 9), abba.q);
        }
        else {
            asir2 = abpu.cc().c().j(aale.s(abpu.bM(), 8388608L)).j(aale.q(0)).an((asjm)new abdd(this, 9), abba.q);
        }
        return new asir[] { an2, asir2 };
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        final int b = this.b;
        Class[] array = null;
        final Class[] array2 = null;
        if (b != 0) {
            Class[] array3;
            if (n != -1) {
                if (n != 0) {
                    if (n != 1) {
                        final StringBuilder sb = new StringBuilder("unsupported op code: ");
                        sb.append(n);
                        throw new IllegalStateException(sb.toString());
                    }
                    this.b((aans)o);
                    array3 = array2;
                }
                else {
                    this.a((aamh)o);
                    array3 = array2;
                }
            }
            else {
                array3 = new Class[] { aamh.class, aans.class };
            }
            return array3;
        }
        if (n != -1) {
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb2 = new StringBuilder("unsupported op code: ");
                    sb2.append(n);
                    throw new IllegalStateException(sb2.toString());
                }
                this.b((aans)o);
            }
            else {
                this.a((aamh)o);
            }
        }
        else {
            array = new Class[] { aamh.class, aans.class };
        }
        return array;
    }
}
