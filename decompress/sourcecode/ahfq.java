import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahfq extends agzi implements ahax
{
    public static final ahfq a;
    private static volatile ahbe c;
    public ahas b;
    
    static {
        agzi.registerDefaultInstance(ahfq.class, a = new ahfq());
    }
    
    private ahfq() {
        this.b = ahas.a;
        agzi.emptyProtobufList();
        agzi.emptyProtobufList();
        agzi.emptyProtobufList();
        agzi.emptyProtobufList();
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
                if ((c = ahfq.c) == null) {
                    synchronized (ahfq.class) {
                        if (ahfq.c == null) {
                            ahfq.c = (ahbe)new agzb((agzi)ahfq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahfq.a;
            }
            case 4: {
                return new agza((agzi)ahfq.a);
            }
            case 3: {
                return new ahfq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahfq.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "b", ahfp.a });
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
