import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpy extends agzi implements ahax
{
    public static final lpy a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public long d;
    public agyc e;
    
    static {
        agzi.registerDefaultInstance(lpy.class, a = new lpy());
    }
    
    private lpy() {
        this.c = "";
        this.e = agyc.b;
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
                if ((f = lpy.f) == null) {
                    synchronized (lpy.class) {
                        if (lpy.f == null) {
                            lpy.f = (ahbe)new agzb((agzi)lpy.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return lpy.a;
            }
            case 4: {
                return new agza((agzi)lpy.a);
            }
            case 3: {
                return new lpy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lpy.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u100a\u0002", new Object[] { "b", "c", "d", "e" });
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
