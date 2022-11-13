import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqlt extends ahbh implements ahcw
{
    public static final aqlt a;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        ahbh.registerDefaultInstance((Class)aqlt.class, (ahbh)(a = new aqlt()));
    }
    
    private aqlt() {
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
                if ((c = aqlt.c) == null) {
                    synchronized (aqlt.class) {
                        if (aqlt.c == null) {
                            aqlt.c = (ahdd)new ahba((ahbh)aqlt.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqlt.a;
            }
            case 4: {
                return new ahaz((boolean[][])null, (char[][])null);
            }
            case 3: {
                return new aqlt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqlt.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", aqlp.class });
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
