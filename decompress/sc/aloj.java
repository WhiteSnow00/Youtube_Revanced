import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aloj extends ahbh implements ahcw
{
    public static final aloj a;
    private static volatile ahdd h;
    public int b;
    public ajut c;
    public aiqj d;
    public ajut e;
    public aiqj f;
    public ahab g;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aloj.class, (ahbh)(a = new aloj()));
    }
    
    private aloj() {
        this.j = 2;
        this.g = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = aloj.h) == null) {
                    synchronized (aloj.class) {
                        if (aloj.h == null) {
                            aloj.h = (ahdd)new ahba((ahbh)aloj.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aloj.a;
            }
            case 4: {
                return new ahaz((ahbh)aloj.a);
            }
            case 3: {
                return new aloj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aloj.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u100a\u0005\u0007\u1409\u0001", new Object[] { "b", "c", "e", "f", "i", "g", "d" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
