import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbt extends agzi implements ahax
{
    public static final agbt a;
    private static volatile ahbe d;
    public String b;
    public agbk c;
    
    static {
        agzi.registerDefaultInstance(agbt.class, a = new agbt());
    }
    
    private agbt() {
        this.b = "";
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
                if ((d = agbt.d) == null) {
                    synchronized (agbt.class) {
                        if (agbt.d == null) {
                            agbt.d = (ahbe)new agzb((agzi)agbt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agbt.a;
            }
            case 4: {
                return new agza((agzi)agbt.a);
            }
            case 3: {
                return new agbt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agbt.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\t", new Object[] { "b", "c" });
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
