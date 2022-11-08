import android.graphics.Path$Direction;
import android.graphics.RectF;
import android.view.accessibility.AccessibilityNodeInfo;
import android.graphics.Color;
import android.text.TextUtils;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.content.res.Resources;
import android.graphics.EmbossMaskFilter;
import android.graphics.MaskFilter;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableString;
import android.text.Layout;
import android.view.View$MeasureSpec;
import android.text.Editable$Factory;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import android.content.Context;
import android.text.Editable;
import android.graphics.Path;
import android.text.TextPaint;
import android.text.Layout$Alignment;
import android.text.StaticLayout;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abrp extends View
{
    public StaticLayout a;
    public StaticLayout b;
    public final Layout$Alignment c;
    private final TextPaint d;
    private final TextPaint e;
    private final TextPaint f;
    private final Path g;
    private final Editable h;
    private int i;
    private int j;
    private float k;
    
    public abrp(final Context context) {
        super(context);
        this.setLayerType(1, (Paint)null);
        this.setId(2131431823);
        final TextPaint d = new TextPaint();
        (this.d = d).setAntiAlias(true);
        d.setStyle(Paint$Style.FILL);
        final TextPaint e = new TextPaint();
        (this.e = e).setAntiAlias(true);
        e.setColor(0);
        e.setStyle(Paint$Style.STROKE);
        (this.f = new TextPaint()).setAntiAlias(true);
        this.g = new Path();
        this.h = Editable$Factory.getInstance().newEditable((CharSequence)"");
        this.c = Layout$Alignment.ALIGN_CENTER;
        this.k = d.getTextSize() * 0.0625f;
    }
    
    private final int h(final CharSequence charSequence, int size) {
        final int mode = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        final int paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        final int i = this.i;
        float n = 0.0f;
        Label_0114: {
            if (i != 0) {
                if (i == 1) {
                    n = Layout.getDesiredWidth(charSequence, this.e);
                    break Label_0114;
                }
                if (i != 2 && i != 3 && i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException(String.format("Edge type %d is not supported.", i));
                    }
                }
            }
            n = Layout.getDesiredWidth(charSequence, this.d);
        }
        final int n2 = (int)n + (paddingLeft + paddingRight);
        if (mode == 0) {
            return n2;
        }
        if (mode == Integer.MIN_VALUE) {
            return Math.min(n2, size);
        }
        return size;
    }
    
    private final int i() {
        final int i = this.i;
        if (i != 0) {
            if (i == 1) {
                final StaticLayout b = this.b;
                b.getClass();
                return b.getHeight();
            }
            if (i != 2 && i != 3 && i != 4) {
                if (i != 5) {
                    throw new IllegalStateException(String.format("Edge type %d is not supported.", i));
                }
            }
        }
        final StaticLayout a = this.a;
        a.getClass();
        return a.getHeight();
    }
    
    private final int j() {
        final int n = this.getPaddingRight() + this.getPaddingLeft();
        final int i = this.i;
        int j = 0;
        StaticLayout staticLayout = null;
        Label_0088: {
            if (i != 0) {
                if (i == 1) {
                    staticLayout = this.b;
                    break Label_0088;
                }
                if (i != 2 && i != 3 && i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException(String.format("Edge type %d is not supported.", i));
                    }
                }
            }
            staticLayout = this.a;
        }
        if (staticLayout == null) {
            return n;
        }
        final int lineCount = staticLayout.getLineCount();
        int max = 0;
        while (j < lineCount) {
            max = Math.max((int)staticLayout.getLineMax(j), max);
            ++j;
        }
        return max + n;
    }
    
    private final StaticLayout k(int i) {
        final StaticLayout b = this.b;
        final int h = this.h((CharSequence)this.h, i);
        if (b != null) {
            final StaticLayout staticLayout = b;
            if (h == b.getWidth()) {
                return staticLayout;
            }
        }
        final SpannableString spannableString = new SpannableString((CharSequence)this.h);
        final int length = spannableString.length();
        i = 0;
        for (ForegroundColorSpan[] array = (ForegroundColorSpan[])spannableString.getSpans(0, length, (Class)ForegroundColorSpan.class); i < array.length; ++i) {
            spannableString.removeSpan((Object)array[i]);
        }
        return new StaticLayout((CharSequence)spannableString, this.e, h, this.c, 1.0f, 0.0f, true);
    }
    
    private final StaticLayout l(int h) {
        final StaticLayout a = this.a;
        h = this.h((CharSequence)this.h, h);
        if (a != null && h == a.getWidth()) {
            return a;
        }
        return new StaticLayout((CharSequence)this.h, this.d, h, this.c, 1.0f, 0.0f, true);
    }
    
    public final void a() {
        this.h.clear();
        this.setContentDescription((CharSequence)null);
        this.a = null;
        this.b = null;
        this.setVisibility(8);
    }
    
    public final void b(final int color) {
        this.e.setColor(color);
        this.invalidate();
    }
    
    public final void c(final int n) {
        final int i = this.i;
        Label_0047: {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    this.d.setMaskFilter((MaskFilter)null);
                    break Label_0047;
                }
                if (i != 5) {
                    break Label_0047;
                }
            }
            this.d.clearShadowLayer();
        }
        int j = n;
        if (n != 0 && (j = n) != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            j = 0;
                        }
                        else {
                            final Resources resources = this.getResources();
                            this.d.setShadowLayer((float)resources.getDimensionPixelSize(2131169862), 0.0f, (float)resources.getDimensionPixelSize(2131169863), this.e.getColor());
                            j = n;
                        }
                    }
                    else {
                        this.d.setMaskFilter((MaskFilter)new EmbossMaskFilter(new float[] { -1.0f, -1.0f, 1.0f }, 0.0f, 9.0f, 2.0f));
                        j = n;
                    }
                }
                else {
                    this.d.setMaskFilter((MaskFilter)new EmbossMaskFilter(new float[] { 1.0f, 1.0f, 1.0f }, 0.0f, 9.0f, 2.0f));
                    j = n;
                }
            }
            else {
                final TextPaint d = this.d;
                final float k = this.k;
                d.setShadowLayer(k, k, k, this.e.getColor());
                j = n;
            }
        }
        this.i = j;
        this.requestLayout();
    }
    
    public final void d(final CharSequence contentDescription) {
        this.h.clear();
        this.h.append(contentDescription);
        this.setContentDescription(contentDescription);
        this.a = null;
        this.b = null;
        this.requestLayout();
        this.invalidate();
    }
    
    public final void e(final int color) {
        this.d.setColor(color);
        this.invalidate();
    }
    
    public final void f(float applyDimension) {
        applyDimension = TypedValue.applyDimension(2, applyDimension, this.getResources().getDisplayMetrics());
        this.d.setTextSize(applyDimension);
        this.k = 0.0625f * applyDimension;
        this.e.setTextSize(applyDimension);
        this.e.setStrokeWidth(this.k);
        this.c(this.i);
        this.b = null;
        this.a = null;
        this.requestLayout();
        this.invalidate();
    }
    
    public final void g(final Typeface typeface) {
        this.d.setTypeface(typeface);
        this.e.setTypeface(typeface);
        this.f.setTypeface(typeface);
        this.requestLayout();
        this.invalidate();
    }
    
    protected final void onDraw(final Canvas canvas) {
        final StaticLayout b = this.b;
        final StaticLayout a = this.a;
        if (!TextUtils.isEmpty((CharSequence)this.h) && b != null) {
            if (a != null) {
                if (Color.alpha(this.j) != 0) {
                    canvas.drawPath(this.g, (Paint)this.f);
                }
                if (this.i == 1) {
                    b.draw(canvas);
                }
                a.draw(canvas);
            }
        }
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText((CharSequence)this.h);
    }
    
    protected final void onLayout(final boolean b, int i, int lineCount, int lineBottom, int lineTop) {
        super.onLayout(b, i, lineCount, lineBottom, lineTop);
        i = View$MeasureSpec.makeMeasureSpec(lineBottom - i, 1073741824);
        this.a = this.l(i);
        this.b = this.k(i);
        final StaticLayout a = this.a;
        if (a != null) {
            lineCount = a.getLineCount();
            final RectF rectF = new RectF();
            this.g.reset();
            for (i = 0; i < lineCount; ++i) {
                lineBottom = a.getLineBottom(i);
                lineTop = a.getLineTop(i);
                rectF.set(a.getLineLeft(i) - this.getPaddingLeft(), (float)lineTop, a.getLineRight(i) + this.getPaddingRight(), (float)lineBottom);
                this.g.addRect(rectF, Path$Direction.CCW);
            }
        }
    }
    
    protected final void onMeasure(int n, int n2) {
        final int size = View$MeasureSpec.getSize(n);
        final int size2 = View$MeasureSpec.getSize(n2);
        this.a = this.l(n);
        this.b = this.k(n);
        n = View$MeasureSpec.getMode(n);
        if (n == Integer.MIN_VALUE) {
            n = Math.min(size, this.j());
        }
        else if (n == 1073741824) {
            n = size;
        }
        else {
            n = this.j();
        }
        n2 = View$MeasureSpec.getMode(n2);
        if (n2 == Integer.MIN_VALUE) {
            n2 = Math.min(size2, this.i());
        }
        else if (n2 == 1073741824) {
            n2 = size2;
        }
        else {
            n2 = this.i();
        }
        this.setMeasuredDimension(n, n2);
    }
    
    public final void setBackgroundColor(final int n) {
        this.j = n;
        this.f.setColor(n);
        this.invalidate();
    }
}
