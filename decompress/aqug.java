import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqug extends ahbh implements ahcw
{
    public static final aqug a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aqug.class, (ahbh)(a = new aqug()));
    }
    
    private aqug() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqug.b) == null) {
                    synchronized (aqug.class) {
                        if (aqug.b == null) {
                            aqug.b = (ahdd)new ahba((ahbh)aqug.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqug.a;
            }
            case 4: {
                return new ahaz((ahbh)aqug.a);
            }
            case 3: {
                return new aqug();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqug.a, "\u0001\u0000", (Object[])null);
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
