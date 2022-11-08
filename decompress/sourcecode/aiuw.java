import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiuw extends agzi implements ahax
{
    public static final aiuw a;
    private static volatile ahbe g;
    public int b;
    public boolean c;
    public agyc d;
    public boolean e;
    public boolean f;
    
    static {
        agzi.registerDefaultInstance(aiuw.class, a = new aiuw());
    }
    
    private aiuw() {
        this.d = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = aiuw.g) == null) {
                    synchronized (aiuw.class) {
                        if (aiuw.g == null) {
                            aiuw.g = (ahbe)new agzb((agzi)aiuw.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aiuw.a;
            }
            case 4: {
                return new agza((agzi)aiuw.a);
            }
            case 3: {
                return new aiuw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiuw.a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0000\u0002\u1007\u0000\u0004\u100a\u0002\u0005\u1007\u0003\u0006\u1007\u0004", new Object[] { "b", "c", "d", "e", "f" });
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
