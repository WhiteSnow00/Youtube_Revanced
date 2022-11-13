import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aozb extends ahbh implements ahcw
{
    private static final aozb a;
    private static volatile ahdd b;
    private String c;
    
    static {
        ahbh.registerDefaultInstance((Class)aozb.class, (ahbh)(a = new aozb()));
    }
    
    private aozb() {
        this.c = "";
    }
    
    public static aozb a() {
        return aozb.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aozb.b) == null) {
                    synchronized (aozb.class) {
                        if (aozb.b == null) {
                            aozb.b = (ahdd)new ahba((ahbh)aozb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aozb.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new aozb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aozb.a, "\u0001\u0000", (Object[])null);
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
