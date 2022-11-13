import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbt extends ahbh implements ahcw
{
    public static final ajbt a;
    private static volatile ahdd e;
    public boolean b;
    public boolean c;
    public boolean d;
    private int f;
    
    static {
        ahbh.registerDefaultInstance((Class)ajbt.class, (ahbh)(a = new ajbt()));
    }
    
    private ajbt() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajbt.e) == null) {
                    synchronized (ajbt.class) {
                        if (ajbt.e == null) {
                            ajbt.e = (ahdd)new ahba((ahbh)ajbt.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajbt.a;
            }
            case 4: {
                return new ahaz((ahbh)ajbt.a);
            }
            case 3: {
                return new ajbt();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajbt.a, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0006\u1007\u0005\t\u1007\b", new Object[] { "f", "b", "c", "d" });
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
