import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqck extends ahbh implements ahcw
{
    public static final aqck a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public akxi d;
    public int e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aqck.class, (ahbh)(a = new aqck()));
    }
    
    private aqck() {
        this.g = 2;
        this.c = "";
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
                final ahdd f;
                if ((f = aqck.f) == null) {
                    synchronized (aqck.class) {
                        if (aqck.f == null) {
                            aqck.f = (ahdd)new ahba((ahbh)aqck.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqck.a;
            }
            case 4: {
                return new ahaz((ahbh)aqck.a);
            }
            case 3: {
                return new aqck();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqck.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u100c\u0002", new Object[] { "b", "c", "d", "e", aqcl.a });
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
