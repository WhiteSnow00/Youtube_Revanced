import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogw extends ahbh implements ahcw
{
    public static final aogw a;
    public static final ahbf b;
    private static volatile ahdd d;
    public aogx c;
    private int e;
    private byte f;
    
    static {
        final aogw a2 = new aogw();
        ahbh.registerDefaultInstance((Class)aogw.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 137739979, ahek.k, (Class)aogw.class);
    }
    
    private aogw() {
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
                if ((d = aogw.d) == null) {
                    synchronized (aogw.class) {
                        if (aogw.d == null) {
                            aogw.d = (ahdd)new ahba((ahbh)aogw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aogw.a;
            }
            case 4: {
                return new ahaz((ahbh)aogw.a);
            }
            case 3: {
                return new aogw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aogw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "e", "c" });
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
