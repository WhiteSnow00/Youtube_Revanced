import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogo extends ahbh implements ahcw
{
    public static final aogo a;
    private static volatile ahdd d;
    public int b;
    public amfo c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aogo.class, (ahbh)(a = new aogo()));
    }
    
    private aogo() {
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
                if ((d = aogo.d) == null) {
                    synchronized (aogo.class) {
                        if (aogo.d == null) {
                            aogo.d = (ahdd)new ahba((ahbh)aogo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aogo.a;
            }
            case 4: {
                return new ahaz((ahbh)aogo.a);
            }
            case 3: {
                return new aogo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aogo.a, "\u0001\u0001\u0000\u0001\uefcf\u2e35\uefcf\u2e35\u0001\u0000\u0000\u0001\uefcf\u2e35\u1409\u0000", new Object[] { "b", "c" });
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