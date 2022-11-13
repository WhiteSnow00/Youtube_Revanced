import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akec extends ahbh implements ahcw
{
    public static final akec a;
    private static volatile ahdd i;
    public int b;
    public String c;
    public long d;
    public ahbj e;
    public boolean f;
    public float g;
    public int h;
    
    static {
        ahbh.registerDefaultInstance((Class)akec.class, (ahbh)(a = new akec()));
    }
    
    private akec() {
        this.c = "";
        this.e = emptyBooleanList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = akec.i) == null) {
                    synchronized (akec.class) {
                        if (akec.i == null) {
                            akec.i = (ahdd)new ahba((ahbh)akec.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akec.a;
            }
            case 4: {
                return new ahaz((ahbh)akec.a);
            }
            case 3: {
                return new akec();
            }
            case 2: {
                return newMessageInfo((MessageLite)akec.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u0019\u0004\u1007\u0002\u0005\u1001\u0003\u0006\u100c\u0004", new Object[] { "b", "c", "d", "e", "f", "g", "h", aopx.a() });
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
