import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqr extends agzi implements ahax
{
    public static final alqr a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(alqr.class, a = new alqr());
    }
    
    private alqr() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = alqr.b) == null) {
                    synchronized (alqr.class) {
                        if (alqr.b == null) {
                            alqr.b = (ahbe)new agzb((agzi)alqr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alqr.a;
            }
            case 4: {
                return new agza((agzi)alqr.a);
            }
            case 3: {
                return new alqr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alqr.a, "\u0001\u0000", null);
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
