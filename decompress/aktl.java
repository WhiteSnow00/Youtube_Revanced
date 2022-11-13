import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aktl extends ahbh implements ahcw
{
    public static final aktl a;
    private static volatile ahdd f;
    public int b;
    public aklg c;
    public String d;
    public alvj e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aktl.class, (ahbh)(a = new aktl()));
    }
    
    private aktl() {
        this.g = 2;
        this.d = "";
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
                if ((f = aktl.f) == null) {
                    synchronized (aktl.class) {
                        if (aktl.f == null) {
                            aktl.f = (ahdd)new ahba((ahbh)aktl.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aktl.a;
            }
            case 4: {
                return new ahaz((ahbh)aktl.a);
            }
            case 3: {
                return new aktl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aktl.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
