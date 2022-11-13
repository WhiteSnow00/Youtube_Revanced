import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoha extends ahbh implements ahcw
{
    public static final aoha a;
    private static volatile ahdd d;
    public int b;
    public anuv c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aoha.class, (ahbh)(a = new aoha()));
    }
    
    private aoha() {
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
                if ((d = aoha.d) == null) {
                    synchronized (aoha.class) {
                        if (aoha.d == null) {
                            aoha.d = (ahdd)new ahba((ahbh)aoha.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoha.a;
            }
            case 4: {
                return new ahaz((ahbh)aoha.a);
            }
            case 3: {
                return new aoha();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoha.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
