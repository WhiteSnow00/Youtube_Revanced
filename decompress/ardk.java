import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardk extends ahcz implements aheo
{
    private static final ardk a;
    private static volatile ahev b;
    private int c;
    private String d;
    private float e;
    
    static {
        ahcz.registerDefaultInstance(ardk.class, a = new ardk());
    }
    
    private ardk() {
        this.d = "";
    }
    
    public static ardj a() {
        return (ardj)ardk.a.createBuilder();
    }
    
    static ardk b() {
        return ardk.a;
    }
    
    public static void c(final ardk ardk, final String s) {
        ardk.e(s);
    }
    
    public static void d(final ardk ardk, final float n) {
        ardk.f(n);
    }
    
    private void e(final String d) {
        d.getClass();
        this.c |= 0x1;
        this.d = d;
    }
    
    private void f(final float e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = ardk.b) == null) {
                    synchronized (ardk.class) {
                        if (ardk.b == null) {
                            ardk.b = (ahev)new ahcs((ahcz)ardk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ardk.a;
            }
            case 4: {
                return new ardj();
            }
            case 3: {
                return new ardk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ardk.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1001\u0001", new Object[] { "c", "d", "e" });
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
