import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahqg extends agzi implements ahax
{
    public static final ahqg a;
    private static volatile ahbe c;
    public boolean b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahqg.class, a = new ahqg());
    }
    
    private ahqg() {
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
                if ((c = ahqg.c) == null) {
                    synchronized (ahqg.class) {
                        if (ahqg.c == null) {
                            ahqg.c = (ahbe)new agzb((agzi)ahqg.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahqg.a;
            }
            case 4: {
                return new agza((agzi)ahqg.a);
            }
            case 3: {
                return new ahqg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahqg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
