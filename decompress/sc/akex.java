import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akex extends ahbh implements ahcw
{
    public static final akex a;
    private static volatile ahdd d;
    public ahab b;
    public ahbx c;
    private int e;
    private ajut f;
    private ajut g;
    private ajut h;
    private ajut i;
    private ajut j;
    private aiqj k;
    private ahhu l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)akex.class, (ahbh)(a = new akex()));
    }
    
    private akex() {
        this.m = 2;
        this.b = ahab.b;
        this.c = emptyProtobufList();
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
                final ahdd d;
                if ((d = akex.d) == null) {
                    synchronized (akex.class) {
                        if (akex.d == null) {
                            akex.d = (ahdd)new ahba((ahbh)akex.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akex.a;
            }
            case 4: {
                return new ahaz((ahbh)akex.a);
            }
            case 3: {
                return new akex();
            }
            case 2: {
                return newMessageInfo((MessageLite)akex.a, "\u0001\t\u0000\u0001\u0004\u0010\t\u0000\u0001\u0007\u0004\u1409\u0001\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u0006\n\u1409\u0007\u000b\u100a\b\u000f\u001b\u0010\u1409\u0002", new Object[] { "e", "f", "h", "i", "j", "k", "l", "b", "c", alwh.class, "g" });
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
