import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anfv extends ahbh implements ahcw
{
    public static final anfv a;
    private static volatile ahdd e;
    public aiqj b;
    public int c;
    public ahab d;
    private int f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)anfv.class, (ahbh)(a = new anfv()));
    }
    
    private anfv() {
        this.h = 2;
        this.d = ahab.b;
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
                final ahdd e;
                if ((e = anfv.e) == null) {
                    synchronized (anfv.class) {
                        if (anfv.e == null) {
                            anfv.e = (ahdd)new ahba((ahbh)anfv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anfv.a;
            }
            case 4: {
                return new ahaz((ahbh)anfv.a);
            }
            case 3: {
                return new anfv();
            }
            case 2: {
                return newMessageInfo((MessageLite)anfv.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1004\u0001\u0003\u100a\u0002\u0004\u1409\u0003", new Object[] { "f", "b", "c", "d", "g" });
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
