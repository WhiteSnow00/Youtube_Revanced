import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aisz extends agzi implements ahax
{
    public static final aisz a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(aisz.class, a = new aisz());
    }
    
    private aisz() {
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
                if ((d = aisz.d) == null) {
                    synchronized (aisz.class) {
                        if (aisz.d == null) {
                            aisz.d = (ahbe)new agzb((agzi)aisz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aisz.a;
            }
            case 4: {
                return new agza((agzi)aisz.a);
            }
            case 3: {
                return new aisz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aisz.a, "\u0001\u0002\u0001\u0000\uf760\u40b9\ue883\u9c93\u0002\u0000\u0000\u0000\uf760\u40b9\u103c\u0000\ue883\u9c93\u103c\u0000", new Object[] { "c", "b", anft.class, apen.class });
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
