import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afos extends agzi implements ahax
{
    public static final afos a;
    private static volatile ahbe e;
    public int b;
    public float c;
    public float d;
    
    static {
        agzi.registerDefaultInstance(afos.class, a = new afos());
    }
    
    private afos() {
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
                if ((e = afos.e) == null) {
                    synchronized (afos.class) {
                        if (afos.e == null) {
                            afos.e = (ahbe)new agzb((agzi)afos.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return afos.a;
            }
            case 4: {
                return new agza((agzi)afos.a);
            }
            case 3: {
                return new afos();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afos.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001", new Object[] { "b", "c", "d" });
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