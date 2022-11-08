import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwb extends agzi implements ahax
{
    public static final amwb a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    
    static {
        agzi.registerDefaultInstance(amwb.class, a = new amwb());
    }
    
    private amwb() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = amwb.h) == null) {
                    synchronized (amwb.class) {
                        if (amwb.h == null) {
                            amwb.h = (ahbe)new agzb((agzi)amwb.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return amwb.a;
            }
            case 4: {
                return new agza((agzi)amwb.a);
            }
            case 3: {
                return new amwb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amwb.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1007\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
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
