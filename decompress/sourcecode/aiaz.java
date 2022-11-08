import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiaz extends agzi implements ahax
{
    public static final aiaz a;
    public static final agzg b;
    private static volatile ahbe e;
    public int c;
    public int d;
    
    static {
        final aiaz a2 = new aiaz();
        agzi.registerDefaultInstance((Class)aiaz.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)aibb.a, (Object)a2, (MessageLite)a2, (agzn)null, 160206468, ahcm.k, (Class)aiaz.class);
    }
    
    private aiaz() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aiaz.e) == null) {
                    synchronized (aiaz.class) {
                        if (aiaz.e == null) {
                            aiaz.e = (ahbe)new agzb((agzi)aiaz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aiaz.a;
            }
            case 4: {
                return new agza((agzi)aiaz.a);
            }
            case 3: {
                return new aiaz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiaz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "c", "d", ahzk.s });
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
