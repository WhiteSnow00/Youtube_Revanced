import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqzq extends ahbh implements ahcw
{
    public static final aqzq a;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        ahbh.registerDefaultInstance((Class)aqzq.class, (ahbh)(a = new aqzq()));
    }
    
    private aqzq() {
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
                if ((c = aqzq.c) == null) {
                    synchronized (aqzq.class) {
                        if (aqzq.c == null) {
                            aqzq.c = (ahdd)new ahba((ahbh)aqzq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqzq.a;
            }
            case 4: {
                return new ahaz((ahbh)aqzq.a);
            }
            case 3: {
                return new aqzq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqzq.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", aqzl.class });
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
