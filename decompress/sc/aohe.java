import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohe extends ahbh implements ahcw
{
    public static final aohe a;
    private static volatile ahdd b;
    private int c;
    private aiqj d;
    private ajut e;
    private ajut f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aohe.class, (ahbh)(a = new aohe()));
    }
    
    private aohe() {
        this.h = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aohe.b) == null) {
                    synchronized (aohe.class) {
                        if (aohe.b == null) {
                            aohe.b = (ahdd)new ahba((ahbh)aohe.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aohe.a;
            }
            case 4: {
                return new ahaz((ahbh)aohe.a);
            }
            case 3: {
                return new aohe();
            }
            case 2: {
                return newMessageInfo((MessageLite)aohe.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0004\u0001\u1409\u0004\u0003\u1409\u0000\u0004\u1409\u0001\u0006\u1409\u0003", new Object[] { "c", "g", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
