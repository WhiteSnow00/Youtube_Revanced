import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyy extends agzi implements ahax
{
    public static final apyy a;
    private static volatile ahbe c;
    public long b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(apyy.class, a = new apyy());
    }
    
    private apyy() {
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
                if ((c = apyy.c) == null) {
                    synchronized (apyy.class) {
                        if (apyy.c == null) {
                            apyy.c = (ahbe)new agzb((agzi)apyy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apyy.a;
            }
            case 4: {
                return new agza((agzi)apyy.a);
            }
            case 3: {
                return new apyy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apyy.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "d", "b" });
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