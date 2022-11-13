// 
// Decompiled by Procyon v0.6.0
// 

public final class aaub
{
    public static final float[] a;
    public static final float[] b;
    public static final float[] c;
    public final adet d;
    public final adet e;
    
    static {
        a = new float[] { 0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f, 0.3127f, 0.329f };
        b = new float[] { 0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f, 0.3127f, 0.329f };
        c = new float[] { 0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f, 0.3127f, 0.329f };
    }
    
    public aaub(float[] array) {
        final adet e = new adet((int[])null);
        this.e = e;
        final float n = array[0];
        final float n2 = array[2];
        final float n3 = array[4];
        final float n4 = array[1];
        final float n5 = array[3];
        final float n6 = array[5];
        final adet adet = new adet(n, n2, n3, n4, n5, n6, 1.0f - n - n4, 1.0f - n2 - n5, 1.0f - n3 - n6);
        final float n7 = array[6];
        final float n8 = array[7];
        final float n9 = n7 / n8;
        final float n10 = (1.0f - n7 - n8) / n8;
        final adet adet2 = new adet((int[])null);
        adet.ay(adet2);
        array = (float[])adet2.a;
        final adet d = new adet(array[0] * n9 + array[1] + array[2] * n10, 0.0f, 0.0f, 0.0f, array[3] * n9 + array[4] + array[5] * n10, 0.0f, 0.0f, 0.0f, array[6] * n9 + array[7] + array[8] * n10);
        adet.ax(adet, this.d = d, d);
        d.ay(e);
    }
}
