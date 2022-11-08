import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpv extends agzi implements ahax
{
    public static final afpv a;
    private static volatile ahbe f;
    public int b;
    public afpm c;
    public long d;
    public long e;
    
    static {
        agzi.registerDefaultInstance(afpv.class, a = new afpv());
    }
    
    private afpv() {
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
                if ((f = afpv.f) == null) {
                    synchronized (afpv.class) {
                        if (afpv.f == null) {
                            afpv.f = (ahbe)new agzb((agzi)afpv.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return afpv.a;
            }
            case 4: {
                return new agza((agzi)afpv.a);
            }
            case 3: {
                return new afpv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afpv.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1003\u0001\u0003\u1003\u0002", new Object[] { "b", "c", "d", "e" });
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
