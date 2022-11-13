import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aggx extends ahbh implements ahcw
{
    public static final aggx a;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        ahbh.registerDefaultInstance((Class)aggx.class, (ahbh)(a = new aggx()));
    }
    
    private aggx() {
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
                if ((c = aggx.c) == null) {
                    synchronized (aggx.class) {
                        if (aggx.c == null) {
                            aggx.c = (ahdd)new ahba((ahbh)aggx.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aggx.a;
            }
            case 4: {
                return new ahaz((ahbh)aggx.a);
            }
            case 3: {
                return new aggx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aggx.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[] { "b" });
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
