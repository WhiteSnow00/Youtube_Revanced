import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxc extends ahbh implements ahcw
{
    public static final ajxc a;
    private static volatile ahdd h;
    public int b;
    public ajut c;
    public aotp d;
    public aiqj e;
    public ajut f;
    public ajut g;
    private ajut i;
    private ajut j;
    private ahhu k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)ajxc.class, (ahbh)(a = new ajxc()));
    }
    
    private ajxc() {
        this.l = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
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
                final ahdd h;
                if ((h = ajxc.h) == null) {
                    synchronized (ajxc.class) {
                        if (ajxc.h == null) {
                            ajxc.h = (ahdd)new ahba((ahbh)ajxc.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajxc.a;
            }
            case 4: {
                return new ahaz((ahbh)ajxc.a);
            }
            case 3: {
                return new ajxc();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxc.a, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\t\t\u1409\u0007\f\u1409\b", new Object[] { "b", "c", "d", "i", "e", "j", "k", "f", "g" });
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
