import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albh extends ahbh implements ahcw
{
    public static final albh a;
    private static volatile ahdd f;
    public int b;
    public aklg c;
    public String d;
    public String e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)albh.class, (ahbh)(a = new albh()));
    }
    
    private albh() {
        this.g = 2;
        this.d = "";
        this.e = "";
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
                if ((f = albh.f) == null) {
                    synchronized (albh.class) {
                        if (albh.f == null) {
                            albh.f = (ahdd)new ahba((ahbh)albh.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return albh.a;
            }
            case 4: {
                return new ahaz((ahbh)albh.a);
            }
            case 3: {
                return new albh();
            }
            case 2: {
                return newMessageInfo((MessageLite)albh.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
