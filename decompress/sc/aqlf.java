import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqlf extends ahbh implements ahcw
{
    public static final aqlf a;
    private static volatile ahdd d;
    public aqlh b;
    public aqfg c;
    private int e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aqlf.class, (ahbh)(a = new aqlf()));
    }
    
    private aqlf() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqlf.d) == null) {
                    synchronized (aqlf.class) {
                        if (aqlf.d == null) {
                            aqlf.d = (ahdd)new ahba((ahbh)aqlf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqlf.a;
            }
            case 4: {
                return new ahaz((ahbh)aqlf.a);
            }
            case 3: {
                return new aqlf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqlf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1009\u0000\u0002\u1409\u0001", new Object[] { "e", "b", "c" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
