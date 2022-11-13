import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anhu extends ahbc implements ahbd
{
    public static final anhu a;
    private static volatile ahdd i;
    public int b;
    public String c;
    public ajut d;
    public int e;
    public akdi f;
    public aiqj g;
    public aiqj h;
    private ajut j;
    private ankk k;
    private ahhu m;
    private byte n;
    
    static {
        ahbh.registerDefaultInstance((Class)anhu.class, (ahbh)(a = new anhu()));
    }
    
    private anhu() {
        this.n = 2;
        this.c = "";
        emptyProtobufList();
        final ahab b = ahab.b;
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
                final ahdd i;
                if ((i = anhu.i) == null) {
                    synchronized (anhu.class) {
                        if (anhu.i == null) {
                            anhu.i = (ahdd)new ahba((ahbh)anhu.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return anhu.a;
            }
            case 4: {
                return new ahbb((ahbc)anhu.a);
            }
            case 3: {
                return new anhu();
            }
            case 2: {
                return newMessageInfo((MessageLite)anhu.a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0007\u0001\u1008\u0000\u0002\u1409\u0001\u0004\u1409\u0003\u0005\u100c\u0004\u0006\u1409\u0005\u0007\u1409\u0007\b\u1409\b\t\u1409\u0006\n\u1409\t", new Object[] { "b", "c", "d", "j", "e", anci.s, "f", "g", "h", "k", "m" });
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
