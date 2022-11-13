import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anem extends ahbh implements ahcw
{
    public static final anem a;
    private static volatile ahdd c;
    public aiqj b;
    private int d;
    private ahhu e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)anem.class, (ahbh)(a = new anem()));
    }
    
    private anem() {
        this.f = 2;
        final ahab b = ahab.b;
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
                final ahdd c;
                if ((c = anem.c) == null) {
                    synchronized (anem.class) {
                        if (anem.c == null) {
                            anem.c = (ahdd)new ahba((ahbh)anem.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anem.a;
            }
            case 4: {
                return new ahaz((ahbh)anem.a);
            }
            case 3: {
                return new anem();
            }
            case 2: {
                return newMessageInfo((MessageLite)anem.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "d", "b", "e" });
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
