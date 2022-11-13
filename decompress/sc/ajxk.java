import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxk extends ahbh implements ahcw
{
    public static final ajxk a;
    private static volatile ahdd d;
    public int b;
    public int c;
    
    static {
        ahbh.registerDefaultInstance((Class)ajxk.class, (ahbh)(a = new ajxk()));
    }
    
    private ajxk() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajxk.d) == null) {
                    synchronized (ajxk.class) {
                        if (ajxk.d == null) {
                            ajxk.d = (ahdd)new ahba((ahbh)ajxk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajxk.a;
            }
            case 4: {
                return new ahaz((ahbh)ajxk.a);
            }
            case 3: {
                return new ajxk();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", ajty.s });
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
