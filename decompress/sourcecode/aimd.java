import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aimd extends agzi implements ahax
{
    public static final aimd a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aimd.class, a = new aimd());
    }
    
    private aimd() {
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
                if ((b = aimd.b) == null) {
                    synchronized (aimd.class) {
                        if (aimd.b == null) {
                            aimd.b = (ahbe)new agzb((agzi)aimd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aimd.a;
            }
            case 4: {
                return new agza((agzi)aimd.a);
            }
            case 3: {
                return new aimd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aimd.a, "\u0001\u0000", null);
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
