import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsh extends ahbh implements ahcw
{
    public static final aqsh a;
    private static volatile ahdd e;
    public int b;
    public aqsb c;
    public ahan d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqsh.class, (ahbh)(a = new aqsh()));
    }
    
    private aqsh() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqsh.e) == null) {
                    synchronized (aqsh.class) {
                        if (aqsh.e == null) {
                            aqsh.e = (ahdd)new ahba((ahbh)aqsh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqsh.a;
            }
            case 4: {
                return new ahaz((ahbh)aqsh.a);
            }
            case 3: {
                return new aqsh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqsh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
