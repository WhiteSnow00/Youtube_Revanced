import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexz extends ahbh implements ahcw
{
    public static final aexz a;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        ahbh.registerDefaultInstance((Class)aexz.class, (ahbh)(a = new aexz()));
    }
    
    private aexz() {
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
                if ((c = aexz.c) == null) {
                    synchronized (aexz.class) {
                        if (aexz.c == null) {
                            aexz.c = (ahdd)new ahba((ahbh)aexz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aexz.a;
            }
            case 4: {
                return new ahaz((ahbh)aexz.a);
            }
            case 3: {
                return new aexz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aexz.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", aexy.class });
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
