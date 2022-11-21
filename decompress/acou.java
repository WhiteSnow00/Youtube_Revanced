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

public class acou
{
    final Context a;
    protected final boolean b;
    protected final boolean c;
    protected final boolean d;
    final aapu e;
    private SpannableStringBuilder f;
    private final acov g;
    private Object h;
    private int i;
    
    public acou(final Context a, final aapu e, final boolean b, final acov g, final boolean d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.h = null;
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
        this.b = b;
        g.getClass();
        this.g = g;
        this.d = d;
        this.c = tua.e(a);
    }
    
    public acou(final Context context, final aapu aapu, final boolean b, final acov acov, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this(context, aapu, b, acov, true, null, null, null, null, null);
    }
    
    public static String c(final aowb aowb) {
        if (aowb != null && (aowb.b & 0x8) != 0x0) {
            ahkc ahkc;
            if ((ahkc = aowb.d) == null) {
                ahkc = ahkc.a;
            }
            if ((ahkc.b & 0x1) != 0x0) {
                ahkc ahkc2;
                if ((ahkc2 = aowb.d) == null) {
                    ahkc2 = ahkc.a;
                }
                ahkb ahkb;
                if ((ahkb = ahkc2.c) == null) {
                    ahkb = ahkb.a;
                }
                if ((ahkb.b & 0x2) != 0x0) {
                    ahkc ahkc3;
                    if ((ahkc3 = aowb.d) == null) {
                        ahkc3 = ahkc.a;
                    }
                    ahkb ahkb2;
                    if ((ahkb2 = ahkc3.c) == null) {
                        ahkb2 = ahkb.a;
                    }
                    return ahkb2.c;
                }
            }
        }
        return "";
    }
    
    public final void d(final acoq acoq, final Bitmap bitmap) {
        tcl.l();
        if (bitmap == null) {
            return;
        }
        final Object a = acoq.a;
        if (a == null || a.equals(this.h)) {
            final int b = acoq.b;
            if (b != 0) {
                if (b == this.i) {
                    ImageSpan imageSpan;
                    if (this.b) {
                        final acot acot = (acot)(imageSpan = new acot(this.a, bitmap));
                        if (this.d) {
                            acot.a = this.a.getResources().getDimensionPixelOffset(2131166404);
                            imageSpan = acot;
                        }
                    }
                    else {
                        imageSpan = new ImageSpan(this.a, bitmap);
                    }
                    final float e = acoq.e;
                    final Rect bounds = imageSpan.getDrawable().getBounds();
                    bounds.right = bounds.left + (int)((bounds.right - bounds.left) * e / (bounds.bottom - bounds.top));
                    bounds.bottom = bounds.top + (int)e;
                    imageSpan.getDrawable().setBounds(bounds);
                    final SpannableStringBuilder f = this.f;
                    if (f != null) {
                        final int length = f.length();
                        final int d = acoq.d;
                        if (length >= d) {
                            this.f.setSpan((Object)imageSpan, acoq.c, d, 33);
                        }
                    }
                    this.g.a(this.f, acoq.b);
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
    
    public final void g(final ajws ajws, final CharSequence charSequence, final SpannableStringBuilder spannableStringBuilder, final StringBuilder sb, final Object a, final int b) {
        final float dimension = this.a.getResources().getDimension(2131166403);
        if (ajws != null) {
            if (ajws.c.size() > 0) {
                this.f(a, b, spannableStringBuilder);
                int max = Math.max(spannableStringBuilder.length() - charSequence.length(), 0);
                int max2 = Math.max(sb.length() - charSequence.length(), 0);
                for (final ajwu ajwu : ajws.c) {
                    int length = 0;
                    Label_0389: {
                        if (((ahcu)ajwu).ry((ahci)ajqh.b)) {
                            final ajqh ajqh = (ajqh)((ahcu)ajwu).rx((ahci)ajqh.b);
                            aowb aowb;
                            if ((aowb = ((ajqh)((ahcu)ajwu).rx((ahci)ajqh.b)).f) == null) {
                                aowb = aowb.a;
                            }
                            if ((ajqh.c & 0x4) != 0x0 && aowb.c.size() > 0) {
                                spannableStringBuilder.delete(max, ajwu.c.length() + max);
                                spannableStringBuilder.insert(max, (CharSequence)"\u25a1");
                                final acoq acoq = new acoq();
                                acoq.a = a;
                                acoq.b = b;
                                acoq.e = dimension;
                                acoq.c = max;
                                final int d = max + 1;
                                acoq.d = d;
                                this.e.bX(acoq, aowb, Math.round(dimension), this);
                                max = d;
                                if (!this.c) {
                                    continue;
                                }
                                final String c = c(aowb);
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
                        if (ajwu.c.isEmpty()) {
                            continue;
                        }
                        length = ajwu.c.length();
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
