import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitd extends agzi implements ahax
{
    public static final aitd a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(aitd.class, a = new aitd());
    }
    
    private aitd() {
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
                if ((c = aitd.c) == null) {
                    synchronized (aitd.class) {
                        if (aitd.c == null) {
                            aitd.c = (ahbe)new agzb((agzi)aitd.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aitd.a;
            }
            case 4: {
                return new agza((agzi)aitd.a);
            }
            case 3: {
                return new aitd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aitd.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aipt.h });
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
