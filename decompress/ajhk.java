import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajhk extends ahbh implements ahcw
{
    public static final ajhk a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajhk.class, (ahbh)(a = new ajhk()));
    }
    
    private ajhk() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ajhk.f) == null) {
                    synchronized (ajhk.class) {
                        if (ajhk.f == null) {
                            ajhk.f = (ahdd)new ahba((ahbh)ajhk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajhk.a;
            }
            case 4: {
                return new ahaz((ahbh)ajhk.a);
            }
            case 3: {
                return new ajhk();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajhk.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1004\u0002", new Object[] { "b", "c", ajhj.a(), "d", ajhp.a(), "e" });
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
