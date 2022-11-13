import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajtw extends ahbh implements ahcw
{
    public static final ajtw a;
    private static volatile ahdd g;
    public int b;
    public String c;
    public anuv d;
    public anuv e;
    public anuv f;
    private aiqj h;
    private aiqj i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)ajtw.class, (ahbh)(a = new ajtw()));
    }
    
    private ajtw() {
        this.j = 2;
        this.c = "";
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
                final ahdd g;
                if ((g = ajtw.g) == null) {
                    synchronized (ajtw.class) {
                        if (ajtw.g == null) {
                            ajtw.g = (ahdd)new ahba((ahbh)ajtw.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajtw.a;
            }
            case 4: {
                return new ahaz((ahbh)ajtw.a);
            }
            case 3: {
                return new ajtw();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajtw.a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0005\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\b\u1409\u0005\t\u1409\u0006", new Object[] { "b", "c", "d", "e", "f", "h", "i" });
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
