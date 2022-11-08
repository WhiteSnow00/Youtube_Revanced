import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbe extends agzi implements ahax
{
    public static final agbe a;
    private static volatile ahbe c;
    public agbf b;
    
    static {
        agzi.registerDefaultInstance(agbe.class, a = new agbe());
    }
    
    private agbe() {
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
                if ((c = agbe.c) == null) {
                    synchronized (agbe.class) {
                        if (agbe.c == null) {
                            agbe.c = (ahbe)new agzb((agzi)agbe.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agbe.a;
            }
            case 4: {
                return new agza((agzi)agbe.a);
            }
            case 3: {
                return new agbe();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agbe.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[] { "b" });
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
