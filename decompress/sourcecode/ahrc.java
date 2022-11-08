import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahrc extends agzi implements ahax
{
    public static final ahrc a;
    private static volatile ahbe e;
    public int b;
    public ahra c;
    public ahrd d;
    
    static {
        agzi.registerDefaultInstance(ahrc.class, a = new ahrc());
    }
    
    private ahrc() {
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
                if ((e = ahrc.e) == null) {
                    synchronized (ahrc.class) {
                        if (ahrc.e == null) {
                            ahrc.e = (ahbe)new agzb((agzi)ahrc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahrc.a;
            }
            case 4: {
                return new agza((agzi)ahrc.a);
            }
            case 3: {
                return new ahrc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahrc.a, "\u0001\u0002\u0000\u0001\ue7f1\u35e2\ufdc4\u45cd\u0002\u0000\u0000\u0000\ue7f1\u35e2\u1009\u0000\ufdc4\u45cd\u1009\u0001", new Object[] { "b", "c", "d" });
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
