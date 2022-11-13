import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import android.text.Spanned;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.text.TextUtils;
import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abun implements tgg
{
    public final abuj a;
    final abum b;
    public abul c;
    public boolean d;
    public aanh e;
    private final tgd f;
    private abuq g;
    private abup h;
    private final ablw i;
    
    public abun(final abuj a, final ablw i, final abum b, final tgd f, final byte[] array) {
        this.a = a;
        this.i = i;
        this.b = b;
        this.f = f;
    }
    
    public final void a() {
        this.f.g((Object)this);
        ((ashi)this.i.i).am(new absa(this, 6));
    }
    
    public final void b(final abup abup) {
        this.h = abup;
        this.a.d = abup;
        this.d();
    }
    
    public final void c(final abuq abuq) {
        this.g = abuq;
        this.a.c = abuq;
        this.d();
    }
    
    public final void d() {
        final aanh e = this.e;
        final boolean b = true;
        final boolean b2 = e != null && e.c();
        final abul c = this.c;
        final abuq g = this.g;
        boolean d = b2;
        if (g != null) {
            d = g.d();
        }
        final abup h = this.h;
        boolean c2;
        if (h != null) {
            c2 = h.c();
        }
        else {
            final aanh e2 = this.e;
            c2 = (e2 != null && e2.b() && b);
        }
        c.h(d, c2);
    }
    
    public final Class[] ms(final Class clazz, final Object o, int i) {
        boolean b = false;
        final Class[] array = null;
        Class[] array2 = null;
        switch (i) {
            default: {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
            case 7: {
                final abkh abkh = (abkh)o;
                this.c.i(8);
                array2 = array;
                break;
            }
            case 6: {
                final aanw aanw = (aanw)o;
                if (!this.d) {
                    array2 = array;
                    break;
                }
                this.c.i(aanw.a());
                return null;
            }
            case 5: {
                this.c.j(((aant)o).e());
                array2 = array;
                break;
            }
            case 4: {
                final aans aans = (aans)o;
                this.d = aans.c().c(abke.c);
                final PlayerResponseModel b2 = aans.b();
                if (aans.c() == abke.a) {
                    this.c.d();
                    final abuj a = this.a;
                    a.c = null;
                    a.d = null;
                    array2 = array;
                    break;
                }
                array2 = array;
                if (aans.c() != abke.c) {
                    break;
                }
                array2 = array;
                if (b2 != null) {
                    this.c.n();
                    final vwa j = vwa.j(b2.y(), 0L, (vjm)null);
                    if (j != null) {
                        this.c.g(Duration.ofSeconds((long)((PlayerResponseModel)j.a).h()).toMillis());
                    }
                    else {
                        this.c.g(Duration.ofSeconds((long)b2.h()).toMillis());
                    }
                    final abul c = this.c;
                    if (!aans.l() || b2.U()) {
                        b = true;
                    }
                    c.f(b);
                    this.c.m(b2.J(), null);
                    this.c.l(b2.l());
                    this.b.d(b2.l(), aezp.k((Object)aakv.m(b2.y())));
                    this.c.a();
                    array2 = array;
                    break;
                }
                break;
            }
            case 3: {
                final aani aani = (aani)o;
                array2 = array;
                if (aani.c() != abkb.e) {
                    break;
                }
                final WatchNextResponseModel a2 = aani.a();
                array2 = array;
                if (a2 == null) {
                    break;
                }
                if (TextUtils.isEmpty((CharSequence)a2.b)) {
                    array2 = array;
                    break;
                }
                final alem a3 = a2.a;
                alvm alvm;
                if ((0x4000 & a3.b) != 0x0) {
                    alei alei;
                    if ((alei = a3.q) == null) {
                        alei = alei.a;
                    }
                    if (alei.b == 61479009) {
                        alvm = (alvm)alei.c;
                    }
                    else {
                        alvm = alvm.a;
                    }
                }
                else {
                    alen alen;
                    if ((alen = a3.e) == null) {
                        alen = alen.a;
                    }
                    aled a4;
                    if (alen.b == 51779735) {
                        a4 = (aled)alen.c;
                    }
                    else {
                        a4 = aled.a;
                    }
                    if ((a4.b & 0x8) != 0x0) {
                        alen alen2;
                        if ((alen2 = a3.e) == null) {
                            alen2 = alen.a;
                        }
                        aled a5;
                        if (alen2.b == 51779735) {
                            a5 = (aled)alen2.c;
                        }
                        else {
                            a5 = aled.a;
                        }
                        alea alea;
                        if ((alea = a5.f) == null) {
                            alea = alea.a;
                        }
                        if (alea.b == 61479009) {
                            alvm = (alvm)alea.c;
                        }
                        else {
                            alvm = alvm.a;
                        }
                    }
                    else {
                        alvm = null;
                    }
                }
                Spanned b3;
                if (alvm == null) {
                    b3 = null;
                }
                else {
                    ajut ajut;
                    if ((alvm.b & 0x1) != 0x0) {
                        if ((ajut = alvm.c) == null) {
                            ajut = ajut.a;
                        }
                    }
                    else {
                        ajut = null;
                    }
                    b3 = acak.b(ajut);
                }
                Object b4;
                if (alvm == null) {
                    b4 = null;
                }
                else {
                    ajut ajut2;
                    if ((alvm.b & 0x8) != 0x0) {
                        if ((ajut2 = alvm.d) == null) {
                            ajut2 = ajut.a;
                        }
                    }
                    else {
                        ajut2 = null;
                    }
                    b4 = acak.b(ajut2);
                }
                CharSequence charSequence = (CharSequence)b4;
                CharSequence k = (CharSequence)b3;
                if (TextUtils.isEmpty((CharSequence)b3)) {
                    final PlayerResponseModel b5 = aani.b();
                    charSequence = (CharSequence)b4;
                    k = (CharSequence)b3;
                    if (b5 != null) {
                        k = b5.J();
                        charSequence = null;
                    }
                }
                this.c.m(k, charSequence);
                array2 = array;
                break;
            }
            case 2: {
                this.e = (aanh)o;
                this.d();
                array2 = array;
                break;
            }
            case 1: {
                final aamb aamb = (aamb)o;
                final abul c2 = this.c;
                final float a6 = aamb.a();
                if (c2.k == a6) {
                    array2 = array;
                    break;
                }
                c2.k = a6;
                c2.b(16384);
                return null;
            }
            case 0: {
                final FormatStreamModel f = ((ypj)o).f();
                if (f == null) {
                    array2 = array;
                    break;
                }
                final abul c3 = this.c;
                final int d = f.d();
                i = f.i();
                c3.i = d;
                c3.j = i;
                c3.b(65536);
                return null;
            }
            case -1: {
                array2 = new Class[] { ypj.class, aamb.class, aanh.class, aani.class, aans.class, aant.class, aanw.class, abkh.class };
                break;
            }
        }
        return array2;
    }
}
