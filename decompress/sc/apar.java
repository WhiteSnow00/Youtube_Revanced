import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apar extends ahbh implements ahcw
{
    public static final apar a;
    private static volatile ahdd b;
    private int c;
    private ahhu d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apar.class, (ahbh)(a = new apar()));
    }
    
    private apar() {
        this.e = 2;
        final ahab b = ahab.b;
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
                final ahdd b;
                if ((b = apar.b) == null) {
                    synchronized (apar.class) {
                        if (apar.b == null) {
                            apar.b = (ahdd)new ahba((ahbh)apar.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apar.a;
            }
            case 4: {
                return new ahaz((ahbh)apar.a);
            }
            case 3: {
                return new apar();
            }
            case 2: {
                return newMessageInfo((MessageLite)apar.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003\u1409\u0002", new Object[] { "c", "d" });
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
