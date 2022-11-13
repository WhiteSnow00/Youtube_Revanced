import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkb extends ahbh implements ahcw
{
    public static final ahkb a;
    private static volatile ahdd e;
    public int b;
    public ahab c;
    public String d;
    
    static {
        ahbh.registerDefaultInstance((Class)ahkb.class, (ahbh)(a = new ahkb()));
    }
    
    private ahkb() {
        this.c = ahab.b;
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ahkb.e) == null) {
                    synchronized (ahkb.class) {
                        if (ahkb.e == null) {
                            ahkb.e = (ahdd)new ahba((ahbh)ahkb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahkb.a;
            }
            case 4: {
                return new ahaz((ahbh)ahkb.a);
            }
            case 3: {
                return new ahkb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkb.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003\u100a\u0002\u0004\u1008\u0003", new Object[] { "b", "c", "d" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
