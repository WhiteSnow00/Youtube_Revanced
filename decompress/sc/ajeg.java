import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajeg extends ahbh implements ahcw
{
    public static final ajeg a;
    private static volatile ahdd e;
    public int b;
    public boolean c;
    public long d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajeg.class, (ahbh)(a = new ajeg()));
    }
    
    private ajeg() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajeg.e) == null) {
                    synchronized (ajeg.class) {
                        if (ajeg.e == null) {
                            ajeg.e = (ahdd)new ahba((ahbh)ajeg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajeg.a;
            }
            case 4: {
                return new ahaz((ahbh)ajeg.a);
            }
            case 3: {
                return new ajeg();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajeg.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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
