import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqwd extends agzi implements ahax
{
    public static final aqwd a;
    private static volatile ahbe e;
    public aqwe b;
    public aqwe c;
    public int d;
    private int f;
    
    static {
        agzi.registerDefaultInstance(aqwd.class, a = new aqwd());
    }
    
    private aqwd() {
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
                if ((e = aqwd.e) == null) {
                    synchronized (aqwd.class) {
                        if (aqwd.e == null) {
                            aqwd.e = (ahbe)new agzb((agzi)aqwd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqwd.a;
            }
            case 4: {
                return new agza((agzi)aqwd.a);
            }
            case 3: {
                return new aqwd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqwd.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u100c\u0002", new Object[] { "f", "b", "c", "d", aqtg.l });
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
