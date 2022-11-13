import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aklx extends ahbh implements ahcw
{
    public static final aklx a;
    private static volatile ahdd m;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public aklt f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    
    static {
        ahbh.registerDefaultInstance((Class)aklx.class, (ahbh)(a = new aklx()));
    }
    
    private aklx() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd m;
                if ((m = aklx.m) == null) {
                    synchronized (aklx.class) {
                        if (aklx.m == null) {
                            aklx.m = (ahdd)new ahba((ahbh)aklx.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return aklx.a;
            }
            case 4: {
                return new ahaz((ahbh)aklx.a);
            }
            case 3: {
                return new aklx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aklx.a, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0004\u1007\u0003\u0006\u1009\u0005\u0007\u1007\u0006\b\u1007\u0007\t\u1007\b\n\u1007\t\u000b\u1007\n\r\u1007\f", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
