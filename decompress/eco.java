import android.graphics.Matrix$ScaleToFit;
import android.graphics.RectF;
import android.view.View$MeasureSpec;
import android.graphics.drawable.Drawable;
import android.widget.ImageView$ScaleType;

// 
// Decompiled by Procyon v0.6.0
// 

final class eco
{
    static {
        ImageView$ScaleType.values();
    }
    
    static boolean a(@dyj final dub dub, @dyj(a = dyk.l) final dub dub2) {
        return dub.b != dub.a || !blf.f((Drawable)dub2.b, (Drawable)dub2.a);
    }
    
    static void b(final dvw dvw, final Integer n, final Integer n2) {
        dvw.a((int)n, (int)n2);
    }
    
    static dvw c() {
        return new dvw();
    }
    
    static void d(int measureSpec, final int n, final dwq dwq, @dyj(a = dyk.l) final Drawable drawable) {
        if (drawable == null || drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            dwq.a = 0;
            dwq.b = 0;
            return;
        }
        final int intrinsicHeight = drawable.getIntrinsicHeight();
        final int intrinsicWidth = drawable.getIntrinsicWidth();
        if (View$MeasureSpec.getMode(measureSpec) == 0 && View$MeasureSpec.getMode(n) == 0) {
            dwq.a = intrinsicWidth;
            dwq.b = intrinsicHeight;
            return;
        }
        final float n2 = (float)intrinsicWidth;
        final float n3 = (float)intrinsicHeight;
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
        bma.h(measureSpec2, measureSpec, n2 / n3, dwq);
    }
    
    static void e(final dvw dvw, @dyj(a = dyk.l) final Drawable drawable, final duh duh) {
        dvw.b(drawable, duh);
    }
    
    static void f(final dvw dvw) {
        dvw.c();
    }
    
    static void g(final dtb dtb, @dyj(a = dyk.l) final Drawable drawable, @dyj final ImageView$ScaleType imageView$ScaleType, final elx elx, final elx elx2, final elx elx3) {
        final int n = dtb.E() + dtb.F();
        final int n2 = dtb.G() + dtb.D();
        final ImageView$ScaleType fit_XY = ImageView$ScaleType.FIT_XY;
        final duh duh = null;
        if (fit_XY != imageView$ScaleType && drawable != null && drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            final int n3 = dtb.H() - n;
            final int n4 = dtb.a() - n2;
            ImageView$ScaleType fit_CENTER;
            if ((fit_CENTER = imageView$ScaleType) == null) {
                fit_CENTER = ImageView$ScaleType.FIT_CENTER;
            }
            final int intrinsicWidth = drawable.getIntrinsicWidth();
            final int intrinsicHeight = drawable.getIntrinsicHeight();
            duh a = duh;
            if (intrinsicWidth > 0) {
                a = duh;
                if (intrinsicHeight > 0) {
                    a = duh;
                    if (ImageView$ScaleType.FIT_XY != fit_CENTER) {
                        if (ImageView$ScaleType.MATRIX == fit_CENTER) {
                            a = duh;
                        }
                        else if (n3 == intrinsicWidth && n4 == intrinsicHeight) {
                            a = duh;
                        }
                        else {
                            a = new duh();
                            final ImageView$ScaleType center = ImageView$ScaleType.CENTER;
                            final boolean b = true;
                            if (center == fit_CENTER) {
                                a.setTranslate((float)bku.r((n3 - intrinsicWidth) * 0.5f), (float)bku.r((n4 - intrinsicHeight) * 0.5f));
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
                                    float n10;
                                    float n11;
                                    if (intrinsicWidth * n4 > n3 * intrinsicHeight) {
                                        final float n6 = (float)n4;
                                        final float n7 = (float)intrinsicHeight;
                                        final float n8 = (float)n3;
                                        final float n9 = (float)intrinsicWidth;
                                        n10 = n6 / n7;
                                        n11 = (n8 - n9 * n10) * 0.5f;
                                    }
                                    else {
                                        final float n12 = (float)n3;
                                        final float n13 = (float)intrinsicWidth;
                                        final float n14 = (float)n4;
                                        final float n15 = (float)intrinsicHeight;
                                        n10 = n12 / n13;
                                        n5 = (n14 - n15 * n10) * 0.5f;
                                        n11 = 0.0f;
                                    }
                                    a.setScale(n10, n10);
                                    a.postTranslate((float)bku.r(n11), (float)bku.r(n5));
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
                                    final float n16 = (float)n3;
                                    final float n17 = (float)intrinsicWidth;
                                    final float n18 = (float)n4;
                                    final float n19 = (float)intrinsicHeight;
                                    a.setScale(min, min);
                                    a.postTranslate((float)bku.r((n16 - n17 * min) * 0.5f), (float)bku.r((n18 - n19 * min) * 0.5f));
                                }
                                else {
                                    final RectF rectF = new RectF();
                                    final RectF rectF2 = new RectF();
                                    rectF.set(0.0f, 0.0f, (float)intrinsicWidth, (float)intrinsicHeight);
                                    rectF2.set(0.0f, 0.0f, (float)n3, (float)n4);
                                    final int n20 = dug.a[fit_CENTER.ordinal()];
                                    Matrix$ScaleToFit matrix$ScaleToFit;
                                    if (n20 != 1) {
                                        if (n20 != 2) {
                                            if (n20 != 3) {
                                                if (n20 != 4) {
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
            elx.a = a;
            elx2.a = drawable.getIntrinsicWidth();
            elx3.a = drawable.getIntrinsicHeight();
            return;
        }
        elx.a = null;
        elx2.a = dtb.H() - n;
        elx3.a = dtb.a() - n2;
    }
}
