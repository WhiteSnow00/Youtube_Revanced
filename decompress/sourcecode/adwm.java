import android.graphics.Path$Direction;
import android.graphics.Path$Op;
import android.graphics.RectF;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executor;
import android.os.Handler;
import android.content.Context;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adwm
{
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    
    public adwm() {
        this.b = new adwu[4];
        this.c = new Matrix[4];
        this.d = new Matrix[4];
        this.e = new PointF();
        this.f = new Path();
        this.g = new Path();
        this.h = new adwu();
        this.i = new float[2];
        this.j = new float[2];
        this.k = new Path();
        this.l = new Path();
        this.a = true;
        for (int i = 0; i < 4; ++i) {
            ((adwu[])this.b)[i] = new adwu();
            ((Matrix[])this.c)[i] = new Matrix();
            ((Matrix[])this.d)[i] = new Matrix();
        }
    }
    
    public adwm(final br k, final Context g, final Handler l, final Executor b, final ufk d, final uea e, final uev j, final ueq h, final uev i, final udl f, final uez c, final byte[] array) {
        this.k = k;
        this.g = g;
        this.l = l;
        this.b = b;
        this.d = d;
        this.e = e;
        this.j = j;
        this.h = h;
        this.i = i;
        this.f = f;
        this.c = c;
    }
    
    public static Object b(final List list, final Object o) {
        return list.get((list.indexOf(o) + 1) % list.size());
    }
    
    public static void c(final Context context, final Executor executor, final String s) {
        tcp.m(afld.j((Runnable)new tur(new File(new File(context.getFilesDir(), ujq.a), s), s, 11), executor), (tcn)new tup(s, 6));
    }
    
    private final boolean f(final Path path, final int n) {
        ((Path)this.l).reset();
        ((adwu[])this.b)[n].c(((Matrix[])this.c)[n], (Path)this.l);
        final RectF rectF = new RectF();
        final boolean b = true;
        path.computeBounds(rectF, true);
        ((Path)this.l).computeBounds(rectF, true);
        path.op((Path)this.l, Path$Op.INTERSECT);
        path.computeBounds(rectF, true);
        boolean b2 = b;
        if (rectF.isEmpty()) {
            if (rectF.width() > 1.0f) {
                if (rectF.height() <= 1.0f) {
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
    
    private static final float g(final int n) {
        return (float)((n + 1) % 4 * 90);
    }
    
    public final void a(final adwk adwk, final float n, final RectF rectF, final Path path) {
        this.e(adwk, n, rectF, null, path);
    }
    
    public final void d(final aqwa aqwa) {
        final aqxd i = aqwa.c().i();
        final int c = i.c;
        aqvj aqvj2;
        Object j;
        if (c == 1) {
            if (!this.a) {
                return;
            }
            final Object d = this.d;
            final aqvj aqvj = aqvj2 = ((aqxt)i.d).g;
            j = d;
            if (aqvj == null) {
                aqvj2 = aqvj.a;
                j = d;
            }
        }
        else if (c == 3) {
            final Object e = this.e;
            final aqvj aqvj3 = aqvj2 = ((aqws)i.d).c;
            j = e;
            if (aqvj3 == null) {
                aqvj2 = aqvj.a;
                j = e;
            }
        }
        else if (c == 6) {
            final Object h = this.h;
            final aqvj aqvj4 = aqvj2 = ((aqvl)i.d).c;
            j = h;
            if (aqvj4 == null) {
                aqvj2 = aqvj.a;
                j = h;
            }
        }
        else if (c == 7) {
            final Object k = this.j;
            final aqvj aqvj5 = aqvj2 = ((aqxy)i.d).c;
            j = k;
            if (aqvj5 == null) {
                aqvj2 = aqvj.a;
                j = k;
            }
        }
        else if (c == 2) {
            j = this.i;
            aqvj2 = null;
        }
        else if (c == 4) {
            final Object f = this.f;
            final aqvj aqvj6 = aqvj2 = ((aqvp)i.d).c;
            j = f;
            if (aqvj6 == null) {
                aqvj2 = aqvj.a;
                j = f;
            }
        }
        else {
            if (c != 12) {
                return;
            }
            final Object c2 = this.c;
            final aqvj aqvj7 = aqvj2 = ((aqvt)i.d).c;
            j = c2;
            if (aqvj7 == null) {
                aqvj2 = aqvj.a;
                j = c2;
            }
        }
        ((Handler)this.l).post((Runnable)new rfy(this, (ufe)j, aqwa, 17, (byte[])null));
        if (aqvj2 != null) {
            final int b = aqvj2.b;
            final String s = "";
            String s2;
            if (b == 1) {
                s2 = (String)aqvj2.c;
            }
            else {
                s2 = "";
            }
            if (!s2.isEmpty()) {
                final Object g = this.g;
                final Object b2 = this.b;
                String s3 = s;
                if (aqvj2.b == 1) {
                    s3 = (String)aqvj2.c;
                }
                c((Context)g, (Executor)b2, s3);
            }
        }
    }
    
    public final void e(final adwk adwk, float n, final RectF rectF, final aepj aepj, final Path path) {
        path.rewind();
        ((Path)this.f).rewind();
        ((Path)this.g).rewind();
        ((Path)this.g).addRect(rectF, Path$Direction.CW);
        for (int i = 0; i < 4; ++i) {
            adwb adwb;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        adwb = adwk.c;
                    }
                    else {
                        adwb = adwk.b;
                    }
                }
                else {
                    adwb = adwk.e;
                }
            }
            else {
                adwb = adwk.d;
            }
            adwd adwd;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        adwd = adwk.k;
                    }
                    else {
                        adwd = adwk.j;
                    }
                }
                else {
                    adwd = adwk.m;
                }
            }
            else {
                adwd = adwk.l;
            }
            adwd.c(((adwu[])this.b)[i], n, adwb.a(rectF));
            final float g = g(i);
            ((Matrix[])this.c)[i].reset();
            final Object e = this.e;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ((PointF)e).set(rectF.right, rectF.top);
                    }
                    else {
                        ((PointF)e).set(rectF.left, rectF.top);
                    }
                }
                else {
                    ((PointF)e).set(rectF.left, rectF.bottom);
                }
            }
            else {
                ((PointF)e).set(rectF.right, rectF.bottom);
            }
            ((Matrix[])this.c)[i].setTranslate(((PointF)this.e).x, ((PointF)this.e).y);
            ((Matrix[])this.c)[i].preRotate(g);
            final Object j = this.i;
            final adwu adwu = ((adwu[])this.b)[i];
            final float b = adwu.b;
            final float[] array = (float[])j;
            array[0] = b;
            array[1] = adwu.c;
            ((Matrix[])this.c)[i].mapPoints(array);
            ((Matrix[])this.d)[i].reset();
            final Matrix matrix = ((Matrix[])this.d)[i];
            final float[] array2 = (float[])this.i;
            matrix.setTranslate(array2[0], array2[1]);
            ((Matrix[])this.d)[i].preRotate(g(i));
        }
        int n2;
        for (int k = 0; k < 4; k = n2) {
            final Object l = this.i;
            final adwu adwu2 = ((adwu[])this.b)[k];
            final float[] array3 = (float[])l;
            array3[0] = 0.0f;
            array3[1] = adwu2.a;
            ((Matrix[])this.c)[k].mapPoints(array3);
            if (k == 0) {
                final float[] array4 = (float[])this.i;
                path.moveTo(array4[0], array4[1]);
            }
            else {
                final float[] array5 = (float[])this.i;
                path.lineTo(array5[0], array5[1]);
            }
            ((adwu[])this.b)[k].c(((Matrix[])this.c)[k], path);
            if (aepj != null) {
                final adwu adwu3 = ((adwu[])this.b)[k];
                final Matrix matrix2 = ((Matrix[])this.c)[k];
                ((adwf)aepj.a).d.set(k, false);
                ((adwf)aepj.a).b[k] = adwu3.a(matrix2);
            }
            n2 = k + 1;
            final int n3 = n2 % 4;
            final Object m = this.i;
            final adwu adwu4 = ((adwu[])this.b)[k];
            n = adwu4.b;
            final float[] array6 = (float[])m;
            array6[0] = n;
            array6[1] = adwu4.c;
            ((Matrix[])this.c)[k].mapPoints(array6);
            final Object j2 = this.j;
            final adwu adwu5 = ((adwu[])this.b)[n3];
            final float[] array7 = (float[])j2;
            array7[0] = 0.0f;
            array7[1] = adwu5.a;
            ((Matrix[])this.c)[n3].mapPoints(array7);
            final float[] array8 = (float[])this.i;
            n = array8[0];
            final float[] array9 = (float[])this.j;
            n = Math.max((float)Math.hypot(n - array9[0], array8[1] - array9[1]) - 0.001f, 0.0f);
            final Object i2 = this.i;
            final adwu adwu6 = ((adwu[])this.b)[k];
            final float b2 = adwu6.b;
            final float[] array10 = (float[])i2;
            array10[0] = b2;
            array10[1] = adwu6.c;
            ((Matrix[])this.c)[k].mapPoints(array10);
            if (k != 1 && k != 3) {
                Math.abs(rectF.centerY() - ((float[])this.i)[1]);
            }
            else {
                Math.abs(rectF.centerX() - ((float[])this.i)[0]);
            }
            ((adwu)this.h).e();
            if (k != 1) {
                if (k != 2) {
                    if (k != 3) {
                        final adwd g2 = adwk.g;
                    }
                    else {
                        final adwd f = adwk.f;
                    }
                }
                else {
                    final adwd i3 = adwk.i;
                }
            }
            else {
                final adwd h = adwk.h;
            }
            ((adwu)this.h).d(n, 0.0f);
            ((Path)this.k).reset();
            ((adwu)this.h).c(((Matrix[])this.d)[k], (Path)this.k);
            if (this.a && (this.f((Path)this.k, k) || this.f((Path)this.k, n3))) {
                final Object k2 = this.k;
                final Object g3 = this.g;
                final Path$Op difference = Path$Op.DIFFERENCE;
                final Path path2 = (Path)g3;
                final Path path3 = (Path)k2;
                path3.op(path3, path2, difference);
                final float[] array11 = (float[])this.i;
                array11[0] = 0.0f;
                array11[1] = ((adwu)this.h).a;
                ((Matrix[])this.d)[k].mapPoints(array11);
                final Object f2 = this.f;
                final float[] array12 = (float[])this.i;
                n = array12[0];
                ((Path)f2).moveTo(n, array12[1]);
                ((adwu)this.h).c(((Matrix[])this.d)[k], (Path)this.f);
            }
            else {
                ((adwu)this.h).c(((Matrix[])this.d)[k], path);
            }
            if (aepj != null) {
                final Object h2 = this.h;
                final Matrix matrix3 = ((Matrix[])this.d)[k];
                ((adwf)aepj.a).d.set(k + 4, false);
                ((adwf)aepj.a).c[k] = ((adwu)h2).a(matrix3);
            }
        }
        path.close();
        ((Path)this.f).close();
        if (!((Path)this.f).isEmpty()) {
            path.op((Path)this.f, Path$Op.UNION);
        }
    }
}
