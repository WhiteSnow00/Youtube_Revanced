import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoma extends ahbh implements ahcw
{
    public static final aoma a;
    private static volatile ahdd d;
    public int b;
    public ajut c;
    private ahhu e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aoma.class, (ahbh)(a = new aoma()));
    }
    
    private aoma() {
        this.f = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aoma.d) == null) {
                    synchronized (aoma.class) {
                        if (aoma.d == null) {
                            aoma.d = (ahdd)new ahba((ahbh)aoma.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoma.a;
            }
            case 4: {
                return new ahaz((ahbh)aoma.a);
            }
            case 3: {
                return new aoma();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoma.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0001", new Object[] { "b", "c", "e" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}