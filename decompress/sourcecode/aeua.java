import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeua extends agzi implements ahax
{
    public static final aeua a;
    private static volatile ahbe c;
    public agyc b;
    
    static {
        agzi.registerDefaultInstance(aeua.class, a = new aeua());
    }
    
    private aeua() {
        final agyc b = agyc.b;
        this.b = agyc.b;
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
                if ((c = aeua.c) == null) {
                    synchronized (aeua.class) {
                        if (aeua.c == null) {
                            aeua.c = (ahbe)new agzb((agzi)aeua.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aeua.a;
            }
            case 4: {
                return new agza((agzi)aeua.a);
            }
            case 3: {
                return new aeua();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aeua.a, "\u0000\u0001\u0000\u0000\t\t\u0001\u0000\u0000\u0000\t\n", new Object[] { "b" });
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
