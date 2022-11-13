import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aier extends ahbh implements ahcw
{
    public static final aier a;
    private static volatile ahdd b;
    private int c;
    private anuv d;
    private anuv e;
    private anuv f;
    private anuv g;
    private aiqj h;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aier.class, (ahbh)(a = new aier()));
    }
    
    private aier() {
        this.j = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
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
                final ahdd b;
                if ((b = aier.b) == null) {
                    synchronized (aier.class) {
                        if (aier.b == null) {
                            aier.b = (ahdd)new ahba((ahbh)aier.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aier.a;
            }
            case 4: {
                return new ahaz((ahbh)aier.a);
            }
            case 3: {
                return new aier();
            }
            case 2: {
                return newMessageInfo((MessageLite)aier.a, "\u0001\u0006\u0000\u0001\u0001\u0015\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\n\b\u1409\u0006\n\u1409\u0004\u0015\u1409\u0002", new Object[] { "c", "d", "e", "i", "h", "g", "f" });
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
