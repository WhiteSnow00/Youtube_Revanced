import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aokq extends ahbh implements ahcw
{
    public static final aokq a;
    private static volatile ahdd g;
    public int b;
    public ajut c;
    public ajut d;
    public boolean e;
    public ahab f;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aokq.class, (ahbh)(a = new aokq()));
    }
    
    private aokq() {
        this.i = 2;
        this.f = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = aokq.g) == null) {
                    synchronized (aokq.class) {
                        if (aokq.g == null) {
                            aokq.g = (ahdd)new ahba((ahbh)aokq.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aokq.a;
            }
            case 4: {
                return new ahaz((ahbh)aokq.a);
            }
            case 3: {
                return new aokq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aokq.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1007\u0002\u0004\u1409\u0003\u0005\u100a\u0004", new Object[] { "b", "c", "d", "e", "h", "f" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
