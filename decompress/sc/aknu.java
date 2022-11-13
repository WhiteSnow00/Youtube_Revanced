import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknu extends ahbh implements ahcw
{
    public static final aknu a;
    private static volatile ahdd e;
    public int b;
    public long c;
    public akny d;
    
    static {
        ahbh.registerDefaultInstance((Class)aknu.class, (ahbh)(a = new aknu()));
    }
    
    private aknu() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aknu.e) == null) {
                    synchronized (aknu.class) {
                        if (aknu.e == null) {
                            aknu.e = (ahdd)new ahba((ahbh)aknu.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aknu.a;
            }
            case 4: {
                return new ahaz((ahbh)aknu.a);
            }
            case 3: {
                return new aknu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aknu.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0003\u1009\u0002", new Object[] { "b", "c", "d" });
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
