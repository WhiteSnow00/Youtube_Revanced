import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajve extends agzi implements ahax
{
    private static final ajve a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ajve.class, a = new ajve());
    }
    
    private ajve() {
    }
    
    public static /* synthetic */ ajve a() {
        return ajve.a;
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
                if ((b = ajve.b) == null) {
                    synchronized (ajve.class) {
                        if (ajve.b == null) {
                            ajve.b = (ahbe)new agzb((agzi)ajve.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajve.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new ajve();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajve.a, "\u0001\u0000", null);
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
