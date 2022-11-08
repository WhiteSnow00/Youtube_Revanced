import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhp extends agzi implements ahax
{
    public static final amhp a;
    private static volatile ahbe c;
    public anss b;
    private int d;
    private anss e;
    private anss f;
    private anss g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)amhp.class, (agzi)(a = new amhp()));
    }
    
    private amhp() {
        this.h = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = amhp.c) == null) {
                    synchronized (amhp.class) {
                        if (amhp.c == null) {
                            amhp.c = (ahbe)new agzb((agzi)amhp.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amhp.a;
            }
            case 4: {
                return new agza((agzi)amhp.a);
            }
            case 3: {
                return new amhp();
            }
            case 2: {
                return newMessageInfo((MessageLite)amhp.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "d", "e", "f", "b", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
