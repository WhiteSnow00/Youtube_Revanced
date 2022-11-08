import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiaq extends agzi implements ahax
{
    public static final aiaq a;
    private static volatile ahbe d;
    public int b;
    public int c;
    private int e;
    
    static {
        agzi.registerDefaultInstance((Class)aiaq.class, (agzi)(a = new aiaq()));
    }
    
    private aiaq() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aiaq.d) == null) {
                    synchronized (aiaq.class) {
                        if (aiaq.d == null) {
                            aiaq.d = (ahbe)new agzb((agzi)aiaq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aiaq.a;
            }
            case 4: {
                return new agza((agzi)aiaq.a);
            }
            case 3: {
                return new aiaq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiaq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u100c\u0001", new Object[] { "e", "b", "c", ahzk.n });
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
