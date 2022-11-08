import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpt extends agzi implements ahax
{
    public static final alpt a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(alpt.class, a = new alpt());
    }
    
    private alpt() {
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
                if ((d = alpt.d) == null) {
                    synchronized (alpt.class) {
                        if (alpt.d == null) {
                            alpt.d = (ahbe)new agzb((agzi)alpt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alpt.a;
            }
            case 4: {
                return new agza((agzi)alpt.a);
            }
            case 3: {
                return new alpt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alpt.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u100b\u0001", new Object[] { "b", "c" });
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
