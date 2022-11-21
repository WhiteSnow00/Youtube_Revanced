import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqy extends ahcz implements aheo
{
    public static final agqy a;
    private static volatile ahev c;
    public ahdp b;
    
    static {
        ahcz.registerDefaultInstance(agqy.class, a = new agqy());
    }
    
    private agqy() {
        this.b = ahcz.emptyProtobufList();
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = agqy.c) == null) {
                    synchronized (agqy.class) {
                        if (agqy.c == null) {
                            agqy.c = (ahev)new ahcs((ahcz)agqy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agqy.a;
            }
            case 4: {
                return new ahcr((ahcz)agqy.a);
            }
            case 3: {
                return new agqy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agqy.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", agqx.class });
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
