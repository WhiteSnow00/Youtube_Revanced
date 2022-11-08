import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajyp extends agzi implements ahax
{
    public static final ajyp a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(ajyp.class, a = new ajyp());
    }
    
    private ajyp() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ajyp.d) == null) {
                    synchronized (ajyp.class) {
                        if (ajyp.d == null) {
                            ajyp.d = (ahbe)new agzb((agzi)ajyp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajyp.a;
            }
            case 4: {
                return new agza((agzi)ajyp.a);
            }
            case 3: {
                return new ajyp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajyp.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "b", "c" });
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
