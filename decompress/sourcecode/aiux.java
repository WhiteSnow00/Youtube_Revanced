import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiux extends agzi implements ahax
{
    public static final aiux a;
    private static volatile ahbe d;
    public boolean b;
    public ampb c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(aiux.class, a = new aiux());
    }
    
    private aiux() {
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
                if ((d = aiux.d) == null) {
                    synchronized (aiux.class) {
                        if (aiux.d == null) {
                            aiux.d = (ahbe)new agzb((agzi)aiux.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aiux.a;
            }
            case 4: {
                return new agza((agzi)aiux.a);
            }
            case 3: {
                return new aiux();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiux.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1009\u0001", new Object[] { "e", "b", "c" });
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
