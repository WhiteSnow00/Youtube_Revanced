import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agfq extends agzi implements ahax
{
    public static final agfq a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(agfq.class, a = new agfq());
    }
    
    private agfq() {
        this.b = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = agfq.c) == null) {
                    synchronized (agfq.class) {
                        if (agfq.c == null) {
                            agfq.c = (ahbe)new agzb((agzi)agfq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agfq.a;
            }
            case 4: {
                return new agza((agzi)agfq.a);
            }
            case 3: {
                return new agfq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agfq.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "b" });
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
