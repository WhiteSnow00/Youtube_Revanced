import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aleu extends ahbh implements ahcw
{
    public static final aleu a;
    private static volatile ahdd g;
    public int b;
    public akli c;
    public alev d;
    public ahab e;
    public aiqj f;
    private ahhu h;
    private ajvo i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aleu.class, (ahbh)(a = new aleu()));
    }
    
    private aleu() {
        this.j = 2;
        this.e = ahab.b;
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
                final ahdd g;
                if ((g = aleu.g) == null) {
                    synchronized (aleu.class) {
                        if (aleu.g == null) {
                            aleu.g = (ahdd)new ahba((ahbh)aleu.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aleu.a;
            }
            case 4: {
                return new ahaz((ahbh)aleu.a);
            }
            case 3: {
                return new aleu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aleu.a, "\u0001\u0006\u0000\u0001\u0001\u0309\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u100a\u0002\u0005\u1409\u0003\u0006\u1409\u0004\u0309\u1409\u0005", new Object[] { "b", "c", "d", "e", "h", "f", "i" });
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
