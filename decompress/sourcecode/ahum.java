import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahum extends agzi implements ahax
{
    public static final ahum a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public String d;
    public boolean e;
    
    static {
        agzi.registerDefaultInstance(ahum.class, a = new ahum());
    }
    
    private ahum() {
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
                final ahbe f;
                if ((f = ahum.f) == null) {
                    synchronized (ahum.class) {
                        if (ahum.f == null) {
                            ahum.f = (ahbe)new agzb((agzi)ahum.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahum.a;
            }
            case 4: {
                return new agza((agzi)ahum.a);
            }
            case 3: {
                return new ahum();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahum.a, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0000\u0000\u0004\u1008\u0000\u0005\u1008\u0001\u0006\u1007\u0002", new Object[] { "b", "c", "d", "e" });
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
