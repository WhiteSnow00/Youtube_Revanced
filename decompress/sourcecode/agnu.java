import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnu extends agzi implements ahax
{
    public static final agnu a;
    private static volatile ahbe d;
    public String b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(agnu.class, a = new agnu());
    }
    
    private agnu() {
        this.b = "";
        this.c = "";
        final agyc b = agyc.b;
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
                if ((d = agnu.d) == null) {
                    synchronized (agnu.class) {
                        if (agnu.d == null) {
                            agnu.d = (ahbe)new agzb((agzi)agnu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agnu.a;
            }
            case 4: {
                return new agza((agzi)agnu.a);
            }
            case 3: {
                return new agnu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agnu.a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u0208\u0003\u0208", new Object[] { "b", "c" });
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
