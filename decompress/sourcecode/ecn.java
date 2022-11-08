import android.graphics.Matrix$ScaleToFit;
import android.graphics.RectF;
import android.view.View$MeasureSpec;
import android.graphics.drawable.Drawable;
import android.widget.ImageView$ScaleType;

// 
// Decompiled by Procyon v0.6.0
// 

final class ecn
{
    static {
        ImageView$ScaleType.values();
    }
    
    static boolean a(@dyi final dua dua, @dyi(a = dyj.l) final dua dua2) {
        return dua.b != dua.a || !ble.f((Drawable)dua2.b, (Drawable)dua2.a);
    }
    
    static void b(final dvv dvv, final Integer n, final Integer n2) {
        dvv.a(n, n2);
    }
    
    static dvv c() {
        return new dvv();
    }
    
    static void d(int measureSpec, final int n, final dwp dwp, @dyi(a = dyj.l) final Drawable drawable) {
        if (drawable == null || drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            dwp.a = 0;
            dwp.b = 0;
            return;
        }
        final int intrinsicHeight = drawable.getIntrinsicHeight();
        final int intrinsicWidth = drawable.getIntrinsicWidth();
        if (View$MeasureSpec.getMode(measureSpec) == 0 && View$MeasureSpec.getMode(n) == 0) {
            dwp.a = intrinsicWidth;
            dwp.b = intrinsicHeight;
            return;
        }
        final float n2 = intrinsicWidth / (float)intrinsicHeight;
        int measureSpec2 = measureSpec;
        if (View$MeasureSpec.getMode(measureSpec) == Integer.MIN_VALUE) {
            measureSpec2 = measureSpec;
            if (View$MeasureSpec.getSize(measureSpec) > intrinsicWidth) {
                measureSpec2 = View$MeasureSpec.makeMeasureSpec(intrinsicWidth, Integer.MIN_VALUE);
            }
        }
        measureSpec = n;
        if (View$MeasureSpec.getMode(n) == Integer.MIN_VALUE) {
            measureSpec = n;
            if (View$MeasureSpec.getSize(n) > intrinsicHeight) {
                measureSpec = View$MeasureSpec.makeMeasureSpec(intrinsicHeight, Integer.MIN_VALUE);
            }
        }
        blz.h(measureSpec2, measureSpec, n2, dwp);
    }
    
    static void e(final dvv dvv, @dyi(a = dyj.l) final Drawable drawable, final dug dug) {
        dvv.b(drawable, dug);
    }
    
    static void f(final dvv dvv) {
        dvv.c();
    }
    
    static void g(final dta dta, @dyi(a = dyj.l) final Drawable drawable, @dyi final ImageView$ScaleType imageView$ScaleType, final elw elw, final elw elw2, final elw elw3) {
        final int n = dta.E() + dta.F();
        final int n2 = dta.G() + dta.D();
        final ImageView$ScaleType fit_XY = ImageView$ScaleType.FIT_XY;
        final dug dug = null;
        if (fit_XY != imageView$ScaleType && drawable != null && drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            final int n3 = dta.H() - n;
            final int n4 = dta.a() - n2;
            ImageView$ScaleType fit_CENTER;
            if ((fit_CENTER = imageView$ScaleType) == null) {
                fit_CENTER = ImageView$ScaleType.FIT_CENTER;
            }
            final int intrinsicWidth = drawable.getIntrinsicWidth();
            final int intrinsicHeight = drawable.getIntrinsicHeight();
            dug a = dug;
            if (intrinsicWidth > 0) {
                a = dug;
                if (intrinsicHeight > 0) {
                    a = dug;
                    if (ImageView$ScaleType.FIT_XY != fit_CENTER) {
                        if (ImageView$ScaleType.MATRIX == fit_CENTER) {
                            a = dug;
                        }
                        else if (n3 == intrinsicWidth && n4 == intrinsicHeight) {
                            a = dug;
                        }
                        else {
                            a = new dug();
                            final ImageView$ScaleType center = ImageView$ScaleType.CENTER;
                            final boolean b = true;
                            if (center == fit_CENTER) {
                                a.setTranslate((float)bkt.r((n3 - intrinsicWidth) * 0.5f), (float)bkt.r((n4 - intrinsicHeight) * 0.5f));
                                boolean a2 = b;
                                if (intrinsicWidth <= n3) {
                                    a2 = (intrinsicHeight > n4 && b);
                                }
                                a.a = a2;
                            }
                            else {
                                final ImageView$ScaleType center_CROP = ImageView$ScaleType.CENTER_CROP;
                                float n5 = 0.0f;
                                if (center_CROP == fit_CENTER) {
                                    float n6;
                                    float n7;
                                    if (intrinsicWidth * n4 > n3 * intrinsicHeight) {
                                        n6 = n4 / (float)intrinsicHeight;
                                        n5 = (n3 - intrinsicWidth * n6) * 0.5f;
                                        n7 = 0.0f;
                                    }
                                    else {
                                        n6 = n3 / (float)intrinsicWidth;
                                        n7 = (n4 - intrinsicHeight * n6) * 0.5f;
                                    }
                                    a.setScale(n6, n6);
                                    a.postTranslate((float)bkt.r(n5), (float)bkt.r(n7));
                                    a.a = true;
                                }
                                else if (ImageView$ScaleType.CENTER_INSIDE == fit_CENTER) {
                                    float min;
                                    if (intrinsicWidth <= n3 && intrinsicHeight <= n4) {
                                        min = 1.0f;
                                    }
                                    else {
                                        min = Math.min(n3 / (float)intrinsicWidth, n4 / (float)intrinsicHeight);
                                    }
                                    a.setScale(min, min);
                                    a.postTranslate((float)bkt.r((n3 - intrinsicWidth * min) * 0.5f), (float)bkt.r((n4 - intrinsicHeight * min) * 0.5f));
                                }
                                else {
                                    final RectF rectF = new RectF();
                                    final RectF rectF2 = new RectF();
                                    rectF.set(0.0f, 0.0f, (float)intrinsicWidth, (float)intrinsicHeight);
                                    rectF2.set(0.0f, 0.0f, (float)n3, (float)n4);
                                    final int n8 = duf.a[fit_CENTER.ordinal()];
                                    Matrix$ScaleToFit matrix$ScaleToFit;
                                    if (n8 != 1) {
                                        if (n8 != 2) {
                                            if (n8 != 3) {
                                                if (n8 != 4) {
                                                    throw new IllegalArgumentException("Only FIT_... values allowed");
                                                }
                                                matrix$ScaleToFit = Matrix$ScaleToFit.END;
                                            }
                                            else {
                                                matrix$ScaleToFit = Matrix$ScaleToFit.CENTER;
                                            }
                                        }
                                        else {
                                            matrix$ScaleToFit = Matrix$ScaleToFit.START;
                                        }
                                    }
                                    else {
                                        matrix$ScaleToFit = Matrix$ScaleToFit.FILL;
                                    }
                                    a.setRectToRect(rectF, rectF2, matrix$ScaleToFit);
                                }
                            }
                        }
                    }
                }
            }
            elw.a = a;
            elw2.a = drawable.getIntrinsicWidth();
            elw3.a = drawable.getIntrinsicHeight();
            return;
        }
        elw.a = null;
        elw2.a = dta.H() - n;
        elw3.a = dta.a() - n2;
    }
}
