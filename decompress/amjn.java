import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjn extends ahbh implements ahcw
{
    public static final amjn a;
    private static volatile ahdd j;
    public boolean b;
    public boolean c;
    public boolean d;
    public aics e;
    public boolean f;
    public ahbp g;
    public amqk h;
    public anxy i;
    private int k;
    private int l;
    
    static {
        ahbh.registerDefaultInstance((Class)amjn.class, (ahbh)(a = new amjn()));
    }
    
    private amjn() {
        emptyIntList();
        ahbh.emptyProtobufList();
        this.g = emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = amjn.j) == null) {
                    synchronized (amjn.class) {
                        if (amjn.j == null) {
                            amjn.j = (ahdd)new ahba((ahbh)amjn.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return amjn.a;
            }
            case 4: {
                return new ahaz((ahbh)amjn.a);
            }
            case 3: {
                return new amjn();
            }
            case 2: {
                return newMessageInfo((MessageLite)amjn.a, "\u0001\b\u0000\u0002\r+\b\u0000\u0001\u0000\r\u1007\t\u0019\u1007\u0010\"\u1007\u0019#\u1009\u001a$\u1007\u001b%\u0016&\u1009\u001c+\u1009 ", new Object[] { "k", "l", "b", "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
