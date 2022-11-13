import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogy extends ahbh implements ahcw
{
    public static final aogy a;
    private static volatile ahdd c;
    public aotp b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aogy.class, (ahbh)(a = new aogy()));
    }
    
    private aogy() {
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
                if ((c = aogy.c) == null) {
                    synchronized (aogy.class) {
                        if (aogy.c == null) {
                            aogy.c = (ahdd)new ahba((ahbh)aogy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aogy.a;
            }
            case 4: {
                return new ahaz((ahbh)aogy.a);
            }
            case 3: {
                return new aogy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aogy.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
