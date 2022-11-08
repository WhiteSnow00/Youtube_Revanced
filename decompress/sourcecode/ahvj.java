import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahvj extends agzi implements ahax
{
    public static final ahvj a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public boolean d;
    
    static {
        agzi.registerDefaultInstance(ahvj.class, a = new ahvj());
    }
    
    private ahvj() {
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
                if ((e = ahvj.e) == null) {
                    synchronized (ahvj.class) {
                        if (ahvj.e == null) {
                            ahvj.e = (ahbe)new agzb((agzi)ahvj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahvj.a;
            }
            case 4: {
                return new agza((agzi)ahvj.a);
            }
            case 3: {
                return new ahvj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahvj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
