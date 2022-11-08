import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahod extends agzi implements ahax
{
    public static final ahod a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public ahoc d;
    public int e;
    public agzq f;
    
    static {
        agzi.registerDefaultInstance(ahod.class, a = new ahod());
    }
    
    private ahod() {
        this.f = agzi.emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = ahod.g) == null) {
                    synchronized (ahod.class) {
                        if (ahod.g == null) {
                            ahod.g = (ahbe)new agzb((agzi)ahod.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahod.a;
            }
            case 4: {
                return new agza((char[])null, (byte[][])null);
            }
            case 3: {
                return new ahod();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahod.a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0001\u0000\u0002\u100c\u0000\u0003\u1009\u0001\u0004\u100c\u0002\u0005\u001e", new Object[] { "b", "c", ahne.a(), "d", "e", ahnd.a(), "f", ahnj.a() });
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
