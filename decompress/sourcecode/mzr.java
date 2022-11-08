import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mzr extends agzi implements ahax
{
    public static final mzr a;
    private static volatile ahbe c;
    public agph b;
    
    static {
        agzi.registerDefaultInstance(mzr.class, a = new mzr());
    }
    
    private mzr() {
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
                if ((c = mzr.c) == null) {
                    synchronized (mzr.class) {
                        if (mzr.c == null) {
                            mzr.c = (ahbe)new agzb((agzi)mzr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return mzr.a;
            }
            case 4: {
                return new agza((agzi)mzr.a);
            }
            case 3: {
                return new mzr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)mzr.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[] { "b" });
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
