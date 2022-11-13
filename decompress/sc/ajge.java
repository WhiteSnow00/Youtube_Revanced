import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajge extends ahbh implements ahcw
{
    public static final ajge a;
    private static volatile ahdd f;
    public int b;
    public boolean c;
    public ajfu d;
    public ajfs e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajge.class, (ahbh)(a = new ajge()));
    }
    
    private ajge() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ajge.f) == null) {
                    synchronized (ajge.class) {
                        if (ajge.f == null) {
                            ajge.f = (ahdd)new ahba((ahbh)ajge.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajge.a;
            }
            case 4: {
                return new ahaz((ahbh)ajge.a);
            }
            case 3: {
                return new ajge();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajge.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
