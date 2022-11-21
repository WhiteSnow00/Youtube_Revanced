import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifx extends ahcz implements aheo
{
    private static final aifx a;
    private static volatile ahev b;
    private int c;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aifx.class, a = new aifx());
    }
    
    private aifx() {
    }
    
    public static aifw a() {
        return (aifw)aifx.a.createBuilder();
    }
    
    static aifx b() {
        return aifx.a;
    }
    
    public static aifx c() {
        return aifx.a;
    }
    
    public static void e(final aifx aifx, final aoug aoug) {
        aifx.f(aoug);
    }
    
    private void f(final aoug aoug) {
        this.d = aoug.g;
        this.c |= 0x1;
    }
    
    public aoug d() {
        aoug aoug;
        if ((aoug = aoug.b(this.d)) == null) {
            aoug = aoug.a;
        }
        return aoug;
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
                if ((b = aifx.b) == null) {
                    synchronized (aifx.class) {
                        if (aifx.b == null) {
                            aifx.b = (ahev)new ahcs((ahcz)aifx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aifx.a;
            }
            case 4: {
                return new aifw();
            }
            case 3: {
                return new aifx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aifx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "c", "d", aoug.a() });
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
