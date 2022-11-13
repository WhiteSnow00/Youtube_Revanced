import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifa extends ahbh implements ahcw
{
    public static final aifa a;
    private static volatile ahdd c;
    public anul b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aifa.class, (ahbh)(a = new aifa()));
    }
    
    private aifa() {
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
                if ((c = aifa.c) == null) {
                    synchronized (aifa.class) {
                        if (aifa.c == null) {
                            aifa.c = (ahdd)new ahba((ahbh)aifa.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aifa.a;
            }
            case 4: {
                return new ahaz((ahbh)aifa.a);
            }
            case 3: {
                return new aifa();
            }
            case 2: {
                return newMessageInfo((MessageLite)aifa.a, "\u0001\u0001\u0000\u0001\uf697\u1cd7\uf697\u1cd7\u0001\u0000\u0000\u0001\uf697\u1cd7\u1409\u0000", new Object[] { "d", "b" });
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
