import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwk extends agzi implements ahax
{
    public static final amwk a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public String d;
    
    static {
        agzi.registerDefaultInstance(amwk.class, a = new amwk());
    }
    
    private amwk() {
        this.c = "";
        this.d = "";
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
                if ((e = amwk.e) == null) {
                    synchronized (amwk.class) {
                        if (amwk.e == null) {
                            amwk.e = (ahbe)new agzb((agzi)amwk.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amwk.a;
            }
            case 4: {
                return new agza((agzi)amwk.a);
            }
            case 3: {
                return new amwk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amwk.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1008\u0000\u0003\u1008\u0001", new Object[] { "b", "c", "d" });
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