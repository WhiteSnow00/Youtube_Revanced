import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atza extends ahbh implements ahcw
{
    public static final atza a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    private atyy f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)atza.class, (ahbh)(a = new atza()));
    }
    
    private atza() {
        this.g = 2;
        this.d = 1;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = atza.e) == null) {
                    synchronized (atza.class) {
                        if (atza.e == null) {
                            atza.e = (ahdd)new ahba((ahbh)atza.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return atza.a;
            }
            case 4: {
                return new ahaz((ahbh)atza.a);
            }
            case 3: {
                return new atza();
            }
            case 2: {
                return newMessageInfo((MessageLite)atza.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u100c\u0000\u0002\u1004\u0001\u0003\u1409\u0002", new Object[] { "b", "c", atyz.a(), "d", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
