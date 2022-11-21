// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.util.DisplayMetrics;
import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout
{
    public TypedValue b;
    public TypedValue c;
    public TypedValue d;
    public TypedValue e;
    public TypedValue f;
    public TypedValue g;
    public final Rect h;
    public oqz i;
    
    public ContentFrameLayout(final Context context) {
        this(context, null);
    }
    
    public ContentFrameLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ContentFrameLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.h = new Rect();
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Object o = this.i;
        if (o == null) {
            return;
        }
        final Object a = ((oqz)o).a;
        o = a;
        final lq o2 = ((fx)o).o;
        if (o2 != null) {
            o2.a();
        }
        Label_0085: {
            if (((fx)o).r == null) {
                break Label_0085;
            }
            ((fx)o).k.getDecorView().removeCallbacks(((fx)o).s);
            while (true) {
                if (!((fx)o).r.isShowing()) {
                    break Label_0080;
                }
                try {
                    ((fx)a).r.dismiss();
                    ((fx)o).r = null;
                    ((fx)o).T();
                    o = ((fx)o).ad(0).h;
                    if (o != null) {
                        ((in)o).close();
                    }
                }
                catch (final IllegalArgumentException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    protected final void onMeasure(int n, int measureSpec) {
        final DisplayMetrics displayMetrics = this.getContext().getResources().getDisplayMetrics();
        final int widthPixels = displayMetrics.widthPixels;
        final int heightPixels = displayMetrics.heightPixels;
        final int mode = View$MeasureSpec.getMode(n);
        final int n2 = 1;
        final boolean b = widthPixels < heightPixels;
        final int mode2 = View$MeasureSpec.getMode(measureSpec);
        int measureSpec2 = 0;
        Label_0206: {
            if (mode == Integer.MIN_VALUE) {
                TypedValue typedValue;
                if (b) {
                    typedValue = this.e;
                }
                else {
                    typedValue = this.d;
                }
                if (typedValue != null && typedValue.type != 0) {
                    int n4 = 0;
                    Label_0155: {
                        float n3;
                        if (typedValue.type == 5) {
                            n3 = typedValue.getDimension(displayMetrics);
                        }
                        else {
                            if (typedValue.type != 6) {
                                n4 = 0;
                                break Label_0155;
                            }
                            n3 = typedValue.getFraction((float)displayMetrics.widthPixels, (float)displayMetrics.widthPixels);
                        }
                        n4 = (int)n3;
                    }
                    if (n4 > 0) {
                        measureSpec2 = View$MeasureSpec.makeMeasureSpec(Math.min(n4 - (this.h.left + this.h.right), View$MeasureSpec.getSize(n)), 1073741824);
                        n = 1;
                        break Label_0206;
                    }
                }
            }
            final int n5 = 0;
            measureSpec2 = n;
            n = n5;
        }
        int measureSpec3 = measureSpec;
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2;
            if (b) {
                typedValue2 = this.f;
            }
            else {
                typedValue2 = this.g;
            }
            measureSpec3 = measureSpec;
            if (typedValue2 != null) {
                measureSpec3 = measureSpec;
                if (typedValue2.type != 0) {
                    int n7 = 0;
                    Label_0313: {
                        float n6;
                        if (typedValue2.type == 5) {
                            n6 = typedValue2.getDimension(displayMetrics);
                        }
                        else {
                            if (typedValue2.type != 6) {
                                n7 = 0;
                                break Label_0313;
                            }
                            n6 = typedValue2.getFraction((float)displayMetrics.heightPixels, (float)displayMetrics.heightPixels);
                        }
                        n7 = (int)n6;
                    }
                    measureSpec3 = measureSpec;
                    if (n7 > 0) {
                        measureSpec3 = View$MeasureSpec.makeMeasureSpec(Math.min(n7 - (this.h.top + this.h.bottom), View$MeasureSpec.getSize(measureSpec)), 1073741824);
                    }
                }
            }
        }
        super.onMeasure(measureSpec2, measureSpec3);
        final int measuredWidth = this.getMeasuredWidth();
        final int measureSpec4 = View$MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        Label_0524: {
            if (n == 0 && mode == Integer.MIN_VALUE) {
                TypedValue typedValue3;
                if (b) {
                    typedValue3 = this.c;
                }
                else {
                    typedValue3 = this.b;
                }
                if (typedValue3 != null && typedValue3.type != 0) {
                    Label_0476: {
                        float n8;
                        if (typedValue3.type == 5) {
                            n8 = typedValue3.getDimension(displayMetrics);
                        }
                        else {
                            if (typedValue3.type != 6) {
                                n = 0;
                                break Label_0476;
                            }
                            n8 = typedValue3.getFraction((float)displayMetrics.widthPixels, (float)displayMetrics.widthPixels);
                        }
                        n = (int)n8;
                    }
                    measureSpec = n;
                    if (n > 0) {
                        measureSpec = n - (this.h.left + this.h.right);
                    }
                    if (measuredWidth < measureSpec) {
                        measureSpec = View$MeasureSpec.makeMeasureSpec(measureSpec, 1073741824);
                        n = n2;
                        break Label_0524;
                    }
                }
            }
            n = 0;
            measureSpec = measureSpec4;
        }
        if (n != 0) {
            super.onMeasure(measureSpec, measureSpec3);
        }
    }
}
