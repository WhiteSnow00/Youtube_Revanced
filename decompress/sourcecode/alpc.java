import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpc extends agzi implements ahax
{
    public static final alpc a;
    private static volatile ahbe d;
    public alpt b;
    public alpt c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(alpc.class, a = new alpc());
    }
    
    private alpc() {
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
                if ((d = alpc.d) == null) {
                    synchronized (alpc.class) {
                        if (alpc.d == null) {
                            alpc.d = (ahbe)new agzb((agzi)alpc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alpc.a;
            }
            case 4: {
                return new agza((agzi)alpc.a);
            }
            case 3: {
                return new alpc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alpc.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "e", "b", "c" });
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
