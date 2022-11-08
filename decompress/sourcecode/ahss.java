import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahss extends agzi implements ahax
{
    private static final ahss a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahss.class, a = new ahss());
    }
    
    private ahss() {
    }
    
    public static /* synthetic */ ahss a() {
        return ahss.a;
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
                if ((b = ahss.b) == null) {
                    synchronized (ahss.class) {
                        if (ahss.b == null) {
                            ahss.b = (ahbe)new agzb((agzi)ahss.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahss.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new ahss();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahss.a, "\u0001\u0000", null);
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
