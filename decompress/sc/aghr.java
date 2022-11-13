import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aghr extends ahbh implements ahcw
{
    public static final aghr a;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        ahbh.registerDefaultInstance((Class)aghr.class, (ahbh)(a = new aghr()));
    }
    
    private aghr() {
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
                if ((c = aghr.c) == null) {
                    synchronized (aghr.class) {
                        if (aghr.c == null) {
                            aghr.c = (ahdd)new ahba((ahbh)aghr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aghr.a;
            }
            case 4: {
                return new ahaz((ahbh)aghr.a);
            }
            case 3: {
                return new aghr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aghr.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "b" });
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
