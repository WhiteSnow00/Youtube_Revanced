import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqo extends ahbh implements ahcw
{
    public static final agqo a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public ahbx d;
    
    static {
        ahbh.registerDefaultInstance((Class)agqo.class, (ahbh)(a = new agqo()));
    }
    
    private agqo() {
        this.c = "";
        this.d = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = agqo.e) == null) {
                    synchronized (agqo.class) {
                        if (agqo.e == null) {
                            agqo.e = (ahdd)new ahba((ahbh)agqo.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agqo.a;
            }
            case 4: {
                return new ahaz((ahbh)agqo.a);
            }
            case 3: {
                return new agqo();
            }
            case 2: {
                return newMessageInfo((MessageLite)agqo.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b", new Object[] { "b", "c", "d", agqn.class });
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
