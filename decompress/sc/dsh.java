import android.graphics.Typeface;
import android.text.TextDirectionHeuristic;
import android.text.TextUtils$TruncateAt;
import android.text.Layout$Alignment;
import android.text.TextPaint;
import android.text.BoringLayout$Metrics;
import android.util.Log;
import android.os.Build$VERSION;
import android.text.TextDirectionHeuristics;
import android.text.StaticLayout$Builder;
import android.graphics.Paint$FontMetricsInt;
import android.text.BoringLayout;
import android.text.style.ClickableSpan;
import android.text.Spannable;
import android.text.Layout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsh
{
    static final abn a;
    public int b;
    public int c;
    public int d;
    public final dsg e;
    public Layout f;
    public boolean g;
    
    static {
        a = new abn(100);
    }
    
    public dsh() {
        this.b = 2;
        this.c = Integer.MAX_VALUE;
        this.d = 2;
        this.e = new dsg();
        this.f = null;
        this.g = true;
    }
    
    public final Layout a() {
        if (this.g) {
            final Layout f = this.f;
            if (f != null) {
                return f;
            }
        }
        final CharSequence h = this.e.h;
        if (h != null && h.length() != 0) {
            final boolean g = this.g;
            final int n = -1;
            boolean b = false;
            Label_0120: {
                if (g) {
                    final CharSequence h2 = this.e.h;
                    if (h2 instanceof Spannable && ((ClickableSpan[])((Spannable)h2).getSpans(0, h2.length() - 1, (Class)ClickableSpan.class)).length > 0) {
                        b = true;
                        break Label_0120;
                    }
                }
                b = false;
            }
            int hashCode = n;
            if (this.g) {
                hashCode = n;
                if (!b) {
                    hashCode = this.e.hashCode();
                    final Layout layout = (Layout)dsh.a.c(hashCode);
                    if (layout != null) {
                        return layout;
                    }
                }
            }
            final dsg e = this.e;
            int o = e.o;
            Object o2 = null;
            Label_0220: {
                if (o == 1) {
                    try {
                        o2 = BoringLayout.isBoring(e.h, e.a);
                        o = 1;
                        break Label_0220;
                    }
                    catch (final NullPointerException ex) {
                        throw ex;
                    }
                }
                o2 = null;
            }
            final dsg e2 = this.e;
            final int g2 = e2.g;
            int n2;
            if (g2 != 0) {
                if (g2 != 1) {
                    n2 = Math.min((int)Math.ceil(Layout.getDesiredWidth(e2.h, e2.a)), this.e.f);
                }
                else {
                    n2 = e2.f;
                }
            }
            else {
                n2 = (int)Math.ceil(Layout.getDesiredWidth(e2.h, e2.a));
            }
            final dsg e3 = this.e;
            final int round = Math.round(e3.a.getFontMetricsInt((Paint$FontMetricsInt)null) * e3.j + e3.k);
            int n3;
            if (this.d == 1) {
                n3 = Math.min(n2, this.c * round);
            }
            else {
                n3 = Math.min(n2, this.c);
            }
            int ellipsizedWidth;
            if (this.b == 1) {
                ellipsizedWidth = Math.max(n3, 0);
            }
            else {
                ellipsizedWidth = Math.max(n3, 0);
            }
            Object f2;
            if (o2 == null) {
                while (true) {
                    try {
                        final CharSequence h3 = this.e.h;
                        final int length = h3.length();
                        final dsg e4 = this.e;
                        final TextPaint a = e4.a;
                        final Layout$Alignment p = e4.p;
                        final float j = e4.j;
                        final float k = e4.k;
                        final boolean l = e4.l;
                        final TextUtils$TruncateAt n4 = e4.n;
                        o2 = e4.q;
                        final int r = e4.r;
                        final boolean m = e4.m;
                        final int n5 = hashCode;
                        try {
                            final StaticLayout$Builder setMaxLines = StaticLayout$Builder.obtain(h3, 0, length, a, ellipsizedWidth).setAlignment(p).setLineSpacing(k, j).setIncludePad(l).setEllipsize(n4).setEllipsizedWidth(ellipsizedWidth).setMaxLines(o);
                            TextDirectionHeuristic textDirection = null;
                            Label_0633: {
                                if (o2 == akl.a) {
                                    textDirection = TextDirectionHeuristics.LTR;
                                }
                                else if (o2 == akl.b) {
                                    textDirection = TextDirectionHeuristics.RTL;
                                }
                                else {
                                    if (o2 != akl.c) {
                                        if (o2 == akl.d) {
                                            textDirection = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                                            break Label_0633;
                                        }
                                        if (o2 == akl.e) {
                                            textDirection = TextDirectionHeuristics.ANYRTL_LTR;
                                            break Label_0633;
                                        }
                                        if (o2 == akl.f) {
                                            textDirection = TextDirectionHeuristics.LOCALE;
                                            break Label_0633;
                                        }
                                    }
                                    textDirection = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                                }
                            }
                            final StaticLayout$Builder setBreakStrategy = setMaxLines.setTextDirection(textDirection).setBreakStrategy(r);
                            try {
                                final StaticLayout$Builder setIndents = setBreakStrategy.setHyphenationFrequency(0).setIndents((int[])null, (int[])null);
                                setIndents.setJustificationMode(0);
                                if (Build$VERSION.SDK_INT >= 28) {
                                    setIndents.setUseLineSpacingFromFallbacks(m);
                                }
                                f2 = setIndents.build();
                                hashCode = n5;
                            }
                            catch (final IndexOutOfBoundsException o2) {}
                        }
                        catch (final IndexOutOfBoundsException o2) {}
                    }
                    catch (final IndexOutOfBoundsException ex2) {}
                    if (this.e.h instanceof String) {
                        throw o2;
                    }
                    Log.e("TextLayoutBuilder", "Hit bug #35412, retrying with Spannables removed", (Throwable)o2);
                    o2 = this.e;
                    ((dsg)o2).h = ((dsg)o2).h.toString();
                }
            }
            else {
                final dsg e5 = this.e;
                f2 = BoringLayout.make(e5.h, e5.a, ellipsizedWidth, e5.p, e5.j, e5.k, (BoringLayout$Metrics)o2, e5.l, e5.n, ellipsizedWidth);
            }
            if (this.g && !b) {
                this.f = (Layout)f2;
                dsh.a.d(hashCode, f2);
            }
            this.e.s = true;
            return (Layout)f2;
        }
        return null;
    }
    
    public final void b(final Layout$Alignment p) {
        final dsg e = this.e;
        if (e.p != p) {
            e.p = p;
            this.f = null;
        }
    }
    
    public final void c(final akf q) {
        final dsg e = this.e;
        if (e.q != q) {
            e.q = q;
            this.f = null;
        }
    }
    
    public final void d(final int n) {
        final float textSize = this.e.a.getTextSize();
        final float textSize2 = (float)n;
        if (textSize != textSize2) {
            this.e.a();
            this.e.a.setTextSize(textSize2);
            this.f = null;
        }
    }
    
    public final void e(final Typeface typeface) {
        if (this.e.a.getTypeface() != typeface) {
            this.e.a();
            this.e.a.setTypeface(typeface);
            this.f = null;
        }
    }
}
