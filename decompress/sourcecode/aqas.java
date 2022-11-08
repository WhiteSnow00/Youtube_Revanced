import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqas extends agzi implements ahax
{
    public static final aqas a;
    private static volatile ahbe d;
    public int b;
    public ahca c;
    
    static {
        agzi.registerDefaultInstance(aqas.class, a = new aqas());
    }
    
    private aqas() {
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
                if ((d = aqas.d) == null) {
                    synchronized (aqas.class) {
                        if (aqas.d == null) {
                            aqas.d = (ahbe)new agzb((agzi)aqas.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqas.a;
            }
            case 4: {
                return new agza((agzi)aqas.a);
            }
            case 3: {
                return new aqas();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqas.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
