import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahpz extends agzi implements ahax
{
    public static final ahpz a;
    private static volatile ahbe f;
    public int b;
    public long c;
    public ahqa d;
    public ahqa e;
    
    static {
        agzi.registerDefaultInstance(ahpz.class, a = new ahpz());
    }
    
    private ahpz() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ahpz.f) == null) {
                    synchronized (ahpz.class) {
                        if (ahpz.f == null) {
                            ahpz.f = (ahbe)new agzb((agzi)ahpz.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahpz.a;
            }
            case 4: {
                return new agza((agzi)ahpz.a);
            }
            case 3: {
                return new ahpz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahpz.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
