import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aheg extends agzi implements ahax
{
    public static final aheg a;
    private static volatile ahbe c;
    public aheh b;
    
    static {
        agzi.registerDefaultInstance(aheg.class, a = new aheg());
    }
    
    private aheg() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aheg.c) == null) {
                    synchronized (aheg.class) {
                        if (aheg.c == null) {
                            aheg.c = (ahbe)new agzb((agzi)aheg.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aheg.a;
            }
            case 4: {
                return new agza((agzi)aheg.a);
            }
            case 3: {
                return new aheg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aheg.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[] { "b" });
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
