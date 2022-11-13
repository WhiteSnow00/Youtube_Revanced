import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akvc extends ahbh implements ahcw
{
    public static final akvc a;
    private static volatile ahdd j;
    public int b;
    public akli c;
    public ahbx d;
    public aida e;
    public akuw f;
    public String g;
    public long h;
    public ahab i;
    private ahhu k;
    private ajvo l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)akvc.class, (ahbh)(a = new akvc()));
    }
    
    private akvc() {
        this.m = 2;
        this.d = emptyProtobufList();
        this.g = "";
        this.i = ahab.b;
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
                if ((j = akvc.j) == null) {
                    synchronized (akvc.class) {
                        if (akvc.j == null) {
                            akvc.j = (ahdd)new ahba((ahbh)akvc.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return akvc.a;
            }
            case 4: {
                return new ahaz((ahbh)akvc.a);
            }
            case 3: {
                return new akvc();
            }
            case 2: {
                return newMessageInfo((MessageLite)akvc.a, "\u0001\t\u0000\u0001\u0001\u0309\t\u0000\u0001\u0006\u0001\u1409\u0000\u0003\u041b\u0004\u1409\u0001\u0006\u1008\u0004\u0007\u1409\u0002\t\u1002\u0005\n\u1409\u0006\u000b\u100a\u0007\u0309\u1409\b", new Object[] { "b", "c", "d", aiqj.class, "e", "g", "f", "h", "k", "i", "l" });
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
