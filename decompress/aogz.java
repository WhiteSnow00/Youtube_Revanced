import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogz extends ahbh implements ahcw
{
    public static final aogz a;
    private static volatile ahdd d;
    public int b;
    public aogy c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aogz.class, (ahbh)(a = new aogz()));
    }
    
    private aogz() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aogz.d) == null) {
                    synchronized (aogz.class) {
                        if (aogz.d == null) {
                            aogz.d = (ahdd)new ahba((ahbh)aogz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aogz.a;
            }
            case 4: {
                return new ahaz((ahbh)aogz.a);
            }
            case 3: {
                return new aogz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aogz.a, "\u0001\u0001\u0000\u0001\ufe1f\u32f7\ufe1f\u32f7\u0001\u0000\u0000\u0001\ufe1f\u32f7\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
