import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaqu extends aanu
{
    public final aaqz e;
    public aaqe f;
    public aarc g;
    public aarc h;
    public float i;
    private final aasb j;
    private final atjj k;
    
    public aaqu(final aarp aarp, final aasb j, final atjj k) {
        super(new aapo(j.a(), 1.0f, 1.0f));
        this.j = j;
        this.k = k;
        final aaqz p3 = aarp.m.p(j.a(), 0.0f, 4.0f);
        (this.e = p3).B(true, false);
        p3.A(2.0f);
        p3.h(17);
        ((aann)p3).k(0.0f, 0.1f, 0.0f);
    }
    
    public static aara a(final Bitmap bitmap, final aasa aasa, final aaqu aaqu) {
        final aara aara = new aara(bitmap, aasa, aaqu.j.a(), aaqu.k);
        ((aann)aara).d = 0.3f;
        ((aann)aara).a((aanm)new aapz((aapy)aara, 0.1f, 0.2f));
        return aara;
    }
    
    public static aasa b(final float n, final boolean b) {
        float[] array;
        if (b) {
            array = aasa.b;
        }
        else {
            array = aasa.c;
        }
        return aasa.a(n, 4.0f, array);
    }
}
