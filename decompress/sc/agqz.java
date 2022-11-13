import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqz extends ahbh implements ahcw
{
    public static final agqz a;
    private static volatile ahdd g;
    public int b;
    public String c;
    public long d;
    public int e;
    public ahdy f;
    
    static {
        ahbh.registerDefaultInstance((Class)agqz.class, (ahbh)(a = new agqz()));
    }
    
    private agqz() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = agqz.g) == null) {
                    synchronized (agqz.class) {
                        if (agqz.g == null) {
                            agqz.g = (ahdd)new ahba((ahbh)agqz.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return agqz.a;
            }
            case 4: {
                return new ahaz((ahbh)agqz.a);
            }
            case 3: {
                return new agqz();
            }
            case 2: {
                return newMessageInfo((MessageLite)agqz.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u100c\u0002\u0004\u1009\u0003", new Object[] { "b", "c", "d", "e", afqo.g, "f" });
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
