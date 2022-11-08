import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxa extends agzi implements ahax
{
    public static final aoxa a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(aoxa.class, a = new aoxa());
    }
    
    private aoxa() {
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
                if ((c = aoxa.c) == null) {
                    synchronized (aoxa.class) {
                        if (aoxa.c == null) {
                            aoxa.c = (ahbe)new agzb((agzi)aoxa.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aoxa.a;
            }
            case 4: {
                return new agza((agzi)aoxa.a);
            }
            case 3: {
                return new aoxa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoxa.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "d", "b" });
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
