import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agaz extends agzi implements ahax
{
    public static final agaz a;
    private static volatile ahbe e;
    public int b;
    public agyc c;
    public agba d;
    
    static {
        agzi.registerDefaultInstance(agaz.class, a = new agaz());
    }
    
    private agaz() {
        this.c = agyc.b;
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
                if ((e = agaz.e) == null) {
                    synchronized (agaz.class) {
                        if (agaz.e == null) {
                            agaz.e = (ahbe)new agzb((agzi)agaz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agaz.a;
            }
            case 4: {
                return new agza((agzi)agaz.a);
            }
            case 3: {
                return new agaz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agaz.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[] { "b", "c", "d" });
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
