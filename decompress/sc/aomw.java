import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomw extends ahbh implements ahcw
{
    public static final aomw a;
    private static volatile ahdd j;
    public int b;
    public ahbx c;
    public int d;
    public int e;
    public ahbx f;
    public akbq g;
    public int h;
    public ahab i;
    private aiqj k;
    private ahhu l;
    private ajut m;
    private byte n;
    
    static {
        ahbh.registerDefaultInstance((Class)aomw.class, (ahbh)(a = new aomw()));
    }
    
    private aomw() {
        this.n = 2;
        this.c = emptyProtobufList();
        this.f = ahbh.emptyProtobufList();
        this.i = ahab.b;
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
                final ahdd j;
                if ((j = aomw.j) == null) {
                    synchronized (aomw.class) {
                        if (aomw.j == null) {
                            aomw.j = (ahdd)new ahba((ahbh)aomw.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aomw.a;
            }
            case 4: {
                return new ahaz((ahbh)aomw.a);
            }
            case 3: {
                return new aomw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomw.a, "\u0001\n\u0000\u0001\u0001\u000e\n\u0000\u0002\u0005\u0001\u041b\u0002\u1004\u0000\u0004\u1409\u0004\u0005\u1409\u0006\u0006\u100a\u0007\u0007\u1004\u0001\b\u100c\u0005\t\u001a\n\u1409\u0003\u000e\u1409\u000b", new Object[] { "b", "c", aomx.class, "d", "g", "l", "i", "e", "h", ampw.p, "f", "k", "m" });
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
