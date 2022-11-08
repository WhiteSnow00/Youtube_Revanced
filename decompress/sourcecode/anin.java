import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anin extends agzi implements ahax
{
    public static final anin a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(anin.class, a = new anin());
    }
    
    private anin() {
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
                if ((d = anin.d) == null) {
                    synchronized (anin.class) {
                        if (anin.d == null) {
                            anin.d = (ahbe)new agzb((agzi)anin.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anin.a;
            }
            case 4: {
                return new agza((agzi)anin.a);
            }
            case 3: {
                return new anin();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anin.a, "\u0001\u0001\u0001\u0000\uf761\u40b9\uf761\u40b9\u0001\u0000\u0000\u0000\uf761\u40b9\u103c\u0000", new Object[] { "c", "b", apin.class });
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
