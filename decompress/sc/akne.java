import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akne extends ahbh implements ahcw
{
    public static final akne a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public ahab d;
    public boolean e;
    
    static {
        ahbh.registerDefaultInstance((Class)akne.class, (ahbh)(a = new akne()));
    }
    
    private akne() {
        this.d = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = akne.f) == null) {
                    synchronized (akne.class) {
                        if (akne.f == null) {
                            akne.f = (ahdd)new ahba((ahbh)akne.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akne.a;
            }
            case 4: {
                return new ahaz((ahbh)akne.a);
            }
            case 3: {
                return new akne();
            }
            case 2: {
                return newMessageInfo((MessageLite)akne.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100a\u0001\u0003\u1007\u0002", new Object[] { "b", "c", ajqi.a(), "d", "e" });
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
