import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqwz extends agzi implements ahax
{
    private static final aqwz a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aqwz.class, a = new aqwz());
    }
    
    private aqwz() {
    }
    
    public static /* synthetic */ aqwz a() {
        return aqwz.a;
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
                if ((b = aqwz.b) == null) {
                    synchronized (aqwz.class) {
                        if (aqwz.b == null) {
                            aqwz.b = (ahbe)new agzb((agzi)aqwz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqwz.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aqwz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqwz.a, "\u0001\u0000", null);
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
