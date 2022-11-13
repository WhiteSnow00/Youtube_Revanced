import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsl extends ahbh implements ahcw
{
    public static final aqsl a;
    private static volatile ahdd e;
    public int b;
    public aqsn c;
    public ahbx d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqsl.class, (ahbh)(a = new aqsl()));
    }
    
    private aqsl() {
        this.d = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqsl.e) == null) {
                    synchronized (aqsl.class) {
                        if (aqsl.e == null) {
                            aqsl.e = (ahdd)new ahba((ahbh)aqsl.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqsl.a;
            }
            case 4: {
                return new ahaz((ahbh)aqsl.a);
            }
            case 3: {
                return new aqsl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqsl.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u001b", new Object[] { "b", "c", "d", aqsm.class });
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
