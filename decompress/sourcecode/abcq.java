import android.view.View$OnClickListener;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abcq implements abnq, tec
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public abcq(final abcr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abcq(final CreatorEndscreenOverlayPresenter a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final aakn aakn) {
        if (this.b != 0) {
            final abid a = abid.a;
            final abim a2 = abim.a;
            final int ordinal = aakn.d().ordinal();
            if (ordinal == 0 || ordinal == 2) {
                if (!((CreatorEndscreenOverlayPresenter)this.a).g.isEmpty()) {
                    final aaxg l = ((CreatorEndscreenOverlayPresenter)this.a).l;
                    if (l != null) {
                        l.f = aakn.c();
                    }
                }
            }
            return;
        }
        ((abcp)((abcr)this.a).c).d(aakn.c() == abid.c);
    }
    
    public final void b(final aaly aaly) {
        if (this.b != 0) {
            ((CreatorEndscreenOverlayPresenter)this.a).n = aaly.e();
            ((CreatorEndscreenOverlayPresenter)this.a).o = aaly.k();
            final abid a = abid.a;
            final abim a2 = abim.a;
            final int ordinal = aaly.c().ordinal();
            if (ordinal == 0) {
                ((CreatorEndscreenOverlayPresenter)this.a).u();
                return;
            }
            if (ordinal == 5) {
                ((CreatorEndscreenOverlayPresenter)this.a).t(aaly.d(), aaly.a());
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
            ((CreatorEndscreenOverlayPresenter)this.a).t(aaly.d(), aaly.b());
        }
        else {
            final abim a3 = abim.a;
            final int ordinal2 = aaly.c().ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 8) {
                    final Object a4 = this.a;
                    final akve z = aaly.b().z();
                    if ((z.b & 0x8000000) != 0x0) {
                        final abcr abcr = (abcr)a4;
                        if (!abcr.a) {
                            akur akur;
                            if ((akur = z.C) == null) {
                                akur = akur.a;
                            }
                            amwf a5;
                            if (akur.b == 130741768) {
                                a5 = (amwf)akur.c;
                            }
                            else {
                                a5 = amwf.a;
                            }
                            ((abcp)abcr.c).c(a5.d);
                            final Object c = abcr.c;
                            ajsq ajsq;
                            if ((a5.b & 0x1) != 0x0) {
                                if ((ajsq = a5.c) == null) {
                                    ajsq = ajsq.a;
                                }
                            }
                            else {
                                ajsq = null;
                            }
                            ((abcp)c).f((CharSequence)abyh.b(ajsq));
                            if ((a5.b & 0x40) != 0x0) {
                                new wws(a5.h);
                            }
                            if ((a5.b & 0x4) != 0x0) {
                                ((abcp)abcr.c).e((View$OnClickListener)new aafm(abcr, a5, 3));
                            }
                            else {
                                ((abcp)abcr.c).e((View$OnClickListener)null);
                            }
                            if ((0x8 & a5.b) != 0x0) {
                                final Object c2 = abcr.c;
                                akbf akbf;
                                if ((akbf = a5.f) == null) {
                                    akbf = akbf.a;
                                }
                                final int c3 = akbf.c;
                                final akbe a6 = akbe.a;
                                ((abcp)c2).h();
                            }
                            else {
                                ((abcp)abcr.c).h();
                            }
                            abcr.a = true;
                            ((abcp)abcr.c).g();
                        }
                    }
                }
                return;
            }
            final abcr abcr2 = (abcr)this.a;
            abcr2.a = false;
            ((abcp)abcr2.c).sZ(false);
        }
    }
    
    public final asic[] lX(final abns abns) {
        if (this.b != 0) {
            final asic am = ((asgt)abns.q().a).j(aajj.t(abns.bN(), 1024L)).j(aajj.r(1)).am((asix)new aavd(this, 6, (byte[])null), (asix)aamk.n);
            asic asic;
            if (((uyi)abns.cd().h).bw()) {
                asic = ((asgt)abns.f().f).am((asix)new aavd(this, 7, (byte[])null), (asix)aamk.n);
            }
            else {
                asic = abns.f().b().j(aajj.t(abns.bN(), 1024L)).j(aajj.r(0)).am((asix)new aavd(this, 7, (byte[])null), (asix)aamk.n);
            }
            return new asic[] { am, asic };
        }
        final asic am2 = ((asgt)abns.q().a).j(aajj.t(abns.bN(), 8388608L)).j(aajj.r(1)).am((asix)new abbr(this, 3), (asix)aaze.q);
        asic asic2;
        if (((uyi)abns.cd().h).bw()) {
            asic2 = ((asgt)abns.f().f).am((asix)new abbr(this, 4), (asix)aaze.q);
        }
        else {
            asic2 = abns.f().b().j(aajj.t(abns.bN(), 8388608L)).j(aajj.r(0)).am((asix)new abbr(this, 4), (asix)aaze.q);
        }
        return new asic[] { am2, asic2 };
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        final int b = this.b;
        final Class[] array = null;
        Class[] array2 = null;
        if (b != 0) {
            if (n != -1) {
                if (n != 0) {
                    if (n != 1) {
                        final StringBuilder sb = new StringBuilder("unsupported op code: ");
                        sb.append(n);
                        throw new IllegalStateException(sb.toString());
                    }
                    this.b((aaly)o);
                }
                else {
                    this.a((aakn)o);
                }
            }
            else {
                array2 = new Class[] { aakn.class, aaly.class };
            }
            return array2;
        }
        Class[] array3;
        if (n != -1) {
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb2 = new StringBuilder("unsupported op code: ");
                    sb2.append(n);
                    throw new IllegalStateException(sb2.toString());
                }
                this.b((aaly)o);
                array3 = array;
            }
            else {
                this.a((aakn)o);
                array3 = array;
            }
        }
        else {
            array3 = new Class[] { aakn.class, aaly.class };
        }
        return array3;
    }
}
