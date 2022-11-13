import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apal extends ahbh implements ahcw
{
    public static final apal a;
    private static volatile ahdd k;
    public int b;
    public ajut c;
    public ahbx d;
    public aida e;
    public ahbx f;
    public anuv g;
    public ahab h;
    public apak i;
    public aiqj j;
    private ahhu l;
    private aida m;
    private anuv n;
    private byte o;
    
    static {
        ahbh.registerDefaultInstance((Class)apal.class, (ahbh)(a = new apal()));
    }
    
    private apal() {
        this.o = 2;
        this.d = emptyProtobufList();
        this.f = emptyProtobufList();
        this.h = ahab.b;
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
                final ahdd k;
                if ((k = apal.k) == null) {
                    synchronized (apal.class) {
                        if (apal.k == null) {
                            apal.k = (ahdd)new ahba((ahbh)apal.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return apal.a;
            }
            case 4: {
                return new ahaz((ahbh)apal.a);
            }
            case 3: {
                return new apal();
            }
            case 2: {
                return newMessageInfo((MessageLite)apal.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\n\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u041b\u0005\u1409\u0003\u0006\u100a\u0004\u0007\u1409\u0005\b\u1409\u0007\t\u1409\u0002\n\u1409\b\u000b\u1409\u0006", new Object[] { "b", "c", "d", apan.class, "e", "f", ajut.class, "l", "h", "i", "m", "g", "n", "j" });
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
