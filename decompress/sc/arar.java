import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arar extends ahbh implements ahcw
{
    public static final arar a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)arar.class, (ahbh)(a = new arar()));
    }
    
    private arar() {
        this.c = "";
        this.d = 1;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = arar.e) == null) {
                    synchronized (arar.class) {
                        if (arar.e == null) {
                            arar.e = (ahdd)new ahba((ahbh)arar.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return arar.a;
            }
            case 4: {
                return new ahaz((ahbh)arar.a);
            }
            case 3: {
                return new arar();
            }
            case 2: {
                return newMessageInfo((MessageLite)arar.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", aqvs.s });
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
