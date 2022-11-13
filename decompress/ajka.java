import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajka extends ahbh implements ahcw
{
    public static final ajka a;
    private static volatile ahdd f;
    public int b;
    public ajkc c;
    public ajkg d;
    public ajkf e;
    private aocy g;
    private aocx h;
    private ajkb i;
    private ajkh j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)ajka.class, (ahbh)(a = new ajka()));
    }
    
    private ajka() {
        this.k = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ajka.f) == null) {
                    synchronized (ajka.class) {
                        if (ajka.f == null) {
                            ajka.f = (ahdd)new ahba((ahbh)ajka.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajka.a;
            }
            case 4: {
                return new ahaz((ahbh)ajka.a);
            }
            case 3: {
                return new ajka();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajka.a, "\u0001\u0007\u0000\u0001\uf85c\u21e7\uf22c\u9f20\u0007\u0000\u0000\u0007\uf85c\u21e7\u1409\u0000\ue9c1\u21e8\u1409\u0002\ueb8b\u2262\u1409\u0001\ufaac\u2515\u1409\u0003\uf79d\u2f1a\u1409\u0004\uecb5\u3a1e\u1409\u0005\uf22c\u9f20\u1409\u0006", new Object[] { "b", "g", "i", "h", "c", "d", "e", "j" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
