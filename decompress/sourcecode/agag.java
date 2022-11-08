import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agag extends agzi implements ahax
{
    public static final agag a;
    private static volatile ahbe d;
    public int b;
    public agyc c;
    
    static {
        agzi.registerDefaultInstance(agag.class, a = new agag());
    }
    
    private agag() {
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
                if ((d = agag.d) == null) {
                    synchronized (agag.class) {
                        if (agag.d == null) {
                            agag.d = (ahbe)new agzb((agzi)agag.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agag.a;
            }
            case 4: {
                return new agza((agzi)agag.a);
            }
            case 3: {
                return new agag();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agag.a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[] { "b", "c" });
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
