import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogn extends ahbh implements ahcw
{
    public static final aogn a;
    public static final ahbf b;
    private static volatile ahdd d;
    public anuv c;
    private int e;
    private ajut f;
    private byte g;
    
    static {
        final aogn a2 = new aogn();
        ahbh.registerDefaultInstance((Class)aogn.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 387380578, ahek.k, (Class)aogn.class);
    }
    
    private aogn() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aogn.d) == null) {
                    synchronized (aogn.class) {
                        if (aogn.d == null) {
                            aogn.d = (ahdd)new ahba((ahbh)aogn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aogn.a;
            }
            case 4: {
                return new ahaz((ahbh)aogn.a);
            }
            case 3: {
                return new aogn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aogn.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "e", "c", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
