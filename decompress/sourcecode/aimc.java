import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aimc extends agzi implements ahax
{
    public static final aimc a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(aimc.class, a = new aimc());
    }
    
    private aimc() {
        this.b = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aimc.c) == null) {
                    synchronized (aimc.class) {
                        if (aimc.c == null) {
                            aimc.c = (ahbe)new agzb((agzi)aimc.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aimc.a;
            }
            case 4: {
                return new agza((agzi)aimc.a);
            }
            case 3: {
                return new aimc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aimc.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", ailx.class });
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
