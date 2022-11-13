import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajhi extends ahbh implements ahcw
{
    public static final ajhi a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)ajhi.class, (ahbh)(a = new ajhi()));
    }
    
    private ajhi() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajhi.d) == null) {
                    synchronized (ajhi.class) {
                        if (ajhi.d == null) {
                            ajhi.d = (ahdd)new ahba((ahbh)ajhi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajhi.a;
            }
            case 4: {
                return new ahaz((ahbh)ajhi.a);
            }
            case 3: {
                return new ajhi();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajhi.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
