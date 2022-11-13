import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomc extends ahbh implements ahcw
{
    public static final aomc a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aomc.class, (ahbh)(a = new aomc()));
    }
    
    private aomc() {
        this.b = 0;
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
                if ((d = aomc.d) == null) {
                    synchronized (aomc.class) {
                        if (aomc.d == null) {
                            aomc.d = (ahdd)new ahba((ahbh)aomc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aomc.a;
            }
            case 4: {
                return new ahaz((ahbh)aomc.a);
            }
            case 3: {
                return new aomc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomc.a, "\u0001\u0002\u0001\u0000\ue1ae\u38da\ufeb7\u40e2\u0002\u0000\u0000\u0002\ue1ae\u38da\u143c\u0000\ufeb7\u40e2\u143c\u0000", new Object[] { "c", "b", aona.class, aomw.class });
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
