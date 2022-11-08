import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqp extends agzi implements ahax
{
    public static final agqp a;
    private static volatile ahbe h;
    public int b;
    public int c;
    public agqx d;
    public agqw e;
    public agqq f;
    public agqr g;
    
    static {
        agzi.registerDefaultInstance(agqp.class, a = new agqp());
    }
    
    private agqp() {
        this.c = 1;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = agqp.h) == null) {
                    synchronized (agqp.class) {
                        if (agqp.h == null) {
                            agqp.h = (ahbe)new agzb((agzi)agqp.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return agqp.a;
            }
            case 4: {
                return new agza((agzi)agqp.a);
            }
            case 3: {
                return new agqp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agqp.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1009\u0002\u0003\u1009\u0003\u0004\u1009\u0004\u0005\u1009\u0001", new Object[] { "b", "c", afon.l, "e", "f", "g", "d" });
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
