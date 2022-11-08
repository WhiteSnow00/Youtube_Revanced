import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agba extends agzi implements ahax
{
    public static final agba a;
    private static volatile ahbe d;
    public int b;
    public agyc c;
    
    static {
        agzi.registerDefaultInstance(agba.class, a = new agba());
    }
    
    private agba() {
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
                if ((d = agba.d) == null) {
                    synchronized (agba.class) {
                        if (agba.d == null) {
                            agba.d = (ahbe)new agzb((agzi)agba.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agba.a;
            }
            case 4: {
                return new agza((agzi)agba.a);
            }
            case 3: {
                return new agba();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agba.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[] { "b", "c" });
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
