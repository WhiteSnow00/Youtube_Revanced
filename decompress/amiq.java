import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amiq extends ahbh implements ahcw
{
    public static final amiq a;
    private static volatile ahdd i;
    public int b;
    public ajut c;
    public ajut d;
    public akdi e;
    public aotp f;
    public aiqj g;
    public anuv h;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)amiq.class, (ahbh)(a = new amiq()));
    }
    
    private amiq() {
        this.j = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = amiq.i) == null) {
                    synchronized (amiq.class) {
                        if (amiq.i == null) {
                            amiq.i = (ahdd)new ahba((ahbh)amiq.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return amiq.a;
            }
            case 4: {
                return new ahaz((ahbh)amiq.a);
            }
            case 3: {
                return new amiq();
            }
            case 2: {
                return newMessageInfo((MessageLite)amiq.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
