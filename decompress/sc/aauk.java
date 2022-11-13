// 
// Decompiled by Procyon v0.6.0
// 

public final class aauk
{
    public final aaun a;
    public final aaun b;
    public float c;
    
    public aauk(float max, float c, final float n, final float n2, final int n3, final float[] array) {
        int i = 0;
        if (n < n2) {
            this.c = 0.0f;
            final aaul aaul = new aaul(new float[] { 0.0f, 10.0f, Math.max(10.0f, n) }, new float[] { 0.0f, 17.0f, n2 });
            this.b = aaul;
            this.a = aaul;
            return;
        }
        final float c2 = max * n2;
        this.c = c2;
        c *= n2;
        if (n3 <= 0) {
            this.c = Math.max(c2, 10.0f);
            max = Math.max(c, 17.0f);
            this.a = new aaul(new float[] { 0.0f, 10.0f, this.c }, new float[] { 0.0f, 17.0f, max });
            c = this.c;
            this.b = new aaum(new float[] { c, c + (n - c) * 0.5f, n }, new float[] { max, max + (n2 - c) * 0.75f, n2 });
            return;
        }
        final float c3 = max * n;
        this.c = c3;
        this.a = new aaul(new float[] { 0.0f, c3 }, new float[] { 0.0f, c });
        final int n4 = n3 + 2;
        final float[] array2 = new float[n4];
        final float[] array3 = new float[n4];
        array2[0] = this.c;
        array3[0] = c;
        final int n5 = n3 + 1;
        c = (1.0f - max) / n5;
        max += c;
        while (i < n3) {
            final int n6 = i + 1;
            array2[n6] = max * n;
            array3[n6] = array[i] * n2;
            max += c;
            i = n6;
        }
        array2[n5] = n;
        array3[n5] = n2;
        this.b = new aaum(array2, array3);
    }
}
