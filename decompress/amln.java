import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amln extends ahbh implements ahcw
{
    public static final amln a;
    private static volatile ahdd d;
    public int b;
    public ajut c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amln.class, (ahbh)(a = new amln()));
    }
    
    private amln() {
        this.e = 2;
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
                if ((d = amln.d) == null) {
                    synchronized (amln.class) {
                        if (amln.d == null) {
                            amln.d = (ahdd)new ahba((ahbh)amln.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amln.a;
            }
            case 4: {
                return new ahaz((ahbh)amln.a);
            }
            case 3: {
                return new amln();
            }
            case 2: {
                return newMessageInfo((MessageLite)amln.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "b", "c" });
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
