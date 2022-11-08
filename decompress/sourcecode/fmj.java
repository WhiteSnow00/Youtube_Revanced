import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fmj extends agzi implements ahax
{
    public static final fmj a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    
    static {
        agzi.registerDefaultInstance((Class)fmj.class, (agzi)(a = new fmj()));
    }
    
    private fmj() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = fmj.d) == null) {
                    synchronized (fmj.class) {
                        if (fmj.d == null) {
                            fmj.d = (ahbe)new agzb((agzi)fmj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return fmj.a;
            }
            case 4: {
                return new agza((agzi)fmj.a);
            }
            case 3: {
                return new fmj();
            }
            case 2: {
                return newMessageInfo((MessageLite)fmj.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
