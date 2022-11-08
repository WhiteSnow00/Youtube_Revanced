import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqr extends agzi implements ahax
{
    public static final agqr a;
    private static volatile ahbe d;
    public int b;
    public agqs c;
    
    static {
        agzi.registerDefaultInstance(agqr.class, a = new agqr());
    }
    
    private agqr() {
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
                if ((d = agqr.d) == null) {
                    synchronized (agqr.class) {
                        if (agqr.d == null) {
                            agqr.d = (ahbe)new agzb((agzi)agqr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agqr.a;
            }
            case 4: {
                return new agza((agzi)agqr.a);
            }
            case 3: {
                return new agqr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agqr.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1009\u0001", new Object[] { "b", "c" });
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
