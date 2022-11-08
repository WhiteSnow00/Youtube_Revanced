import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwv extends agzi implements ahax
{
    public static final amwv a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(amwv.class, a = new amwv());
    }
    
    private amwv() {
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
                final ahbe e;
                if ((e = amwv.e) == null) {
                    synchronized (amwv.class) {
                        if (amwv.e == null) {
                            amwv.e = (ahbe)new agzb((agzi)amwv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amwv.a;
            }
            case 4: {
                return new agza((agzi)amwv.a);
            }
            case 3: {
                return new amwv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amwv.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", amww.a() });
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
