import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiml extends agzi implements ahax
{
    public static final aiml a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aiml.class, a = new aiml());
    }
    
    private aiml() {
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
                if ((b = aiml.b) == null) {
                    synchronized (aiml.class) {
                        if (aiml.b == null) {
                            aiml.b = (ahbe)new agzb((agzi)aiml.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aiml.a;
            }
            case 4: {
                return new agza((agzi)aiml.a);
            }
            case 3: {
                return new aiml();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiml.a, "\u0001\u0000", null);
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
