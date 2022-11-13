import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import android.text.TextUtils;
import android.text.Spanned;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixs implements abps
{
    private final asid a;
    private CharSequence b;
    private final ixv c;
    
    public ixs(final ixv c, final asid a) {
        c.getClass();
        this.c = c;
        this.a = a;
    }
    
    public final void a(final Spanned b) {
        if (TextUtils.equals(this.b, (CharSequence)b)) {
            return;
        }
        final ixv c = this.c;
        Object o;
        if (b == null) {
            o = "";
        }
        else {
            o = b;
        }
        c.e.tu(o);
        this.b = (CharSequence)b;
    }
    
    public final void b(final WatchNextResponseModel watchNextResponseModel) {
        final Spanned spanned = null;
        final ajut ajut = null;
        ajmo a = null;
        Label_0096: {
            if (watchNextResponseModel != null) {
                final angl i = watchNextResponseModel.i;
                if (i != null) {
                    angq angq;
                    if ((angq = i.j) == null) {
                        angq = angq.a;
                    }
                    if (angq.b == 153515154) {
                        angq angq2;
                        if ((angq2 = i.j) == null) {
                            angq2 = angq.a;
                        }
                        if (angq2.b == 153515154) {
                            a = (ajmo)angq2.c;
                            break Label_0096;
                        }
                        a = ajmo.a;
                        break Label_0096;
                    }
                }
            }
            a = null;
        }
        if (a == null) {
            angp a2 = null;
            Label_0185: {
                if (watchNextResponseModel != null) {
                    final angl j = watchNextResponseModel.i;
                    if (j != null) {
                        angq angq3;
                        if ((angq3 = j.j) == null) {
                            angq3 = angq.a;
                        }
                        if (angq3.b == 128392103) {
                            angq angq4;
                            if ((angq4 = j.j) == null) {
                                angq4 = angq.a;
                            }
                            if (angq4.b == 128392103) {
                                a2 = (angp)angq4.c;
                                break Label_0185;
                            }
                            a2 = angp.a;
                            break Label_0185;
                        }
                    }
                }
                a2 = null;
            }
            Spanned b = spanned;
            if (a2 != null) {
                ajut ajut2 = ajut;
                if ((a2.b & 0x1) != 0x0 && (ajut2 = a2.c) == null) {
                    ajut2 = ajut.a;
                }
                b = acak.b(ajut2);
            }
            this.a(b);
            return;
        }
        this.c.e.tu((Object)a);
    }
    
    public final asir[] lX(final abpu abpu) {
        asir asir;
        if (((vai)abpu.ci().g).bx()) {
            asir = abpu.Q().an(new ixr(this, 0), ixp.c);
        }
        else {
            asir = abpu.P().R().P(this.a).an(new ixr(this, 0), ixp.c);
        }
        return new asir[] { asir };
    }
}
