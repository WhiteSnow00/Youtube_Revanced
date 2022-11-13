import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqn extends ahbh implements ahcw
{
    public static final agqn a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public agqz d;
    public String e;
    
    static {
        ahbh.registerDefaultInstance((Class)agqn.class, (ahbh)(a = new agqn()));
    }
    
    private agqn() {
        this.c = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = agqn.f) == null) {
                    synchronized (agqn.class) {
                        if (agqn.f == null) {
                            agqn.f = (ahdd)new ahba((ahbh)agqn.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agqn.a;
            }
            case 4: {
                return new ahaz((ahbh)agqn.a);
            }
            case 3: {
                return new agqn();
            }
            case 2: {
                return newMessageInfo((MessageLite)agqn.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
