import android.graphics.Paint$Cap;
import android.graphics.Paint$Join;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.Paint$Style;
import android.graphics.Path$FillType;
import android.graphics.Canvas;
import android.graphics.PathMeasure;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

final class ckk
{
    public static final Matrix a;
    Paint b;
    Paint c;
    final cki d;
    float e;
    float f;
    float g;
    float h;
    int i;
    String j;
    Boolean k;
    final abi l;
    private final Path m;
    private final Path n;
    private final Matrix o;
    private PathMeasure p;
    private int q;
    
    static {
        a = new Matrix();
    }
    
    public ckk() {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        this.l = new abi();
        this.d = new cki();
        this.m = new Path();
        this.n = new Path();
    }
    
    public ckk(final ckk ckk) {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        final abi l = new abi();
        this.l = l;
        this.d = new cki(ckk.d, l);
        this.m = new Path(ckk.m);
        this.n = new Path(ckk.n);
        this.e = ckk.e;
        this.f = ckk.f;
        this.g = ckk.g;
        this.h = ckk.h;
        final int q = ckk.q;
        this.q = 0;
        this.i = ckk.i;
        this.j = ckk.j;
        final String j = ckk.j;
        if (j != null) {
            ((abp)l).put((Object)j, (Object)this);
        }
        this.k = ckk.k;
    }
    
    public final void a(final cki cki, Matrix o, final Canvas canvas, final int n, final int n2) {
        cki.a.set(o);
        cki.a.preConcat(cki.j);
        canvas.save();
        for (int i = 0; i < cki.b.size(); ++i) {
            final cjd cjd = cki.b.get(i);
            if (cjd instanceof cki) {
                this.a((cki)cjd, cki.a, canvas, n, n2);
            }
            else if (cjd instanceof ckj) {
                final ckj ckj = (ckj)cjd;
                final float n3 = n / this.g;
                final float n4 = n2 / this.h;
                final float min = Math.min(n3, n4);
                final Matrix a = cki.a;
                this.o.set(a);
                this.o.postScale(n3, n4);
                final float[] array2;
                final float[] array = array2 = new float[4];
                array2[0] = 0.0f;
                array2[2] = (array2[1] = 1.0f);
                array2[3] = 0.0f;
                a.mapVectors(array);
                final float n5 = (float)Math.hypot(array[0], array[1]);
                final float n6 = (float)Math.hypot(array[2], array[3]);
                final float n7 = array[0];
                final float n8 = array[1];
                final float n9 = array[2];
                final float n10 = array[3];
                final float max = Math.max(n5, n6);
                float n11;
                if (max > 0.0f) {
                    n11 = Math.abs(n7 * n10 - n8 * n9) / max;
                }
                else {
                    n11 = 0.0f;
                }
                if (n11 != 0.0f) {
                    final Path m = this.m;
                    m.reset();
                    final aig[] j = ckj.m;
                    if (j != null) {
                        aig.a(j, m);
                    }
                    final Path k = this.m;
                    this.n.reset();
                    if (ckj.n()) {
                        final Path n12 = this.n;
                        Path$FillType fillType;
                        if (ckj.o == 0) {
                            fillType = Path$FillType.WINDING;
                        }
                        else {
                            fillType = Path$FillType.EVEN_ODD;
                        }
                        n12.setFillType(fillType);
                        this.n.addPath(k, this.o);
                        canvas.clipPath(this.n);
                    }
                    else {
                        final ckh ckh = (ckh)ckj;
                        final float e = ckh.e;
                        if (e != 0.0f || ckh.f != 1.0f) {
                            final float g = ckh.g;
                            final float f = ckh.f;
                            if (this.p == null) {
                                this.p = new PathMeasure();
                            }
                            this.p.setPath(this.m, false);
                            final float length = this.p.getLength();
                            final float n13 = (e + g) % 1.0f * length;
                            final float n14 = (f + g) % 1.0f * length;
                            k.reset();
                            if (n13 > n14) {
                                this.p.getSegment(n13, length, k, true);
                                this.p.getSegment(0.0f, n14, k, true);
                            }
                            else {
                                this.p.getSegment(n13, n14, k, true);
                            }
                            k.rLineTo(0.0f, 0.0f);
                        }
                        this.n.addPath(k, this.o);
                        if (ckh.l.I()) {
                            final agpw l = ckh.l;
                            if (this.c == null) {
                                (this.c = new Paint(1)).setStyle(Paint$Style.FILL);
                            }
                            final Paint c = this.c;
                            if (l.F()) {
                                final Object a2 = l.a;
                                o = this.o;
                                final Shader shader = (Shader)a2;
                                shader.setLocalMatrix(o);
                                c.setShader(shader);
                                c.setAlpha(Math.round(ckh.d * 255.0f));
                            }
                            else {
                                c.setShader((Shader)null);
                                c.setAlpha(255);
                                c.setColor(ckn.a(l.b, ckh.d));
                            }
                            c.setColorFilter((ColorFilter)null);
                            final Path n15 = this.n;
                            Path$FillType fillType2;
                            if (ckh.o == 0) {
                                fillType2 = Path$FillType.WINDING;
                            }
                            else {
                                fillType2 = Path$FillType.EVEN_ODD;
                            }
                            n15.setFillType(fillType2);
                            canvas.drawPath(this.n, c);
                        }
                        if (ckh.k.I()) {
                            final agpw k2 = ckh.k;
                            if (this.b == null) {
                                (this.b = new Paint(1)).setStyle(Paint$Style.STROKE);
                            }
                            final Paint b = this.b;
                            final Paint$Join i2 = ckh.i;
                            if (i2 != null) {
                                b.setStrokeJoin(i2);
                            }
                            final Paint$Cap h = ckh.h;
                            if (h != null) {
                                b.setStrokeCap(h);
                            }
                            b.setStrokeMiter(ckh.j);
                            if (k2.F()) {
                                final Object a3 = k2.a;
                                final Matrix o2 = this.o;
                                final Shader shader2 = (Shader)a3;
                                shader2.setLocalMatrix(o2);
                                b.setShader(shader2);
                                b.setAlpha(Math.round(ckh.c * 255.0f));
                            }
                            else {
                                b.setShader((Shader)null);
                                b.setAlpha(255);
                                b.setColor(ckn.a(k2.b, ckh.c));
                            }
                            b.setColorFilter((ColorFilter)null);
                            b.setStrokeWidth(ckh.b * (n11 * min));
                            canvas.drawPath(this.n, b);
                        }
                    }
                }
            }
        }
        canvas.restore();
    }
    
    public float getAlpha() {
        return this.getRootAlpha() / 255.0f;
    }
    
    public int getRootAlpha() {
        return this.i;
    }
    
    public void setAlpha(final float n) {
        this.setRootAlpha((int)(n * 255.0f));
    }
    
    public void setRootAlpha(final int i) {
        this.i = i;
    }
}
