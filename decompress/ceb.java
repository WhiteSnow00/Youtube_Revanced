import android.os.AsyncTask;
import java.util.ArrayList;
import android.graphics.Rect;
import java.util.List;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ceb
{
    public int a;
    private final Bitmap b;
    private final List c;
    private final List d;
    private Rect e;
    
    public ceb(final Bitmap b) {
        final ArrayList c = new ArrayList();
        this.c = c;
        this.a = 16;
        final ArrayList d = new ArrayList();
        this.d = d;
        if (b != null && !b.isRecycled()) {
            d.add(cee.f);
            this.b = b;
            c.add(cef.a);
            c.add(cef.b);
            c.add(cef.c);
            c.add(cef.d);
            c.add(cef.e);
            c.add(cef.f);
            return;
        }
        throw new IllegalArgumentException("Bitmap is not valid");
    }
    
    @Deprecated
    public final AsyncTask a(final cec cec) {
        afc.j(cec);
        return new cea(this, cec).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Bitmap[] { this.b });
    }
    
    public final cee b() {
        final Bitmap b = this.b;
        final int n = b.getWidth() * b.getHeight();
        double sqrt;
        if (n > 12544) {
            final double n2 = n;
            Double.isNaN(n2);
            sqrt = Math.sqrt(12544.0 / n2);
        }
        else {
            sqrt = -1.0;
        }
        Bitmap scaledBitmap = b;
        if (sqrt > 0.0) {
            final double n3 = b.getWidth();
            Double.isNaN(n3);
            final int n4 = (int)Math.ceil(n3 * sqrt);
            final double n5 = b.getHeight();
            Double.isNaN(n5);
            scaledBitmap = Bitmap.createScaledBitmap(b, n4, (int)Math.ceil(n5 * sqrt), false);
        }
        final Rect e = this.e;
        if (scaledBitmap != this.b && e != null) {
            final double n6 = scaledBitmap.getWidth();
            final double n7 = this.b.getWidth();
            final double n8 = e.left;
            Double.isNaN(n6);
            Double.isNaN(n7);
            final double n9 = n6 / n7;
            Double.isNaN(n8);
            e.left = (int)Math.floor(n8 * n9);
            final double n10 = e.top;
            Double.isNaN(n10);
            e.top = (int)Math.floor(n10 * n9);
            final double n11 = e.right;
            Double.isNaN(n11);
            e.right = Math.min((int)Math.ceil(n11 * n9), scaledBitmap.getWidth());
            final double n12 = e.bottom;
            Double.isNaN(n12);
            e.bottom = Math.min((int)Math.ceil(n12 * n9), scaledBitmap.getHeight());
        }
        final int width = scaledBitmap.getWidth();
        final int height = scaledBitmap.getHeight();
        int[] array = new int[width * height];
        scaledBitmap.getPixels(array, 0, width, 0, 0, width, height);
        final Rect e2 = this.e;
        if (e2 != null) {
            final int width2 = e2.width();
            final int height2 = this.e.height();
            final int[] array2 = new int[width2 * height2];
            for (int i = 0; i < height2; ++i) {
                System.arraycopy(array, (this.e.top + i) * width + this.e.left, array2, i * width2, width2);
            }
            array = array2;
        }
        final int a = this.a;
        cdn[] array3;
        if (this.d.isEmpty()) {
            array3 = null;
        }
        else {
            final List d = this.d;
            array3 = d.toArray(new cdn[d.size()]);
        }
        final cdz cdz = new cdz(array, a, array3, null);
        if (scaledBitmap != this.b) {
            scaledBitmap.recycle();
        }
        final cee cee = new cee(cdz.c, this.c);
        for (int size = cee.b.size(), j = 0; j < size; ++j) {
            final cef cef = cee.b.get(j);
            int k = 0;
            float n13 = 0.0f;
            while (k < 3) {
                final float n14 = cef.i[k];
                float n15 = n13;
                if (n14 > 0.0f) {
                    n15 = n13 + n14;
                }
                ++k;
                n13 = n15;
            }
            if (n13 != 0.0f) {
                for (int l = 0; l < 3; ++l) {
                    final float[] m = cef.i;
                    final float n16 = m[l];
                    if (n16 > 0.0f) {
                        m[l] = n16 / n13;
                    }
                }
            }
            final abp c = cee.c;
            final int size2 = cee.a.size();
            ced ced = null;
            int n17 = 0;
            float n18 = 0.0f;
            while (n17 < size2) {
                final ced ced2 = cee.a.get(n17);
                final float[] c2 = ced2.c();
                final float n19 = c2[1];
                final float[] g = cef.g;
                float n25 = 0.0f;
                Label_0983: {
                    if (n19 >= g[0] && n19 <= g[2]) {
                        final float n20 = c2[2];
                        final float[] h = cef.h;
                        if (n20 >= h[0] && n20 <= h[2] && !cee.d.get(ced2.a)) {
                            final float[] c3 = ced2.c();
                            final ced e3 = cee.e;
                            int b2;
                            if (e3 != null) {
                                b2 = e3.b;
                            }
                            else {
                                b2 = 1;
                            }
                            float n21;
                            if (cef.c() > 0.0f) {
                                n21 = cef.c() * (1.0f - Math.abs(c3[1] - cef.g[1]));
                            }
                            else {
                                n21 = 0.0f;
                            }
                            float n22;
                            if (cef.a() > 0.0f) {
                                n22 = cef.a() * (1.0f - Math.abs(c3[2] - cef.h[1]));
                            }
                            else {
                                n22 = 0.0f;
                            }
                            float n23;
                            if (cef.b() > 0.0f) {
                                n23 = cef.b() * (ced2.b / (float)b2);
                            }
                            else {
                                n23 = 0.0f;
                            }
                            final float n24 = n21 + n22 + n23;
                            if (ced != null) {
                                n25 = n18;
                                if (n24 <= n18) {
                                    break Label_0983;
                                }
                            }
                            ced = ced2;
                            n25 = n24;
                            break Label_0983;
                        }
                    }
                    n25 = n18;
                }
                ++n17;
                n18 = n25;
            }
            if (ced != null) {
                final boolean j2 = cef.j;
                cee.d.append(ced.a, true);
            }
            c.put((Object)cef, (Object)ced);
        }
        cee.d.clear();
        return cee;
    }
    
    public final void c(final int n, final int n2, final int n3) {
        if (this.e == null) {
            this.e = new Rect();
        }
        this.e.set(0, 0, this.b.getWidth(), this.b.getHeight());
        if (this.e.intersect(0, n, n2, n3)) {
            return;
        }
        throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
    }
}
