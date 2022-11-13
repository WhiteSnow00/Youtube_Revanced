import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aprb extends ahbh implements ahcw
{
    public static final aprb a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private aiqj f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aprb.class, (ahbh)(a = new aprb()));
    }
    
    private aprb() {
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
                if ((b = aprb.b) == null) {
                    synchronized (aprb.class) {
                        if (aprb.b == null) {
                            aprb.b = (ahdd)new ahba((ahbh)aprb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aprb.a;
            }
            case 4: {
                return new ahaz((ahbh)aprb.a);
            }
            case 3: {
                return new aprb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprb.a, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0004\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g" });
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
