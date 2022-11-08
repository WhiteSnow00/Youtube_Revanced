import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aikw extends agzi implements ahax
{
    public static final aikw a;
    private static volatile ahbe i;
    public int b;
    public aikr c;
    public aikv d;
    public agzy e;
    public int f;
    public agzy g;
    public agyc h;
    private ahfw j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(aikw.class, a = new aikw());
    }
    
    private aikw() {
        this.k = 2;
        this.e = agzi.emptyProtobufList();
        emptyProtobufList();
        this.g = agzi.emptyProtobufList();
        this.h = agyc.b;
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
                final ahbe i;
                if ((i = aikw.i) == null) {
                    synchronized (aikw.class) {
                        if (aikw.i == null) {
                            aikw.i = (ahbe)new agzb((agzi)aikw.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aikw.a;
            }
            case 4: {
                return new agza((int[][])null, (char[])null);
            }
            case 3: {
                return new aikw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aikw.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0003\u0001\u1409\u0001\u0002\u041b\u0004\u100b\u0002\u0005\u1409\u0003\u0006\u100a\u0004\u0007\u1009\u0000\b\u001a", new Object[] { "b", "d", "e", aiky.class, "f", "j", "h", "c", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
