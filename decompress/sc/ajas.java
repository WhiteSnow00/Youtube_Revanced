import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajas extends ahbh implements ahcw
{
    public static final ajas a;
    private static volatile ahdd e;
    public int b;
    public ahbx c;
    public ajut d;
    private ahhu f;
    private ajut g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)ajas.class, (ahbh)(a = new ajas()));
    }
    
    private ajas() {
        this.h = 2;
        this.c = emptyProtobufList();
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
                if ((e = ajas.e) == null) {
                    synchronized (ajas.class) {
                        if (ajas.e == null) {
                            ajas.e = (ahdd)new ahba((ahbh)ajas.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajas.a;
            }
            case 4: {
                return new ahaz((ahbh)ajas.a);
            }
            case 3: {
                return new ajas();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajas.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0004\u0001\u041b\u0002\u1409\u0000\u0004\u1409\u0002\u0006\u1409\u0003", new Object[] { "b", "c", anuv.class, "d", "f", "g" });
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
