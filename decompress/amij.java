import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amij extends ahbh implements ahcw
{
    public static final amij a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ahhu f;
    private ajut g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)amij.class, (ahbh)(a = new amij()));
    }
    
    private amij() {
        this.h = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
        emptyProtobufList();
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
                final ahdd b;
                if ((b = amij.b) == null) {
                    synchronized (amij.class) {
                        if (amij.b == null) {
                            amij.b = (ahdd)new ahba((ahbh)amij.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amij.a;
            }
            case 4: {
                return new ahaz((ahbh)amij.a);
            }
            case 3: {
                return new amij();
            }
            case 2: {
                return newMessageInfo((MessageLite)amij.a, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0003\u1409\u0002\u0006\u1409\u0004\n\u1409\u0001", new Object[] { "c", "d", "f", "g", "e" });
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
