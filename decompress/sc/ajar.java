import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajar extends ahbh implements ahcw
{
    public static final ajar a;
    public static final ahbf b;
    private static volatile ahdd d;
    public anuv c;
    private int e;
    private byte f;
    
    static {
        final ajar a2 = new ajar();
        ahbh.registerDefaultInstance((Class)ajar.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 166773264, ahek.k, (Class)ajar.class);
    }
    
    private ajar() {
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
                final ahdd d;
                if ((d = ajar.d) == null) {
                    synchronized (ajar.class) {
                        if (ajar.d == null) {
                            ajar.d = (ahdd)new ahba((ahbh)ajar.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajar.a;
            }
            case 4: {
                return new ahaz((ahbh)ajar.a);
            }
            case 3: {
                return new ajar();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajar.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "e", "c" });
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
