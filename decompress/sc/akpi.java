import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpi extends ahbh implements ahcw
{
    public static final akpi a;
    private static volatile ahdd i;
    public String b;
    public boolean c;
    public int d;
    public long e;
    public ahbx f;
    public akpr g;
    public akpk h;
    private int j;
    private akps k;
    private akpq l;
    private akpo m;
    private byte n;
    
    static {
        ahbh.registerDefaultInstance((Class)akpi.class, (ahbh)(a = new akpi()));
    }
    
    private akpi() {
        this.n = 2;
        this.b = "";
        this.f = emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = akpi.i) == null) {
                    synchronized (akpi.class) {
                        if (akpi.i == null) {
                            akpi.i = (ahdd)new ahba((ahbh)akpi.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akpi.a;
            }
            case 4: {
                return new ahaz((ahbh)akpi.a);
            }
            case 3: {
                return new akpi();
            }
            case 2: {
                return newMessageInfo((MessageLite)akpi.a, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0001\u0006\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u100c\u0002\u0004\u1002\u0003\u0007\u041b\b\u1409\u0007\t\u1409\b\n\u1409\f\u000e\u1409\t\u0011\u1409\u000b", new Object[] { "j", "b", "c", "d", akjo.n, "e", "f", akpp.class, "g", "k", "h", "l", "m" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
