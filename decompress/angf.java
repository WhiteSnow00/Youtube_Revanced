import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class angf extends ahbh implements ahcw
{
    public static final angf a;
    private static volatile ahdd d;
    public int b;
    public int c;
    private int e;
    private ajut f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)angf.class, (ahbh)(a = new angf()));
    }
    
    private angf() {
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
                final ahdd d;
                if ((d = angf.d) == null) {
                    synchronized (angf.class) {
                        if (angf.d == null) {
                            angf.d = (ahdd)new ahba((ahbh)angf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return angf.a;
            }
            case 4: {
                return new ahaz((ahbh)angf.a);
            }
            case 3: {
                return new angf();
            }
            case 2: {
                return newMessageInfo((MessageLite)angf.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1004\u0001\u0003\u1409\u0003\u0005\u1004\u0002", new Object[] { "e", "f", "b", "g", "c" });
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
