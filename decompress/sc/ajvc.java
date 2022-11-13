import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvc extends ahbh implements ahcw
{
    public static final ajvc a;
    private static volatile ahdd j;
    public int b;
    public ajut c;
    public ahbx d;
    public ajut e;
    public ajut f;
    public aiqj g;
    public algl h;
    public ahab i;
    private ahhu k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)ajvc.class, (ahbh)(a = new ajvc()));
    }
    
    private ajvc() {
        this.l = 2;
        this.d = emptyProtobufList();
        this.i = ahab.b;
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
                final ahdd j;
                if ((j = ajvc.j) == null) {
                    synchronized (ajvc.class) {
                        if (ajvc.j == null) {
                            ajvc.j = (ahdd)new ahba((ahbh)ajvc.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajvc.a;
            }
            case 4: {
                return new ahaz((ahbh)ajvc.a);
            }
            case 3: {
                return new ajvc();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajvc.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u001b\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003\u0006\u1009\u0004\u0007\u1409\u0005\b\u100a\u0006", new Object[] { "b", "c", "d", ajvb.class, "e", "f", "g", "h", "k", "i" });
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
