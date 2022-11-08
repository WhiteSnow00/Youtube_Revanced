import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahil extends agzi implements ahax
{
    public static final ahil a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(ahil.class, a = new ahil());
    }
    
    private ahil() {
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
                final ahbe d;
                if ((d = ahil.d) == null) {
                    synchronized (ahil.class) {
                        if (ahil.d == null) {
                            ahil.d = (ahbe)new agzb((agzi)ahil.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahil.a;
            }
            case 4: {
                return new agza((agzi)ahil.a);
            }
            case 3: {
                return new ahil();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahil.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
