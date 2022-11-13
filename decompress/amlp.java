import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlp extends ahbh implements ahcw
{
    public static final amlp a;
    private static volatile ahdd k;
    public int b;
    public int c;
    public Object d;
    public int e;
    public Object f;
    public ahab g;
    public amlo h;
    public boolean i;
    public String j;
    private ahhu l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)amlp.class, (ahbh)(a = new amlp()));
    }
    
    private amlp() {
        this.c = 0;
        this.e = 0;
        this.m = 2;
        this.g = ahab.b;
        this.j = "";
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
                final ahdd k;
                if ((k = amlp.k) == null) {
                    synchronized (amlp.class) {
                        if (amlp.k == null) {
                            amlp.k = (ahdd)new ahba((ahbh)amlp.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return amlp.a;
            }
            case 4: {
                return new ahaz((ahbh)amlp.a);
            }
            case 3: {
                return new amlp();
            }
            case 2: {
                return newMessageInfo((MessageLite)amlp.a, "\u0001\t\u0002\u0001\u0001\r\t\u0000\u0000\u0006\u0001\u143c\u0000\u0002\u143c\u0000\u0003\u143c\u0001\u0004\u143c\u0001\u0005\u1409\u0004\u0006\u100a\u0005\u000b\u1409\n\f\u1007\u000b\r\u1008\f", new Object[] { "d", "c", "f", "e", "b", akdi.class, aotp.class, amll.class, aiqj.class, "l", "g", "h", "i", "j" });
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
