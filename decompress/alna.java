// 
// Decompiled by Procyon v0.6.0
// 

final class alna implements ahbn
{
    static final ahbn a;
    static final ahbn b;
    static final ahbn c;
    static final ahbn d;
    static final ahbn e;
    static final ahbn f;
    static final ahbn g;
    static final ahbn h;
    private final int i;
    
    static {
        h = (ahbn)new alna(7);
        g = (ahbn)new alna(6);
        f = (ahbn)new alna(5);
        e = (ahbn)new alna(4);
        d = (ahbn)new alna(3);
        c = (ahbn)new alna(2);
        b = (ahbn)new alna(1);
        a = (ahbn)new alna(0);
    }
    
    private alna(final int i) {
        this.i = i;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.i) {
            default: {
                if (alne.b(n) != null) {
                    return true;
                }
                break;
            }
            case 6: {
                return aqsx.dR(n) != 0;
            }
            case 5: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 4: {
                return n == 0 || n == 1 || n == 2;
            }
            case 3: {
                return alnd.b(n) != null;
            }
            case 2: {
                return alnc.b(n) != null;
            }
            case 1: {
                return almz.b(n) != null;
            }
            case 0: {
                if (alnb.b(n) != null) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
