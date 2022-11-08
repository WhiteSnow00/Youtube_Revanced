import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbm extends agzi implements ahax
{
    public static final apbm a;
    private static volatile ahbe c;
    public long b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(apbm.class, a = new apbm());
    }
    
    private apbm() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = apbm.c) == null) {
                    synchronized (apbm.class) {
                        if (apbm.c == null) {
                            apbm.c = (ahbe)new agzb((agzi)apbm.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apbm.a;
            }
            case 4: {
                return new agza((agzi)apbm.a);
            }
            case 3: {
                return new apbm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apbm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "d", "b" });
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
