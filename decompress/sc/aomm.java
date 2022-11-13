import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomm extends ahbh implements ahcw
{
    public static final aomm a;
    private static volatile ahdd h;
    public int b;
    public anuv c;
    public ajut d;
    public ajut e;
    public ajut f;
    public ahab g;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aomm.class, (ahbh)(a = new aomm()));
    }
    
    private aomm() {
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
                if ((h = aomm.h) == null) {
                    synchronized (aomm.class) {
                        if (aomm.h == null) {
                            aomm.h = (ahdd)new ahba((ahbh)aomm.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aomm.a;
            }
            case 4: {
                return new ahaz((ahbh)aomm.a);
            }
            case 3: {
                return new aomm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomm.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u100a\u0005", new Object[] { "b", "c", "d", "e", "f", "i", "g" });
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
