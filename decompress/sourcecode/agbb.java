import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbb extends agzi implements ahax
{
    public static final agbb a;
    private static volatile ahbe e;
    public int b;
    public agbd c;
    public agyc d;
    
    static {
        agzi.registerDefaultInstance(agbb.class, a = new agbb());
    }
    
    private agbb() {
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
                if ((e = agbb.e) == null) {
                    synchronized (agbb.class) {
                        if (agbb.e == null) {
                            agbb.e = (ahbe)new agzb((agzi)agbb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agbb.a;
            }
            case 4: {
                return new agza((agzi)agbb.a);
            }
            case 3: {
                return new agbb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agbb.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[] { "b", "c", "d" });
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
