import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogt extends ahbh implements ahcw
{
    public static final aogt a;
    private static volatile ahdd m;
    public int b;
    public ajut c;
    public aogz d;
    public ahbx e;
    public aijz f;
    public aiqj g;
    public ajut h;
    public ajut i;
    public aiao j;
    public amgv k;
    public ahab l;
    private ahhu n;
    private byte o;
    
    static {
        ahbh.registerDefaultInstance((Class)aogt.class, (ahbh)(a = new aogt()));
    }
    
    private aogt() {
        this.o = 2;
        this.e = emptyProtobufList();
        this.l = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd m;
                if ((m = aogt.m) == null) {
                    synchronized (aogt.class) {
                        if (aogt.m == null) {
                            aogt.m = (ahdd)new ahba((ahbh)aogt.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return aogt.a;
            }
            case 4: {
                return new ahaz((ahbh)aogt.a);
            }
            case 3: {
                return new aogt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aogt.a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\n\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\b\u1409\u0006\t\u1409\u0007\n\u1409\b\u000b\u100a\t\f\u041b\r\u1409\u0002", new Object[] { "b", "c", "d", "g", "h", "i", "j", "k", "n", "l", "e", aotd.class, "f" });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
