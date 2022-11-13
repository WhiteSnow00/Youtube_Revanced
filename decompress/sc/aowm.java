import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowm extends ahbh implements ahcw
{
    public static final aowm a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aowm.class, (ahbh)(a = new aowm()));
    }
    
    private aowm() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aowm.e) == null) {
                    synchronized (aowm.class) {
                        if (aowm.e == null) {
                            aowm.e = (ahdd)new ahba((ahbh)aowm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aowm.a;
            }
            case 4: {
                return new ahaz((ahbh)aowm.a);
            }
            case 3: {
                return new aowm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aowm.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", aowa.a() });
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
