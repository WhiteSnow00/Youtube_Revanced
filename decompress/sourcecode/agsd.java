import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsd extends agzi implements ahax
{
    public static final agsd a;
    private static volatile ahbe i;
    public int b;
    public Object c;
    public long d;
    public String e;
    public boolean f;
    public boolean g;
    public String h;
    
    static {
        agzi.registerDefaultInstance(agsd.class, a = new agsd());
    }
    
    private agsd() {
        this.b = 0;
        this.e = "";
        this.h = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = agsd.i) == null) {
                    synchronized (agsd.class) {
                        if (agsd.i == null) {
                            agsd.i = (ahbe)new agzb((agzi)agsd.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return agsd.a;
            }
            case 4: {
                return new agza((agzi)agsd.a);
            }
            case 3: {
                return new agsd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agsd.a, "\u0000\u0007\u0001\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001\u0002\u0003\u0208\u0004<\u0000\u0005<\u0000\u0006\u0007\u0007\u0007\b\u0208", new Object[] { "c", "b", "d", "e", agsf.class, agsm.class, "f", "g", "h" });
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
