import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class annc extends ahbh implements ahcw
{
    public static final annc a;
    private static volatile ahdd b;
    private int c;
    private anuv d;
    private ajut e;
    private aiqj f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)annc.class, (ahbh)(a = new annc()));
    }
    
    private annc() {
        this.h = 2;
        emptyIntList();
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
                if ((b = annc.b) == null) {
                    synchronized (annc.class) {
                        if (annc.b == null) {
                            annc.b = (ahdd)new ahba((ahbh)annc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return annc.a;
            }
            case 4: {
                return new ahaz((ahbh)annc.a);
            }
            case 3: {
                return new annc();
            }
            case 2: {
                return newMessageInfo((MessageLite)annc.a, "\u0001\u0004\u0000\u0001\u0001\u000b\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0003\u1409\u0003\b\u1409\u0007\u000b\u1409\u0002", new Object[] { "c", "d", "f", "g", "e" });
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
