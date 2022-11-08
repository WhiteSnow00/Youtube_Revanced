import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqal extends agzi implements ahax
{
    public static final aqal a;
    private static volatile ahbe d;
    public antz b;
    public ancq c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(aqal.class, a = new aqal());
    }
    
    private aqal() {
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
                if ((d = aqal.d) == null) {
                    synchronized (aqal.class) {
                        if (aqal.d == null) {
                            aqal.d = (ahbe)new agzb((agzi)aqal.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqal.a;
            }
            case 4: {
                return new agza((agzi)aqal.a);
            }
            case 3: {
                return new aqal();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqal.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "e", "b", "c" });
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
