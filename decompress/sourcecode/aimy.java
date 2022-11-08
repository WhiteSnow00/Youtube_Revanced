import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aimy extends agzi implements ahax
{
    public static final aimy a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aimy.class, a = new aimy());
    }
    
    private aimy() {
        emptyIntList();
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
                if ((b = aimy.b) == null) {
                    synchronized (aimy.class) {
                        if (aimy.b == null) {
                            aimy.b = (ahbe)new agzb((agzi)aimy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aimy.a;
            }
            case 4: {
                return new agza((agzi)aimy.a);
            }
            case 3: {
                return new aimy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aimy.a, "\u0001\u0000", null);
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
