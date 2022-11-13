import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigm extends ahbh implements ahcw
{
    public static final aigm a;
    private static volatile ahdd k;
    public int b;
    public ajut c;
    public String d;
    public boolean e;
    public ajut f;
    public String g;
    public boolean h;
    public ahbx i;
    public ajut j;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)aigm.class, (ahbh)(a = new aigm()));
    }
    
    private aigm() {
        this.l = 2;
        this.d = "";
        this.e = true;
        this.g = "";
        this.h = true;
        this.i = emptyProtobufList();
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
                final ahdd k;
                if ((k = aigm.k) == null) {
                    synchronized (aigm.class) {
                        if (aigm.k == null) {
                            aigm.k = (ahdd)new ahba((ahbh)aigm.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aigm.a;
            }
            case 4: {
                return new ahaz((ahbh)aigm.a);
            }
            case 3: {
                return new aigm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aigm.a, "\u0001\b\u0000\u0001\u0002\u000b\b\u0000\u0001\u0004\u0002\u1409\u0001\u0003\u1008\u0002\u0004\u1007\u0003\u0006\u1409\u0005\u0007\u1008\u0006\b\u1007\u0007\n\u041b\u000b\u1409\t", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", ajut.class, "j" });
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
