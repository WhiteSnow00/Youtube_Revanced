import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqaa extends agzi implements ahax
{
    public static final aqaa a;
    private static volatile ahbe d;
    public apzz b;
    public agyc c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(aqaa.class, a = new aqaa());
    }
    
    private aqaa() {
        this.c = agyc.b;
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
                if ((d = aqaa.d) == null) {
                    synchronized (aqaa.class) {
                        if (aqaa.d == null) {
                            aqaa.d = (ahbe)new agzb((agzi)aqaa.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqaa.a;
            }
            case 4: {
                return new agza((agzi)aqaa.a);
            }
            case 3: {
                return new aqaa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqaa.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100a\u0001", new Object[] { "e", "b", "c" });
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
