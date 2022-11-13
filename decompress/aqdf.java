import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqdf extends ahbh implements ahcw
{
    public static final aqdf a;
    private static volatile ahdd h;
    public int b;
    public aqdn c;
    public aqat d;
    public aqbf e;
    public boolean f;
    public boolean g;
    
    static {
        ahbh.registerDefaultInstance((Class)aqdf.class, (ahbh)(a = new aqdf()));
    }
    
    private aqdf() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = aqdf.h) == null) {
                    synchronized (aqdf.class) {
                        if (aqdf.h == null) {
                            aqdf.h = (ahdd)new ahba((ahbh)aqdf.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aqdf.a;
            }
            case 4: {
                return new ahaz((ahbh)aqdf.a);
            }
            case 3: {
                return new aqdf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqdf.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1007\u0003\u0004\u1009\u0002\u0005\u1007\u0004", new Object[] { "b", "c", "d", "f", "e", "g" });
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
