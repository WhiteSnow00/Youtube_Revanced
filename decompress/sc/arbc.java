import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbc extends ahbh implements ahcw
{
    public static final arbc a;
    private static volatile ahdd i;
    public int b;
    public String c;
    public arbj d;
    public arbb e;
    public String f;
    public aiqj g;
    public float h;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)arbc.class, (ahbh)(a = new arbc()));
    }
    
    private arbc() {
        this.j = 2;
        this.c = "";
        this.f = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = arbc.i) == null) {
                    synchronized (arbc.class) {
                        if (arbc.i == null) {
                            arbc.i = (ahdd)new ahba((ahbh)arbc.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return arbc.a;
            }
            case 4: {
                return new ahaz((ahbh)arbc.a);
            }
            case 3: {
                return new arbc();
            }
            case 2: {
                return newMessageInfo((MessageLite)arbc.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1409\u0002\u0004\u1008\u0003\u0005\u1409\u0004\u0006\u1001\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
