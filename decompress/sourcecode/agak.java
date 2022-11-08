import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agak extends agzi implements ahax
{
    public static final agak a;
    private static volatile ahbe d;
    public int b;
    public agyc c;
    
    static {
        agzi.registerDefaultInstance(agak.class, a = new agak());
    }
    
    private agak() {
        this.c = agyc.b;
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
                if ((d = agak.d) == null) {
                    synchronized (agak.class) {
                        if (agak.d == null) {
                            agak.d = (ahbe)new agzb((agzi)agak.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agak.a;
            }
            case 4: {
                return new agza((agzi)agak.a);
            }
            case 3: {
                return new agak();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agak.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[] { "b", "c" });
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
