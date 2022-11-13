import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcr extends ahbh implements ahcw
{
    public static final aqcr a;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        ahbh.registerDefaultInstance((Class)aqcr.class, (ahbh)(a = new aqcr()));
    }
    
    private aqcr() {
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aqcr.c) == null) {
                    synchronized (aqcr.class) {
                        if (aqcr.c == null) {
                            aqcr.c = (ahdd)new ahba((ahbh)aqcr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqcr.a;
            }
            case 4: {
                return new ahaz((ahbh)aqcr.a);
            }
            case 3: {
                return new aqcr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqcr.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", pek.class });
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
