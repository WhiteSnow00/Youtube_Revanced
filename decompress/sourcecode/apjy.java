import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjy extends agzi implements ahax
{
    public static final agzr a;
    public static final apjy b;
    private static volatile ahbe d;
    public agzq c;
    
    static {
        a = (agzr)new altr(12);
        agzi.registerDefaultInstance(apjy.class, b = new apjy());
    }
    
    private apjy() {
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
                if ((d = apjy.d) == null) {
                    synchronized (apjy.class) {
                        if (apjy.d == null) {
                            apjy.d = (ahbe)new agzb((agzi)apjy.b);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apjy.b;
            }
            case 4: {
                return new agza((agzi)apjy.b);
            }
            case 3: {
                return new apjy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apjy.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[] { "c", apjf.a() });
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
