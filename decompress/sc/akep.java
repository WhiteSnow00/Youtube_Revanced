import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akep extends ahbh implements ahcw
{
    public static final akep a;
    private static volatile ahdd e;
    public long b;
    public long c;
    public long d;
    private int f;
    
    static {
        ahbh.registerDefaultInstance((Class)akep.class, (ahbh)(a = new akep()));
    }
    
    private akep() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = akep.e) == null) {
                    synchronized (akep.class) {
                        if (akep.e == null) {
                            akep.e = (ahdd)new ahba((ahbh)akep.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akep.a;
            }
            case 4: {
                return new ahaz((ahbh)akep.a);
            }
            case 3: {
                return new akep();
            }
            case 2: {
                return newMessageInfo((MessageLite)akep.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1003\u0000\u0003\u1003\u0002\u0004\u1003\u0003", new Object[] { "f", "b", "c", "d" });
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
