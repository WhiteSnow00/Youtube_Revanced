import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahon extends agzi implements ahax
{
    public static final ahon a;
    private static volatile ahbe h;
    public int b;
    public int c;
    public Object d;
    public int e;
    public int f;
    public boolean g;
    
    static {
        agzi.registerDefaultInstance(ahon.class, a = new ahon());
    }
    
    private ahon() {
        this.c = 0;
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
                if ((h = ahon.h) == null) {
                    synchronized (ahon.class) {
                        if (ahon.h == null) {
                            ahon.h = (ahbe)new agzb((agzi)ahon.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahon.a;
            }
            case 4: {
                return new agza((agzi)ahon.a);
            }
            case 3: {
                return new ahon();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahon.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u1007\u0004", new Object[] { "d", "c", "b", "e", ahnj.a(), "f", ahni.a(), ahoe.class, ahoo.class, "g" });
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
