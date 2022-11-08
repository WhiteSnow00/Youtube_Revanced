import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import android.text.Spanned;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.text.TextUtils;
import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absm implements tec
{
    public final absi a;
    final absl b;
    public absk c;
    public boolean d;
    public aaln e;
    private final abhr f;
    private final tdz g;
    private absp h;
    private abso i;
    
    public absm(final absi a, final abhr f, final absl b, final tdz g) {
        this.a = a;
        this.f = f;
        this.b = b;
        this.g = g;
    }
    
    public final void a() {
        this.g.g((Object)this);
        ((asgt)this.f.c).al((asix)new abtm(this, 1));
    }
    
    public final void b(final abso abso) {
        this.i = abso;
        this.a.d = abso;
        this.d();
    }
    
    public final void c(final absp absp) {
        this.h = absp;
        this.a.c = absp;
        this.d();
    }
    
    public final void d() {
        final aaln e = this.e;
        final boolean b = true;
        final boolean b2 = e != null && e.c();
        final absk c = this.c;
        final absp h = this.h;
        boolean d = b2;
        if (h != null) {
            d = h.d();
        }
        final abso i = this.i;
        boolean c2;
        if (i != null) {
            c2 = i.c();
        }
        else {
            final aaln e2 = this.e;
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
                final abip abip = (abip)o;
                this.c.i(8);
                array2 = array;
                break;
            }
            case 6: {
                final aamc aamc = (aamc)o;
                if (!this.d) {
                    array2 = array;
                    break;
                }
                this.c.i(aamc.a());
                return null;
            }
            case 5: {
                this.c.j(((aalz)o).e());
                array2 = array;
                break;
            }
            case 4: {
                final aaly aaly = (aaly)o;
                this.d = aaly.c().c(abim.c);
                final PlayerResponseModel b2 = aaly.b();
                if (aaly.c() == abim.a) {
                    this.c.d();
                    final absi a = this.a;
                    a.c = null;
                    a.d = null;
                    array2 = array;
                    break;
                }
                array2 = array;
                if (aaly.c() != abim.c) {
                    break;
                }
                array2 = array;
                if (b2 != null) {
                    this.c.n();
                    final vup f = vup.f(b2.y(), 0L, (vhm)null);
                    if (f != null) {
                        this.c.g(Duration.ofSeconds((long)((PlayerResponseModel)f.b).h()).toMillis());
                    }
                    else {
                        this.c.g(Duration.ofSeconds((long)b2.h()).toMillis());
                    }
                    final absk c = this.c;
                    if (!aaly.l() || b2.U()) {
                        b = true;
                    }
                    c.f(b);
                    this.c.m(b2.J(), null);
                    this.c.l(b2.l());
                    this.b.d(b2.l(), aexq.k((Object)aaja.m(b2.y())));
                    this.c.a();
                    array2 = array;
                    break;
                }
                break;
            }
            case 3: {
                final aalo aalo = (aalo)o;
                array2 = array;
                if (aalo.c() != abij.e) {
                    break;
                }
                final WatchNextResponseModel a2 = aalo.a();
                array2 = array;
                if (a2 == null) {
                    break;
                }
                if (TextUtils.isEmpty((CharSequence)a2.b)) {
                    array2 = array;
                    break;
                }
                final alcj a3 = a2.a;
                alti alti;
                if ((0x4000 & a3.b) != 0x0) {
                    alcf alcf;
                    if ((alcf = a3.q) == null) {
                        alcf = alcf.a;
                    }
                    if (alcf.b == 61479009) {
                        alti = (alti)alcf.c;
                    }
                    else {
                        alti = alti.a;
                    }
                }
                else {
                    alck alck;
                    if ((alck = a3.e) == null) {
                        alck = alck.a;
                    }
                    alca a4;
                    if (alck.b == 51779735) {
                        a4 = (alca)alck.c;
                    }
                    else {
                        a4 = alca.a;
                    }
                    if ((a4.b & 0x8) != 0x0) {
                        alck alck2;
                        if ((alck2 = a3.e) == null) {
                            alck2 = alck.a;
                        }
                        alca a5;
                        if (alck2.b == 51779735) {
                            a5 = (alca)alck2.c;
                        }
                        else {
                            a5 = alca.a;
                        }
                        albx albx;
                        if ((albx = a5.f) == null) {
                            albx = albx.a;
                        }
                        if (albx.b == 61479009) {
                            alti = (alti)albx.c;
                        }
                        else {
                            alti = alti.a;
                        }
                    }
                    else {
                        alti = null;
                    }
                }
                Spanned b3;
                if (alti == null) {
                    b3 = null;
                }
                else {
                    ajsq ajsq;
                    if ((alti.b & 0x1) != 0x0) {
                        if ((ajsq = alti.c) == null) {
                            ajsq = ajsq.a;
                        }
                    }
                    else {
                        ajsq = null;
                    }
                    b3 = abyh.b(ajsq);
                }
                Object b4;
                if (alti == null) {
                    b4 = null;
                }
                else {
                    ajsq ajsq2;
                    if ((alti.b & 0x8) != 0x0) {
                        if ((ajsq2 = alti.d) == null) {
                            ajsq2 = ajsq.a;
                        }
                    }
                    else {
                        ajsq2 = null;
                    }
                    b4 = abyh.b(ajsq2);
                }
                CharSequence charSequence = (CharSequence)b4;
                CharSequence j = (CharSequence)b3;
                if (TextUtils.isEmpty((CharSequence)b3)) {
                    final PlayerResponseModel b5 = aalo.b();
                    charSequence = (CharSequence)b4;
                    j = (CharSequence)b3;
                    if (b5 != null) {
                        j = b5.J();
                        charSequence = null;
                    }
                }
                this.c.m(j, charSequence);
                array2 = array;
                break;
            }
            case 2: {
                this.e = (aaln)o;
                this.d();
                array2 = array;
                break;
            }
            case 1: {
                final aakh aakh = (aakh)o;
                final absk c2 = this.c;
                final float a6 = aakh.a();
                if (c2.k == a6) {
                    array2 = array;
                    break;
                }
                c2.k = a6;
                c2.b(16384);
                return null;
            }
            case 0: {
                final FormatStreamModel f2 = ((ynk)o).f();
                if (f2 == null) {
                    array2 = array;
                    break;
                }
                final absk c3 = this.c;
                final int d = f2.d();
                i = f2.i();
                c3.i = d;
                c3.j = i;
                c3.b(65536);
                return null;
            }
            case -1: {
                array2 = new Class[] { ynk.class, aakh.class, aaln.class, aalo.class, aaly.class, aalz.class, aamc.class, abip.class };
                break;
            }
        }
        return array2;
    }
}
