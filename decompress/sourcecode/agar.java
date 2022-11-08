import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agar extends agzi implements ahax
{
    public static final agar a;
    private static volatile ahbe f;
    public int b;
    public agap c;
    public agyc d;
    public agyc e;
    
    static {
        agzi.registerDefaultInstance(agar.class, a = new agar());
    }
    
    private agar() {
        this.d = agyc.b;
        this.e = agyc.b;
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
                if ((f = agar.f) == null) {
                    synchronized (agar.class) {
                        if (agar.f == null) {
                            agar.f = (ahbe)new agzb((agzi)agar.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agar.a;
            }
            case 4: {
                return new agza((agzi)agar.a);
            }
            case 3: {
                return new agar();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agar.a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[] { "b", "c", "d", "e" });
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
