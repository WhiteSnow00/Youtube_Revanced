import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albt extends agzi implements ahax
{
    public static final albt a;
    private static volatile ahbe e;
    public int b;
    public boolean c;
    public boolean d;
    
    static {
        agzi.registerDefaultInstance((Class)albt.class, (agzi)(a = new albt()));
    }
    
    private albt() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = albt.e) == null) {
                    synchronized (albt.class) {
                        if (albt.e == null) {
                            albt.e = (ahbe)new agzb((agzi)albt.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return albt.a;
            }
            case 4: {
                return new agza((agzi)albt.a);
            }
            case 3: {
                return new albt();
            }
            case 2: {
                return newMessageInfo((MessageLite)albt.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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