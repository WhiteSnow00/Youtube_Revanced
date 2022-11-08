import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agob extends agzi implements ahax
{
    public static final agob a;
    private static volatile ahbe c;
    public String b;
    
    static {
        agzi.registerDefaultInstance(agob.class, a = new agob());
    }
    
    private agob() {
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
                final ahbe c;
                if ((c = agob.c) == null) {
                    synchronized (agob.class) {
                        if (agob.c == null) {
                            agob.c = (ahbe)new agzb((agzi)agob.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agob.a;
            }
            case 4: {
                return new agza((agzi)agob.a);
            }
            case 3: {
                return new agob();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agob.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "b" });
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
