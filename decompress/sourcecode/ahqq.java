import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahqq extends agzi implements ahax
{
    public static final ahqq a;
    private static volatile ahbe d;
    public boolean b;
    public int c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(ahqq.class, a = new ahqq());
    }
    
    private ahqq() {
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
                if ((d = ahqq.d) == null) {
                    synchronized (ahqq.class) {
                        if (ahqq.d == null) {
                            ahqq.d = (ahbe)new agzb((agzi)ahqq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahqq.a;
            }
            case 4: {
                return new agza((agzi)ahqq.a);
            }
            case 3: {
                return new ahqq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahqq.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0003\u100c\u0002", new Object[] { "e", "b", "c", ahng.o });
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
