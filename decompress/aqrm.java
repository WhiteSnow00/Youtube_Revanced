import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrm extends ahbh implements ahcw
{
    public static final aqrm a;
    private static volatile ahdd c;
    public ahbs b;
    
    static {
        ahbh.registerDefaultInstance((Class)aqrm.class, (ahbh)(a = new aqrm()));
    }
    
    private aqrm() {
        this.b = emptyLongList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aqrm.c) == null) {
                    synchronized (aqrm.class) {
                        if (aqrm.c == null) {
                            aqrm.c = (ahdd)new ahba((ahbh)aqrm.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqrm.a;
            }
            case 4: {
                return new ahaz((char[][])null, (char[][])null);
            }
            case 3: {
                return new aqrm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqrm.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0014", new Object[] { "b" });
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
