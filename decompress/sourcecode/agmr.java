import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmr extends agzi implements ahax
{
    public static final agmr a;
    private static volatile ahbe e;
    public int b;
    public agzy c;
    public agmq d;
    
    static {
        agzi.registerDefaultInstance(agmr.class, a = new agmr());
    }
    
    private agmr() {
        this.c = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = agmr.e) == null) {
                    synchronized (agmr.class) {
                        if (agmr.e == null) {
                            agmr.e = (ahbe)new agzb((agzi)agmr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agmr.a;
            }
            case 4: {
                return new agza((agzi)agmr.a);
            }
            case 3: {
                return new agmr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agmr.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000", new Object[] { "b", "c", agmp.class, "d" });
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
