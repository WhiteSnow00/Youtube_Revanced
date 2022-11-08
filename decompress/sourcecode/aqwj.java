import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqwj extends agzi implements ahax
{
    private static final aqwj a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aqwj.class, a = new aqwj());
    }
    
    private aqwj() {
    }
    
    public static /* synthetic */ aqwj a() {
        return aqwj.a;
    }
    
    public static aqwj b() {
        return aqwj.a;
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
                if ((b = aqwj.b) == null) {
                    synchronized (aqwj.class) {
                        if (aqwj.b == null) {
                            aqwj.b = (ahbe)new agzb((agzi)aqwj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqwj.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aqwj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqwj.a, "\u0001\u0000", null);
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
