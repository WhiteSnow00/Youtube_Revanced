import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprr extends ahbc implements ahbd
{
    public static final aprr a;
    private static volatile ahdd h;
    public int b;
    public ahbx c;
    public ahbx d;
    public ahbx e;
    public int f;
    public ahab g;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aprr.class, (ahbh)(a = new aprr()));
    }
    
    private aprr() {
        this.j = 2;
        this.c = emptyProtobufList();
        this.d = emptyProtobufList();
        this.e = emptyProtobufList();
        this.g = ahab.b;
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
                final ahdd h;
                if ((h = aprr.h) == null) {
                    synchronized (aprr.class) {
                        if (aprr.h == null) {
                            aprr.h = (ahdd)new ahba((ahbh)aprr.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aprr.a;
            }
            case 4: {
                return new ahbb((ahbc)aprr.a);
            }
            case 3: {
                return new aprr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprr.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0004\u0001\u041b\u0002\u041b\u0003\u1409\u0001\u0004\u100a\u0002\u0005\u041b\u0006\u1004\u0000", new Object[] { "b", "c", aprk.class, "d", ajut.class, "i", "g", "e", ajut.class, "f" });
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
