import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apji extends agzi implements ahax
{
    public static final apji a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(apji.class, a = new apji());
    }
    
    private apji() {
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
                if ((d = apji.d) == null) {
                    synchronized (apji.class) {
                        if (apji.d == null) {
                            apji.d = (ahbe)new agzb((agzi)apji.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apji.a;
            }
            case 4: {
                return new agza((agzi)apji.a);
            }
            case 3: {
                return new apji();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apji.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", apjc.a() });
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
