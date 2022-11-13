import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrs extends ahbh implements ahcw
{
    public static final alrs a;
    private static volatile ahdd j;
    public int b;
    public ajut c;
    public ajut d;
    public akdi e;
    public boolean f;
    public aiqj g;
    public String h;
    public ahab i;
    private ahhu k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)alrs.class, (ahbh)(a = new alrs()));
    }
    
    private alrs() {
        this.l = 2;
        this.h = "";
        this.i = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = alrs.j) == null) {
                    synchronized (alrs.class) {
                        if (alrs.j == null) {
                            alrs.j = (ahdd)new ahba((ahbh)alrs.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return alrs.a;
            }
            case 4: {
                return new ahaz((ahbh)alrs.a);
            }
            case 3: {
                return new alrs();
            }
            case 2: {
                return newMessageInfo((MessageLite)alrs.a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u1007\u0003\u0006\u1409\u0004\b\u1008\u0005\t\u1409\u0006\n\u100a\u0007", new Object[] { "b", "c", "d", "e", "f", "g", "h", "k", "i" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
