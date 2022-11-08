import android.content.res.Configuration;
import android.os.Build$VERSION;
import android.graphics.Canvas;
import android.text.TextDirectionHeuristic;
import android.util.Log;
import android.view.Gravity;
import android.text.TextDirectionHeuristics;
import android.text.StaticLayout$Builder;
import android.text.TextUtils;
import android.text.Layout$Alignment;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.text.TextUtils$TruncateAt;
import android.graphics.Rect;
import android.text.StaticLayout;
import android.content.res.ColorStateList;
import android.animation.TimeInterpolator;
import android.text.TextPaint;
import android.graphics.Typeface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adtk
{
    private float A;
    private float B;
    private float C;
    private float D;
    private Typeface E;
    private Typeface F;
    private Typeface G;
    private Typeface H;
    private Typeface I;
    private Typeface J;
    private Typeface K;
    private CharSequence L;
    private float M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private int R;
    private int[] S;
    private boolean T;
    private final TextPaint U;
    private TimeInterpolator V;
    private TimeInterpolator W;
    private float X;
    private float Y;
    private float Z;
    public float a;
    private ColorStateList aa;
    private float ab;
    private float ac;
    private float ad;
    private ColorStateList ae;
    private float af;
    private float ag;
    private StaticLayout ah;
    private float ai;
    private float aj;
    private CharSequence ak;
    private cgi al;
    private cgi am;
    public boolean b;
    public float c;
    public float d;
    public int e;
    public final Rect f;
    public ColorStateList g;
    public ColorStateList h;
    public int i;
    public TextUtils$TruncateAt j;
    public CharSequence k;
    public boolean l;
    public boolean m;
    public final TextPaint n;
    public float o;
    public float p;
    public int q;
    private final View r;
    private final Rect s;
    private final RectF t;
    private int u;
    private int v;
    private float w;
    private float x;
    private float y;
    private float z;
    
    public adtk(final View r) {
        this.u = 16;
        this.v = 16;
        this.w = 15.0f;
        this.x = 15.0f;
        this.j = TextUtils$TruncateAt.END;
        this.m = true;
        this.q = 1;
        this.r = r;
        final TextPaint u = new TextPaint(129);
        this.U = u;
        this.n = new TextPaint((Paint)u);
        this.f = new Rect();
        this.s = new Rect();
        this.t = new RectF();
        this.d = this.a();
        this.f(r.getContext().getResources().getConfiguration());
    }
    
    private static int A(int blue, int blue2, final float n) {
        final float n2 = 1.0f - n;
        final int alpha = Color.alpha(blue);
        final int alpha2 = Color.alpha(blue2);
        final int red = Color.red(blue);
        final int red2 = Color.red(blue2);
        final int green = Color.green(blue);
        final int green2 = Color.green(blue2);
        blue = Color.blue(blue);
        blue2 = Color.blue(blue2);
        return Color.argb(Math.round(alpha * n2 + alpha2 * n), Math.round(red * n2 + red2 * n), Math.round(green * n2 + green2 * n), Math.round(blue * n2 + blue2 * n));
    }
    
    private final int B(final ColorStateList list) {
        if (list == null) {
            return 0;
        }
        final int[] s = this.S;
        if (s != null) {
            return list.getColorForState(s, 0);
        }
        return list.getDefaultColor();
    }
    
    private final void C() {
        final float a = this.a;
        if (this.b) {
            final RectF t = this.t;
            Rect rect;
            if (a < this.d) {
                rect = this.s;
            }
            else {
                rect = this.f;
            }
            t.set(rect);
        }
        else {
            this.t.left = z((float)this.s.left, (float)this.f.left, a, this.V);
            this.t.top = z(this.y, this.z, a, this.V);
            this.t.right = z((float)this.s.right, (float)this.f.right, a, this.V);
            this.t.bottom = z((float)this.s.bottom, (float)this.f.bottom, a, this.V);
        }
        float n;
        if (this.b) {
            if (a < this.d) {
                this.C = this.A;
                this.D = this.y;
                this.E(0.0f);
                n = 0.0f;
            }
            else {
                this.C = this.B;
                this.D = this.z - Math.max(0, this.e);
                this.E(1.0f);
                n = 1.0f;
            }
        }
        else {
            this.C = z(this.A, this.B, a, this.V);
            this.D = z(this.y, this.z, a, this.V);
            this.E(a);
            n = a;
        }
        this.ai = 1.0f - z(0.0f, 1.0f, 1.0f - a, adqd.b);
        ana.H(this.r);
        this.aj = z(1.0f, 0.0f, a, adqd.b);
        ana.H(this.r);
        final ColorStateList h = this.h;
        final ColorStateList g = this.g;
        if (h != g) {
            this.U.setColor(A(this.B(g), this.c(), n));
        }
        else {
            this.U.setColor(this.c());
        }
        final float af = this.af;
        final float o = this.o;
        if (af != o) {
            this.U.setLetterSpacing(z(o, af, a, adqd.b));
        }
        else {
            this.U.setLetterSpacing(af);
        }
        this.O = z(this.ab, this.X, a, null);
        this.P = z(this.ac, this.Y, a, null);
        this.Q = z(this.ad, this.Z, a, null);
        final int a2 = A(this.B(this.ae), this.B(this.aa), a);
        this.R = a2;
        this.U.setShadowLayer(this.O, this.P, this.Q, a2);
        if (this.b) {
            final int alpha = this.U.getAlpha();
            final float d = this.d;
            float n2;
            if (a <= d) {
                n2 = adqd.b(1.0f, 0.0f, this.c, d, a);
            }
            else {
                n2 = adqd.b(0.0f, 1.0f, d, 1.0f, a);
            }
            this.U.setAlpha((int)(n2 * alpha));
        }
        ana.H(this.r);
    }
    
    private final void D(float min, final boolean b) {
        if (this.k == null) {
            return;
        }
        final float n = (float)this.f.width();
        final float n2 = (float)this.s.width();
        float n3;
        float ag;
        Typeface k;
        if (F(min, 1.0f)) {
            n3 = this.x;
            ag = this.af;
            this.M = 1.0f;
            k = this.E;
            min = n;
        }
        else {
            n3 = this.w;
            ag = this.o;
            k = this.H;
            if (F(min, 0.0f)) {
                this.M = 1.0f;
            }
            else {
                this.M = z(this.w, this.x, min, this.W) / this.w;
            }
            min = this.x / this.w;
            if (!b && n2 * min > n) {
                min = Math.min(n / min, n2);
            }
            else {
                min = n2;
            }
        }
        boolean b3;
        if (min > 0.0f) {
            final float n4 = this.N;
            final float ag2 = this.ag;
            final Typeface i = this.K;
            final StaticLayout ah = this.ah;
            final boolean b2 = ah != null && min != ah.getWidth();
            b3 = (n4 != n3 || ag2 != ag || b2 || i != k || this.T);
            this.N = n3;
            this.ag = ag;
            this.K = k;
            this.T = false;
            this.U.setLinearText(this.M != 1.0f);
        }
        else {
            b3 = false;
        }
        if (this.L != null && !b3) {
            return;
        }
        this.U.setTextSize(this.N);
        this.U.setTypeface(this.K);
        this.U.setLetterSpacing(this.ag);
        final int v = this.v(this.k) ? 1 : 0;
        this.l = (v != 0);
        int q;
        if (this.H()) {
            q = this.q;
        }
        else {
            q = 1;
        }
        while (true) {
            if (q == 1) {
                StaticLayout build = null;
                Label_0729: {
                    try {
                        Layout$Alignment layout$Alignment = Layout$Alignment.ALIGN_NORMAL;
                        q = 1;
                        while (true) {
                        Label_0463_Outer:
                            while (true) {
                                while (true) {
                                Block_21:
                                    while (true) {
                                        final CharSequence j = this.k;
                                        final TextPaint u = this.U;
                                        final int n5 = (int)min;
                                        final int length = j.length();
                                        final TextUtils$TruncateAt l = this.j;
                                        CharSequence charSequence = j;
                                        if (j == null) {
                                            charSequence = "";
                                        }
                                        final int max = Math.max(0, n5);
                                        CharSequence ellipsize = charSequence;
                                        int maxLines;
                                        if ((maxLines = q) == 1) {
                                            ellipsize = TextUtils.ellipsize(charSequence, u, (float)max, l);
                                            maxLines = 1;
                                        }
                                        final int min2 = Math.min(ellipsize.length(), length);
                                        Layout$Alignment align_OPPOSITE = layout$Alignment;
                                        if (v != 0) {
                                            align_OPPOSITE = layout$Alignment;
                                            if (maxLines == 1) {
                                                align_OPPOSITE = Layout$Alignment.ALIGN_OPPOSITE;
                                            }
                                        }
                                        final StaticLayout$Builder obtain = StaticLayout$Builder.obtain(ellipsize, 0, min2, u, max);
                                        obtain.setAlignment(align_OPPOSITE);
                                        obtain.setIncludePad(false);
                                        TextDirectionHeuristic textDirection;
                                        if (v != 0) {
                                            textDirection = TextDirectionHeuristics.RTL;
                                        }
                                        else {
                                            textDirection = TextDirectionHeuristics.LTR;
                                        }
                                        obtain.setTextDirection(textDirection);
                                        if (l != null) {
                                            obtain.setEllipsize(l);
                                        }
                                        obtain.setMaxLines(maxLines);
                                        if (maxLines > 1) {
                                            obtain.setHyphenationFrequency(1);
                                        }
                                        build = obtain.build();
                                        break Label_0729;
                                        Label_0471: {
                                            iftrue(Label_0455:)(!this.l);
                                        }
                                        break Block_21;
                                        Label_0481:
                                        layout$Alignment = Layout$Alignment.ALIGN_CENTER;
                                        continue Label_0463_Outer;
                                        layout$Alignment = Layout$Alignment.ALIGN_OPPOSITE;
                                        continue Label_0463_Outer;
                                        layout$Alignment = Layout$Alignment.ALIGN_NORMAL;
                                        continue Label_0463_Outer;
                                    }
                                    continue;
                                }
                                iftrue(Label_0463:)(!this.l);
                                continue Label_0463_Outer;
                            }
                            final int n6 = Gravity.getAbsoluteGravity(this.u, v) & 0x7;
                            iftrue(Label_0481:)(n6 == 1);
                            iftrue(Label_0471:)(n6 == 5);
                            continue;
                        }
                    }
                    catch (final adud adud) {
                        Log.e("CollapsingTextHelper", adud.getCause().getMessage(), (Throwable)adud);
                        build = null;
                    }
                }
                aff.k((Object)build);
                this.ah = build;
                this.L = build.getText();
                return;
            }
            continue;
        }
    }
    
    private final void E(final float n) {
        this.D(n, false);
        ana.H(this.r);
    }
    
    private static boolean F(final float n, final float n2) {
        return Math.abs(n - n2) < 1.0E-5f;
    }
    
    private static boolean G(final Rect rect, final int n, final int n2, final int n3, final int n4) {
        return rect.left == n && rect.top == n2 && rect.right == n3 && rect.bottom == n4;
    }
    
    private final boolean H() {
        return this.q > 1 && (!this.l || this.b);
    }
    
    private static final float I(final TextPaint textPaint, final CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }
    
    private static float z(final float n, final float n2, final float n3, final TimeInterpolator timeInterpolator) {
        float interpolation = n3;
        if (timeInterpolator != null) {
            interpolation = timeInterpolator.getInterpolation(n3);
        }
        return adqd.a(n, n2, interpolation);
    }
    
    public final float a() {
        final float c = this.c;
        return c + (1.0f - c) * 0.5f;
    }
    
    public final float b() {
        final TextPaint n = this.n;
        n.setTextSize(this.x);
        n.setTypeface(this.E);
        n.setLetterSpacing(this.af);
        return -this.n.ascent();
    }
    
    public final int c() {
        return this.B(this.h);
    }
    
    public final void d(final Canvas canvas) {
        final int save = canvas.save();
        if (this.L != null && this.t.width() > 0.0f && this.t.height() > 0.0f) {
            this.U.setTextSize(this.N);
            final float c = this.C;
            final float d = this.D;
            final float m = this.M;
            if (m != 1.0f && !this.b) {
                canvas.scale(m, m, c, d);
            }
            if (this.H() && (!this.b || this.a > this.d)) {
                final float c2 = this.C;
                final int lineStart = this.ah.getLineStart(0);
                final int alpha = this.U.getAlpha();
                canvas.translate(c2 - lineStart, d);
                final float n = (float)alpha;
                this.U.setAlpha((int)(this.aj * n));
                if (Build$VERSION.SDK_INT >= 31) {
                    final TextPaint u = this.U;
                    u.setShadowLayer(this.O, this.P, this.Q, adwd.z(this.R, u.getAlpha()));
                }
                this.ah.draw(canvas);
                this.U.setAlpha((int)(this.ai * n));
                if (Build$VERSION.SDK_INT >= 31) {
                    final TextPaint u2 = this.U;
                    u2.setShadowLayer(this.O, this.P, this.Q, adwd.z(this.R, u2.getAlpha()));
                }
                final int lineBaseline = this.ah.getLineBaseline(0);
                final CharSequence ak = this.ak;
                final float n2 = (float)lineBaseline;
                canvas.drawText(ak, 0, ak.length(), 0.0f, n2, (Paint)this.U);
                if (Build$VERSION.SDK_INT >= 31) {
                    this.U.setShadowLayer(this.O, this.P, this.Q, this.R);
                }
                if (!this.b) {
                    String s2;
                    final String s = s2 = this.ak.toString().trim();
                    if (s.endsWith("\u2026")) {
                        s2 = s.substring(0, s.length() - 1);
                    }
                    this.U.setAlpha(alpha);
                    canvas.drawText(s2, 0, Math.min(this.ah.getLineEnd(0), s2.length()), 0.0f, n2, (Paint)this.U);
                }
            }
            else {
                canvas.translate(c, d);
                this.ah.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }
    
    public final void e(final TextPaint textPaint) {
        textPaint.setTextSize(this.w);
        textPaint.setTypeface(this.H);
        textPaint.setLetterSpacing(this.o);
    }
    
    public final void f(final Configuration configuration) {
        if (Build$VERSION.SDK_INT >= 31) {
            final Typeface g = this.G;
            if (g != null) {
                this.F = adwd.d(configuration, g);
            }
            final Typeface j = this.J;
            if (j != null) {
                this.I = adwd.d(configuration, j);
            }
            Typeface e;
            if ((e = this.F) == null) {
                e = this.G;
            }
            this.E = e;
            Typeface h;
            if ((h = this.I) == null) {
                h = this.J;
            }
            this.H = h;
            this.h(true);
        }
    }
    
    public final void g() {
        this.h(false);
    }
    
    public final void h(final boolean b) {
        boolean b2 = false;
        Label_0028: {
            if (this.r.getHeight() > 0) {
                b2 = b;
                if (this.r.getWidth() > 0) {
                    break Label_0028;
                }
            }
            if (!b) {
                return;
            }
            b2 = true;
        }
        this.D(1.0f, b2);
        final CharSequence l = this.L;
        if (l != null) {
            final StaticLayout ah = this.ah;
            if (ah != null) {
                this.ak = TextUtils.ellipsize(l, this.U, (float)ah.getWidth(), this.j);
            }
        }
        final CharSequence ak = this.ak;
        float i = 0.0f;
        if (ak != null) {
            this.p = I(this.U, ak);
        }
        else {
            this.p = 0.0f;
        }
        final int absoluteGravity = Gravity.getAbsoluteGravity(this.v, (int)(this.l ? 1 : 0));
        final int n = absoluteGravity & 0x70;
        if (n != 48) {
            if (n != 80) {
                this.z = this.f.centerY() - (this.U.descent() - this.U.ascent()) / 2.0f;
            }
            else {
                this.z = this.f.bottom + this.U.ascent();
            }
        }
        else {
            this.z = (float)this.f.top;
        }
        final int n2 = absoluteGravity & 0x800007;
        if (n2 != 1) {
            if (n2 != 5) {
                this.B = (float)this.f.left;
            }
            else {
                this.B = this.f.right - this.p;
            }
        }
        else {
            this.B = this.f.centerX() - this.p / 2.0f;
        }
        this.D(0.0f, b2);
        final StaticLayout ah2 = this.ah;
        float n3;
        if (ah2 != null) {
            n3 = (float)ah2.getHeight();
        }
        else {
            n3 = 0.0f;
        }
        final StaticLayout ah3 = this.ah;
        if (ah3 != null && this.q > 1) {
            i = (float)ah3.getWidth();
        }
        else {
            final CharSequence j = this.L;
            if (j != null) {
                i = I(this.U, j);
            }
        }
        final StaticLayout ah4 = this.ah;
        int lineCount;
        if (ah4 != null) {
            lineCount = ah4.getLineCount();
        }
        else {
            lineCount = 0;
        }
        this.i = lineCount;
        final int absoluteGravity2 = Gravity.getAbsoluteGravity(this.u, (int)(this.l ? 1 : 0));
        final int n4 = absoluteGravity2 & 0x70;
        if (n4 != 48) {
            if (n4 != 80) {
                this.y = this.s.centerY() - n3 / 2.0f;
            }
            else {
                this.y = this.s.bottom - n3 + this.U.descent();
            }
        }
        else {
            this.y = (float)this.s.top;
        }
        final int n5 = absoluteGravity2 & 0x800007;
        if (n5 != 1) {
            if (n5 != 5) {
                this.A = (float)this.s.left;
            }
            else {
                this.A = this.s.right - i;
            }
        }
        else {
            this.A = this.s.centerX() - i / 2.0f;
        }
        this.E(this.a);
        this.C();
    }
    
    public final void i(final ColorStateList list) {
        if (this.h == list && this.g == list) {
            return;
        }
        this.h = list;
        this.g = list;
        this.g();
    }
    
    public final void j(final int n, final int n2, final int n3, final int n4) {
        if (!G(this.f, n, n2, n3, n4)) {
            this.f.set(n, n2, n3, n4);
            this.T = true;
        }
    }
    
    public final void k(final int n) {
        final advw advw = new advw(this.r.getContext(), n);
        final ColorStateList i = advw.i;
        if (i != null) {
            this.h = i;
        }
        final float j = advw.j;
        if (j != 0.0f) {
            this.x = j;
        }
        final ColorStateList a = advw.a;
        if (a != null) {
            this.aa = a;
        }
        this.Y = advw.e;
        this.Z = advw.f;
        this.X = advw.g;
        this.af = advw.h;
        final cgi am = this.am;
        if (am != null) {
            am.j();
        }
        this.am = new cgi((advt)new adtj(this, 1), advw.a());
        advw.d(this.r.getContext(), this.am);
        this.g();
    }
    
    public final void l(final ColorStateList h) {
        if (this.h != h) {
            this.h = h;
            this.g();
        }
    }
    
    public final void m(final int v) {
        if (this.v != v) {
            this.v = v;
            this.g();
        }
    }
    
    public final void n(final int n, final int n2, final int n3, final int n4) {
        if (!G(this.s, n, n2, n3, n4)) {
            this.s.set(n, n2, n3, n4);
            this.T = true;
        }
    }
    
    public final void o(final int n) {
        final advw advw = new advw(this.r.getContext(), n);
        final ColorStateList i = advw.i;
        if (i != null) {
            this.g = i;
        }
        final float j = advw.j;
        if (j != 0.0f) {
            this.w = j;
        }
        final ColorStateList a = advw.a;
        if (a != null) {
            this.ae = a;
        }
        this.ac = advw.e;
        this.ad = advw.f;
        this.ab = advw.g;
        this.o = advw.h;
        final cgi al = this.al;
        if (al != null) {
            al.j();
        }
        this.al = new cgi((advt)new adtj(this, 0), advw.a());
        advw.d(this.r.getContext(), this.al);
        this.g();
    }
    
    public final void p(final int u) {
        if (this.u != u) {
            this.u = u;
            this.g();
        }
    }
    
    public final void q(final float w) {
        if (this.w != w) {
            this.w = w;
            this.g();
        }
    }
    
    public final void r(float u) {
        u = aeh.u(u, 1.0f);
        if (u != this.a) {
            this.a = u;
            this.C();
        }
    }
    
    public final void s(final TimeInterpolator v) {
        this.V = v;
        this.g();
    }
    
    public final void t(final CharSequence k) {
        if (k != null && TextUtils.equals(this.k, k)) {
            return;
        }
        this.k = k;
        this.L = null;
        this.g();
    }
    
    public final void u(final TimeInterpolator w) {
        this.W = w;
        this.g();
    }
    
    public final boolean v(final CharSequence charSequence) {
        final int f = ana.f(this.r);
        boolean b = true;
        if (f != 1) {
            b = false;
        }
        if (this.m) {
            ake ake;
            if (b) {
                ake = akk.d;
            }
            else {
                ake = akk.c;
            }
            return ake.a(charSequence, charSequence.length());
        }
        return b;
    }
    
    public final boolean w(Typeface g) {
        final cgi am = this.am;
        if (am != null) {
            am.j();
        }
        if (this.G != g) {
            this.G = g;
            final Typeface d = adwd.d(this.r.getContext().getResources().getConfiguration(), g);
            this.F = d;
            if ((g = d) == null) {
                g = this.G;
            }
            this.E = g;
            return true;
        }
        return false;
    }
    
    public final boolean x(Typeface j) {
        final cgi al = this.al;
        if (al != null) {
            al.j();
        }
        if (this.J != j) {
            this.J = j;
            final Typeface d = adwd.d(this.r.getContext().getResources().getConfiguration(), j);
            this.I = d;
            if ((j = d) == null) {
                j = this.J;
            }
            this.H = j;
            return true;
        }
        return false;
    }
    
    public final boolean y(final int[] s) {
        this.S = s;
        final ColorStateList h = this.h;
        if (h == null || !h.isStateful()) {
            final ColorStateList g = this.g;
            if (g == null || !g.isStateful()) {
                return false;
            }
        }
        this.g();
        return true;
    }
}
