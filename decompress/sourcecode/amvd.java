import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amvd extends agzi implements ahax
{
    public static final amvd a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public agyc d;
    
    static {
        agzi.registerDefaultInstance(amvd.class, a = new amvd());
    }
    
    private amvd() {
        this.c = "";
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
                final ahbe e;
                if ((e = amvd.e) == null) {
                    synchronized (amvd.class) {
                        if (amvd.e == null) {
                            amvd.e = (ahbe)new agzb((agzi)amvd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amvd.a;
            }
            case 4: {
                return new agza((agzi)amvd.a);
            }
            case 3: {
                return new amvd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amvd.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100a\u0001", new Object[] { "b", "c", "d" });
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
