import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrg extends agzi implements ahax
{
    public static final agrg a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(agrg.class, a = new agrg());
    }
    
    private agrg() {
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
                if ((d = agrg.d) == null) {
                    synchronized (agrg.class) {
                        if (agrg.d == null) {
                            agrg.d = (ahbe)new agzb((agzi)agrg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agrg.a;
            }
            case 4: {
                return new agza((agzi)agrg.a);
            }
            case 3: {
                return new agrg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agrg.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[] { "b", "c" });
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
