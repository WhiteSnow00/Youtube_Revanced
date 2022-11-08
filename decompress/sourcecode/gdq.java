// 
// Decompiled by Procyon v0.6.0
// 

public final class gdq implements gdr
{
    private final ajys a;
    
    public gdq(final ajys a) {
        this.a = a;
    }
    
    @Override
    public final aioe a() {
        final ajys a = this.a;
        if (a == null) {
            return null;
        }
        aioe a2;
        if (a.c == 3) {
            a2 = (aioe)a.d;
        }
        else {
            a2 = aioe.a;
        }
        return a2;
    }
    
    @Override
    public final aioe b() {
        final ajys a = this.a;
        if (a == null) {
            return null;
        }
        aioe a2;
        if (a.c == 2) {
            a2 = (aioe)a.d;
        }
        else {
            a2 = aioe.a;
        }
        return a2;
    }
    
    @Override
    public final akbf c() {
        final ajys a = this.a;
        if (a == null) {
            return null;
        }
        akbf akbf;
        if ((akbf = a.e) == null) {
            akbf = akbf.a;
        }
        return akbf;
    }
    
    @Override
    public final Object d() {
        return this.a;
    }
    
    @Override
    public final String e() {
        final ajys a = this.a;
        if (a != null && (a.b & 0x8) != 0x0) {
            ahgm ahgm;
            if ((ahgm = a.f) == null) {
                ahgm = ahgm.a;
            }
            return ahgm.c;
        }
        return null;
    }
}
