import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpw extends ahbh implements ahcw
{
    public static final agpw a;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        ahbh.registerDefaultInstance((Class)agpw.class, (ahbh)(a = new agpw()));
    }
    
    private agpw() {
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
                if ((c = agpw.c) == null) {
                    synchronized (agpw.class) {
                        if (agpw.c == null) {
                            agpw.c = (ahdd)new ahba((ahbh)agpw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agpw.a;
            }
            case 4: {
                return new ahaz((ahbh)agpw.a);
            }
            case 3: {
                return new agpw();
            }
            case 2: {
                return newMessageInfo((MessageLite)agpw.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", agpx.class });
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
