import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjq extends ahbh implements ahcw
{
    public static final aqjq a;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        ahbh.registerDefaultInstance((Class)aqjq.class, (ahbh)(a = new aqjq()));
    }
    
    private aqjq() {
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
                if ((c = aqjq.c) == null) {
                    synchronized (aqjq.class) {
                        if (aqjq.c == null) {
                            aqjq.c = (ahdd)new ahba((ahbh)aqjq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqjq.a;
            }
            case 4: {
                return new ahaz((char[][])null, (char[])null);
            }
            case 3: {
                return new aqjq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqjq.a, "\u0001\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0001\u0000\u0006\u001b", new Object[] { "b", anny.class });
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
