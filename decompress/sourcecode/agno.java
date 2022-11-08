import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agno extends agzi implements ahax
{
    public static final agno a;
    private static volatile ahbe c;
    public String b;
    
    static {
        agzi.registerDefaultInstance(agno.class, a = new agno());
    }
    
    private agno() {
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
                if ((c = agno.c) == null) {
                    synchronized (agno.class) {
                        if (agno.c == null) {
                            agno.c = (ahbe)new agzb((agzi)agno.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agno.a;
            }
            case 4: {
                return new agza((agzi)agno.a);
            }
            case 3: {
                return new agno();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agno.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "b" });
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
