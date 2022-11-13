import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anba extends ahbh implements ahcw
{
    public static final anba a;
    private static volatile ahdd b;
    private int c;
    private anaz d;
    private anbc e;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)anba.class, (ahbh)(a = new anba()));
    }
    
    private anba() {
        this.g = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
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
                if ((b = anba.b) == null) {
                    synchronized (anba.class) {
                        if (anba.b == null) {
                            anba.b = (ahdd)new ahba((ahbh)anba.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anba.a;
            }
            case 4: {
                return new ahaz((ahbh)anba.a);
            }
            case 3: {
                return new anba();
            }
            case 2: {
                return newMessageInfo((MessageLite)anba.a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0006\u1409\u0004", new Object[] { "c", "d", "e", "f" });
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
