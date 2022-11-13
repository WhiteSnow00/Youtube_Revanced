import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apab extends ahbh implements ahcw
{
    public static final apab a;
    private static volatile ahdd f;
    public int b;
    public ajut c;
    public ajut d;
    public ajut e;
    private ajut g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)apab.class, (ahbh)(a = new apab()));
    }
    
    private apab() {
        this.h = 2;
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
                if ((f = apab.f) == null) {
                    synchronized (apab.class) {
                        if (apab.f == null) {
                            apab.f = (ahdd)new ahba((ahbh)apab.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apab.a;
            }
            case 4: {
                return new ahaz((ahbh)apab.a);
            }
            case 3: {
                return new apab();
            }
            case 2: {
                return newMessageInfo((MessageLite)apab.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "g" });
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
