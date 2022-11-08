import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anll extends agzi implements ahax
{
    public static final anll a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(anll.class, a = new anll());
    }
    
    private anll() {
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
                if ((b = anll.b) == null) {
                    synchronized (anll.class) {
                        if (anll.b == null) {
                            anll.b = (ahbe)new agzb((agzi)anll.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anll.a;
            }
            case 4: {
                return new agza((agzi)anll.a);
            }
            case 3: {
                return new anll();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anll.a, "\u0000\u0000", null);
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
