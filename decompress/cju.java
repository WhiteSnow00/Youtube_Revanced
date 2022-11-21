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

public class cju extends ciq
{
    private static final String[] q;
    public int p;
    
    static {
        q = new String[] { "android:visibility:visibility", "android:visibility:parent" };
    }
    
    public cju() {
        this.p = 3;
    }
    
    public static final void I(final cjc cjc) {
        cjc.a.put("android:visibility:visibility", cjc.b.getVisibility());
        cjc.a.put("android:visibility:parent", cjc.b.getParent());
        final int[] array = new int[2];
        cjc.b.getLocationOnScreen(array);
        cjc.a.put("android:visibility:screenLocation", array);
    }
    
    private static final cjt J(final cjc cjc, final cjc cjc2) {
        final cjt cjt = new cjt();
        cjt.a = false;
        cjt.b = false;
        if (cjc != null && cjc.a.containsKey("android:visibility:visibility")) {
            cjt.c = cjc.a.get("android:visibility:visibility");
            cjt.e = cjc.a.get("android:visibility:parent");
        }
        else {
            cjt.c = -1;
            cjt.e = null;
        }
        if (cjc2 != null && cjc2.a.containsKey("android:visibility:visibility")) {
            cjt.d = cjc2.a.get("android:visibility:visibility");
            cjt.f = cjc2.a.get("android:visibility:parent");
        }
        else {
            cjt.d = -1;
            cjt.f = null;
        }
        while (true) {
            Label_0293: {
                if (cjc != null && cjc2 != null) {
                    final int c = cjt.c;
                    final int d = cjt.d;
                    if (c == d && cjt.e == cjt.f) {
                        return cjt;
                    }
                    if (c != d) {
                        if (c == 0) {
                            break Label_0293;
                        }
                        if (d != 0) {
                            return cjt;
                        }
                    }
                    else {
                        if (cjt.f == null) {
                            break Label_0293;
                        }
                        if (cjt.e != null) {
                            return cjt;
                        }
                    }
                }
                else if (cjc != null || cjt.d != 0) {
                    if (cjc2 == null && cjt.c == 0) {
                        break Label_0293;
                    }
                    return cjt;
                }
                cjt.b = true;
                cjt.a = true;
                return cjt;
            }
            cjt.b = false;
            continue;
        }
    }
    
    @Override
    public final Animator a(final ViewGroup viewGroup, final cjc cjc, final cjc cjc2) {
        final cjt j = J(cjc, cjc2);
        final boolean a = j.a;
        final Animator animator = null;
        if (!a || (j.e == null && j.f == null)) {
            return null;
        }
        final boolean b = j.b;
        boolean b2 = true;
        final int n = 0;
        if (b) {
            if ((this.p & 0x1) == 0x1) {
                if (cjc2 != null) {
                    if (cjc == null) {
                        final View view = (View)cjc2.b.getParent();
                        if (J(this.i(view, false), this.j(view, false)).a) {
                            return null;
                        }
                    }
                    return this.e(cjc2.b, cjc);
                }
            }
            return null;
        }
        final int d = j.d;
        Animator animator3;
        if ((this.p & 0x2) == 0x2 && cjc != null) {
            final View b3 = cjc.b;
            View b4;
            if (cjc2 != null) {
                b4 = cjc2.b;
            }
            else {
                b4 = null;
            }
            Object o = b3.getTag(2131431237);
            if (o != null) {
                b4 = null;
            }
            else {
                boolean b5 = false;
                Label_0255: {
                    Label_0247: {
                        if (b4 != null && b4.getParent() != null) {
                            if (d != 4 && b3 != b4) {
                                break Label_0247;
                            }
                            o = null;
                        }
                        else {
                            if (b4 == null) {
                                break Label_0247;
                            }
                            final View view2 = null;
                            o = b4;
                            b4 = view2;
                        }
                        b5 = false;
                        break Label_0255;
                    }
                    b4 = null;
                    o = null;
                    b5 = true;
                }
                if (b5) {
                    if (b3.getParent() == null) {
                        o = b3;
                    }
                    else if (b3.getParent() instanceof View) {
                        final View view3 = (View)b3.getParent();
                        Object o2;
                        if (!J(this.j(view3, true), this.i(view3, true)).a) {
                            final Matrix matrix = new Matrix();
                            matrix.setTranslate((float)(-view3.getScrollX()), (float)(-view3.getScrollY()));
                            cjh.b.f(b3, matrix);
                            cjh.b.g((View)viewGroup, matrix);
                            final RectF rectF = new RectF(0.0f, 0.0f, (float)b3.getWidth(), (float)b3.getHeight());
                            matrix.mapRect(rectF);
                            final int round = Math.round(rectF.left);
                            final int round2 = Math.round(rectF.top);
                            final int round3 = Math.round(rectF.right);
                            final int round4 = Math.round(rectF.bottom);
                            final ImageView imageView = new ImageView(b3.getContext());
                            imageView.setScaleType(ImageView$ScaleType.CENTER_CROP);
                            final boolean b6 = ciz.a(b3) ^ true;
                            final boolean a2 = ciz.a((View)viewGroup);
                            Bitmap imageBitmap = null;
                            Label_0764: {
                                ViewGroup viewGroup2;
                                int indexOfChild;
                                if (b6) {
                                    if (!a2) {
                                        imageBitmap = null;
                                        break Label_0764;
                                    }
                                    viewGroup2 = (ViewGroup)b3.getParent();
                                    indexOfChild = viewGroup2.indexOfChild(b3);
                                    ciy.a(viewGroup, b3);
                                }
                                else {
                                    viewGroup2 = null;
                                    indexOfChild = n;
                                }
                                final int round5 = Math.round(rectF.width());
                                final int round6 = Math.round(rectF.height());
                                Bitmap bitmap;
                                if (round5 > 0 && round6 > 0) {
                                    final float n2 = (float)round5;
                                    final float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                    final float n3 = (float)round6;
                                    final int round7 = Math.round(n2 * min);
                                    final int round8 = Math.round(n3 * min);
                                    matrix.postTranslate(-rectF.left, -rectF.top);
                                    matrix.postScale(min, min);
                                    if (cjb.a) {
                                        final Picture picture = new Picture();
                                        final Canvas beginRecording = picture.beginRecording(round7, round8);
                                        beginRecording.concat(matrix);
                                        b3.draw(beginRecording);
                                        picture.endRecording();
                                        bitmap = cja.a(picture);
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
                                    ciy.b(viewGroup, b3);
                                    viewGroup2.addView(b3, indexOfChild);
                                    imageBitmap = bitmap;
                                }
                            }
                            if (imageBitmap != null) {
                                imageView.setImageBitmap(imageBitmap);
                            }
                            imageView.measure(View$MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View$MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                            imageView.layout(round, round2, round3, round4);
                            o2 = imageView;
                        }
                        else {
                            final int id = view3.getId();
                            o2 = o;
                            if (view3.getParent() == null) {
                                o2 = o;
                                if (id != -1) {
                                    viewGroup.findViewById(id);
                                    o2 = o;
                                }
                            }
                        }
                        o = o2;
                    }
                }
                b2 = false;
            }
            if (o != null) {
                if (!b2) {
                    final int[] array = cjc.a.get("android:visibility:screenLocation");
                    final int n4 = array[0];
                    final int n5 = array[1];
                    final int[] array2 = new int[2];
                    viewGroup.getLocationOnScreen(array2);
                    ((View)o).offsetLeftAndRight(n4 - array2[0] - ((View)o).getLeft());
                    ((View)o).offsetTopAndBottom(n5 - array2[1] - ((View)o).getTop());
                    viewGroup.getOverlay().add((View)o);
                }
                final Animator animator2 = animator3 = this.f((View)o, cjc);
                if (!b2) {
                    if (animator2 == null) {
                        viewGroup.getOverlay().remove((View)o);
                        animator3 = animator2;
                    }
                    else {
                        b3.setTag(2131431237, o);
                        this.w((cip)new cjr(this, viewGroup, (View)o, b3));
                        animator3 = animator2;
                    }
                }
            }
            else if (b4 != null) {
                final int visibility = b4.getVisibility();
                cjh.d(b4, 0);
                animator3 = this.f(b4, cjc);
                if (animator3 != null) {
                    final cjs cjs = new cjs(b4, d);
                    animator3.addListener((Animator$AnimatorListener)cjs);
                    chx.a(animator3, cjs);
                    this.w(cjs);
                }
                else {
                    cjh.d(b4, visibility);
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
    
    @Override
    public final void b(final cjc cjc) {
        I(cjc);
    }
    
    @Override
    public void c(final cjc cjc) {
        I(cjc);
    }
    
    @Override
    public final String[] d() {
        return cju.q;
    }
    
    public Animator e(final View view, final cjc cjc) {
        return null;
    }
    
    public Animator f(final View view, final cjc cjc) {
        throw null;
    }
    
    @Override
    public final boolean u(final cjc cjc, final cjc cjc2) {
        final boolean b = false;
        if (cjc == null && cjc2 == null) {
            return false;
        }
        if (cjc != null && cjc2 != null && cjc2.a.containsKey("android:visibility:visibility") != cjc.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        final cjt j = J(cjc, cjc2);
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
