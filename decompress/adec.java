// 
// Decompiled by Procyon v0.6.0
// 

public final class adec implements addu
{
    public final tjm a;
    public final ativ b;
    public amqs c;
    private final afaq d;
    
    public adec(final ashi ashi, final tjm a, final asid asid, final tff tff) {
        this.c = amqs.a;
        this.a = a;
        this.b = ativ.aE();
        this.d = adyf.A((afaq)new yuk(this, 16));
        if (tff.e().i) {
            ashi.P(asid).am((asjm)new acpc(this, 3));
        }
    }
    
    public final aezp a(final ahod ahod, final addv addv) {
        final amqs a = amqs.a;
        final int ordinal = addv.a.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal == 5) {
                        if ((ahod.b & 0x2) != 0x0) {
                            return aezp.k((Object)ahod.d);
                        }
                    }
                }
                else if ((ahod.b & 0x4) != 0x0) {
                    return aezp.k((Object)ahod.e);
                }
            }
            else if ((ahod.b & 0x8) != 0x0) {
                return aezp.k((Object)ahod.f);
            }
        }
        else if ((ahod.b & 0x10) != 0x0) {
            return aezp.k((Object)ahod.g);
        }
        Object o;
        if ((ahod.b & 0x1) != 0x0) {
            o = aezp.k((Object)ahod.c);
        }
        else {
            o = aeyo.a;
        }
        return (aezp)o;
    }
    
    public final amqs b() {
        return this.c;
    }
    
    public final ashi c() {
        return (ashi)this.d.a();
    }
}
