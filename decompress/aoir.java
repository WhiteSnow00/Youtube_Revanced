import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoir extends ahbc implements ahbd
{
    public static final aoir a;
    private static volatile ahdd i;
    public int b;
    public ahbx c;
    public String d;
    public aiqj e;
    public String f;
    public ahab g;
    public boolean h;
    private ahhu j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)aoir.class, (ahbh)(a = new aoir()));
    }
    
    private aoir() {
        this.k = 2;
        this.c = emptyProtobufList();
        this.d = "";
        this.f = "";
        this.g = ahab.b;
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
                final ahdd i;
                if ((i = aoir.i) == null) {
                    synchronized (aoir.class) {
                        if (aoir.i == null) {
                            aoir.i = (ahdd)new ahba((ahbh)aoir.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aoir.a;
            }
            case 4: {
                return new ahbb((ahbc)aoir.a);
            }
            case 3: {
                return new aoir();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoir.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0003\u0001\u041b\u0002\u1008\u0000\u0003\u1409\u0001\u0004\u1409\u0003\u0005\u100a\u0004\u0006\u1008\u0002\b\u1007\u0005", new Object[] { "b", "c", anuv.class, "d", "e", "j", "g", "f", "h" });
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
