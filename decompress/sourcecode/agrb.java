import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrb extends agzi implements ahax
{
    public static final agrb a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        agzi.registerDefaultInstance(agrb.class, a = new agrb());
    }
    
    private agrb() {
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
                if ((f = agrb.f) == null) {
                    synchronized (agrb.class) {
                        if (agrb.f == null) {
                            agrb.f = (ahbe)new agzb((agzi)agrb.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agrb.a;
            }
            case 4: {
                return new agza((agzi)agrb.a);
            }
            case 3: {
                return new agrb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agrb.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u100c\u0002", new Object[] { "b", "c", aqth.a(), "d", aqti.a(), "e", aqtf.a() });
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
