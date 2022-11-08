import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpf extends agzi implements ahax
{
    public static final lpf a;
    private static volatile ahbe f;
    public int b;
    public agyc c;
    public agyc d;
    public int e;
    
    static {
        agzi.registerDefaultInstance(lpf.class, a = new lpf());
    }
    
    private lpf() {
        this.c = agyc.b;
        this.d = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = lpf.f) == null) {
                    synchronized (lpf.class) {
                        if (lpf.f == null) {
                            lpf.f = (ahbe)new agzb((agzi)lpf.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return lpf.a;
            }
            case 4: {
                return new agza((agzi)lpf.a);
            }
            case 3: {
                return new lpf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lpf.a, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0000\u0000\u0004\u100a\u0000\u0005\u100a\u0001\u0006\u100c\u0002", new Object[] { "b", "c", "d", "e", aipt.i });
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
