import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbe extends ahbh implements ahcw
{
    public static final arbe a;
    private static volatile ahdd n;
    public int b;
    public int c;
    public int d;
    public float e;
    public float f;
    public float g;
    public float h;
    public String i;
    public String j;
    public long k;
    public long l;
    public long m;
    
    static {
        ahbh.registerDefaultInstance((Class)arbe.class, (ahbh)(a = new arbe()));
    }
    
    private arbe() {
        this.i = "";
        this.j = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd n;
                if ((n = arbe.n) == null) {
                    synchronized (arbe.class) {
                        if (arbe.n == null) {
                            arbe.n = (ahdd)new ahba((ahbh)arbe.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return arbe.a;
            }
            case 4: {
                return new ahaz((ahbh)arbe.a);
            }
            case 3: {
                return new arbe();
            }
            case 2: {
                return newMessageInfo((MessageLite)arbe.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1001\u0002\u0004\u1001\u0003\u0005\u1001\u0004\u0006\u1001\u0005\u0007\u1008\u0006\b\u1008\u0007\t\u1002\b\n\u1002\t\u000b\u1002\n", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m" });
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
