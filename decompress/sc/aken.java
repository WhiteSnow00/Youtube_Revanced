import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aken extends ahbh implements ahcw
{
    public static final aken a;
    private static volatile ahdd k;
    public int b;
    public ahbx c;
    public ahbx d;
    public ahbx e;
    public ajut f;
    public akem g;
    public akem h;
    public long i;
    public aiqj j;
    private ahhu l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)aken.class, (ahbh)(a = new aken()));
    }
    
    private aken() {
        this.m = 2;
        this.c = emptyProtobufList();
        final ahab b = ahab.b;
        this.d = emptyProtobufList();
        this.e = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd k;
                if ((k = aken.k) == null) {
                    synchronized (aken.class) {
                        if (aken.k == null) {
                            aken.k = (ahdd)new ahba((ahbh)aken.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aken.a;
            }
            case 4: {
                return new ahaz((ahbh)aken.a);
            }
            case 3: {
                return new aken();
            }
            case 2: {
                return newMessageInfo((MessageLite)aken.a, "\u0001\t\u0000\u0001\u0001\u0015\t\u0000\u0003\u0006\u0001\u041b\u0002\u1409\u0000\t\u001b\u000b\u001b\r\u1409\u0002\u000e\u1409\u0004\u000f\u1409\u0005\u0013\u1002\u0007\u0015\u1409\t", new Object[] { "b", "c", akes.class, "l", "d", alwh.class, "e", alwh.class, "f", "g", "h", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
