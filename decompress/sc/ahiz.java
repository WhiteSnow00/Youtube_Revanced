import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahiz extends ahbh implements ahcw
{
    public static final ahiz a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public boolean d;
    public ahja e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)ahiz.class, (ahbh)(a = new ahiz()));
    }
    
    private ahiz() {
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
                if ((f = ahiz.f) == null) {
                    synchronized (ahiz.class) {
                        if (ahiz.f == null) {
                            ahiz.f = (ahdd)new ahba((ahbh)ahiz.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahiz.a;
            }
            case 4: {
                return new ahaz((ahbh)ahiz.a);
            }
            case 3: {
                return new ahiz();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahiz.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1409\u0003", new Object[] { "b", "c", "d", "e" });
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
