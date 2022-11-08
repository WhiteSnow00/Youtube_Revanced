import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahwd extends agzi implements ahax
{
    public static final ahwd a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(ahwd.class, a = new ahwd());
    }
    
    private ahwd() {
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
                if ((e = ahwd.e) == null) {
                    synchronized (ahwd.class) {
                        if (ahwd.e == null) {
                            ahwd.e = (ahbe)new agzb((agzi)ahwd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahwd.a;
            }
            case 4: {
                return new agza((agzi)ahwd.a);
            }
            case 3: {
                return new ahwd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahwd.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", aigg.a() });
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
