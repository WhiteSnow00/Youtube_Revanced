import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aquf extends ahbh implements ahcw
{
    public static final aquf a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aquf.class, (ahbh)(a = new aquf()));
    }
    
    private aquf() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aquf.b) == null) {
                    synchronized (aquf.class) {
                        if (aquf.b == null) {
                            aquf.b = (ahdd)new ahba((ahbh)aquf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aquf.a;
            }
            case 4: {
                return new ahaz((ahbh)aquf.a);
            }
            case 3: {
                return new aquf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aquf.a, "\u0001\u0000", (Object[])null);
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
