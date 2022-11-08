import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahqz extends agzi implements ahax
{
    public static final ahqz a;
    private static volatile ahbe c;
    public ahqy b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahqz.class, a = new ahqz());
    }
    
    private ahqz() {
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
                if ((c = ahqz.c) == null) {
                    synchronized (ahqz.class) {
                        if (ahqz.c == null) {
                            ahqz.c = (ahbe)new agzb((agzi)ahqz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahqz.a;
            }
            case 4: {
                return new agza((agzi)ahqz.a);
            }
            case 3: {
                return new ahqz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahqz.a, "\u0001\u0001\u0000\u0001\ufca1\u3938\ufca1\u3938\u0001\u0000\u0000\u0000\ufca1\u3938\u1009\u0000", new Object[] { "d", "b" });
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
