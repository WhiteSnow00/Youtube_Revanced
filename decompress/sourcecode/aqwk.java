import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqwk extends agzi implements ahax
{
    private static final aqwk a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aqwk.class, a = new aqwk());
    }
    
    private aqwk() {
    }
    
    public static /* synthetic */ aqwk a() {
        return aqwk.a;
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
                if ((b = aqwk.b) == null) {
                    synchronized (aqwk.class) {
                        if (aqwk.b == null) {
                            aqwk.b = (ahbe)new agzb((agzi)aqwk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqwk.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aqwk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqwk.a, "\u0001\u0000", null);
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