import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class obq extends agzi implements ahax
{
    public static final obq a;
    private static volatile ahbe c;
    public obj b;
    
    static {
        agzi.registerDefaultInstance((Class)obq.class, (agzi)(a = new obq()));
    }
    
    private obq() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = obq.c) == null) {
                    synchronized (obq.class) {
                        if (obq.c == null) {
                            obq.c = (ahbe)new agzb((agzi)obq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return obq.a;
            }
            case 4: {
                return new agza((agzi)obq.a);
            }
            case 3: {
                return new obq();
            }
            case 2: {
                return newMessageInfo((MessageLite)obq.a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[] { "b" });
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
