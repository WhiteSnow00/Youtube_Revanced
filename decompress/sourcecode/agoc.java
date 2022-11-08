import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agoc extends agzi implements ahax
{
    public static final agoc a;
    private static volatile ahbe d;
    public String b;
    public boolean c;
    
    static {
        agzi.registerDefaultInstance(agoc.class, a = new agoc());
    }
    
    private agoc() {
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
                if ((d = agoc.d) == null) {
                    synchronized (agoc.class) {
                        if (agoc.d == null) {
                            agoc.d = (ahbe)new agzb((agzi)agoc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agoc.a;
            }
            case 4: {
                return new agza((agzi)agoc.a);
            }
            case 3: {
                return new agoc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agoc.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0007", new Object[] { "b", "c" });
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
