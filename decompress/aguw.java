import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aguw extends ahcz implements aheo
{
    public static final aguw a;
    private static volatile ahev d;
    public ahdp b;
    public ahdp c;
    
    static {
        ahcz.registerDefaultInstance(aguw.class, a = new aguw());
    }
    
    private aguw() {
        this.b = ahcz.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.c = ahcz.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                final ahev d;
                if ((d = aguw.d) == null) {
                    synchronized (aguw.class) {
                        if (aguw.d == null) {
                            aguw.d = (ahev)new ahcs((ahcz)aguw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aguw.a;
            }
            case 4: {
                return new ahcr((ahcz)aguw.a);
            }
            case 3: {
                return new aguw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aguw.a, "\u0000\u0002\u0000\u0000\u0001\u0004\u0002\u0000\u0002\u0000\u0001\u001b\u0004\u001b", new Object[] { "b", agva.class, "c", aguy.class });
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
