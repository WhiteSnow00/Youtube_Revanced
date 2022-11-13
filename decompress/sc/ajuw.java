import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajuw extends ahbh implements ahcw
{
    public static final ajuw a;
    private static volatile ahdd m;
    public int b;
    public boolean c;
    public boolean d;
    public ajut e;
    public ajut f;
    public ajut g;
    public ajut h;
    public int i;
    public aiqj j;
    public algl k;
    public ahab l;
    private ahhu n;
    private byte o;
    
    static {
        ahbh.registerDefaultInstance((Class)ajuw.class, (ahbh)(a = new ajuw()));
    }
    
    private ajuw() {
        this.o = 2;
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
                if ((m = ajuw.m) == null) {
                    synchronized (ajuw.class) {
                        if (ajuw.m == null) {
                            ajuw.m = (ahdd)new ahba((ahbh)ajuw.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return ajuw.a;
            }
            case 4: {
                return new ahaz((ahbh)ajuw.a);
            }
            case 3: {
                return new ajuw();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajuw.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0006\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0007\u0007\u1409\t\b\u100a\n\t\u1009\b\n\u1409\u0005\u000b\u100c\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "j", "n", "l", "k", "h", "i", ajty.m });
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
