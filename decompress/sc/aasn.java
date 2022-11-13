// 
// Decompiled by Procyon v0.6.0
// 

public final class aasn implements aass
{
    public final aasu a;
    public final aaso b;
    public final aasu c;
    public final aasu d;
    
    public aasn(final aasu a, final aaso b, final aasu c, final aasu d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a(float n, float n2) {
        final aasu a = this.a;
        n *= 0.9f;
        final aaso b = this.b;
        final aasu c = this.c;
        final aasu d = this.d;
        ((aapi)a).sZ(n, 1.0f, 1.0f);
        final float i = b.i;
        final float j = (n + 2.0f) / 2.0f;
        final float n3 = j - i;
        ((aapi)c).k(-n3, 0.0f, 0.0f);
        ((aapi)d).k(n3, 0.0f, 0.0f);
        b.i = j;
        ((aapo)b).l(4.0f + n, n2);
        final aary f = b.f;
        f.a = new float[] { n, 1.0f, 1.0f };
        f.b = new float[] { n * 1.1f, 1.1f, 1.1f };
        n2 = (n * 0.100000024f + 0.20000005f) / 2.0f;
        n = -n2;
        b.g.a = new float[] { n, 0.0f, 0.0f };
        b.h.a = new float[] { n2, 0.0f, 0.0f };
    }
}
