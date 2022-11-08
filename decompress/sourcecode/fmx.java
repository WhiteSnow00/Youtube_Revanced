import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fmx extends agzi implements ahax
{
    public static final fmx a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance((Class)fmx.class, (agzi)(a = new fmx()));
    }
    
    private fmx() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = fmx.d) == null) {
                    synchronized (fmx.class) {
                        if (fmx.d == null) {
                            fmx.d = (ahbe)new agzb((agzi)fmx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return fmx.a;
            }
            case 4: {
                return new agza((agzi)fmx.a);
            }
            case 3: {
                return new fmx();
            }
            case 2: {
                return newMessageInfo((MessageLite)fmx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
