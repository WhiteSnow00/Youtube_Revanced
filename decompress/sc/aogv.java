import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogv extends ahbh implements ahcw
{
    public static final aogv a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public String d;
    public aiqj e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aogv.class, (ahbh)(a = new aogv()));
    }
    
    private aogv() {
        this.g = 2;
        this.c = "";
        this.d = "";
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
                if ((f = aogv.f) == null) {
                    synchronized (aogv.class) {
                        if (aogv.f == null) {
                            aogv.f = (ahdd)new ahba((ahbh)aogv.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aogv.a;
            }
            case 4: {
                return new ahaz((ahbh)aogv.a);
            }
            case 3: {
                return new aogv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aogv.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "e" });
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
