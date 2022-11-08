import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agat extends agzi implements ahax
{
    public static final agat a;
    private static volatile ahbe c;
    public agau b;
    
    static {
        agzi.registerDefaultInstance(agat.class, a = new agat());
    }
    
    private agat() {
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
                if ((c = agat.c) == null) {
                    synchronized (agat.class) {
                        if (agat.c == null) {
                            agat.c = (ahbe)new agzb((agzi)agat.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agat.a;
            }
            case 4: {
                return new agza((agzi)agat.a);
            }
            case 3: {
                return new agat();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agat.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[] { "b" });
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
