import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjj extends ahbh implements ahcw
{
    public static final amjj a;
    private static volatile ahdd t;
    public int b;
    public aotp c;
    public amji d;
    public anuv e;
    public amjh f;
    public amje g;
    public anuv h;
    public anuv i;
    public amjd j;
    public anuv k;
    public anuv l;
    public anuv m;
    public anuv n;
    public anuv o;
    public boolean p;
    public anuv q;
    public anuv r;
    public anuv s;
    private amjg u;
    private amjg v;
    private amjc w;
    private amjf x;
    private byte y;
    
    static {
        ahbh.registerDefaultInstance((Class)amjj.class, (ahbh)(a = new amjj()));
    }
    
    private amjj() {
        this.y = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte y = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd t;
                if ((t = amjj.t) == null) {
                    synchronized (amjj.class) {
                        if (amjj.t == null) {
                            amjj.t = (ahdd)new ahba((ahbh)amjj.a);
                        }
                    }
                }
                return t;
            }
            case 5: {
                return amjj.a;
            }
            case 4: {
                return new ahaz((char[])null, (int[][])null);
            }
            case 3: {
                return new amjj();
            }
            case 2: {
                return newMessageInfo((MessageLite)amjj.a, "\u0001\u0015\u0000\u0001\u0001\u0016\u0015\u0000\u0000\u0014\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u0007\b\u1409\b\t\u1409\u000b\n\u1409\f\f\u1409\u000e\r\u1409\u000f\u000e\u1409\r\u000f\u1409\u0010\u0010\u1409\u0002\u0011\u1409\t\u0012\u1409\n\u0013\u1007\u0011\u0014\u1409\u0012\u0015\u1409\u0013\u0016\u1409\u0014", new Object[] { "b", "c", "d", "f", "u", "v", "g", "w", "x", "j", "k", "m", "n", "l", "o", "e", "h", "i", "p", "q", "r", "s" });
            }
            case 1: {
                if (o == null) {
                    y = 0;
                }
                this.y = y;
                return null;
            }
            case 0: {
                return this.y;
            }
        }
    }
}
