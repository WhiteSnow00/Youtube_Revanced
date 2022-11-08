import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import android.text.TextUtils;
import android.text.Spanned;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iwu implements abnq
{
    private final asho a;
    private CharSequence b;
    private final iwx c;
    
    public iwu(final iwx c, final asho a) {
        c.getClass();
        this.c = c;
        this.a = a;
    }
    
    public final void a(final Spanned b) {
        if (TextUtils.equals(this.b, (CharSequence)b)) {
            return;
        }
        final iwx c = this.c;
        Object o;
        if (b == null) {
            o = "";
        }
        else {
            o = b;
        }
        c.e.tr(o);
        this.b = (CharSequence)b;
    }
    
    public final void b(final WatchNextResponseModel watchNextResponseModel) {
        final Spanned spanned = null;
        final ajsq ajsq = null;
        ajkj a = null;
        Label_0105: {
            if (watchNextResponseModel != null) {
                final aneh i = watchNextResponseModel.i;
                if (i != null) {
                    anem anem;
                    if ((anem = i.j) == null) {
                        anem = anem.a;
                    }
                    if (anem.b == 153515154) {
                        anem anem2;
                        if ((anem2 = i.j) == null) {
                            anem2 = anem.a;
                        }
                        if (anem2.b == 153515154) {
                            a = (ajkj)anem2.c;
                            break Label_0105;
                        }
                        a = ajkj.a;
                        break Label_0105;
                    }
                }
            }
            a = null;
        }
        if (a == null) {
            anel a2 = null;
            Label_0201: {
                if (watchNextResponseModel != null) {
                    final aneh j = watchNextResponseModel.i;
                    if (j != null) {
                        anem anem3;
                        if ((anem3 = j.j) == null) {
                            anem3 = anem.a;
                        }
                        if (anem3.b == 128392103) {
                            anem anem4;
                            if ((anem4 = j.j) == null) {
                                anem4 = anem.a;
                            }
                            if (anem4.b == 128392103) {
                                a2 = (anel)anem4.c;
                                break Label_0201;
                            }
                            a2 = anel.a;
                            break Label_0201;
                        }
                    }
                }
                a2 = null;
            }
            Spanned b = spanned;
            if (a2 != null) {
                ajsq ajsq2 = ajsq;
                if ((a2.b & 0x1) != 0x0 && (ajsq2 = a2.c) == null) {
                    ajsq2 = ajsq.a;
                }
                b = abyh.b(ajsq2);
            }
            this.a(b);
            return;
        }
        this.c.e.tr((Object)a);
    }
    
    public final asic[] lX(final abns abns) {
        asic asic;
        if (((uyi)abns.cd().h).bx()) {
            asic = abns.R().am((asix)new iws(this, 2), (asix)iwn.d);
        }
        else {
            asic = abns.Q().R().P(this.a).am((asix)new iws(this, 2), (asix)iwn.d);
        }
        return new asic[] { asic };
    }
}
