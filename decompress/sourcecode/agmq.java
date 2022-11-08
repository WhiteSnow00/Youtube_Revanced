import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmq extends agzi implements ahax
{
    public static final agmq a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(agmq.class, a = new agmq());
    }
    
    private agmq() {
        this.b = 0;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = agmq.d) == null) {
                    synchronized (agmq.class) {
                        if (agmq.d == null) {
                            agmq.d = (ahbe)new agzb((agzi)agmq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agmq.a;
            }
            case 4: {
                return new agza((agzi)agmq.a);
            }
            case 3: {
                return new agmq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agmq.a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1035\u0000\u0002\u1033\u0000\u0003\u103c\u0000", new Object[] { "c", "b", agmo.class });
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
