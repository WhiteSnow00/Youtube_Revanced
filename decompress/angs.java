import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class angs extends ahbh implements ahcw
{
    public static final angs a;
    private static volatile ahdd d;
    public int b;
    public amrc c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)angs.class, (ahbh)(a = new angs()));
    }
    
    private angs() {
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
                if ((d = angs.d) == null) {
                    synchronized (angs.class) {
                        if (angs.d == null) {
                            angs.d = (ahdd)new ahba((ahbh)angs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return angs.a;
            }
            case 4: {
                return new ahaz((ahbh)angs.a);
            }
            case 3: {
                return new angs();
            }
            case 2: {
                return newMessageInfo((MessageLite)angs.a, "\u0001\u0001\u0000\u0001\ueee9\u18d1\ueee9\u18d1\u0001\u0000\u0000\u0001\ueee9\u18d1\u1409\u0000", new Object[] { "b", "c" });
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
