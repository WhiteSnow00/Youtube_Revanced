import java.util.Iterator;
import android.text.TextUtils;
import android.graphics.Rect;
import android.text.style.ImageSpan;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class acnh
{
    final Context a;
    protected final boolean b;
    protected final boolean c;
    protected final boolean d;
    final aujg e;
    private SpannableStringBuilder f;
    private final acni g;
    private Object h;
    private int i;
    
    public acnh(final Context a, final aujg e, final boolean b, final acni g, final boolean d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.h = null;
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
        this.b = b;
        g.getClass();
        this.g = g;
        this.d = d;
        this.c = tsy.e(a);
    }
    
    public acnh(final Context context, final aujg aujg, final boolean b, final acni acni, final byte[] array, final byte[] array2, final byte[] array3) {
        this(context, aujg, b, acni, true, null, null, null);
    }
    
    public static String c(final aotp aotp) {
        if (aotp != null && (aotp.b & 0x8) != 0x0) {
            ahil ahil;
            if ((ahil = aotp.d) == null) {
                ahil = ahil.a;
            }
            if ((ahil.b & 0x1) != 0x0) {
                ahil ahil2;
                if ((ahil2 = aotp.d) == null) {
                    ahil2 = ahil.a;
                }
                ahik ahik;
                if ((ahik = ahil2.c) == null) {
                    ahik = ahik.a;
                }
                if ((ahik.b & 0x2) != 0x0) {
                    ahil ahil3;
                    if ((ahil3 = aotp.d) == null) {
                        ahil3 = ahil.a;
                    }
                    ahik ahik2;
                    if ((ahik2 = ahil3.c) == null) {
                        ahik2 = ahik.a;
                    }
                    return ahik2.c;
                }
            }
        }
        return "";
    }
    
    public final void d(final acnd acnd, final Bitmap bitmap) {
        tbi.f();
        if (bitmap == null) {
            return;
        }
        final Object a = acnd.a;
        if (a == null || a.equals(this.h)) {
            final int b = acnd.b;
            if (b != 0) {
                if (b == this.i) {
                    ImageSpan imageSpan;
                    if (this.b) {
                        final acng acng = (acng)(imageSpan = new acng(this.a, bitmap));
                        if (this.d) {
                            acng.a = this.a.getResources().getDimensionPixelOffset(2131166402);
                            imageSpan = acng;
                        }
                    }
                    else {
                        imageSpan = new ImageSpan(this.a, bitmap);
                    }
                    final float e = acnd.e;
                    final Rect bounds = imageSpan.getDrawable().getBounds();
                    bounds.right = bounds.left + (int)((bounds.right - bounds.left) * e / (bounds.bottom - bounds.top));
                    bounds.bottom = bounds.top + (int)e;
                    imageSpan.getDrawable().setBounds(bounds);
                    final SpannableStringBuilder f = this.f;
                    if (f != null) {
                        final int length = f.length();
                        final int d = acnd.d;
                        if (length >= d) {
                            this.f.setSpan((Object)imageSpan, acnd.c, d, 33);
                        }
                    }
                    this.g.a(this.f, acnd.b);
                }
            }
        }
    }
    
    public final void e() {
        this.f(null, 0, null);
    }
    
    protected final void f(final Object h, final int i, final SpannableStringBuilder f) {
        this.h = h;
        this.i = i;
        this.f = f;
    }
    
    public final void g(final ajut ajut, final CharSequence charSequence, final SpannableStringBuilder spannableStringBuilder, final StringBuilder sb, final Object a, final int b) {
        final float dimension = this.a.getResources().getDimension(2131166401);
        if (ajut != null) {
            if (ajut.c.size() > 0) {
                this.f(a, b, spannableStringBuilder);
                int max = Math.max(spannableStringBuilder.length() - charSequence.length(), 0);
                int max2 = Math.max(sb.length() - charSequence.length(), 0);
                for (final ajuv ajuv : ajut.c) {
                    int length = 0;
                    Label_0389: {
                        if (((ahbc)ajuv).ry((ahaq)ajoi.b)) {
                            final ajoi ajoi = (ajoi)((ahbc)ajuv).rx((ahaq)ajoi.b);
                            aotp aotp;
                            if ((aotp = ((ajoi)((ahbc)ajuv).rx((ahaq)ajoi.b)).f) == null) {
                                aotp = aotp.a;
                            }
                            if ((ajoi.c & 0x4) != 0x0 && aotp.c.size() > 0) {
                                spannableStringBuilder.delete(max, ajuv.c.length() + max);
                                spannableStringBuilder.insert(max, (CharSequence)"\u25a1");
                                final acnd acnd = new acnd();
                                acnd.a = a;
                                acnd.b = b;
                                acnd.e = dimension;
                                acnd.c = max;
                                final int d = max + 1;
                                acnd.d = d;
                                this.e.J(acnd, aotp, Math.round(dimension), this);
                                max = d;
                                if (!this.c) {
                                    continue;
                                }
                                final String c = c(aotp);
                                max = d;
                                if (!TextUtils.isEmpty((CharSequence)c)) {
                                    final StringBuilder sb2 = new StringBuilder(" ");
                                    sb2.append(c);
                                    sb2.append(" ");
                                    sb.insert(max2, sb2.toString());
                                    length = c.length() + 2;
                                    max = d;
                                    break Label_0389;
                                }
                                continue;
                            }
                        }
                        if (ajuv.c.isEmpty()) {
                            continue;
                        }
                        length = ajuv.c.length();
                        final int n = max += length;
                        if (!this.c) {
                            continue;
                        }
                        max = n;
                    }
                    max2 += length;
                }
            }
        }
    }
}
