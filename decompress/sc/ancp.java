import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ancp extends ahbh implements ahcw
{
    public static final ancp a;
    private static volatile ahdd d;
    public int b;
    public amel c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ancp.class, (ahbh)(a = new ancp()));
    }
    
    private ancp() {
        this.e = 2;
        emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ancp.d) == null) {
                    synchronized (ancp.class) {
                        if (ancp.d == null) {
                            ancp.d = (ahdd)new ahba((ahbh)ancp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ancp.a;
            }
            case 4: {
                return new ahaz((ahbh)ancp.a);
            }
            case 3: {
                return new ancp();
            }
            case 2: {
                return newMessageInfo((MessageLite)ancp.a, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007\u1009\u0003", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
