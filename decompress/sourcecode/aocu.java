import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aocu extends agzi implements ahax
{
    public static final aocu a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(aocu.class, a = new aocu());
    }
    
    private aocu() {
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
                if ((e = aocu.e) == null) {
                    synchronized (aocu.class) {
                        if (aocu.e == null) {
                            aocu.e = (ahbe)new agzb((agzi)aocu.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aocu.a;
            }
            case 4: {
                return new agza((agzi)aocu.a);
            }
            case 3: {
                return new aocu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aocu.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "b", "c", aocr.d, "d", aocs.a() });
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
