import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrp extends agzi implements ahax
{
    public static final alrp a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(alrp.class, a = new alrp());
    }
    
    private alrp() {
        agzi.emptyProtobufList();
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
                if ((b = alrp.b) == null) {
                    synchronized (alrp.class) {
                        if (alrp.b == null) {
                            alrp.b = (ahbe)new agzb((agzi)alrp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alrp.a;
            }
            case 4: {
                return new agza((agzi)alrp.a);
            }
            case 3: {
                return new alrp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alrp.a, "\u0001\u0000", null);
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
