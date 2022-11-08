import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajws extends agzi implements ahax
{
    public static final ajws a;
    private static volatile ahbe c;
    public agyc b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ajws.class, a = new ajws());
    }
    
    private ajws() {
        this.b = agyc.b;
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
                if ((c = ajws.c) == null) {
                    synchronized (ajws.class) {
                        if (ajws.c == null) {
                            ajws.c = (ahbe)new agzb((agzi)ajws.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajws.a;
            }
            case 4: {
                return new agza((agzi)ajws.a);
            }
            case 3: {
                return new ajws();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajws.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "d", "b" });
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
