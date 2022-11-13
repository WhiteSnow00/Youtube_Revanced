import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anxw extends ahbh implements ahcw
{
    public static final anxw a;
    private static volatile ahdd c;
    public aotp b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anxw.class, (ahbh)(a = new anxw()));
    }
    
    private anxw() {
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
                final ahdd c;
                if ((c = anxw.c) == null) {
                    synchronized (anxw.class) {
                        if (anxw.c == null) {
                            anxw.c = (ahdd)new ahba((ahbh)anxw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anxw.a;
            }
            case 4: {
                return new ahaz((ahbh)anxw.a);
            }
            case 3: {
                return new anxw();
            }
            case 2: {
                return newMessageInfo((MessageLite)anxw.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003\u1409\u0000", new Object[] { "d", "b" });
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
