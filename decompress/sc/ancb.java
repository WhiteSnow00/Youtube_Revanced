import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ancb extends ahbh implements ahcw
{
    public static final ancb a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private aiqj f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)ancb.class, (ahbh)(a = new ancb()));
    }
    
    private ancb() {
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
                if ((b = ancb.b) == null) {
                    synchronized (ancb.class) {
                        if (ancb.b == null) {
                            ancb.b = (ahdd)new ahba((ahbh)ancb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ancb.a;
            }
            case 4: {
                return new ahaz((ahbh)ancb.a);
            }
            case 3: {
                return new ancb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ancb.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "c", "d", "e", "f", "g" });
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