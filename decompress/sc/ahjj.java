import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjj extends ahbh implements ahcw
{
    public static final ahjj a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ahjj.class, (ahbh)(a = new ahjj()));
    }
    
    private ahjj() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ahjj.b) == null) {
                    synchronized (ahjj.class) {
                        if (ahjj.b == null) {
                            ahjj.b = (ahdd)new ahba((ahbh)ahjj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahjj.a;
            }
            case 4: {
                return new ahaz((ahbh)ahjj.a);
            }
            case 3: {
                return new ahjj();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjj.a, "\u0001\u0000", (Object[])null);
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
