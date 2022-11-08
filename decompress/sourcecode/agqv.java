import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqv extends agzi implements ahax
{
    public static final agqv a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(agqv.class, a = new agqv());
    }
    
    private agqv() {
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
                if ((e = agqv.e) == null) {
                    synchronized (agqv.class) {
                        if (agqv.e == null) {
                            agqv.e = (ahbe)new agzb((agzi)agqv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agqv.a;
            }
            case 4: {
                return new agza((agzi)agqv.a);
            }
            case 3: {
                return new agqv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agqv.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "b", "c", aqkf.q, "d", aqkf.p });
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
