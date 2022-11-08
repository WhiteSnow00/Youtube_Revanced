import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqao extends agzi implements ahax
{
    public static final aqao a;
    private static volatile ahbe e;
    public int b;
    public ahca c;
    public long d;
    
    static {
        agzi.registerDefaultInstance(aqao.class, a = new aqao());
    }
    
    private aqao() {
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
                if ((e = aqao.e) == null) {
                    synchronized (aqao.class) {
                        if (aqao.e == null) {
                            aqao.e = (ahbe)new agzb((agzi)aqao.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqao.a;
            }
            case 4: {
                return new agza((agzi)aqao.a);
            }
            case 3: {
                return new aqao();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqao.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0001\u0002\u1009\u0000", new Object[] { "b", "d", "c" });
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
