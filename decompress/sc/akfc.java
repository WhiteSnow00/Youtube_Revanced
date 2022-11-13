import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfc extends ahbh implements ahcw
{
    public static final akfc a;
    private static volatile ahdd d;
    public ahab b;
    public ahbx c;
    private int e;
    private akew f;
    private ajut g;
    private ajut h;
    private ajut i;
    private ajut j;
    private ajut k;
    private aiqj l;
    private ahhu m;
    private byte n;
    
    static {
        ahbh.registerDefaultInstance((Class)akfc.class, (ahbh)(a = new akfc()));
    }
    
    private akfc() {
        this.n = 2;
        this.b = ahab.b;
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akfc.d) == null) {
                    synchronized (akfc.class) {
                        if (akfc.d == null) {
                            akfc.d = (ahdd)new ahba((ahbh)akfc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akfc.a;
            }
            case 4: {
                return new ahaz((ahbh)akfc.a);
            }
            case 3: {
                return new akfc();
            }
            case 2: {
                return newMessageInfo((MessageLite)akfc.a, "\u0001\n\u0000\u0001\u0004\u0011\n\u0000\u0001\b\u0004\u1409\u0001\u0005\u1409\u0002\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u0006\t\u1409\u0007\u000b\u1409\b\f\u100a\t\u0010\u001b\u0011\u1409\u0003", new Object[] { "e", "f", "g", "i", "j", "k", "l", "m", "b", "c", alwh.class, "h" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
