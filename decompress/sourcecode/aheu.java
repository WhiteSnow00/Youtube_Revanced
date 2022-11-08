import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aheu extends agzi implements ahax
{
    private static final aheu a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private String e;
    private String f;
    private long g;
    
    static {
        agzi.registerDefaultInstance(aheu.class, a = new aheu());
    }
    
    private aheu() {
        this.e = "";
        this.f = "";
    }
    
    public static ahes a() {
        return (ahes)aheu.a.createBuilder();
    }
    
    private void g(final ahet ahet) {
        this.d = ahet.g;
        this.c |= 0x1;
    }
    
    private void h(final long g) {
        this.c |= 0x8;
        this.g = g;
    }
    
    private void i(final String e) {
        e.getClass();
        this.c |= 0x2;
        this.e = e;
    }
    
    public ahet b() {
        ahet ahet;
        if ((ahet = ahet.b(this.d)) == null) {
            ahet = ahet.a;
        }
        return ahet;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aheu.b) == null) {
                    synchronized (aheu.class) {
                        if (aheu.b == null) {
                            aheu.b = (ahbe)new agzb((agzi)aheu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aheu.a;
            }
            case 4: {
                return new ahes();
            }
            case 3: {
                return new aheu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aheu.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0004\u1002\u0003", new Object[] { "c", "d", ahet.a(), "e", "g" });
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
