import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlj extends ahbh implements ahcw
{
    public static final ahlj a;
    private static volatile ahdd e;
    public int b;
    public aotp c;
    public ahlk d;
    private ahhu f;
    private ahmr g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)ahlj.class, (ahbh)(a = new ahlj()));
    }
    
    private ahlj() {
        this.h = 2;
        final ahab b = ahab.b;
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
                final ahdd e;
                if ((e = ahlj.e) == null) {
                    synchronized (ahlj.class) {
                        if (ahlj.e == null) {
                            ahlj.e = (ahdd)new ahba((ahbh)ahlj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahlj.a;
            }
            case 4: {
                return new ahaz((ahbh)ahlj.a);
            }
            case 3: {
                return new ahlj();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahlj.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u1409\u0002\u0005\u1409\u0004", new Object[] { "b", "c", "d", "f", "g" });
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
