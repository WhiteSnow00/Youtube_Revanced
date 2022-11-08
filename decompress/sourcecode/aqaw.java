import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqaw extends agzi implements ahax
{
    public static final aqaw a;
    private static volatile ahbe d;
    public int b;
    public amds c;
    
    static {
        agzi.registerDefaultInstance(aqaw.class, a = new aqaw());
    }
    
    private aqaw() {
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
                if ((d = aqaw.d) == null) {
                    synchronized (aqaw.class) {
                        if (aqaw.d == null) {
                            aqaw.d = (ahbe)new agzb((agzi)aqaw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqaw.a;
            }
            case 4: {
                return new agza((agzi)aqaw.a);
            }
            case 3: {
                return new aqaw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqaw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0001", new Object[] { "b", "c" });
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
