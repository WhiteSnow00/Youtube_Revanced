import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajup extends ahbh implements ahcw
{
    public static final ajup a;
    private static volatile ahdd e;
    public int b;
    public aibe c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajup.class, (ahbh)(a = new ajup()));
    }
    
    private ajup() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajup.e) == null) {
                    synchronized (ajup.class) {
                        if (ajup.e == null) {
                            ajup.e = (ahdd)new ahba((ahbh)ajup.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajup.a;
            }
            case 4: {
                return new ahaz((ahbh)ajup.a);
            }
            case 3: {
                return new ajup();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajup.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", ajty.k });
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
