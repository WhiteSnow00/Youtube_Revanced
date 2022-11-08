import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrh extends agzi implements ahax
{
    public static final agrh a;
    private static volatile ahbe c;
    public agxp b;
    
    static {
        agzi.registerDefaultInstance(agrh.class, a = new agrh());
    }
    
    private agrh() {
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
                if ((c = agrh.c) == null) {
                    synchronized (agrh.class) {
                        if (agrh.c == null) {
                            agrh.c = (ahbe)new agzb((agzi)agrh.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agrh.a;
            }
            case 4: {
                return new agza((agzi)agrh.a);
            }
            case 3: {
                return new agrh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agrh.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[] { "b" });
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
