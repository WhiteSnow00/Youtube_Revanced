import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aplo extends agzi implements ahax
{
    public static final aplo a;
    private static volatile ahbe e;
    public int b;
    public long c;
    public long d;
    
    static {
        agzi.registerDefaultInstance(aplo.class, a = new aplo());
    }
    
    private aplo() {
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
                if ((e = aplo.e) == null) {
                    synchronized (aplo.class) {
                        if (aplo.e == null) {
                            aplo.e = (ahbe)new agzb((agzi)aplo.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aplo.a;
            }
            case 4: {
                return new agza((agzi)aplo.a);
            }
            case 3: {
                return new aplo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aplo.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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
