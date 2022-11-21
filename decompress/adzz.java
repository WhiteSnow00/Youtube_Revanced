import android.graphics.Region$Op;
import android.graphics.Rect;
import android.graphics.Outline;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.os.Build$VERSION;
import android.graphics.ColorFilter;
import android.util.Log;
import android.graphics.Canvas;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint$Style;
import android.os.Looper;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Region;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Matrix;
import java.util.BitSet;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public class adzz extends Drawable implements aeap
{
    private static final String g = "adzz";
    private static final Paint h;
    public adzy a;
    public final aean[] b;
    public final aean[] c;
    public final BitSet d;
    public boolean e;
    public boolean f;
    private final Matrix i;
    private final Path j;
    private final Path k;
    private final RectF l;
    private final RectF m;
    private final Region n;
    private final Region o;
    private aeae p;
    private final Paint q;
    private final Paint r;
    private final adzr s;
    private final aeag t;
    private PorterDuffColorFilter u;
    private PorterDuffColorFilter v;
    private final RectF w;
    private final adzx x;
    
    static {
        final Paint h2 = new Paint(1);
        (h = h2).setColor(-1);
        h2.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
    }
    
    public adzz() {
        this(new aeae());
    }
    
    public adzz(final adzy a) {
        this.b = new aean[4];
        this.c = new aean[4];
        this.d = new BitSet(8);
        this.i = new Matrix();
        this.j = new Path();
        this.k = new Path();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Region();
        this.o = new Region();
        final Paint q = new Paint(1);
        this.q = q;
        final Paint r = new Paint(1);
        this.r = r;
        this.s = new adzr();
        aeag a2;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            a2 = aeaf.a;
        }
        else {
            a2 = new aeag();
        }
        this.t = a2;
        this.w = new RectF();
        this.f = true;
        this.a = a;
        r.setStyle(Paint$Style.STROKE);
        q.setStyle(Paint$Style.FILL);
        this.J();
        this.I(this.getState());
        this.x = new adzx(this);
    }
    
    public adzz(final aeae aeae) {
        this(new adzy(aeae));
    }
    
    public adzz(final Context context, final AttributeSet set, final int n, final int n2) {
        this(aeae.c(context, set, n, n2).a());
    }
    
    private static int A(final int n, final int n2) {
        return n * (n2 + (n2 >>> 7)) >>> 8;
    }
    
    private final PorterDuffColorFilter B(final ColorStateList list, final PorterDuff$Mode porterDuff$Mode, final Paint paint, final boolean b) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (list != null && porterDuff$Mode != null) {
            int n = list.getColorForState(this.getState(), 0);
            if (b) {
                n = this.e(n);
            }
            porterDuffColorFilter = new PorterDuffColorFilter(n, porterDuff$Mode);
        }
        else {
            porterDuffColorFilter = null;
            if (b) {
                final int color = paint.getColor();
                final int e = this.e(color);
                porterDuffColorFilter = porterDuffColorFilter;
                if (e != color) {
                    porterDuffColorFilter = new PorterDuffColorFilter(e, PorterDuff$Mode.SRC_IN);
                }
            }
        }
        return porterDuffColorFilter;
    }
    
    private final RectF C() {
        this.m.set(this.i());
        final float z = this.z();
        this.m.inset(z, z);
        return this.m;
    }
    
    private final void D(final RectF rectF, final Path path) {
        final aeag t = this.t;
        final adzy a = this.a;
        t.b(a.a, a.k, rectF, this.x, path);
        if (this.a.j != 1.0f) {
            this.i.reset();
            final Matrix i = this.i;
            final float j = this.a.j;
            i.setScale(j, j, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.i);
        }
        path.computeBounds(this.w, true);
    }
    
    private final void E(final Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w(adzz.g, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        final int s = this.a.s;
        int i;
        final int n = i = 0;
        if (s != 0) {
            canvas.drawPath(this.j, this.s.e);
            i = n;
        }
        while (i < 4) {
            this.b[i].c(this.s, this.a.r, canvas);
            this.c[i].c(this.s, this.a.r, canvas);
            ++i;
        }
        if (this.f) {
            final int f = this.f();
            final int g = this.g();
            canvas.translate((float)(-f), (float)(-g));
            canvas.drawPath(this.j, adzz.h);
            canvas.translate((float)f, (float)g);
        }
    }
    
    private final void F(final Canvas canvas, final Paint paint, final Path path, final aeae aeae, final RectF rectF) {
        if (aeae.g(rectF)) {
            final float n = aeae.c.a(rectF) * this.a.k;
            canvas.drawRoundRect(rectF, n, n, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }
    
    private final void G() {
        final float c = this.c();
        this.a.r = (int)Math.ceil(0.75f * c);
        this.a.s = (int)Math.ceil(c * 0.25f);
        this.J();
        super.invalidateSelf();
    }
    
    private final boolean H() {
        return (this.a.v == Paint$Style.FILL_AND_STROKE || this.a.v == Paint$Style.STROKE) && this.r.getStrokeWidth() > 0.0f;
    }
    
    private final boolean I(final int[] array) {
        final ColorStateList d = this.a.d;
        boolean b = false;
        if (d != null) {
            final int color = this.q.getColor();
            final int colorForState = this.a.d.getColorForState(array, color);
            b = b;
            if (color != colorForState) {
                this.q.setColor(colorForState);
                b = true;
            }
        }
        if (this.a.e != null) {
            final int color2 = this.r.getColor();
            final int colorForState2 = this.a.e.getColorForState(array, color2);
            if (color2 != colorForState2) {
                this.r.setColor(colorForState2);
                return true;
            }
        }
        return b;
    }
    
    private final boolean J() {
        final PorterDuffColorFilter u = this.u;
        final PorterDuffColorFilter v = this.v;
        final adzy a = this.a;
        this.u = this.B(a.g, a.h, this.q, true);
        final adzy a2 = this.a;
        final ColorStateList f = a2.f;
        this.v = this.B(null, a2.h, this.r, false);
        final boolean u2 = this.a.u;
        return !akq.b((Object)u, (Object)this.u) || !akq.b((Object)v, (Object)this.v);
    }
    
    public static adzz j(final Context context, final float n) {
        final int p2 = adfe.P(context, "adzz");
        final adzz adzz = new adzz();
        adzz.m(context);
        adzz.o(ColorStateList.valueOf(p2));
        adzz.n(n);
        return adzz;
    }
    
    private final float z() {
        if (this.H()) {
            return this.r.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }
    
    public final float a() {
        return this.a.o;
    }
    
    public final float b() {
        return this.a.a.b.a(this.i());
    }
    
    public final float c() {
        final float a = this.a();
        final float p = this.a.p;
        return a + 0.0f;
    }
    
    public final void draw(final Canvas canvas) {
        this.q.setColorFilter((ColorFilter)this.u);
        final int alpha = this.q.getAlpha();
        this.q.setAlpha(A(alpha, this.a.m));
        this.r.setColorFilter((ColorFilter)this.v);
        this.r.setStrokeWidth(this.a.l);
        final int alpha2 = this.r.getAlpha();
        this.r.setAlpha(A(alpha2, this.a.m));
        if (this.e) {
            final float n = -this.z();
            final aeae k = this.k();
            final aead e = k.e();
            e.a = adzw.p(k.b, n);
            e.b = adzw.p(k.c, n);
            e.d = adzw.p(k.e, n);
            e.c = adzw.p(k.d, n);
            final aeae a = e.a();
            this.p = a;
            this.t.a(a, this.a.k, this.C(), this.k);
            this.D(this.i(), this.j);
            this.e = false;
        }
        final adzy a2 = this.a;
        final int q = a2.q;
        Label_0576: {
            if (q != 1 && a2.r > 0 && (q == 2 || (!this.w() && !this.j.isConvex() && Build$VERSION.SDK_INT < 29))) {
                canvas.save();
                canvas.translate((float)this.f(), (float)this.g());
                if (this.f) {
                    final float width = this.w.width();
                    final float n2 = (float)this.getBounds().width();
                    final float height = this.w.height();
                    final float n3 = (float)this.getBounds().height();
                    final int n4 = (int)(width - n2);
                    if (n4 >= 0) {
                        final int n5 = (int)(height - n3);
                        if (n5 >= 0) {
                            final int n6 = (int)this.w.width();
                            final int r = this.a.r;
                            final int n7 = (int)this.w.height();
                            final int r2 = this.a.r;
                            final Bitmap bitmap = Bitmap.createBitmap(n6 + (r + r) + n4, n7 + (r2 + r2) + n5, Bitmap$Config.ARGB_8888);
                            final Canvas canvas2 = new Canvas(bitmap);
                            final int left = this.getBounds().left;
                            final int r3 = this.a.r;
                            final int top = this.getBounds().top;
                            final int r4 = this.a.r;
                            final float n8 = (float)(left - r3 - n4);
                            final float n9 = (float)(top - r4 - n5);
                            canvas2.translate(-n8, -n9);
                            this.E(canvas2);
                            canvas.drawBitmap(bitmap, n8, n9, (Paint)null);
                            bitmap.recycle();
                            canvas.restore();
                            break Label_0576;
                        }
                    }
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                this.E(canvas);
                canvas.restore();
            }
        }
        if (this.a.v == Paint$Style.FILL_AND_STROKE || this.a.v == Paint$Style.FILL) {
            this.F(canvas, this.q, this.j, this.a.a, this.i());
        }
        if (this.H()) {
            this.l(canvas);
        }
        this.q.setAlpha(alpha);
        this.r.setAlpha(alpha2);
    }
    
    protected final int e(final int n) {
        final float c = this.c();
        final adzy a = this.a;
        final float n2 = a.n;
        final adwd b = a.b;
        int a2 = n;
        if (b != null) {
            a2 = b.a(n, c + n2);
        }
        return a2;
    }
    
    public final int f() {
        final adzy a = this.a;
        final double n = a.s;
        final double sin = Math.sin(Math.toRadians(a.t));
        Double.isNaN(n);
        return (int)(n * sin);
    }
    
    public final int g() {
        final adzy a = this.a;
        final double n = a.s;
        final double cos = Math.cos(Math.toRadians(a.t));
        Double.isNaN(n);
        return (int)(n * cos);
    }
    
    public final int getAlpha() {
        return this.a.m;
    }
    
    public final Drawable$ConstantState getConstantState() {
        return (Drawable$ConstantState)this.a;
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    public final void getOutline(final Outline outline) {
        if (this.a.q == 2) {
            return;
        }
        if (this.w()) {
            outline.setRoundRect(this.getBounds(), this.b() * this.a.k);
            return;
        }
        this.D(this.i(), this.j);
        adfe.H(outline, this.j);
    }
    
    public final boolean getPadding(final Rect rect) {
        final Rect i = this.a.i;
        if (i != null) {
            rect.set(i);
            return true;
        }
        return super.getPadding(rect);
    }
    
    public final Region getTransparentRegion() {
        this.n.set(this.getBounds());
        this.D(this.i(), this.j);
        this.o.setPath(this.j, this.n);
        this.n.op(this.o, Region$Op.DIFFERENCE);
        return this.n;
    }
    
    public final ColorStateList h() {
        return this.a.d;
    }
    
    public final RectF i() {
        this.l.set(this.getBounds());
        return this.l;
    }
    
    public final void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }
    
    public boolean isStateful() {
        final boolean stateful = super.isStateful();
        boolean b2;
        final boolean b = b2 = true;
        if (!stateful) {
            final ColorStateList g = this.a.g;
            if (g != null) {
                b2 = b;
                if (g.isStateful()) {
                    return b2;
                }
            }
            final adzy a = this.a;
            final ColorStateList f = a.f;
            final ColorStateList e = a.e;
            if (e != null) {
                b2 = b;
                if (e.isStateful()) {
                    return b2;
                }
            }
            final ColorStateList d = this.a.d;
            if (d != null) {
                if (!d.isStateful()) {
                    return false;
                }
                b2 = b;
            }
            else {
                b2 = false;
            }
        }
        return b2;
    }
    
    public final aeae k() {
        return this.a.a;
    }
    
    protected void l(final Canvas canvas) {
        this.F(canvas, this.r, this.k, this.p, this.C());
    }
    
    public final void m(final Context context) {
        this.a.b = new adwd(context);
        this.G();
    }
    
    public final Drawable mutate() {
        this.a = new adzy(this.a);
        return this;
    }
    
    public final void n(final float o) {
        final adzy a = this.a;
        if (a.o != o) {
            a.o = o;
            this.G();
        }
    }
    
    public final void o(final ColorStateList d) {
        final adzy a = this.a;
        if (a.d != d) {
            a.d = d;
            this.onStateChange(this.getState());
        }
    }
    
    protected final void onBoundsChange(final Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }
    
    protected final boolean onStateChange(final int[] array) {
        final boolean i = this.I(array);
        final boolean j = this.J();
        boolean b2;
        final boolean b = b2 = true;
        if (!i) {
            b2 = (j && b);
        }
        if (b2) {
            this.invalidateSelf();
        }
        return b2;
    }
    
    public final void p(final float k) {
        final adzy a = this.a;
        if (a.k != k) {
            a.k = k;
            this.e = true;
            this.invalidateSelf();
        }
    }
    
    public final void q(final float n) {
        final adzy a = this.a;
        if (a.n != n) {
            a.n = n;
            this.G();
        }
    }
    
    public final void r(final int n) {
        this.s.a(n);
        this.a.u = false;
        super.invalidateSelf();
    }
    
    public final void s(final float n, final int n2) {
        this.v(n);
        this.u(ColorStateList.valueOf(n2));
    }
    
    public final void setAlpha(final int m) {
        final adzy a = this.a;
        if (a.m != m) {
            a.m = m;
            super.invalidateSelf();
        }
    }
    
    public final void setColorFilter(final ColorFilter c) {
        this.a.c = c;
        super.invalidateSelf();
    }
    
    public final void setTint(final int n) {
        this.setTintList(ColorStateList.valueOf(n));
    }
    
    public final void setTintList(final ColorStateList g) {
        this.a.g = g;
        this.J();
        super.invalidateSelf();
    }
    
    public final void setTintMode(final PorterDuff$Mode h) {
        final adzy a = this.a;
        if (a.h != h) {
            a.h = h;
            this.J();
            super.invalidateSelf();
        }
    }
    
    public final void t(final float n, final ColorStateList list) {
        this.v(n);
        this.u(list);
    }
    
    public final void tm(final aeae a) {
        this.a.a = a;
        this.invalidateSelf();
    }
    
    public final void u(final ColorStateList e) {
        final adzy a = this.a;
        if (a.e != e) {
            a.e = e;
            this.onStateChange(this.getState());
        }
    }
    
    public final void v(final float l) {
        this.a.l = l;
        this.invalidateSelf();
    }
    
    public final boolean w() {
        return this.a.a.g(this.i());
    }
    
    public final void x() {
        final adzy a = this.a;
        if (a.q != 2) {
            a.q = 2;
            super.invalidateSelf();
        }
    }
    
    public final void y() {
        final adzy a = this.a;
        if (a.t != 180) {
            a.t = 180;
            super.invalidateSelf();
        }
    }
}
