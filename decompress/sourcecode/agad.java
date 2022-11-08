import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agad extends agzi implements ahax
{
    public static final agad a;
    private static volatile ahbe e;
    public int b;
    public agaf c;
    public agyc d;
    
    static {
        agzi.registerDefaultInstance(agad.class, a = new agad());
    }
    
    private agad() {
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
                final ahbe e;
                if ((e = agad.e) == null) {
                    synchronized (agad.class) {
                        if (agad.e == null) {
                            agad.e = (ahbe)new agzb((agzi)agad.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agad.a;
            }
            case 4: {
                return new agza((agzi)agad.a);
            }
            case 3: {
                return new agad();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agad.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[] { "b", "c", "d" });
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
