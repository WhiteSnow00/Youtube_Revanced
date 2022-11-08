import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtf extends agzi implements ahax
{
    public static final agtf a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public int d;
    public int e;
    public int f;
    
    static {
        agzi.registerDefaultInstance(agtf.class, a = new agtf());
    }
    
    private agtf() {
        this.c = "";
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
                if ((g = agtf.g) == null) {
                    synchronized (agtf.class) {
                        if (agtf.g == null) {
                            agtf.g = (ahbe)new agzb((agzi)agtf.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return agtf.a;
            }
            case 4: {
                return new agza((agzi)agtf.a);
            }
            case 3: {
                return new agtf();
            }
            case 2: {
                final agzo b = agte.b;
                final agzo a2 = agte.a;
                return agzi.newMessageInfo((MessageLite)agtf.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u100c\u0002\u0004\u100c\u0003", new Object[] { "b", "c", "d", b, "e", a2, "f", a2 });
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
