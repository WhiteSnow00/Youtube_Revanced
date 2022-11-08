import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apio extends agzi implements ahax
{
    public static final apio a;
    private static volatile ahbe h;
    public int b;
    public apis c;
    public apiq d;
    public boolean e;
    public int f;
    public int g;
    
    static {
        agzi.registerDefaultInstance(apio.class, a = new apio());
    }
    
    private apio() {
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
                if ((h = apio.h) == null) {
                    synchronized (apio.class) {
                        if (apio.h == null) {
                            apio.h = (ahbe)new agzb((agzi)apio.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return apio.a;
            }
            case 4: {
                return new agza((agzi)apio.a);
            }
            case 3: {
                return new apio();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apio.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1007\u0002\u0006\u100c\u0003\u0007\u100c\u0004", new Object[] { "b", "c", "d", "e", "f", apjd.t, "g", apjd.q });
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
