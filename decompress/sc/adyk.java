// 
// Decompiled by Procyon v0.6.0
// 

public final class adyk extends adyf
{
    final float a;
    
    public adyk() {
        this.a = -1.0f;
    }
    
    public final void c(final adyw adyw, float n, float n2) {
        adyw.f(n2 * n, 180.0f, 90.0f);
        n2 = (n2 + n2) * n;
        final adys adys = new adys(0.0f, 0.0f, n2, n2);
        adys.e = 180.0f;
        adys.f = 90.0f;
        adyw.f.add(adys);
        adyw.b((adyv)new adyq(adys), 180.0f, 270.0f);
        n = (float)Math.cos(Math.toRadians(270.0));
        final float n3 = n2 + 0.0f;
        n2 = n3 / 2.0f;
        final float n4 = n3 * 0.5f;
        adyw.b = n * n2 + n4;
        adyw.c = n4 + n2 * (float)Math.sin(Math.toRadians(270.0));
    }
}
