import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akvx extends ahbh implements ahcw
{
    public static final akvx a;
    private static volatile ahdd l;
    public int b;
    public int c;
    public Object d;
    public aklg e;
    public ahab f;
    public ahab g;
    public ahab h;
    public boolean i;
    public String j;
    public int k;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)akvx.class, (ahbh)(a = new akvx()));
    }
    
    private akvx() {
        this.c = 0;
        this.m = 2;
        this.f = ahab.b;
        final ahab b = ahab.b;
        this.g = b;
        this.h = b;
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
                final ahdd l;
                if ((l = akvx.l) == null) {
                    synchronized (akvx.class) {
                        if (akvx.l == null) {
                            akvx.l = (ahdd)new ahba((ahbh)akvx.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return akvx.a;
            }
            case 4: {
                return new ahaz((ahbh)akvx.a);
            }
            case 3: {
                return new akvx();
            }
            case 2: {
                return newMessageInfo((MessageLite)akvx.a, "\u0001\t\u0001\u0001\u0001\u0010\t\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u103d\u0000\u0005\u100a\u0003\u0006\u100a\u0001\u0007\u100a\u0002\b\u1007\u0004\t\u1008\u0006\f\u100c\u000b\u0010\u103d\u0000", new Object[] { "d", "c", "b", "e", "h", "f", "g", "i", "j", "k", akwi.b });
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
