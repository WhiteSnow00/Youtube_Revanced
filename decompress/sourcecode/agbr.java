import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbr extends agzi implements ahax
{
    public static final agbr a;
    private static volatile ahbe c;
    public String b;
    
    static {
        agzi.registerDefaultInstance(agbr.class, a = new agbr());
    }
    
    private agbr() {
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
                if ((c = agbr.c) == null) {
                    synchronized (agbr.class) {
                        if (agbr.c == null) {
                            agbr.c = (ahbe)new agzb((agzi)agbr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agbr.a;
            }
            case 4: {
                return new agza((agzi)agbr.a);
            }
            case 3: {
                return new agbr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agbr.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "b" });
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
