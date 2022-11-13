import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akvt extends ahbh implements ahcw
{
    public static final akvt a;
    private static volatile ahdd e;
    public int b;
    public aklg c;
    public int d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)akvt.class, (ahbh)(a = new akvt()));
    }
    
    private akvt() {
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
                if ((e = akvt.e) == null) {
                    synchronized (akvt.class) {
                        if (akvt.e == null) {
                            akvt.e = (ahdd)new ahba((ahbh)akvt.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akvt.a;
            }
            case 4: {
                return new ahaz((ahbh)akvt.a);
            }
            case 3: {
                return new akvt();
            }
            case 2: {
                return newMessageInfo((MessageLite)akvt.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u100c\u0002", new Object[] { "b", "c", "d", akjo.t });
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
