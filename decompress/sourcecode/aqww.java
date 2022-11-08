import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqww extends agzi implements ahax
{
    private static final aqww a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aqww.class, a = new aqww());
    }
    
    private aqww() {
    }
    
    public static /* synthetic */ aqww a() {
        return aqww.a;
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
                if ((b = aqww.b) == null) {
                    synchronized (aqww.class) {
                        if (aqww.b == null) {
                            aqww.b = (ahbe)new agzb((agzi)aqww.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqww.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aqww();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqww.a, "\u0001\u0000", null);
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
