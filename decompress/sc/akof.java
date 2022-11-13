import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akof extends ahbh implements ahcw
{
    public static final akof a;
    private static volatile ahdd e;
    public int b;
    public boolean c;
    public akog d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)akof.class, (ahbh)(a = new akof()));
    }
    
    private akof() {
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
                final ahdd e;
                if ((e = akof.e) == null) {
                    synchronized (akof.class) {
                        if (akof.e == null) {
                            akof.e = (ahdd)new ahba((ahbh)akof.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akof.a;
            }
            case 4: {
                return new ahaz((ahbh)akof.a);
            }
            case 3: {
                return new akof();
            }
            case 2: {
                return newMessageInfo((MessageLite)akof.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1007\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
