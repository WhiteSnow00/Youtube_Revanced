import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ailn extends agzi implements ahax
{
    public static final ailn a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(ailn.class, a = new ailn());
    }
    
    private ailn() {
        this.b = 0;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ailn.d) == null) {
                    synchronized (ailn.class) {
                        if (ailn.d == null) {
                            ailn.d = (ahbe)new agzb((agzi)ailn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ailn.a;
            }
            case 4: {
                return new agza((agzi)ailn.a);
            }
            case 3: {
                return new ailn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ailn.a, "\u0001\u0003\u0001\u0000\u0003\u0005\u0003\u0000\u0000\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000", new Object[] { "c", "b", aima.class, ailf.class, aili.class });
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
