import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqq extends agzi implements ahax
{
    public static final agqq a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public long d;
    
    static {
        agzi.registerDefaultInstance(agqq.class, a = new agqq());
    }
    
    private agqq() {
        this.d = 1L;
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
                if ((e = agqq.e) == null) {
                    synchronized (agqq.class) {
                        if (agqq.e == null) {
                            agqq.e = (ahbe)new agzb((agzi)agqq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agqq.a;
            }
            case 4: {
                return new agza((agzi)agqq.a);
            }
            case 3: {
                return new agqq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agqq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1002\u0001", new Object[] { "b", "c", aqtd.a, "d" });
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
