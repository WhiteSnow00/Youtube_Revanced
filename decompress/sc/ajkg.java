import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajkg extends ahbh implements ahcw
{
    public static final ajkg a;
    private static volatile ahdd i;
    public int b;
    public int c;
    public Object d;
    public ajut e;
    public akdi f;
    public ajut g;
    public boolean h;
    private aiqj j;
    private ajut k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)ajkg.class, (ahbh)(a = new ajkg()));
    }
    
    private ajkg() {
        this.c = 0;
        this.l = 2;
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
                final ahdd i;
                if ((i = ajkg.i) == null) {
                    synchronized (ajkg.class) {
                        if (ajkg.i == null) {
                            ajkg.i = (ahdd)new ahba((ahbh)ajkg.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ajkg.a;
            }
            case 4: {
                return new ahaz((ahbh)ajkg.a);
            }
            case 3: {
                return new ajkg();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajkg.a, "\u0001\b\u0001\u0001\u0001\n\b\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1037\u0000\u0005\u103b\u0000\u0006\u1007\u0005\t\u1409\b\n\u1409\t", new Object[] { "d", "c", "b", "e", "f", "g", "h", "j", "k" });
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
