import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeub extends agzi implements ahax
{
    public static final aeub a;
    private static volatile ahbe d;
    public String b;
    public float c;
    
    static {
        agzi.registerDefaultInstance(aeub.class, a = new aeub());
    }
    
    private aeub() {
        this.b = "";
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
                if ((d = aeub.d) == null) {
                    synchronized (aeub.class) {
                        if (aeub.d == null) {
                            aeub.d = (ahbe)new agzb((agzi)aeub.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aeub.a;
            }
            case 4: {
                return new agza((agzi)aeub.a);
            }
            case 3: {
                return new aeub();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aeub.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0001", new Object[] { "b", "c" });
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
