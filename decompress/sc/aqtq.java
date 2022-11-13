import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqtq extends ahbh implements ahcw
{
    public static final aqtq a;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        ahbh.registerDefaultInstance((Class)aqtq.class, (ahbh)(a = new aqtq()));
    }
    
    private aqtq() {
        this.b = ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aqtq.c) == null) {
                    synchronized (aqtq.class) {
                        if (aqtq.c == null) {
                            aqtq.c = (ahdd)new ahba((ahbh)aqtq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqtq.a;
            }
            case 4: {
                return new ahaz((int[])null, (int[][])null);
            }
            case 3: {
                return new aqtq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqtq.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "b" });
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
