import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amii extends ahbh implements ahcw
{
    public static final amii a;
    private static volatile ahdd e;
    public ajut b;
    public String c;
    public ajut d;
    private int f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)amii.class, (ahbh)(a = new amii()));
    }
    
    private amii() {
        this.h = 2;
        this.c = "";
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = amii.e) == null) {
                    synchronized (amii.class) {
                        if (amii.e == null) {
                            amii.e = (ahdd)new ahba((ahbh)amii.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amii.a;
            }
            case 4: {
                return new ahaz((ahbh)amii.a);
            }
            case 3: {
                return new amii();
            }
            case 2: {
                return newMessageInfo((MessageLite)amii.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "f", "b", "c", "d", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
