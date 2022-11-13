import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoju extends ahbh implements ahcw
{
    public static final aoju a;
    private static volatile ahdd e;
    public int b;
    public aotp c;
    public ajut d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aoju.class, (ahbh)(a = new aoju()));
    }
    
    private aoju() {
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
                if ((e = aoju.e) == null) {
                    synchronized (aoju.class) {
                        if (aoju.e == null) {
                            aoju.e = (ahdd)new ahba((ahbh)aoju.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aoju.a;
            }
            case 4: {
                return new ahaz((ahbh)aoju.a);
            }
            case 3: {
                return new aoju();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoju.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
