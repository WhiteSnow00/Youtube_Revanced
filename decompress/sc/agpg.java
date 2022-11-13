import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpg extends ahbh implements ahcw
{
    public static final agpg a;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        ahbh.registerDefaultInstance((Class)agpg.class, (ahbh)(a = new agpg()));
    }
    
    private agpg() {
        this.b = emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = agpg.c) == null) {
                    synchronized (agpg.class) {
                        if (agpg.c == null) {
                            agpg.c = (ahdd)new ahba((ahbh)agpg.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agpg.a;
            }
            case 4: {
                return new ahaz((ahbh)agpg.a);
            }
            case 3: {
                return new agpg();
            }
            case 2: {
                return newMessageInfo((MessageLite)agpg.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", agpf.class });
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
