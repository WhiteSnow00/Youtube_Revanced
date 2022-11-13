import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akoe extends ahbh implements ahcw
{
    public static final akoe a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public Object d;
    public String e;
    
    static {
        ahbh.registerDefaultInstance((Class)akoe.class, (ahbh)(a = new akoe()));
    }
    
    private akoe() {
        this.c = 0;
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = akoe.f) == null) {
                    synchronized (akoe.class) {
                        if (akoe.f == null) {
                            akoe.f = (ahdd)new ahba((ahbh)akoe.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akoe.a;
            }
            case 4: {
                return new ahaz((ahbh)akoe.a);
            }
            case 3: {
                return new akoe();
            }
            case 2: {
                return newMessageInfo((MessageLite)akoe.a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1035\u0000\u0003\u1035\u0000", new Object[] { "d", "c", "b", "e" });
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
