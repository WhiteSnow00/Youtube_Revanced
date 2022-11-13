import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqlp extends ahbh implements ahcw
{
    public static final aqlp a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public String d;
    public long e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqlp.class, (ahbh)(a = new aqlp()));
    }
    
    private aqlp() {
        this.c = "";
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqlp.f) == null) {
                    synchronized (aqlp.class) {
                        if (aqlp.f == null) {
                            aqlp.f = (ahdd)new ahba((ahbh)aqlp.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqlp.a;
            }
            case 4: {
                return new ahaz((ahbh)aqlp.a);
            }
            case 3: {
                return new aqlp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqlp.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002", new Object[] { "b", "c", "d", "e" });
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
