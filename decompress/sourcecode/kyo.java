import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kyo extends agzi implements ahax
{
    public static final kyo a;
    private static volatile ahbe e;
    public int b;
    public long c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(kyo.class, a = new kyo());
    }
    
    private kyo() {
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
                if ((e = kyo.e) == null) {
                    synchronized (kyo.class) {
                        if (kyo.e == null) {
                            kyo.e = (ahbe)new agzb((agzi)kyo.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return kyo.a;
            }
            case 4: {
                return new agza((agzi)kyo.a);
            }
            case 3: {
                return new kyo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)kyo.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
