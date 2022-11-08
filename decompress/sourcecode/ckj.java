import android.content.res.TypedArray;
import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParserException;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Matrix;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ckj extends ckb
{
    static final PorterDuff$Mode a;
    public ckh b;
    public boolean c;
    private PorterDuffColorFilter d;
    private ColorFilter f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;
    
    static {
        a = PorterDuff$Mode.SRC_IN;
    }
    
    public ckj() {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = new ckh();
    }
    
    public ckj(final ckh b) {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = b;
        this.d = this.b(b.c, b.d);
    }
    
    static int a(final int n, final float n2) {
        return (int)(Color.alpha(n) * n2) << 24 | (0xFFFFFF & n);
    }
    
    final PorterDuffColorFilter b(final ColorStateList list, final PorterDuff$Mode porterDuff$Mode) {
        if (list != null && porterDuff$Mode != null) {
            return new PorterDuffColorFilter(list.getColorForState(this.getState(), 0), porterDuff$Mode);
        }
        return null;
    }
    
    public final boolean canApplyTheme() {
        final Drawable e = this.e;
        if (e != null) {
            aip.i(e);
        }
        return false;
    }
    
    public final void draw(final Canvas canvas) {
        final Drawable e = this.e;
        if (e != null) {
            e.draw(canvas);
            return;
        }
        this.copyBounds(this.j);
        if (this.j.width() > 0) {
            if (this.j.height() > 0) {
                Object colorFilter;
                if ((colorFilter = this.f) == null) {
                    colorFilter = this.d;
                }
                canvas.getMatrix(this.i);
                this.i.getValues(this.h);
                float abs = Math.abs(this.h[0]);
                float abs2 = Math.abs(this.h[4]);
                final float abs3 = Math.abs(this.h[1]);
                final float abs4 = Math.abs(this.h[3]);
                if (abs3 != 0.0f || abs4 != 0.0f) {
                    abs = 1.0f;
                    abs2 = 1.0f;
                }
                final int width = this.j.width();
                final int height = this.j.height();
                final int min = Math.min(2048, (int)(width * abs));
                final int min2 = Math.min(2048, (int)(height * abs2));
                if (min > 0) {
                    if (min2 > 0) {
                        final int save = canvas.save();
                        canvas.translate((float)this.j.left, (float)this.j.top);
                        if (this.isAutoMirrored() && aiq.a((Drawable)this) == 1) {
                            canvas.translate((float)this.j.width(), 0.0f);
                            canvas.scale(-1.0f, 1.0f);
                        }
                        this.j.offsetTo(0, 0);
                        final ckh b = this.b;
                        final Bitmap f = b.f;
                        if (f == null || min != f.getWidth() || min2 != b.f.getHeight()) {
                            b.f = Bitmap.createBitmap(min, min2, Bitmap$Config.ARGB_8888);
                            b.k = true;
                        }
                        if (!this.c) {
                            this.b.a(min, min2);
                        }
                        else {
                            final ckh b2 = this.b;
                            if (b2.k || b2.g != b2.c || b2.h != b2.d || b2.j != b2.e || b2.i != b2.b.getRootAlpha()) {
                                this.b.a(min, min2);
                                final ckh b3 = this.b;
                                b3.g = b3.c;
                                b3.h = b3.d;
                                b3.i = b3.b.getRootAlpha();
                                b3.j = b3.e;
                                b3.k = false;
                            }
                        }
                        final ckh b4 = this.b;
                        final Rect j = this.j;
                        Paint l = null;
                        Label_0561: {
                            if (b4.b.getRootAlpha() >= 255) {
                                if (colorFilter == null) {
                                    l = null;
                                    break Label_0561;
                                }
                            }
                            if (b4.l == null) {
                                (b4.l = new Paint()).setFilterBitmap(true);
                            }
                            b4.l.setAlpha(b4.b.getRootAlpha());
                            b4.l.setColorFilter((ColorFilter)colorFilter);
                            l = b4.l;
                        }
                        canvas.drawBitmap(b4.f, (Rect)null, j, l);
                        canvas.restoreToCount(save);
                    }
                }
            }
        }
    }
    
    public final int getAlpha() {
        final Drawable e = this.e;
        if (e != null) {
            return aio.a(e);
        }
        return this.b.b.getRootAlpha();
    }
    
    public final int getChangingConfigurations() {
        final Drawable e = this.e;
        if (e != null) {
            return e.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }
    
    public final ColorFilter getColorFilter() {
        final Drawable e = this.e;
        if (e != null) {
            return aip.a(e);
        }
        return this.f;
    }
    
    public final Drawable$ConstantState getConstantState() {
        final Drawable e = this.e;
        if (e != null) {
            return (Drawable$ConstantState)new cki(e.getConstantState());
        }
        this.b.a = this.getChangingConfigurations();
        return (Drawable$ConstantState)this.b;
    }
    
    public final int getIntrinsicHeight() {
        final Drawable e = this.e;
        if (e != null) {
            return e.getIntrinsicHeight();
        }
        return (int)this.b.b.f;
    }
    
    public final int getIntrinsicWidth() {
        final Drawable e = this.e;
        if (e != null) {
            return e.getIntrinsicWidth();
        }
        return (int)this.b.b.e;
    }
    
    public final int getOpacity() {
        final Drawable e = this.e;
        if (e != null) {
            return e.getOpacity();
        }
        return -3;
    }
    
    public final void inflate(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set) {
        final Drawable e = this.e;
        if (e != null) {
            e.inflate(resources, xmlPullParser, set);
            return;
        }
        this.inflate(resources, xmlPullParser, set, null);
    }
    
    public final void inflate(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final Drawable e = this.e;
        if (e != null) {
            aip.c(e, resources, xmlPullParser, set, resources$Theme);
            return;
        }
        final ckh b = this.b;
        b.b = new ckg();
        final TypedArray f = vh.f(resources, resources$Theme, set, cjs.a);
        final ckh b2 = this.b;
        final ckg b3 = b2.b;
        final int d = vh.d(f, xmlPullParser, "tintMode", 6, -1);
        PorterDuff$Mode d2 = PorterDuff$Mode.SRC_IN;
        if (d != 3) {
            if (d != 5) {
                if (d != 9) {
                    switch (d) {
                        case 16: {
                            d2 = PorterDuff$Mode.ADD;
                            break;
                        }
                        case 15: {
                            d2 = PorterDuff$Mode.SCREEN;
                            break;
                        }
                        case 14: {
                            d2 = PorterDuff$Mode.MULTIPLY;
                            break;
                        }
                    }
                }
                else {
                    d2 = PorterDuff$Mode.SRC_ATOP;
                }
            }
            else {
                d2 = PorterDuff$Mode.SRC_IN;
            }
        }
        else {
            d2 = PorterDuff$Mode.SRC_OVER;
        }
        b2.d = d2;
        ColorStateList c;
        if (vh.j(xmlPullParser, "tint")) {
            final TypedValue typedValue = new TypedValue();
            f.getValue(1, typedValue);
            if (typedValue.type == 2) {
                new StringBuilder("Failed to resolve attribute at index 1: ").append(typedValue);
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: ".concat(typedValue.toString()));
            }
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                c = ColorStateList.valueOf(typedValue.data);
            }
            else {
                c = ahh.c(f.getResources(), f.getResourceId(1, 0), resources$Theme);
            }
        }
        else {
            c = null;
        }
        if (c != null) {
            b2.c = c;
        }
        boolean e2 = b2.e;
        if (vh.j(xmlPullParser, "autoMirrored")) {
            e2 = f.getBoolean(5, e2);
        }
        b2.e = e2;
        b3.g = vh.b(f, xmlPullParser, "viewportWidth", 7, b3.g);
        final float b4 = vh.b(f, xmlPullParser, "viewportHeight", 8, b3.h);
        b3.h = b4;
        if (b3.g <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(f.getPositionDescription()).concat("<vector> tag requires viewportWidth > 0"));
        }
        if (b4 <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(f.getPositionDescription()).concat("<vector> tag requires viewportHeight > 0"));
        }
        b3.e = f.getDimension(3, b3.e);
        final float dimension = f.getDimension(2, b3.f);
        b3.f = dimension;
        if (b3.e <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(f.getPositionDescription()).concat("<vector> tag requires width > 0"));
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(f.getPositionDescription()).concat("<vector> tag requires height > 0"));
        }
        b3.setAlpha(vh.b(f, xmlPullParser, "alpha", 4, b3.getAlpha()));
        final String string = f.getString(0);
        if (string != null) {
            b3.j = string;
            ((abn)b3.l).put((Object)string, (Object)b3);
        }
        f.recycle();
        b.a = this.getChangingConfigurations();
        b.k = true;
        final ckh b5 = this.b;
        final ckg b6 = b5.b;
        final ArrayDeque<cke> arrayDeque = new ArrayDeque<cke>();
        arrayDeque.push(b6.d);
        int n = xmlPullParser.getEventType();
        final int n2 = xmlPullParser.getDepth() + 1;
        int n3 = 1;
        while (n != 1 && (xmlPullParser.getDepth() >= n2 || n != 3)) {
            int n4 = 0;
            Label_1607: {
                if (n == 2) {
                    final String name = xmlPullParser.getName();
                    final cke cke = arrayDeque.peek();
                    if (cke != null) {
                        if ("path".equals(name)) {
                            final ckd ckd = new ckd();
                            final TypedArray f2 = vh.f(resources, resources$Theme, set, cjs.c);
                            ckd.a = null;
                            if (vh.j(xmlPullParser, "pathData")) {
                                final String string2 = f2.getString(0);
                                if (string2 != null) {
                                    ckd.n = string2;
                                }
                                final String string3 = f2.getString(2);
                                if (string3 != null) {
                                    ckd.m = vi.b(string3);
                                }
                                ckd.l = vh.n(f2, xmlPullParser, resources$Theme, "fillColor", 1);
                                ckd.d = vh.b(f2, xmlPullParser, "fillAlpha", 12, ckd.d);
                                final int d3 = vh.d(f2, xmlPullParser, "strokeLineCap", 8, -1);
                                Paint$Cap h = ckd.h;
                                if (d3 != 0) {
                                    if (d3 != 1) {
                                        if (d3 == 2) {
                                            h = Paint$Cap.SQUARE;
                                        }
                                    }
                                    else {
                                        h = Paint$Cap.ROUND;
                                    }
                                }
                                else {
                                    h = Paint$Cap.BUTT;
                                }
                                ckd.h = h;
                                final int d4 = vh.d(f2, xmlPullParser, "strokeLineJoin", 9, -1);
                                Paint$Join i = ckd.i;
                                if (d4 != 0) {
                                    if (d4 != 1) {
                                        if (d4 == 2) {
                                            i = Paint$Join.BEVEL;
                                        }
                                    }
                                    else {
                                        i = Paint$Join.ROUND;
                                    }
                                }
                                else {
                                    i = Paint$Join.MITER;
                                }
                                ckd.i = i;
                                ckd.j = vh.b(f2, xmlPullParser, "strokeMiterLimit", 10, ckd.j);
                                ckd.k = vh.n(f2, xmlPullParser, resources$Theme, "strokeColor", 3);
                                ckd.c = vh.b(f2, xmlPullParser, "strokeAlpha", 11, ckd.c);
                                ckd.b = vh.b(f2, xmlPullParser, "strokeWidth", 4, ckd.b);
                                ckd.f = vh.b(f2, xmlPullParser, "trimPathEnd", 6, ckd.f);
                                ckd.g = vh.b(f2, xmlPullParser, "trimPathOffset", 7, ckd.g);
                                ckd.e = vh.b(f2, xmlPullParser, "trimPathStart", 5, ckd.e);
                                ckd.o = vh.d(f2, xmlPullParser, "fillType", 13, ckd.o);
                            }
                            f2.recycle();
                            cke.b.add(ckd);
                            if (((ckf)ckd).getPathName() != null) {
                                ((abn)b6.l).put((Object)((ckf)ckd).getPathName(), (Object)ckd);
                            }
                            final int a = b5.a;
                            n4 = 0;
                            break Label_1607;
                        }
                        if ("clip-path".equals(name)) {
                            final ckc ckc = new ckc();
                            if (vh.j(xmlPullParser, "pathData")) {
                                final TypedArray f3 = vh.f(resources, resources$Theme, set, cjs.d);
                                final String string4 = f3.getString(0);
                                if (string4 != null) {
                                    ckc.n = string4;
                                }
                                final String string5 = f3.getString(1);
                                if (string5 != null) {
                                    ckc.m = vi.b(string5);
                                }
                                ckc.o = vh.d(f3, xmlPullParser, "fillType", 2, 0);
                                f3.recycle();
                            }
                            cke.b.add(ckc);
                            if (((ckf)ckc).getPathName() != null) {
                                ((abn)b6.l).put((Object)((ckf)ckc).getPathName(), (Object)ckc);
                            }
                            final int a2 = b5.a;
                            n4 = n3;
                            break Label_1607;
                        }
                        if ("group".equals(name)) {
                            final cke cke2 = new cke();
                            final TypedArray f4 = vh.f(resources, resources$Theme, set, cjs.b);
                            cke2.l = null;
                            cke2.c = vh.b(f4, xmlPullParser, "rotation", 5, cke2.c);
                            cke2.d = f4.getFloat(1, cke2.d);
                            cke2.e = f4.getFloat(2, cke2.e);
                            cke2.f = vh.b(f4, xmlPullParser, "scaleX", 3, cke2.f);
                            cke2.g = vh.b(f4, xmlPullParser, "scaleY", 4, cke2.g);
                            cke2.h = vh.b(f4, xmlPullParser, "translateX", 6, cke2.h);
                            cke2.i = vh.b(f4, xmlPullParser, "translateY", 7, cke2.i);
                            final String string6 = f4.getString(0);
                            if (string6 != null) {
                                cke2.m = string6;
                            }
                            cke2.m();
                            f4.recycle();
                            cke.b.add(cke2);
                            arrayDeque.push(cke2);
                            if (cke2.getGroupName() != null) {
                                ((abn)b6.l).put((Object)cke2.getGroupName(), (Object)cke2);
                            }
                            final int a3 = b5.a;
                        }
                    }
                    n4 = n3;
                }
                else {
                    n4 = n3;
                    if (n == 3) {
                        n4 = n3;
                        if ("group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                            n4 = n3;
                        }
                    }
                }
            }
            n = xmlPullParser.next();
            n3 = n4;
        }
        if (n3 == 0) {
            this.d = this.b(b.c, b.d);
            return;
        }
        throw new XmlPullParserException("no path defined");
    }
    
    public final void invalidateSelf() {
        final Drawable e = this.e;
        if (e != null) {
            e.invalidateSelf();
            return;
        }
        super.invalidateSelf();
    }
    
    public final boolean isAutoMirrored() {
        final Drawable e = this.e;
        if (e != null) {
            return aio.e(e);
        }
        return this.b.e;
    }
    
    public final boolean isStateful() {
        final Drawable e = this.e;
        if (e != null) {
            return e.isStateful();
        }
        final boolean stateful = super.isStateful();
        boolean b2;
        final boolean b = b2 = true;
        if (!stateful) {
            final ckh b3 = this.b;
            if (b3 != null) {
                b2 = b;
                if (b3.b()) {
                    return b2;
                }
                final ColorStateList c = this.b.c;
                if (c != null) {
                    if (c.isStateful()) {
                        b2 = b;
                        return b2;
                    }
                    return false;
                }
            }
            b2 = false;
        }
        return b2;
    }
    
    public final Drawable mutate() {
        final Drawable e = this.e;
        if (e != null) {
            e.mutate();
            return (Drawable)this;
        }
        if (!this.g && super.mutate() == this) {
            this.b = new ckh(this.b);
            this.g = true;
        }
        return (Drawable)this;
    }
    
    protected final void onBoundsChange(final Rect bounds) {
        final Drawable e = this.e;
        if (e != null) {
            e.setBounds(bounds);
        }
    }
    
    protected final boolean onStateChange(final int[] state) {
        final Drawable e = this.e;
        if (e != null) {
            return e.setState(state);
        }
        final ckh b = this.b;
        final ColorStateList c = b.c;
        boolean b2 = false;
        if (c != null) {
            final PorterDuff$Mode d = b.d;
            b2 = b2;
            if (d != null) {
                this.d = this.b(c, d);
                this.invalidateSelf();
                b2 = true;
            }
        }
        if (b.b()) {
            final boolean c2 = b.b.d.c(state);
            b.k |= c2;
            if (c2) {
                this.invalidateSelf();
                return true;
            }
        }
        return b2;
    }
    
    public final void scheduleSelf(final Runnable runnable, final long n) {
        final Drawable e = this.e;
        if (e != null) {
            e.scheduleSelf(runnable, n);
            return;
        }
        super.scheduleSelf(runnable, n);
    }
    
    public final void setAlpha(final int n) {
        final Drawable e = this.e;
        if (e != null) {
            e.setAlpha(n);
            return;
        }
        if (this.b.b.getRootAlpha() != n) {
            this.b.b.setRootAlpha(n);
            this.invalidateSelf();
        }
    }
    
    public final void setAutoMirrored(final boolean e) {
        final Drawable e2 = this.e;
        if (e2 != null) {
            aio.d(e2, e);
            return;
        }
        this.b.e = e;
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        final Drawable e = this.e;
        if (e != null) {
            e.setColorFilter(colorFilter);
            return;
        }
        this.f = colorFilter;
        this.invalidateSelf();
    }
    
    public final void setTint(final int n) {
        final Drawable e = this.e;
        if (e != null) {
            aip.f(e, n);
            return;
        }
        this.setTintList(ColorStateList.valueOf(n));
    }
    
    public final void setTintList(final ColorStateList c) {
        final Drawable e = this.e;
        if (e != null) {
            aip.g(e, c);
            return;
        }
        final ckh b = this.b;
        if (b.c != c) {
            b.c = c;
            this.d = this.b(c, b.d);
            this.invalidateSelf();
        }
    }
    
    public final void setTintMode(final PorterDuff$Mode d) {
        final Drawable e = this.e;
        if (e != null) {
            aip.h(e, d);
            return;
        }
        final ckh b = this.b;
        if (b.d != d) {
            b.d = d;
            this.d = this.b(b.c, d);
            this.invalidateSelf();
        }
    }
    
    public final boolean setVisible(final boolean b, final boolean b2) {
        final Drawable e = this.e;
        if (e != null) {
            return e.setVisible(b, b2);
        }
        return super.setVisible(b, b2);
    }
    
    public final void unscheduleSelf(final Runnable runnable) {
        final Drawable e = this.e;
        if (e != null) {
            e.unscheduleSelf(runnable);
            return;
        }
        super.unscheduleSelf(runnable);
    }
}
