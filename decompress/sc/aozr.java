import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aozr extends ahbh implements ahcw
{
    public static final aozr a;
    private static volatile ahdd b;
    private int c;
    private aozq d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aozr.class, (ahbh)(a = new aozr()));
    }
    
    private aozr() {
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
                final ahdd b;
                if ((b = aozr.b) == null) {
                    synchronized (aozr.class) {
                        if (aozr.b == null) {
                            aozr.b = (ahdd)new ahba((ahbh)aozr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aozr.a;
            }
            case 4: {
                return new ahaz((ahbh)aozr.a);
            }
            case 3: {
                return new aozr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aozr.a, "\u0001\u0001\u0000\u0001\uf3fa\u3fe4\uf3fa\u3fe4\u0001\u0000\u0000\u0001\uf3fa\u3fe4\u1409\u0000", new Object[] { "c", "d" });
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
