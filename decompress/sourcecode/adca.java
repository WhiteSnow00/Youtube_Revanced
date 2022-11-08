// 
// Decompiled by Procyon v0.6.0
// 

public final class adca implements adbr
{
    public final thh a;
    public final atid b;
    public amoo c;
    private final aeyr d;
    
    public adca(final asgt asgt, final thh a, final asho asho, final tda tda) {
        this.c = amoo.a;
        this.a = a;
        this.b = atid.aD();
        this.d = agnj.E((aeyr)new ysm(this, 16));
        if (tda.e().i) {
            asgt.P(asho).al((asix)new abtm(this, 18));
        }
    }
    
    @Override
    public final aexq a(final ahmf ahmf, final adbs adbs) {
        final amoo a = amoo.a;
        final int ordinal = adbs.a.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal == 5) {
                        if ((ahmf.b & 0x2) != 0x0) {
                            return aexq.k((Object)ahmf.d);
                        }
                    }
                }
                else if ((ahmf.b & 0x4) != 0x0) {
                    return aexq.k((Object)ahmf.e);
                }
            }
            else if ((ahmf.b & 0x8) != 0x0) {
                return aexq.k((Object)ahmf.f);
            }
        }
        else if ((ahmf.b & 0x10) != 0x0) {
            return aexq.k((Object)ahmf.g);
        }
        aexq aexq;
        if ((ahmf.b & 0x1) != 0x0) {
            aexq = aexq.k((Object)ahmf.c);
        }
        else {
            aexq = aewp.a;
        }
        return aexq;
    }
    
    @Override
    public final amoo b() {
        return this.c;
    }
    
    @Override
    public final asgt c() {
        return (asgt)this.d.a();
    }
}
