import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqyc extends agzi implements ahax
{
    public static final aqyc a;
    private static volatile ahbe e;
    public int b;
    public aqvj c;
    public boolean d;
    
    static {
        agzi.registerDefaultInstance(aqyc.class, a = new aqyc());
    }
    
    private aqyc() {
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
                if ((e = aqyc.e) == null) {
                    synchronized (aqyc.class) {
                        if (aqyc.e == null) {
                            aqyc.e = (ahbe)new agzb((agzi)aqyc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqyc.a;
            }
            case 4: {
                return new agza((agzi)aqyc.a);
            }
            case 3: {
                return new aqyc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqyc.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
