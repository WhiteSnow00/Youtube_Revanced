import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akod extends ahbh implements ahcw
{
    public static final akod a;
    private static volatile ahdd j;
    public int b;
    public int c;
    public Object d;
    public ahab e;
    public ajut f;
    public aotp g;
    public ajut h;
    public ajut i;
    private ahhu k;
    private ajut l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)akod.class, (ahbh)(a = new akod()));
    }
    
    private akod() {
        this.c = 0;
        this.m = 2;
        this.e = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = akod.j) == null) {
                    synchronized (akod.class) {
                        if (akod.j == null) {
                            akod.j = (ahdd)new ahba((ahbh)akod.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return akod.a;
            }
            case 4: {
                return new ahaz((ahbh)akod.a);
            }
            case 3: {
                return new akod();
            }
            case 2: {
                return newMessageInfo((MessageLite)akod.a, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u100a\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u143c\u0000\t\u103b\u0000", new Object[] { "d", "c", "b", "k", "e", "f", "g", "h", "i", "l", aiqj.class });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
