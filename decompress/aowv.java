import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowv extends ahbh implements ahcw
{
    public static final aowv a;
    private static volatile ahdd f;
    public String b;
    public long c;
    public long d;
    public aiqj e;
    private int g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aowv.class, (ahbh)(a = new aowv()));
    }
    
    private aowv() {
        this.h = 2;
        this.b = "";
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
                final ahdd f;
                if ((f = aowv.f) == null) {
                    synchronized (aowv.class) {
                        if (aowv.f == null) {
                            aowv.f = (ahdd)new ahba((ahbh)aowv.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aowv.a;
            }
            case 4: {
                return new ahaz((ahbh)aowv.a);
            }
            case 3: {
                return new aowv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aowv.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1409\u0003", new Object[] { "g", "b", "c", "d", "e" });
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
