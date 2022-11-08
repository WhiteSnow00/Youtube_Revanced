import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afnw extends agzi implements ahax
{
    public static final afnw a;
    private static volatile ahbe d;
    public int b;
    public long c;
    
    static {
        agzi.registerDefaultInstance(afnw.class, a = new afnw());
    }
    
    private afnw() {
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
                if ((d = afnw.d) == null) {
                    synchronized (afnw.class) {
                        if (afnw.d == null) {
                            afnw.d = (ahbe)new agzb((agzi)afnw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return afnw.a;
            }
            case 4: {
                return new agza((agzi)afnw.a);
            }
            case 3: {
                return new afnw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afnw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "b", "c" });
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
