import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akoe extends agzi implements ahax
{
    public static final akoe a;
    private static volatile ahbe f;
    public akjf b;
    public aioe c;
    public agyc d;
    public agzy e;
    private int g;
    private ahfw h;
    private ajtl i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(akoe.class, a = new akoe());
    }
    
    private akoe() {
        this.j = 2;
        this.d = agyc.b;
        this.e = agzi.emptyProtobufList();
    }
    
    @Override
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
                if ((f = akoe.f) == null) {
                    synchronized (akoe.class) {
                        if (akoe.f == null) {
                            akoe.f = (ahbe)new agzb((agzi)akoe.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akoe.a;
            }
            case 4: {
                return new agza((agzi)akoe.a);
            }
            case 3: {
                return new akoe();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akoe.a, "\u0001\u0006\u0000\u0001\u0001\u0309\u0006\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100a\u0003\u0005\u041b\u0309\u1409\u0005", new Object[] { "g", "b", "c", "h", "d", "e", aorm.class, "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
