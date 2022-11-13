import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akny extends ahbh implements ahcw
{
    public static final akny a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public long d;
    
    static {
        ahbh.registerDefaultInstance((Class)akny.class, (ahbh)(a = new akny()));
    }
    
    private akny() {
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
                if ((e = akny.e) == null) {
                    synchronized (akny.class) {
                        if (akny.e == null) {
                            akny.e = (ahdd)new ahba((ahbh)akny.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akny.a;
            }
            case 4: {
                return new ahaz((ahbh)akny.a);
            }
            case 3: {
                return new akny();
            }
            case 2: {
                return newMessageInfo((MessageLite)akny.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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
