import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aobo extends agzi implements ahax
{
    public static final aobo a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    private int f;
    
    static {
        agzi.registerDefaultInstance(aobo.class, a = new aobo());
    }
    
    private aobo() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aobo.e) == null) {
                    synchronized (aobo.class) {
                        if (aobo.e == null) {
                            aobo.e = (ahbe)new agzb((agzi)aobo.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aobo.a;
            }
            case 4: {
                return new agza((agzi)aobo.a);
            }
            case 3: {
                return new aobo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aobo.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100b\u0001\u0003\u100b\u0002", new Object[] { "f", "b", "c", "d" });
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
