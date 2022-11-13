import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqzi extends ahbh implements ahcw
{
    private static final aqzi a;
    private static volatile ahdd b;
    private int c;
    private int d;
    private boolean e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqzi.class, (ahbh)(a = new aqzi()));
    }
    
    private aqzi() {
        this.d = 1;
    }
    
    public static aqzi b() {
        return aqzi.a;
    }
    
    public static aqzi c() {
        return aqzi.a;
    }
    
    public aqyn a() {
        aqyn aqyn;
        if ((aqyn = aqyn.b(this.d)) == null) {
            aqyn = aqyn.a;
        }
        return aqyn;
    }
    
    public boolean d() {
        return this.e;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqzi.b) == null) {
                    synchronized (aqzi.class) {
                        if (aqzi.b == null) {
                            aqzi.b = (ahdd)new ahba((ahbh)aqzi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqzi.a;
            }
            case 4: {
                return new ahaz((ahbh)b());
            }
            case 3: {
                return new aqzi();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqzi.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1007\u0001", new Object[] { "c", "d", aqyn.a(), "e" });
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
