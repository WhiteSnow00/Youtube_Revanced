import android.graphics.ColorFilter;
import java.util.Collections;
import java.util.List;
import android.text.SpannableStringBuilder;
import android.graphics.RectF;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.view.View;
import android.view.MotionEvent;
import android.graphics.Rect;
import android.graphics.Color;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.Layout$Alignment;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Handler;
import android.text.style.ImageSpan;
import android.content.res.ColorStateList;
import android.text.Layout;
import android.graphics.Point;
import android.graphics.drawable.Drawable$Callback;
import com.facebook.litho.TextContent;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eey extends Drawable implements TextContent, Drawable$Callback, dwz
{
    private static final Point[] p;
    public Layout a;
    public float c;
    public boolean d;
    public boolean e;
    public CharSequence f;
    public ColorStateList g;
    public int h;
    public int i;
    public ImageSpan[] j;
    public eex k;
    public boolean l;
    public Handler m;
    public String n;
    public elx o;
    private int q;
    private int r;
    private Path s;
    private boolean t;
    private Paint u;
    private eew v;
    
    static {
        p = new Point[] { new Point(0, 0), new Point(0, -12), new Point(-12, -12), new Point(-12, 0), new Point(-12, 12), new Point(0, 12), new Point(12, 12), new Point(12, 0), new Point(12, -12), new Point(0, -24), new Point(-24, -24), new Point(-24, 0), new Point(-24, 24), new Point(0, 24), new Point(24, 24), new Point(24, 0), new Point(24, -24) };
    }
    
    private final int b(int offsetForHorizontal, int n) {
        final int lineForVertical = this.a.getLineForVertical(n);
        float lineLeft;
        float n2;
        if (this.a.getAlignment() == Layout$Alignment.ALIGN_CENTER) {
            lineLeft = this.a.getLineLeft(lineForVertical);
            n2 = this.a.getLineRight(lineForVertical);
        }
        else {
            if (this.a.getParagraphDirection(lineForVertical) == -1) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                lineLeft = this.a.getWidth() - this.a.getLineMax(lineForVertical);
            }
            else {
                lineLeft = (float)this.a.getParagraphLeft(lineForVertical);
            }
            if (n != 0) {
                n2 = (float)this.a.getParagraphRight(lineForVertical);
            }
            else {
                n2 = this.a.getLineMax(lineForVertical);
            }
        }
        final float n3 = (float)offsetForHorizontal;
        if (n3 < lineLeft) {
            return -1;
        }
        if (n3 > n2) {
            return -1;
        }
        try {
            offsetForHorizontal = this.a.getOffsetForHorizontal(lineForVertical, n3);
            return offsetForHorizontal;
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            return -1;
        }
    }
    
    private final ClickableSpan c(int b, final int n) {
        b = this.b(b, n);
        if (b < 0) {
            return null;
        }
        final ClickableSpan[] array = (ClickableSpan[])((Spanned)this.f).getSpans(b, b, (Class)ClickableSpan.class);
        if (array != null && array.length > 0) {
            return array[0];
        }
        return null;
    }
    
    private final void f() {
        final Handler m = this.m;
        if (m != null) {
            m.removeCallbacks((Runnable)this.v);
            this.v = null;
        }
        this.l = false;
    }
    
    private final void g(final int q, final int r) {
        if (Color.alpha(this.i) != 0 && (this.q != q || this.r != r)) {
            this.q = q;
            this.r = r;
            final Paint u = this.u;
            if (u == null) {
                (this.u = new Paint()).setColor(this.i);
            }
            else {
                u.setColor(this.i);
            }
            this.t = true;
            this.invalidateSelf();
        }
    }
    
    private static boolean h(final Rect rect, final MotionEvent motionEvent) {
        return rect.contains((int)motionEvent.getX(), (int)motionEvent.getY());
    }
    
    private final boolean i(final MotionEvent motionEvent) {
        int actionMasked;
        final int n = actionMasked = motionEvent.getActionMasked();
        if (n != 1) {
            if (n != 0) {
                final int n2 = 0;
                actionMasked = n;
                final int n3 = n2;
                return (this.e && h(this.getBounds(), motionEvent) && n3 != 0) || actionMasked == 3;
            }
            actionMasked = 0;
        }
        final int n3 = 1;
        return (this.e && h(this.getBounds(), motionEvent) && n3 != 0) || actionMasked == 3;
    }
    
    private final boolean j(final MotionEvent motionEvent) {
        return this.e && this.m != null && motionEvent.getAction() != 0;
    }
    
    public final void a() {
        this.g(0, 0);
    }
    
    public final boolean d(final MotionEvent motionEvent, final View view) {
        if (this.i(motionEvent) || this.j(motionEvent)) {
            final int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 3) {
                this.a();
                this.f();
            }
            else {
                int n;
                if ((n = actionMasked) == 2) {
                    if (!this.l && this.v != null) {
                        final Rect bounds = this.getBounds();
                        if (!h(bounds, motionEvent)) {
                            this.f();
                        }
                        else if (this.v.a != this.c((int)motionEvent.getX() - bounds.left, (int)motionEvent.getY() - bounds.top)) {
                            this.f();
                        }
                    }
                    n = 2;
                }
                final boolean l = this.l;
                int n2;
                if ((n2 = n) == 1) {
                    this.f();
                    n2 = 1;
                }
                final Rect bounds2 = this.getBounds();
                if (h(bounds2, motionEvent)) {
                    final int n3 = (int)motionEvent.getX() - bounds2.left;
                    final int n4 = (int)motionEvent.getY() - bounds2.top;
                    ClickableSpan c = null;
                    Label_0407: {
                        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 0) {
                            c = this.c(n3, n4);
                        }
                        else {
                            final Point[] p2 = eey.p;
                            final int length = p2.length;
                            ClickableSpan c2 = null;
                            int n5 = 0;
                            ClickableSpan clickableSpan = null;
                        Label_0404:
                            while (true) {
                                clickableSpan = c2;
                                if (n5 >= 17) {
                                    break;
                                }
                                final Point point = p2[n5];
                                final elx o = this.o;
                                if (o != null) {
                                    final Object a = o.a;
                                    if (a != null) {
                                        int n6 = 0;
                                        while (true) {
                                            final omm[] array = (omm[])a;
                                            if (n6 >= array.length) {
                                                break;
                                            }
                                            if (array[n6].e(n3, n4)) {
                                                clickableSpan = c2;
                                                break Label_0404;
                                            }
                                            ++n6;
                                        }
                                    }
                                }
                                c2 = this.c(point.x + n3, point.y + n4);
                                if ((clickableSpan = c2) != null) {
                                    break;
                                }
                                final int b = this.b(point.x + n3, point.y + n4);
                                if (((efl[])((Spanned)this.f).getSpans(b, b, (Class)efl.class)).length > 0) {
                                    c = null;
                                    break Label_0407;
                                }
                                ++n5;
                            }
                            c = clickableSpan;
                        }
                    }
                    if (c != null) {
                        if (n2 == 1) {
                            this.a();
                            if (l ^ true) {
                                c.onClick(view);
                            }
                        }
                        else if (n2 == 0) {
                            if (c instanceof ecy) {
                                final eew v = new eew(this, (ecy)c, view);
                                this.v = v;
                                this.m.postDelayed((Runnable)v, (long)ViewConfiguration.getLongPressTimeout());
                            }
                            final Spanned spanned = (Spanned)this.f;
                            this.g(spanned.getSpanStart((Object)c), spanned.getSpanEnd((Object)c));
                        }
                        return true;
                    }
                    this.a();
                }
            }
        }
        return false;
    }
    
    public final void draw(final Canvas canvas) {
        if (this.a == null) {
            return;
        }
        final int save = canvas.save();
        final Rect bounds = this.getBounds();
        if (this.d) {
            canvas.clipRect(bounds);
        }
        canvas.translate((float)bounds.left, bounds.top + this.c);
        final elx o = this.o;
        Path s = null;
        final int n = 0;
        final int n2 = 0;
        int n3;
        if (o != null) {
            int saveLayer;
            if (o.O()) {
                saveLayer = canvas.saveLayer(new RectF(0.0f, 0.0f, (float)this.getBounds().width(), (float)this.getBounds().height()), (Paint)null);
            }
            else {
                saveLayer = 0;
            }
            final Object a = this.o.a;
            if (a == null) {
                n3 = saveLayer;
            }
            else {
                int n4 = 0;
                while (true) {
                    final omm[] array = (omm[])a;
                    n3 = saveLayer;
                    if (n4 >= array.length) {
                        break;
                    }
                    array[n4].b(canvas);
                    ++n4;
                }
            }
        }
        else {
            n3 = 0;
        }
        try {
            final Layout a2 = this.a;
            if (this.q != this.r) {
                if (Color.alpha(this.i) != 0) {
                    if (this.t) {
                        if (this.s == null) {
                            this.s = new Path();
                        }
                        this.a.getSelectionPath(this.q, this.r, this.s);
                        this.t = false;
                    }
                    s = this.s;
                }
            }
            a2.draw(canvas, s, this.u, 0);
            final elx o2 = this.o;
            if (o2 != null) {
                final Object a3 = o2.a;
                int n5 = n2;
                if (a3 != null) {
                    while (true) {
                        final omm[] array2 = (omm[])a3;
                        if (n5 >= array2.length) {
                            break;
                        }
                        array2[n5].a(canvas);
                        ++n5;
                    }
                }
                if (this.o.O()) {
                    canvas.restoreToCount(n3);
                }
            }
            canvas.restoreToCount(save);
        }
        catch (final IndexOutOfBoundsException ex) {
            final String message = ex.getMessage();
            final StringBuilder sb = new StringBuilder(" [");
            sb.append(this.n);
            sb.append("] ");
            final CharSequence f = this.f;
            if (f instanceof SpannableStringBuilder) {
                final Object[] spans = ((SpannableStringBuilder)f).getSpans(0, f.length(), (Class)Object.class);
                sb.append("spans: ");
                for (int length = spans.length, i = n; i < length; ++i) {
                    sb.append(spans[i].getClass().getSimpleName());
                    sb.append(", ");
                }
            }
            sb.append("ellipsizedWidth: ");
            sb.append(this.a.getEllipsizedWidth());
            sb.append(", lineCount: ");
            sb.append(this.a.getLineCount());
            throw new IndexOutOfBoundsException(String.valueOf(message).concat(sb.toString()));
        }
    }
    
    public final boolean e(final MotionEvent motionEvent) {
        return this.i(motionEvent) || this.j(motionEvent);
    }
    
    public final int getOpacity() {
        return 0;
    }
    
    public final List getTextItems() {
        final CharSequence f = this.f;
        Object o;
        if (f != null) {
            o = Collections.singletonList(f);
        }
        else {
            o = Collections.emptyList();
        }
        return (List)o;
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        this.invalidateSelf();
    }
    
    public final boolean isStateful() {
        return this.g != null;
    }
    
    protected final boolean onStateChange(final int[] array) {
        if (this.g != null) {
            final Layout a = this.a;
            if (a != null) {
                final int color = a.getPaint().getColor();
                final int colorForState = this.g.getColorForState(array, this.h);
                if (colorForState != color) {
                    this.a.getPaint().setColor(colorForState);
                    this.invalidateSelf();
                }
            }
        }
        return super.onStateChange(array);
    }
    
    public final void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        this.scheduleSelf(runnable, n);
    }
    
    public final void setAlpha(final int n) {
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
    }
    
    public final void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}
