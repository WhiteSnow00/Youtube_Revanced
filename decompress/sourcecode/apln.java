import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apln extends agzi implements ahax
{
    public static final apln a;
    private static volatile ahbe e;
    public int b;
    public long c;
    public long d;
    
    static {
        agzi.registerDefaultInstance(apln.class, a = new apln());
    }
    
    private apln() {
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
                if ((e = apln.e) == null) {
                    synchronized (apln.class) {
                        if (apln.e == null) {
                            apln.e = (ahbe)new agzb((agzi)apln.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apln.a;
            }
            case 4: {
                return new agza((agzi)apln.a);
            }
            case 3: {
                return new apln();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apln.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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
