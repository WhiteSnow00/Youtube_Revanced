import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akey extends ahbh implements ahcw
{
    public static final akey a;
    private static volatile ahdd d;
    public ahbx b;
    public ahab c;
    private int e;
    private ajut f;
    private aiqj g;
    private ajut h;
    private ajut i;
    private ajut j;
    private aiqj k;
    private ahhu l;
    private ajut m;
    private byte n;
    
    static {
        ahbh.registerDefaultInstance((Class)akey.class, (ahbh)(a = new akey()));
    }
    
    private akey() {
        this.n = 2;
        this.b = emptyProtobufList();
        this.c = ahab.b;
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
                if ((d = akey.d) == null) {
                    synchronized (akey.class) {
                        if (akey.d == null) {
                            akey.d = (ahdd)new ahba((ahbh)akey.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akey.a;
            }
            case 4: {
                return new ahaz((ahbh)akey.a);
            }
            case 3: {
                return new akey();
            }
            case 2: {
                return newMessageInfo((MessageLite)akey.a, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0001\b\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\b\u1409\u0007\t\u001b\n\u1409\b\u000b\u100a\t\r\u1409\u000b", new Object[] { "e", "f", "g", "h", "i", "j", "k", "b", alwh.class, "l", "c", "m" });
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
