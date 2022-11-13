import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aihp extends ahbh implements ahcw
{
    public static final aihp a;
    private static volatile ahdd e;
    public int b;
    public aiqj c;
    public ajut d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aihp.class, (ahbh)(a = new aihp()));
    }
    
    private aihp() {
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
                if ((e = aihp.e) == null) {
                    synchronized (aihp.class) {
                        if (aihp.e == null) {
                            aihp.e = (ahdd)new ahba((ahbh)aihp.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aihp.a;
            }
            case 4: {
                return new ahaz((ahbh)aihp.a);
            }
            case 3: {
                return new aihp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aihp.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0002", new Object[] { "b", "c", "d" });
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
