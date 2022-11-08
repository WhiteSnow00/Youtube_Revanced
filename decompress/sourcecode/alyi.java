import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alyi extends agzd implements agze
{
    public static final alyi a;
    public static final agzg b;
    private static volatile ahbe i;
    public int c;
    public String d;
    public String e;
    public long f;
    public agzy g;
    public boolean h;
    private byte j;
    
    static {
        final alyi a2 = new alyi();
        agzi.registerDefaultInstance((Class)alyi.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)ajnz.a, (Object)a2, (MessageLite)a2, (agzn)null, 262, ahcm.k, (Class)alyi.class);
    }
    
    private alyi() {
        this.j = 2;
        this.d = "";
        final agyc b = agyc.b;
        this.e = "";
        this.g = agzi.emptyProtobufList();
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
                final ahbe i;
                if ((i = alyi.i) == null) {
                    synchronized (alyi.class) {
                        if (alyi.i == null) {
                            alyi.i = (ahbe)new agzb((agzi)alyi.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return alyi.a;
            }
            case 4: {
                return new agzc(alyi.a);
            }
            case 3: {
                return new alyi();
            }
            case 2: {
                return newMessageInfo((MessageLite)alyi.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001\u1008\u0000\u0003\u1008\u0002\u0004\u1003\u0003\u0005\u001a\u0007\u1007\u0004", new Object[] { "c", "d", "e", "f", "g", "h" });
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
