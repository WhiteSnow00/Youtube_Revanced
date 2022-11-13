import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvq extends ahbh implements ahcw
{
    public static final ajvq a;
    private static volatile ahdd f;
    public int b;
    public anuv c;
    public long d;
    public ahlp e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)ajvq.class, (ahbh)(a = new ajvq()));
    }
    
    private ajvq() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ajvq.f) == null) {
                    synchronized (ajvq.class) {
                        if (ajvq.f == null) {
                            ajvq.f = (ahdd)new ahba((ahbh)ajvq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajvq.a;
            }
            case 4: {
                return new ahaz((ahbh)ajvq.a);
            }
            case 3: {
                return new ajvq();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajvq.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u1009\u0002\u0004\u1002\u0001", new Object[] { "b", "c", "e", "d" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
