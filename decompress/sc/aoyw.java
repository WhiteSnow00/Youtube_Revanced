import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoyw extends ahbh implements ahcw
{
    private static final aoyw a;
    private static volatile ahdd b;
    private String c;
    
    static {
        ahbh.registerDefaultInstance((Class)aoyw.class, (ahbh)(a = new aoyw()));
    }
    
    private aoyw() {
        this.c = "";
    }
    
    public static aoyw a() {
        return aoyw.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoyw.b) == null) {
                    synchronized (aoyw.class) {
                        if (aoyw.b == null) {
                            aoyw.b = (ahdd)new ahba((ahbh)aoyw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoyw.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new aoyw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoyw.a, "\u0001\u0000", (Object[])null);
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
