import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akhh extends ahbh implements ahcw
{
    public static final akhh a;
    private static volatile ahdd i;
    public int b;
    public ahab c;
    public akhg d;
    public aiqj e;
    public akhb f;
    public ahbx g;
    public akhf h;
    private akli j;
    private ahhu k;
    private akyz l;
    private akhz m;
    private alem n;
    private byte o;
    
    static {
        ahbh.registerDefaultInstance((Class)akhh.class, (ahbh)(a = new akhh()));
    }
    
    private akhh() {
        this.o = 2;
        this.c = ahab.b;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.g = ahbh.emptyProtobufList();
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
                final ahdd i;
                if ((i = akhh.i) == null) {
                    synchronized (akhh.class) {
                        if (akhh.i == null) {
                            akhh.i = (ahdd)new ahba((ahbh)akhh.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akhh.a;
            }
            case 4: {
                return new ahaz((ahbh)akhh.a);
            }
            case 3: {
                return new akhh();
            }
            case 2: {
                return newMessageInfo((MessageLite)akhh.a, "\u0001\u000b\u0000\u0001\u0001#\u000b\u0000\u0001\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u100a\u0002\r\u1409\f\u000e\u1409\r\u000f\u1409\u000e\u0010\u1409\b\u0012\u1409\u0011\u0014\u001a \u1009\u001b#\u1009\u0006", new Object[] { "b", "j", "k", "c", "l", "m", "n", "e", "f", "g", "h", "d" });
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
