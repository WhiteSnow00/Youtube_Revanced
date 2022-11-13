import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aihf extends ahbh implements ahcw
{
    public static final aihf a;
    private static volatile ahdd i;
    public int b;
    public String c;
    public String d;
    public String e;
    public aotp f;
    public int g;
    public int h;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aihf.class, (ahbh)(a = new aihf()));
    }
    
    private aihf() {
        this.j = 2;
        this.c = "";
        this.d = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = aihf.i) == null) {
                    synchronized (aihf.class) {
                        if (aihf.i == null) {
                            aihf.i = (ahdd)new ahba((ahbh)aihf.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aihf.a;
            }
            case 4: {
                return new ahaz((ahbh)aihf.a);
            }
            case 3: {
                return new aihf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aihf.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1409\u0003\u0005\u1004\u0004\u0006\u1004\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
