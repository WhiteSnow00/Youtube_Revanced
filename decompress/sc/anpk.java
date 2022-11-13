import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anpk extends ahbh implements ahcw
{
    public static final anpk a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        ahbh.registerDefaultInstance((Class)anpk.class, (ahbh)(a = new anpk()));
    }
    
    private anpk() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = anpk.f) == null) {
                    synchronized (anpk.class) {
                        if (anpk.f == null) {
                            anpk.f = (ahdd)new ahba((ahbh)anpk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return anpk.a;
            }
            case 4: {
                return new ahaz((ahbh)anpk.a);
            }
            case 3: {
                return new anpk();
            }
            case 2: {
                return newMessageInfo((MessageLite)anpk.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1004\u0001\u0003\u100c\u0002", new Object[] { "b", "c", anpe.a(), "d", "e", anpg.a() });
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
