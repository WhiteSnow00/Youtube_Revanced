import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anko extends agzi implements ahax
{
    public static final anko a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    private int f;
    
    static {
        agzi.registerDefaultInstance(anko.class, a = new anko());
    }
    
    private anko() {
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
                if ((e = anko.e) == null) {
                    synchronized (anko.class) {
                        if (anko.e == null) {
                            anko.e = (ahbe)new agzb((agzi)anko.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anko.a;
            }
            case 4: {
                return new agza((agzi)anko.a);
            }
            case 3: {
                return new anko();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anko.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0003\u100c\u0002\u0004\u100c\u0003", new Object[] { "f", "b", angs.i, "c", alku.a(), "d", alku.a() });
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
