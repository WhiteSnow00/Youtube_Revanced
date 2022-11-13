import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovt extends ahbh implements ahcw
{
    private static final aovt a;
    private static volatile ahdd b;
    private int c;
    
    static {
        ahbh.registerDefaultInstance((Class)aovt.class, (ahbh)(a = new aovt()));
    }
    
    private aovt() {
        this.c = 0;
    }
    
    public static aovt a() {
        return aovt.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aovt.b) == null) {
                    synchronized (aovt.class) {
                        if (aovt.b == null) {
                            aovt.b = (ahdd)new ahba((ahbh)aovt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aovt.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new aovt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aovt.a, "\u0001\u0000", (Object[])null);
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
