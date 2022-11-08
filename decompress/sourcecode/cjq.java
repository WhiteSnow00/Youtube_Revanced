import android.animation.AnimatorListenerAdapter;
import android.animation.Animator$AnimatorListener;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Picture;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.view.View;
import android.animation.Animator;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public class cjq extends cim
{
    private static final String[] q;
    public int p;
    
    static {
        q = new String[] { "android:visibility:visibility", "android:visibility:parent" };
    }
    
    public cjq() {
        this.p = 3;
    }
    
    public static final void I(final ciy ciy) {
        ciy.a.put("android:visibility:visibility", ciy.b.getVisibility());
        ciy.a.put("android:visibility:parent", ciy.b.getParent());
        final int[] array = new int[2];
        ciy.b.getLocationOnScreen(array);
        ciy.a.put("android:visibility:screenLocation", array);
    }
    
    private static final cjp J(final ciy ciy, final ciy ciy2) {
        final cjp cjp = new cjp();
        cjp.a = false;
        cjp.b = false;
        if (ciy != null && ciy.a.containsKey("android:visibility:visibility")) {
            cjp.c = ciy.a.get("android:visibility:visibility");
            cjp.e = ciy.a.get("android:visibility:parent");
        }
        else {
            cjp.c = -1;
            cjp.e = null;
        }
        if (ciy2 != null && ciy2.a.containsKey("android:visibility:visibility")) {
            cjp.d = ciy2.a.get("android:visibility:visibility");
            cjp.f = ciy2.a.get("android:visibility:parent");
        }
        else {
            cjp.d = -1;
            cjp.f = null;
        }
        while (true) {
            Label_0275: {
                if (ciy != null && ciy2 != null) {
                    final int c = cjp.c;
                    final int d = cjp.d;
                    if (c == d && cjp.e == cjp.f) {
                        return cjp;
                    }
                    if (c != d) {
                        if (c == 0) {
                            break Label_0275;
                        }
                        if (d != 0) {
                            return cjp;
                        }
                    }
                    else {
                        if (cjp.f == null) {
                            break Label_0275;
                        }
                        if (cjp.e != null) {
                            return cjp;
                        }
                    }
                }
                else if (ciy != null || cjp.d != 0) {
                    if (ciy2 == null && cjp.c == 0) {
                        break Label_0275;
                    }
                    return cjp;
                }
                cjp.b = true;
                cjp.a = true;
                return cjp;
            }
            cjp.b = false;
            continue;
        }
    }
    
    public final Animator a(final ViewGroup viewGroup, final ciy ciy, final ciy ciy2) {
        final cjp j = J(ciy, ciy2);
        final boolean a = j.a;
        final Animator animator = null;
        View view = null;
        if (!a || (j.e == null && j.f == null)) {
            return null;
        }
        final boolean b = j.b;
        boolean b2 = true;
        final int n = 0;
        if (b) {
            if ((this.p & 0x1) == 0x1) {
                if (ciy2 != null) {
                    if (ciy == null) {
                        final View view2 = (View)ciy2.b.getParent();
                        if (J(this.i(view2, false), this.j(view2, false)).a) {
                            return null;
                        }
                    }
                    return this.e(ciy2.b, ciy);
                }
            }
            return null;
        }
        final int d = j.d;
        Animator animator3;
        if ((this.p & 0x2) == 0x2 && ciy != null) {
            final View b3 = ciy.b;
            View b4;
            if (ciy2 != null) {
                b4 = ciy2.b;
            }
            else {
                b4 = null;
            }
            final View view3 = (View)b3.getTag(2131431233);
            View view4 = null;
            Label_0863: {
                if (view3 != null) {
                    view4 = view3;
                }
                else {
                    boolean b5 = false;
                    Object o = null;
                    View view6 = null;
                    Label_0262: {
                        Label_0253: {
                            View view5;
                            if (b4 != null && b4.getParent() != null) {
                                if (d != 4 && b3 != b4) {
                                    break Label_0253;
                                }
                                view5 = b4;
                                b4 = null;
                            }
                            else {
                                if (b4 == null) {
                                    break Label_0253;
                                }
                                view5 = null;
                            }
                            b5 = false;
                            o = b4;
                            view6 = view5;
                            break Label_0262;
                        }
                        o = (view6 = null);
                        b5 = true;
                    }
                    if (b5) {
                        if (b3.getParent() == null) {
                            view = view6;
                            b2 = false;
                            view4 = b3;
                            break Label_0863;
                        }
                        if (b3.getParent() instanceof View) {
                            final View view7 = (View)b3.getParent();
                            if (!J(this.j(view7, true), this.i(view7, true)).a) {
                                final Matrix matrix = new Matrix();
                                matrix.setTranslate((float)(-view7.getScrollX()), (float)(-view7.getScrollY()));
                                cjd.b.g(b3, matrix);
                                cjd.b.h((View)viewGroup, matrix);
                                final RectF rectF = new RectF(0.0f, 0.0f, (float)b3.getWidth(), (float)b3.getHeight());
                                matrix.mapRect(rectF);
                                final int round = Math.round(rectF.left);
                                final int round2 = Math.round(rectF.top);
                                final int round3 = Math.round(rectF.right);
                                final int round4 = Math.round(rectF.bottom);
                                final ImageView imageView = new ImageView(b3.getContext());
                                imageView.setScaleType(ImageView$ScaleType.CENTER_CROP);
                                final boolean b6 = civ.a(b3) ^ true;
                                final boolean a2 = civ.a((View)viewGroup);
                                Bitmap imageBitmap = null;
                                Label_0760: {
                                    ViewGroup viewGroup2;
                                    int indexOfChild;
                                    if (b6) {
                                        if (!a2) {
                                            imageBitmap = null;
                                            break Label_0760;
                                        }
                                        viewGroup2 = (ViewGroup)b3.getParent();
                                        indexOfChild = viewGroup2.indexOfChild(b3);
                                        ciu.a(viewGroup, b3);
                                    }
                                    else {
                                        viewGroup2 = null;
                                        indexOfChild = n;
                                    }
                                    final int round5 = Math.round(rectF.width());
                                    final int round6 = Math.round(rectF.height());
                                    Bitmap bitmap;
                                    if (round5 > 0 && round6 > 0) {
                                        final float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                        final int round7 = Math.round(round5 * min);
                                        final int round8 = Math.round(round6 * min);
                                        matrix.postTranslate(-rectF.left, -rectF.top);
                                        matrix.postScale(min, min);
                                        if (cix.a) {
                                            final Picture picture = new Picture();
                                            final Canvas beginRecording = picture.beginRecording(round7, round8);
                                            beginRecording.concat(matrix);
                                            b3.draw(beginRecording);
                                            picture.endRecording();
                                            bitmap = ciw.a(picture);
                                        }
                                        else {
                                            bitmap = Bitmap.createBitmap(round7, round8, Bitmap$Config.ARGB_8888);
                                            final Canvas canvas = new Canvas(bitmap);
                                            canvas.concat(matrix);
                                            b3.draw(canvas);
                                        }
                                    }
                                    else {
                                        bitmap = null;
                                    }
                                    imageBitmap = bitmap;
                                    if (b6) {
                                        ciu.b(viewGroup, b3);
                                        viewGroup2.addView(b3, indexOfChild);
                                        imageBitmap = bitmap;
                                    }
                                }
                                if (imageBitmap != null) {
                                    imageView.setImageBitmap(imageBitmap);
                                }
                                imageView.measure(View$MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View$MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                imageView.layout(round, round2, round3, round4);
                                o = imageView;
                            }
                            else {
                                final int id = view7.getId();
                                if (view7.getParent() == null && id != -1) {
                                    viewGroup.findViewById(id);
                                }
                            }
                        }
                    }
                    final View view8 = view6;
                    b2 = false;
                    view4 = (View)o;
                    view = view8;
                }
            }
            if (view4 != null) {
                if (!b2) {
                    final int[] array = ciy.a.get("android:visibility:screenLocation");
                    final int n2 = array[0];
                    final int n3 = array[1];
                    final int[] array2 = new int[2];
                    viewGroup.getLocationOnScreen(array2);
                    view4.offsetLeftAndRight(n2 - array2[0] - view4.getLeft());
                    view4.offsetTopAndBottom(n3 - array2[1] - view4.getTop());
                    viewGroup.getOverlay().add(view4);
                }
                final Animator animator2 = animator3 = this.f(view4, ciy);
                if (!b2) {
                    if (animator2 == null) {
                        viewGroup.getOverlay().remove(view4);
                        animator3 = animator2;
                    }
                    else {
                        b3.setTag(2131431233, (Object)view4);
                        this.w((cil)new cjn(this, viewGroup, view4, b3));
                        animator3 = animator2;
                    }
                }
            }
            else if (view != null) {
                final int visibility = view.getVisibility();
                cjd.d(view, 0);
                animator3 = this.f(view, ciy);
                if (animator3 != null) {
                    final cjo cjo = new cjo(view, d);
                    animator3.addListener((Animator$AnimatorListener)cjo);
                    cht.a(animator3, (AnimatorListenerAdapter)cjo);
                    this.w((cil)cjo);
                }
                else {
                    cjd.d(view, visibility);
                }
            }
            else {
                animator3 = null;
            }
        }
        else {
            animator3 = animator;
        }
        return animator3;
    }
    
    public final void b(final ciy ciy) {
        I(ciy);
    }
    
    public void c(final ciy ciy) {
        I(ciy);
    }
    
    public final String[] d() {
        return cjq.q;
    }
    
    public Animator e(final View view, final ciy ciy) {
        return null;
    }
    
    public Animator f(final View view, final ciy ciy) {
        throw null;
    }
    
    public final boolean u(final ciy ciy, final ciy ciy2) {
        final boolean b = false;
        if (ciy == null && ciy2 == null) {
            return false;
        }
        if (ciy != null && ciy2 != null && ciy2.a.containsKey("android:visibility:visibility") != ciy.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        final cjp j = J(ciy, ciy2);
        boolean b2 = b;
        if (j.a) {
            if (j.c != 0) {
                if (j.d == 0) {
                    return true;
                }
                b2 = b;
            }
            else {
                b2 = true;
            }
        }
        return b2;
    }
}
