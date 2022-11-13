import java.util.function.ToLongFunction;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ijv implements ToLongFunction
{
    public static final ijv a;
    public static final ijv b;
    public static final ijv c;
    public static final ijv d;
    public static final ijv e;
    public static final ijv f;
    public static final ijv g;
    public static final ijv h;
    public static final ijv i;
    public static final ijv j;
    public static final ijv k;
    private final int l;
    
    static {
        k = new ijv(10);
        j = new ijv(9);
        i = new ijv(8);
        h = new ijv(7);
        g = new ijv(6);
        f = new ijv(5);
        e = new ijv(4);
        d = new ijv(3);
        c = new ijv(2);
        b = new ijv(1);
        a = new ijv(0);
    }
    
    private ijv(final int l) {
        this.l = l;
    }
    
    @Override
    public final long applyAsLong(final Object o) {
        switch (this.l) {
            default: {
                return ((aouq)o).b;
            }
            case 9: {
                return ((zkz)o).d;
            }
            case 8: {
                return ((xym)o).a();
            }
            case 7: {
                return ((xyk)o).b.size();
            }
            case 6: {
                return ((xyk)o).a;
            }
            case 5: {
                return ((lxr)o).a();
            }
            case 4: {
                return ((aqqg)o).b;
            }
            case 3: {
                return ((aqqf)o).e;
            }
            case 2: {
                return ((sgn)o).e.a;
            }
            case 1: {
                return ((aoln)o).c;
            }
            case 0: {
                return ((aoln)o).c;
            }
        }
    }
}
