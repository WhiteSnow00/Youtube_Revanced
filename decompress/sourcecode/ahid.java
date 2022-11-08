import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahid extends agzi implements ahax
{
    public static final ahid a;
    private static volatile ahbe e;
    public int b;
    public agyc c;
    public String d;
    
    static {
        agzi.registerDefaultInstance(ahid.class, a = new ahid());
    }
    
    private ahid() {
        this.c = agyc.b;
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
                if ((e = ahid.e) == null) {
                    synchronized (ahid.class) {
                        if (ahid.e == null) {
                            ahid.e = (ahbe)new agzb((agzi)ahid.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahid.a;
            }
            case 4: {
                return new agza((agzi)ahid.a);
            }
            case 3: {
                return new ahid();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahid.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003\u100a\u0002\u0004\u1008\u0003", new Object[] { "b", "c", "d" });
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
