// 
// Decompiled by Procyon v0.6.0
// 

public final class aeac extends adzw
{
    final float a;
    
    public aeac() {
        this.a = -1.0f;
    }
    
    public final void c(final aeao aeao, float n, float n2) {
        aeao.f(n2 * n, 180.0f, 90.0f);
        n2 = (n2 + n2) * n;
        final aeak aeak = new aeak(0.0f, 0.0f, n2, n2);
        aeak.e = 180.0f;
        aeak.f = 90.0f;
        aeao.f.add(aeak);
        aeao.b((aean)new aeai(aeak), 180.0f, 270.0f);
        n = (float)Math.cos(Math.toRadians(270.0));
        final float n3 = n2 + 0.0f;
        n2 = n3 / 2.0f;
        final float n4 = n3 * 0.5f;
        aeao.b = n * n2 + n4;
        aeao.c = n4 + n2 * (float)Math.sin(Math.toRadians(270.0));
    }
}
