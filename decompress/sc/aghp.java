import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aghp extends ahbh implements ahcw
{
    private static final aghp a;
    private static volatile ahdd b;
    private String c;
    
    static {
        ahbh.registerDefaultInstance((Class)aghp.class, (ahbh)(a = new aghp()));
    }
    
    private aghp() {
        this.c = "";
    }
    
    public static aghp a() {
        return aghp.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aghp.b) == null) {
                    synchronized (aghp.class) {
                        if (aghp.b == null) {
                            aghp.b = (ahdd)new ahba((ahbh)aghp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aghp.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new aghp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aghp.a, "\u0001\u0000", (Object[])null);
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
