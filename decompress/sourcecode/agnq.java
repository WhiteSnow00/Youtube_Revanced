import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnq extends agzi implements ahax
{
    public static final agnq a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agnq.class, a = new agnq());
    }
    
    private agnq() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = agnq.b) == null) {
                    synchronized (agnq.class) {
                        if (agnq.b == null) {
                            agnq.b = (ahbe)new agzb((agzi)agnq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agnq.a;
            }
            case 4: {
                return new agza((agzi)agnq.a);
            }
            case 3: {
                return new agnq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agnq.a, "\u0000\u0000", null);
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
