import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anxp extends ahbh implements ahcw
{
    public static final anxp a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)anxp.class, (ahbh)(a = new anxp()));
    }
    
    private anxp() {
        this.g = 2;
        final ahab b = ahab.b;
        emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anxp.b) == null) {
                    synchronized (anxp.class) {
                        if (anxp.b == null) {
                            anxp.b = (ahdd)new ahba((ahbh)anxp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anxp.a;
            }
            case 4: {
                return new ahaz((ahbh)anxp.a);
            }
            case 3: {
                return new anxp();
            }
            case 2: {
                return newMessageInfo((MessageLite)anxp.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0002\u0004\u1409\u0001", new Object[] { "c", "d", "f", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
