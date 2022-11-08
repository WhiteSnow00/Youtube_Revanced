import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahsf extends agzi implements ahax
{
    public static final ahsf a;
    private static volatile ahbe c;
    public boolean b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahsf.class, a = new ahsf());
    }
    
    private ahsf() {
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
                if ((c = ahsf.c) == null) {
                    synchronized (ahsf.class) {
                        if (ahsf.c == null) {
                            ahsf.c = (ahbe)new agzb((agzi)ahsf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahsf.a;
            }
            case 4: {
                return new agza((agzi)ahsf.a);
            }
            case 3: {
                return new ahsf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahsf.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1007\u0001", new Object[] { "d", "b" });
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
