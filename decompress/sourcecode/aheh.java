import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aheh extends agzi implements ahax
{
    public static final aheh a;
    private static volatile ahbe c;
    public boolean b;
    
    static {
        agzi.registerDefaultInstance(aheh.class, a = new aheh());
    }
    
    private aheh() {
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
                if ((c = aheh.c) == null) {
                    synchronized (aheh.class) {
                        if (aheh.c == null) {
                            aheh.c = (ahbe)new agzb((agzi)aheh.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aheh.a;
            }
            case 4: {
                return new agza((agzi)aheh.a);
            }
            case 3: {
                return new aheh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aheh.a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u0007", new Object[] { "b" });
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
