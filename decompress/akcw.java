import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akcw extends ahcz implements aheo
{
    public static final akcw a;
    private static volatile ahev g;
    public int b;
    public int c;
    public Object d;
    public akfj e;
    public ahkb f;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(akcw.class, a = new akcw());
    }
    
    private akcw() {
        this.c = 0;
        this.i = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = akcw.g) == null) {
                    synchronized (akcw.class) {
                        if (akcw.g == null) {
                            akcw.g = (ahev)new ahcs((ahcz)akcw.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akcw.a;
            }
            case 4: {
                return new ahcr((ahcz)akcw.a);
            }
            case 3: {
                return new akcw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akcw.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u143c\u0000\u0003\u143c\u0000\u0004\u1009\u0003\u0005\u1409\u0004", new Object[] { "d", "c", "b", "e", aisc.class, aisc.class, "f", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
