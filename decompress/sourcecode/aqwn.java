import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqwn extends agzi implements ahax
{
    public static final aqwn a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(aqwn.class, a = new aqwn());
    }
    
    private aqwn() {
        this.b = 0;
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
                if ((d = aqwn.d) == null) {
                    synchronized (aqwn.class) {
                        if (aqwn.d == null) {
                            aqwn.d = (ahbe)new agzb((agzi)aqwn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqwn.a;
            }
            case 4: {
                return new agza((agzi)aqwn.a);
            }
            case 3: {
                return new aqwn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqwn.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000", new Object[] { "c", "b", ahdw.class, ahdw.class });
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
