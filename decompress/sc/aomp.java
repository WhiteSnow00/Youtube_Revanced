import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomp extends ahbh implements ahcw
{
    public static final aomp a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aomp.class, (ahbh)(a = new aomp()));
    }
    
    private aomp() {
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
                if ((b = aomp.b) == null) {
                    synchronized (aomp.class) {
                        if (aomp.b == null) {
                            aomp.b = (ahdd)new ahba((ahbh)aomp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aomp.a;
            }
            case 4: {
                return new ahaz((ahbh)aomp.a);
            }
            case 3: {
                return new aomp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomp.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0003\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g" });
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