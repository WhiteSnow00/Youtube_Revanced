import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anuq extends ahbh implements ahcw
{
    public static final anuq a;
    private static volatile ahdd e;
    public int b;
    public anup c;
    public anup d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)anuq.class, (ahbh)(a = new anuq()));
    }
    
    private anuq() {
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
                if ((e = anuq.e) == null) {
                    synchronized (anuq.class) {
                        if (anuq.e == null) {
                            anuq.e = (ahdd)new ahba((ahbh)anuq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anuq.a;
            }
            case 4: {
                return new ahaz((ahbh)anuq.a);
            }
            case 3: {
                return new anuq();
            }
            case 2: {
                return newMessageInfo((MessageLite)anuq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
