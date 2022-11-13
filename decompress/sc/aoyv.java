import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoyv extends ahbh implements ahcw
{
    private static final aoyv a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aoyv.class, (ahbh)(a = new aoyv()));
    }
    
    private aoyv() {
    }
    
    public static aoyv a() {
        return aoyv.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoyv.b) == null) {
                    synchronized (aoyv.class) {
                        if (aoyv.b == null) {
                            aoyv.b = (ahdd)new ahba((ahbh)aoyv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoyv.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new aoyv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoyv.a, "\u0001\u0000", (Object[])null);
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
