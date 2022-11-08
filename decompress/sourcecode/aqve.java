import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqve extends agzi implements ahax
{
    public static final aqve a;
    private static volatile ahbe e;
    public int b;
    public boolean c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(aqve.class, a = new aqve());
    }
    
    private aqve() {
        this.d = 30;
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
                if ((e = aqve.e) == null) {
                    synchronized (aqve.class) {
                        if (aqve.e == null) {
                            aqve.e = (ahbe)new agzb((agzi)aqve.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqve.a;
            }
            case 4: {
                return new agza((agzi)aqve.a);
            }
            case 3: {
                return new aqve();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqve.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
