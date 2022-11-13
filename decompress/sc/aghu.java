import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aghu extends ahbh implements ahcw
{
    public static final aghu a;
    private static volatile ahdd j;
    public int b;
    public int c;
    public Object d;
    public int e;
    public Object f;
    public String g;
    public int h;
    public String i;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)aghu.class, (ahbh)(a = new aghu()));
    }
    
    private aghu() {
        this.c = 0;
        this.e = 0;
        this.k = 2;
        this.g = "";
        this.i = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = aghu.j) == null) {
                    synchronized (aghu.class) {
                        if (aghu.j == null) {
                            aghu.j = (ahdd)new ahba((ahbh)aghu.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aghu.a;
            }
            case 4: {
                return new ahaz((ahbh)aghu.a);
            }
            case 3: {
                return new aghu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aghu.a, "\u0001\u0007\u0002\u0001\u0001\u000b\u0007\u0000\u0000\u0001\u0001\u103b\u0000\u0002\u1008\u0003\u0003\u100c\u0005\u0005\u103c\u0001\u0006\u103c\u0000\n\u1008\u0007\u000b\u143c\u0000", new Object[] { "d", "c", "f", "e", "b", "g", "h", afqo.d, aght.class, aghr.class, "i", aghs.class });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
