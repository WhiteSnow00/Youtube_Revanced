import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqlj extends ahbh implements ahcw
{
    public static final aqlj a;
    private static volatile ahdd g;
    public int b;
    public String c;
    public aqfg d;
    public aqfw e;
    public aqfc f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aqlj.class, (ahbh)(a = new aqlj()));
    }
    
    private aqlj() {
        this.h = 2;
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = aqlj.g) == null) {
                    synchronized (aqlj.class) {
                        if (aqlj.g == null) {
                            aqlj.g = (ahdd)new ahba((ahbh)aqlj.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqlj.a;
            }
            case 4: {
                return new ahaz((ahbh)aqlj.a);
            }
            case 3: {
                return new aqlj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqlj.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
