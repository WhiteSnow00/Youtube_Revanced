import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jfg implements jfh
{
    private final /* synthetic */ int a;
    private final agzi b;
    
    public jfg(final aiay b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public jfg(final amra b, final int a) {
        this.a = a;
        this.b = (agzi)b;
    }
    
    public final aioe a() {
        if (this.a != 0) {
            final aiay aiay = (aiay)this.b;
            aioe g;
            if ((aiay.b & 0x4) != 0x0) {
                if ((g = aiay.g) == null) {
                    return aioe.a;
                }
            }
            else {
                g = null;
            }
            return g;
        }
        aioe aioe;
        if ((aioe = ((amra)this.b).f) == null) {
            aioe = aioe.a;
        }
        return aioe;
    }
    
    public final ajsq b() {
        if (this.a != 0) {
            ajsq ajsq;
            if ((ajsq = ((aiay)this.b).d) == null) {
                ajsq = ajsq.a;
            }
            return ajsq;
        }
        ajsq ajsq2;
        if ((ajsq2 = ((amra)this.b).c) == null) {
            ajsq2 = ajsq.a;
        }
        return ajsq2;
    }
    
    public final ajsq c() {
        if (this.a != 0) {
            ajsq ajsq;
            if ((ajsq = ((aiay)this.b).c) == null) {
                ajsq = ajsq.a;
            }
            return ajsq;
        }
        ajsq ajsq2;
        if ((ajsq2 = ((amra)this.b).b) == null) {
            ajsq2 = ajsq.a;
        }
        return ajsq2;
    }
    
    public final aorm d() {
        if (this.a != 0) {
            final aiay aiay = (aiay)this.b;
            aorm k;
            if ((aiay.b & 0x40) != 0x0) {
                if ((k = aiay.k) == null) {
                    return aorm.a;
                }
            }
            else {
                k = null;
            }
            return k;
        }
        aorm aorm;
        if ((aorm = ((amra)this.b).i) == null) {
            aorm = aorm.a;
        }
        return aorm;
    }
    
    public final List e() {
        if (this.a != 0) {
            return ((aiay)this.b).e;
        }
        return ((amra)this.b).d;
    }
    
    public final List f() {
        if (this.a != 0) {
            return ((aiay)this.b).f;
        }
        return ((amra)this.b).e;
    }
    
    public final byte[] g() {
        if (this.a != 0) {
            return ((aiay)this.b).l.I();
        }
        return null;
    }
    
    public final int h() {
        final int a = this.a;
        int n = 1;
        if (a != 0) {
            final aiay aiay = (aiay)this.b;
            if ((aiay.b & 0x20) != 0x0) {
                final int ai = aesy.aI(aiay.j);
                if (ai != 0) {
                    return ai;
                }
            }
            else {
                n = 0;
            }
            return n;
        }
        final int ai2 = aesy.aI(((amra)this.b).h);
        if (ai2 == 0) {
            return 1;
        }
        return ai2;
    }
}
