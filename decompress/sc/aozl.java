import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aozl extends ahbh implements ahcw
{
    public static final aozl a;
    private static volatile ahdd b;
    private int c;
    private aixf d;
    private akbo e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aozl.class, (ahbh)(a = new aozl()));
    }
    
    private aozl() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aozl.b) == null) {
                    synchronized (aozl.class) {
                        if (aozl.b == null) {
                            aozl.b = (ahdd)new ahba((ahbh)aozl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aozl.a;
            }
            case 4: {
                return new ahaz((ahbh)aozl.a);
            }
            case 3: {
                return new aozl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aozl.a, "\u0001\u0002\u0000\u0001\uf321\u1e90\uf3fb\u30fa\u0002\u0000\u0000\u0002\uf321\u1e90\u1409\u0000\uf3fb\u30fa\u1409\u0001", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
