import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqvu extends agzi implements ahax
{
    public static final agzr a;
    public static final aqvu b;
    private static volatile ahbe f;
    public int c;
    public int d;
    public agzq e;
    
    static {
        a = (agzr)new altr(17);
        agzi.registerDefaultInstance(aqvu.class, b = new aqvu());
    }
    
    private aqvu() {
        this.e = agzi.emptyIntList();
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
                if ((f = aqvu.f) == null) {
                    synchronized (aqvu.class) {
                        if (aqvu.f == null) {
                            aqvu.f = (ahbe)new agzb((agzi)aqvu.b);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqvu.b;
            }
            case 4: {
                return new agza((short[][][])null, (boolean[])null);
            }
            case 3: {
                return new aqvu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqvu.b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u001e", new Object[] { "c", "d", aqvv.a(), "e", aqvv.a() });
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
