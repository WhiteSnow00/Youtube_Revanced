import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahqw extends agzi implements ahax
{
    public static final ahqw a;
    private static volatile ahbe d;
    public int b;
    public amon c;
    
    static {
        agzi.registerDefaultInstance(ahqw.class, a = new ahqw());
    }
    
    private ahqw() {
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
                if ((d = ahqw.d) == null) {
                    synchronized (ahqw.class) {
                        if (ahqw.d == null) {
                            ahqw.d = (ahbe)new agzb((agzi)ahqw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahqw.a;
            }
            case 4: {
                return new agza((agzi)ahqw.a);
            }
            case 3: {
                return new ahqw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahqw.a, "\u0001\u0001\u0000\u0001\uf166\u20b4\uf166\u20b4\u0001\u0000\u0000\u0000\uf166\u20b4\u1009\u0000", new Object[] { "b", "c" });
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
