import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahgf extends agzi implements ahax
{
    public static final agzr a;
    public static final ahgf b;
    private static volatile ahbe d;
    public agzq c;
    
    static {
        a = (agzr)new prz(7);
        agzi.registerDefaultInstance(ahgf.class, b = new ahgf());
    }
    
    private ahgf() {
        this.c = agzi.emptyIntList();
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
                if ((d = ahgf.d) == null) {
                    synchronized (ahgf.class) {
                        if (ahgf.d == null) {
                            ahgf.d = (ahbe)new agzb((agzi)ahgf.b);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahgf.b;
            }
            case 4: {
                return new agza((int[][])null, (short[])null);
            }
            case 3: {
                return new ahgf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahgf.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[] { "c", ahgg.a() });
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
