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

public class acle
{
    final Context a;
    protected final boolean b;
    protected final boolean c;
    protected final boolean d;
    final auip e;
    private SpannableStringBuilder f;
    private final aclf g;
    private Object h;
    private int i;
    
    public acle(final Context a, final auip e, final boolean b, final aclf g, final boolean d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.h = null;
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
        this.b = b;
        g.getClass();
        this.g = g;
        this.d = d;
        this.c = tqt.e(a);
    }
    
    public acle(final Context context, final auip auip, final boolean b, final aclf aclf, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this(context, auip, b, aclf, true, null, null, null, null);
    }
    
    public static String c(final aorm aorm) {
        if (aorm != null && (aorm.b & 0x8) != 0x0) {
            ahgn ahgn;
            if ((ahgn = aorm.d) == null) {
                ahgn = ahgn.a;
            }
            if ((ahgn.b & 0x1) != 0x0) {
                ahgn ahgn2;
                if ((ahgn2 = aorm.d) == null) {
                    ahgn2 = ahgn.a;
                }
                ahgm ahgm;
                if ((ahgm = ahgn2.c) == null) {
                    ahgm = ahgm.a;
                }
                if ((ahgm.b & 0x2) != 0x0) {
                    ahgn ahgn3;
                    if ((ahgn3 = aorm.d) == null) {
                        ahgn3 = ahgn.a;
                    }
                    ahgm ahgm2;
                    if ((ahgm2 = ahgn3.c) == null) {
                        ahgm2 = ahgm.a;
                    }
                    return ahgm2.c;
                }
            }
        }
        return "";
    }
    
    public final void d(final acla acla, final Bitmap bitmap) {
        szc.f();
        if (bitmap == null) {
            return;
        }
        final Object a = acla.a;
        if (a == null || a.equals(this.h)) {
            final int b = acla.b;
            if (b != 0) {
                if (b == this.i) {
                    ImageSpan imageSpan;
                    if (this.b) {
                        final acld acld = (acld)(imageSpan = new acld(this.a, bitmap));
                        if (this.d) {
                            acld.a = this.a.getResources().getDimensionPixelOffset(2131166402);
                            imageSpan = acld;
                        }
                    }
                    else {
                        imageSpan = new ImageSpan(this.a, bitmap);
                    }
                    final float e = acla.e;
                    final Rect bounds = imageSpan.getDrawable().getBounds();
                    bounds.right = bounds.left + (int)((bounds.right - bounds.left) * e / (bounds.bottom - bounds.top));
                    bounds.bottom = bounds.top + (int)e;
                    imageSpan.getDrawable().setBounds(bounds);
                    final SpannableStringBuilder f = this.f;
                    if (f != null) {
                        final int length = f.length();
                        final int d = acla.d;
                        if (length >= d) {
                            this.f.setSpan((Object)imageSpan, acla.c, d, 33);
                        }
                    }
                    this.g.a(this.f, acla.b);
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
    
    public final void g(final ajsq ajsq, final CharSequence charSequence, final SpannableStringBuilder spannableStringBuilder, final StringBuilder sb, final Object a, final int b) {
        final float dimension = this.a.getResources().getDimension(2131166401);
        if (ajsq != null) {
            if (ajsq.c.size() > 0) {
                this.f(a, b, spannableStringBuilder);
                int max = Math.max(spannableStringBuilder.length() - charSequence.length(), 0);
                int max2 = Math.max(sb.length() - charSequence.length(), 0);
            Label_0343_Outer:
                for (final ajss ajss : ajsq.c) {
                    while (true) {
                        Label_0353: {
                            if (!((agzd)ajss).rs((agyr)ajmd.b)) {
                                break Label_0353;
                            }
                            final ajmd ajmd = (ajmd)((agzd)ajss).rr((agyr)ajmd.b);
                            aorm aorm;
                            if ((aorm = ((ajmd)((agzd)ajss).rr((agyr)ajmd.b)).f) == null) {
                                aorm = aorm.a;
                            }
                            if ((ajmd.c & 0x4) == 0x0 || aorm.c.size() <= 0) {
                                break Label_0353;
                            }
                            spannableStringBuilder.delete(max, ajss.c.length() + max);
                            spannableStringBuilder.insert(max, (CharSequence)"\u25a1");
                            final acla acla = new acla();
                            acla.a = a;
                            acla.b = b;
                            acla.e = dimension;
                            acla.c = max;
                            final int d = max + 1;
                            acla.d = d;
                            this.e.J(acla, aorm, Math.round(dimension), this);
                            max = d;
                            if (!this.c) {
                                continue Label_0343_Outer;
                            }
                            final String c = c(aorm);
                            max = d;
                            if (TextUtils.isEmpty((CharSequence)c)) {
                                continue Label_0343_Outer;
                            }
                            final StringBuilder sb2 = new StringBuilder(" ");
                            sb2.append(c);
                            sb2.append(" ");
                            sb.insert(max2, sb2.toString());
                            final int length = c.length() + 2;
                            max = d;
                            max2 += length;
                            continue Label_0343_Outer;
                        }
                        if (!ajss.c.isEmpty()) {
                            final int length = ajss.c.length();
                            final int n = max += length;
                            if (this.c) {
                                max = n;
                                continue;
                            }
                            continue Label_0343_Outer;
                        }
                        break;
                    }
                }
            }
        }
    }
}
