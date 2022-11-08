import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiut extends agzi implements ahax
{
    public static final aiut a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    
    static {
        agzi.registerDefaultInstance(aiut.class, a = new aiut());
    }
    
    private aiut() {
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
                if ((d = aiut.d) == null) {
                    synchronized (aiut.class) {
                        if (aiut.d == null) {
                            aiut.d = (ahbe)new agzb((agzi)aiut.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aiut.a;
            }
            case 4: {
                return new agza((agzi)aiut.a);
            }
            case 3: {
                return new aiut();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiut.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
