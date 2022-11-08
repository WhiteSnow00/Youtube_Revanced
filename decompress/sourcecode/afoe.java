import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afoe extends agzi implements ahax
{
    public static final afoe a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(afoe.class, a = new afoe());
    }
    
    private afoe() {
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
                if ((d = afoe.d) == null) {
                    synchronized (afoe.class) {
                        if (afoe.d == null) {
                            afoe.d = (ahbe)new agzb((agzi)afoe.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return afoe.a;
            }
            case 4: {
                return new agza((agzi)afoe.a);
            }
            case 3: {
                return new afoe();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afoe.a, "\u0001\u0000", null);
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
