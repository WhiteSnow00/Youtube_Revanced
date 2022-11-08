import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahud extends agzi implements ahax
{
    public static final ahud a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public Object d;
    public String e;
    
    static {
        agzi.registerDefaultInstance(ahud.class, a = new ahud());
    }
    
    private ahud() {
        this.c = 0;
        this.e = "";
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
                if ((f = ahud.f) == null) {
                    synchronized (ahud.class) {
                        if (ahud.f == null) {
                            ahud.f = (ahbe)new agzb((agzi)ahud.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahud.a;
            }
            case 4: {
                return new agza((agzi)ahud.a);
            }
            case 3: {
                return new ahud();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahud.a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u103b\u0000\u0003\u103b\u0000\u0004\u103d\u0000", new Object[] { "d", "c", "b", "e" });
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
