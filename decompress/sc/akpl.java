import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpl extends ahbh implements ahcw
{
    public static final akpl a;
    private static volatile ahdd j;
    public int b;
    public aklg c;
    public ahbx d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)akpl.class, (ahbh)(a = new akpl()));
    }
    
    private akpl() {
        this.k = 2;
        this.d = ahbh.emptyProtobufList();
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
                if ((j = akpl.j) == null) {
                    synchronized (akpl.class) {
                        if (akpl.j == null) {
                            akpl.j = (ahdd)new ahba((ahbh)akpl.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return akpl.a;
            }
            case 4: {
                return new ahaz((char[])null, (byte[])null);
            }
            case 3: {
                return new akpl();
            }
            case 2: {
                return newMessageInfo((MessageLite)akpl.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u1007\n\u0003\u1007\u000b\u0004\u001a\u0005\u1007\u0002\u0006\u1007\u0003\u0007\u1007\u0004", new Object[] { "b", "c", "h", "i", "d", "e", "f", "g" });
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
