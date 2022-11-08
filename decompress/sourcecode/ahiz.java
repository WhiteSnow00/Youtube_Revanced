import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahiz extends agzi implements ahax
{
    public static final ahiz a;
    private static volatile ahbe f;
    public int b;
    public aioe c;
    public agzy d;
    public agyc e;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)ahiz.class, (agzi)(a = new ahiz()));
    }
    
    private ahiz() {
        this.h = 2;
        this.d = emptyProtobufList();
        this.e = agyc.b;
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
                if ((f = ahiz.f) == null) {
                    synchronized (ahiz.class) {
                        if (ahiz.f == null) {
                            ahiz.f = (ahbe)new agzb((agzi)ahiz.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahiz.a;
            }
            case 4: {
                return new agza((agzi)ahiz.a);
            }
            case 3: {
                return new ahiz();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahiz.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u100a\u0002", new Object[] { "b", "c", "d", aioe.class, "g", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
