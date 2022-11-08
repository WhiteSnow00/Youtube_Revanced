import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apou extends agzi implements ahax
{
    public static final apou a;
    private static volatile ahbe f;
    public int b;
    public agzy c;
    public aioe d;
    public ajsq e;
    private ajsq g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)apou.class, (agzi)(a = new apou()));
    }
    
    private apou() {
        this.i = 2;
        this.c = emptyProtobufList();
        final agyc b = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = apou.f) == null) {
                    synchronized (apou.class) {
                        if (apou.f == null) {
                            apou.f = (ahbe)new agzb((agzi)apou.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apou.a;
            }
            case 4: {
                return new agza((agzi)apou.a);
            }
            case 3: {
                return new apou();
            }
            case 2: {
                return newMessageInfo((MessageLite)apou.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003", new Object[] { "b", "g", "c", apos.class, "d", "e", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
