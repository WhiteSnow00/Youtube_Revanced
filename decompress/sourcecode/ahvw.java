import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahvw extends agzi implements ahax
{
    public static final ahvw a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(ahvw.class, a = new ahvw());
    }
    
    private ahvw() {
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
                if ((e = ahvw.e) == null) {
                    synchronized (ahvw.class) {
                        if (ahvw.e == null) {
                            ahvw.e = (ahbe)new agzb((agzi)ahvw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahvw.a;
            }
            case 4: {
                return new agza((agzi)ahvw.a);
            }
            case 3: {
                return new ahvw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahvw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", ahvx.a() });
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
